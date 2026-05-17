package iit.android.language;

import iit.android.swarachakra.KeyAttr;

import java.util.HashMap;
import android.util.SparseArray;

public interface ExceptionHandler {

	public SparseArray<KeyAttr> handleException(int keyCode);
}
