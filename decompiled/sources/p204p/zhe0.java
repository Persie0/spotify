package p204p;

import android.transition.Transition;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zhe0 {
    /* JADX INFO: renamed from: a */
    public static void m96126a(PopupWindow popupWindow, Transition transition) {
        popupWindow.setEnterTransition(transition);
    }

    /* JADX INFO: renamed from: b */
    public static void m96127b(PopupWindow popupWindow, Transition transition) {
        popupWindow.setExitTransition(transition);
    }
}
