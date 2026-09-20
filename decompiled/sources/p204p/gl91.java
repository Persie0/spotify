package p204p;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class gl91 extends ij50 {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f81028c = 1;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ hl91 f81029d;

    /* JADX INFO: renamed from: e */
    public final Object f81030e;

    public gl91(hl91 hl91Var, Callable callable) {
        this.f81029d = hl91Var;
        callable.getClass();
        this.f81030e = callable;
    }

    @Override // p204p.ij50
    /* JADX INFO: renamed from: a */
    public final void mo41225a(Throwable th) {
        switch (this.f81028c) {
            case 0:
                this.f81029d.m28331v(th);
                break;
            default:
                this.f81029d.m28331v(th);
                break;
        }
    }

    @Override // p204p.ij50
    /* JADX INFO: renamed from: b */
    public final void mo41226b(Object obj) {
        switch (this.f81028c) {
            case 0:
                this.f81029d.m28332w((u790) obj);
                break;
            default:
                this.f81029d.m28330u(obj);
                break;
        }
    }

    @Override // p204p.ij50
    /* JADX INFO: renamed from: d */
    public final boolean mo41227d() {
        switch (this.f81028c) {
            case 0:
                break;
        }
        return this.f81029d.isDone();
    }

    @Override // p204p.ij50
    /* JADX INFO: renamed from: e */
    public final Object mo41228e() {
        switch (this.f81028c) {
            case 0:
                zl6 zl6Var = (zl6) this.f81030e;
                u790 u790VarCall = zl6Var.call();
                c95.m31849o("AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", u790VarCall, zl6Var);
                return u790VarCall;
            default:
                return ((Callable) this.f81030e).call();
        }
    }

    @Override // p204p.ij50
    /* JADX INFO: renamed from: f */
    public final String mo41229f() {
        switch (this.f81028c) {
            case 0:
                return ((zl6) this.f81030e).toString();
            default:
                return ((Callable) this.f81030e).toString();
        }
    }

    public gl91(hl91 hl91Var, zl6 zl6Var) {
        this.f81029d = hl91Var;
        this.f81030e = zl6Var;
    }
}
