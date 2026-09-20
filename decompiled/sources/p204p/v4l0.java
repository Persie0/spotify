package p204p;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class v4l0 extends p3x0 {

    /* JADX INFO: renamed from: b */
    public final p3x0 f237201b;

    /* JADX INFO: renamed from: c */
    public final vuu0 f237202c;

    /* JADX INFO: renamed from: d */
    public IOException f237203d;

    public v4l0(p3x0 p3x0Var) {
        this.f237201b = p3x0Var;
        this.f237202c = kif1.m56500i(new s2b(this, p3x0Var.mo28080C1()));
    }

    @Override // p204p.p3x0
    /* JADX INFO: renamed from: C1 */
    public final gqa mo28080C1() {
        return this.f237202c;
    }

    @Override // p204p.p3x0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f237201b.close();
    }

    @Override // p204p.p3x0
    /* JADX INFO: renamed from: e */
    public final long mo28081e() {
        return this.f237201b.mo28081e();
    }

    @Override // p204p.p3x0
    /* JADX INFO: renamed from: f */
    public final ayd0 mo28082f() {
        return this.f237201b.mo28082f();
    }
}
