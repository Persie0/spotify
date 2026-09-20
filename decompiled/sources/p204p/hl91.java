package p204p;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: loaded from: classes4.dex */
public final class hl91 extends inz implements RunnableFuture {

    /* JADX INFO: renamed from: e */
    public volatile ij50 f92655e;

    public hl91(Callable callable) {
        this.f92655e = new gl91(this, callable);
    }

    /* JADX INFO: renamed from: A */
    public static hl91 m47872A(zl6 zl6Var) {
        hl91 hl91Var = new hl91();
        hl91Var.f92655e = new gl91(hl91Var, zl6Var);
        return hl91Var;
    }

    /* JADX INFO: renamed from: y */
    public static hl91 m47873y(Runnable runnable, Object obj) {
        return new hl91(Executors.callable(runnable, obj));
    }

    /* JADX INFO: renamed from: z */
    public static hl91 m47874z(Callable callable) {
        return new hl91(callable);
    }

    @Override // p204p.AbstractC1694b7
    /* JADX INFO: renamed from: l */
    public final void mo28325l() {
        ij50 ij50Var;
        if (m28333x() && (ij50Var = this.f92655e) != null) {
            ij50Var.m50771c();
        }
        this.f92655e = null;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        ij50 ij50Var = this.f92655e;
        if (ij50Var != null) {
            ij50Var.run();
        }
        this.f92655e = null;
    }

    @Override // p204p.AbstractC1694b7
    /* JADX INFO: renamed from: s */
    public final String mo28328s() {
        ij50 ij50Var = this.f92655e;
        if (ij50Var == null) {
            return super.mo28328s();
        }
        return "task=[" + ij50Var + "]";
    }
}
