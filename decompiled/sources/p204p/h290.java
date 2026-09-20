package p204p;

import android.graphics.Rect;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h290 {
    /* JADX INFO: renamed from: a */
    public static void m46483a(PopupWindow popupWindow, Rect rect) {
        popupWindow.setEpicenterBounds(rect);
    }

    /* JADX INFO: renamed from: b */
    public static void m46484b(PopupWindow popupWindow, boolean z) {
        popupWindow.setIsClippedToScreen(z);
    }
}
