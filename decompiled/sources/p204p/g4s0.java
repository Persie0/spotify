package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes11.dex */
public final class g4s0 {

    /* JADX INFO: renamed from: a */
    public final hb11 f76520a;

    /* JADX INFO: renamed from: b */
    public final hb11 f76521b;

    /* JADX INFO: renamed from: c */
    public final zv41 f76522c;

    /* JADX INFO: renamed from: d */
    public final zv41 f76523d;

    public g4s0() {
        hb11 hb11VarM52092t = j0g1.m52092t(0, 0, 0, 7);
        this.f76520a = hb11VarM52092t;
        this.f76521b = hb11VarM52092t;
        zv41 zv41VarM52819d = jag1.m52819d(Boolean.FALSE);
        this.f76522c = zv41VarM52819d;
        this.f76523d = zv41VarM52819d;
    }

    /* JADX INFO: renamed from: a */
    public final Object m43558a(f4s0 f4s0Var, mb61 mb61Var) throws Throwable {
        boolean z = f4s0Var instanceof d4s0;
        zv41 zv41Var = this.f76522c;
        if (z) {
            Boolean bool = Boolean.TRUE;
            zv41Var.getClass();
            zv41Var.m97091m(null, bool);
        } else if (f4s0Var instanceof c4s0) {
            Boolean bool2 = Boolean.FALSE;
            zv41Var.getClass();
            zv41Var.m97091m(null, bool2);
        } else if (!(f4s0Var instanceof e4s0)) {
            throw new NoWhenBranchMatchedException();
        }
        Object objEmit = this.f76520a.emit(f4s0Var, mb61Var);
        return objEmit == yuk.f276404a ? objEmit : w2a1.f247311a;
    }
}
