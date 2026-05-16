#!/bin/bash
# =============================================================
# build_all.sh — Build all 12 Swarachakra APKs (debug, auto-signed)
# Run from project root: ./build_all.sh
# =============================================================
set -e

LANGUAGES="bengali gujarati hindi kannada konkani malayalam marathi oriya telugu tamil asomiya punjabi"
OUTPUT_DIR="$(pwd)/output_apks"
mkdir -p "$OUTPUT_DIR"

echo "================================================"
echo "  Building all 12 Swarachakra keyboards"
echo "  (debug builds — auto-signed, ready to ADB install)"
echo "================================================"
echo ""

for lang in $LANGUAGES; do
    cap="$(echo ${lang:0:1} | tr '[:lower:]' '[:upper:]')${lang:1}"
    task="assemble${cap}Debug"
    echo ">>> $lang  →  $task"
    ./gradlew "$task" --quiet
    apk=$(find "app/build/outputs/apk/$lang/debug" -name "*.apk" 2>/dev/null | head -1)
    if [ -n "$apk" ]; then
        dest="$OUTPUT_DIR/Swarachakra-${cap}.apk"
        cp "$apk" "$dest"
        echo "    ✓  $(basename $dest)"
    else
        echo "    ✗  APK not found for $lang"
    fi
done

echo ""
echo "================================================"
echo "  Done! APKs in: $OUTPUT_DIR"
echo "================================================"
echo ""
echo "Install all on your Pixel:"
echo "  adb devices   # confirm your device is listed"
echo "  for apk in $OUTPUT_DIR/*.apk; do adb install \"\$apk\"; done"
