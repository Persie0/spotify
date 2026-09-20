package p204p;

import android.view.MotionEvent;

/* JADX INFO: loaded from: classes3.dex */
public abstract class jlz0 {

    /* JADX INFO: renamed from: a */
    public static final x4t0 f113718a = loq0.f135519Z;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX INFO: renamed from: a */
    public static final boolean m53734a(e6q0 e6q0Var) {
        MotionEvent motionEventM37955a;
        ?? r0 = e6q0Var.f56704a;
        int size = r0.size();
        for (int i = 0; i < size; i++) {
            if (((k6q0) r0.get(i)).f119818i != 2) {
                MotionEvent motionEventM37955a2 = e6q0Var.m37955a();
                if ((motionEventM37955a2 == null || !motionEventM37955a2.isFromSource(8194)) && ((motionEventM37955a = e6q0Var.m37955a()) == null || !motionEventM37955a.isFromSource(1048584))) {
                    return false;
                }
            }
        }
        return true;
    }
}
