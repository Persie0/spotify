package p204p;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class dg40 implements Serializable {

    /* JADX INFO: renamed from: a */
    public final eg40 f48714a;

    public dg40(eg40 eg40Var) {
        this.f48714a = eg40Var;
    }

    public Object readResolve() {
        return this.f48714a.m38771m();
    }
}
