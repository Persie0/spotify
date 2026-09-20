package p204p;

import android.window.BackEvent;

/* JADX INFO: loaded from: classes.dex */
public abstract class a45 {
    /* JADX INFO: renamed from: a */
    public static float m24664a(BackEvent backEvent) {
        return backEvent.getProgress();
    }

    /* JADX INFO: renamed from: b */
    public static int m24665b(BackEvent backEvent) {
        return backEvent.getSwipeEdge();
    }

    /* JADX INFO: renamed from: c */
    public static float m24666c(BackEvent backEvent) {
        return backEvent.getTouchX();
    }

    /* JADX INFO: renamed from: d */
    public static float m24667d(BackEvent backEvent) {
        return backEvent.getTouchY();
    }
}
