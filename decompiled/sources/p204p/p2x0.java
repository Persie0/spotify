package p204p;

import java.io.IOException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class p2x0 {
    /* JADX INFO: renamed from: a */
    public final p2x0 m68968a(gh00 gh00Var) {
        Object objInvoke;
        ono0 ono0Var = new ono0(gh00Var);
        if (this instanceof k2x0) {
            objInvoke = new k2x0(((k2x0) this).f118699a);
        } else {
            if (!(this instanceof m2x0)) {
                throw new NoWhenBranchMatchedException();
            }
            objInvoke = ono0Var.invoke(((m2x0) this).f139474a);
        }
        return (p2x0) objInvoke;
    }

    /* JADX INFO: renamed from: b */
    public final Object m68969b(gh00 gh00Var, gh00 gh00Var2) {
        if (this instanceof k2x0) {
            return gh00Var.invoke(((k2x0) this).f118699a);
        }
        if (this instanceof m2x0) {
            return gh00Var2.invoke(((m2x0) this).f139474a);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: c */
    public final Object m68970c() {
        if (this instanceof k2x0) {
            return null;
        }
        if (this instanceof m2x0) {
            return ((m2x0) this).f139474a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: d */
    public final Object m68971d() {
        if (this instanceof k2x0) {
            throw new IOException(((k2x0) this).f118699a.mo27977b());
        }
        if (this instanceof m2x0) {
            return ((m2x0) this).f139474a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final String toString() {
        Object objInvoke;
        gkw0 gkw0Var = gkw0.f80934Y0;
        if (this instanceof k2x0) {
            objInvoke = gkw0Var.invoke(((k2x0) this).f118699a);
        } else {
            if (!(this instanceof m2x0)) {
                throw new NoWhenBranchMatchedException();
            }
            objInvoke = "Success";
        }
        return (String) objInvoke;
    }
}
