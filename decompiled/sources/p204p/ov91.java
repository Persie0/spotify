package p204p;

import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public final class ov91 {

    /* JADX INFO: renamed from: a */
    public final ei50 f170457a;

    public ov91(ei50 ei50Var) {
        this.f170457a = ei50Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m68125a(rt91 rt91Var) {
        if (!((Boolean) this.f170457a.invoke()).booleanValue() || wj50.m88271j(Looper.myLooper(), Looper.getMainLooper())) {
            return;
        }
        na6.m63971s("UBI API is called from the background thread!!! " + rt91Var);
    }
}
