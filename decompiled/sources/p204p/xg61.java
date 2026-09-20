package p204p;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class xg61 implements t27 {

    /* JADX INFO: renamed from: b */
    public final Object f261229b;

    /* JADX INFO: renamed from: c */
    public final xp31 f261230c = new xp31(true);

    public xg61(Object obj) {
        this.f261229b = obj;
    }

    @Override // p204p.t27
    /* JADX INFO: renamed from: d */
    public final boolean mo31666d() {
        boolean zMo31666d;
        synchronized (this.f261229b) {
            zMo31666d = this.f261230c.mo31666d();
        }
        return zMo31666d;
    }

    @Override // p204p.t27
    /* JADX INFO: renamed from: e */
    public final ByteBuffer mo31667e() {
        ByteBuffer byteBufferMo31667e;
        synchronized (this.f261229b) {
            byteBufferMo31667e = this.f261230c.mo31667e();
        }
        return byteBufferMo31667e;
    }

    @Override // p204p.t27
    /* JADX INFO: renamed from: f */
    public final q27 mo31668f(q27 q27Var) {
        q27 q27VarMo31668f;
        synchronized (this.f261229b) {
            q27VarMo31668f = this.f261230c.mo31668f(q27Var);
        }
        return q27VarMo31668f;
    }

    @Override // p204p.t27
    /* JADX INFO: renamed from: g */
    public final void mo31669g(s27 s27Var) {
        synchronized (this.f261229b) {
            this.f261230c.mo31669g(s27Var);
        }
    }

    @Override // p204p.t27
    /* JADX INFO: renamed from: h */
    public final void mo31670h(ByteBuffer byteBuffer) {
        synchronized (this.f261229b) {
            this.f261230c.mo31670h(byteBuffer);
        }
    }

    @Override // p204p.t27
    /* JADX INFO: renamed from: i */
    public final void mo31671i() {
        synchronized (this.f261229b) {
            this.f261230c.mo31671i();
        }
    }

    @Override // p204p.t27
    public final boolean isActive() {
        boolean zIsActive;
        synchronized (this.f261229b) {
            zIsActive = this.f261230c.isActive();
        }
        return zIsActive;
    }

    @Override // p204p.t27
    /* JADX INFO: renamed from: j */
    public final long mo40331j(long j) {
        long jM91579a;
        synchronized (this.f261229b) {
            jM91579a = this.f261230c.m91579a(j);
        }
        return jM91579a;
    }

    @Override // p204p.t27
    public final void reset() {
        synchronized (this.f261229b) {
            this.f261230c.reset();
        }
    }
}
