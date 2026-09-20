package p204p;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class v4u0 extends w4u0 implements Serializable {
    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return u4u0.f226804a;
    }

    @Override // p204p.w4u0
    /* JADX INFO: renamed from: a */
    public final int mo29120a(int i) {
        return w4u0.f247891b.mo29120a(i);
    }

    @Override // p204p.w4u0
    /* JADX INFO: renamed from: b */
    public final double mo84662b() {
        return w4u0.f247891b.mo84662b();
    }

    @Override // p204p.w4u0
    /* JADX INFO: renamed from: c */
    public final double mo41476c(double d) {
        throw null;
    }

    @Override // p204p.w4u0
    /* JADX INFO: renamed from: d */
    public final double mo84663d(double d, double d2) {
        return w4u0.f247891b.mo84663d(0.0d, d2);
    }

    @Override // p204p.w4u0
    /* JADX INFO: renamed from: e */
    public final float mo84664e() {
        return w4u0.f247891b.mo84664e();
    }

    @Override // p204p.w4u0
    /* JADX INFO: renamed from: f */
    public final int mo29121f() {
        return w4u0.f247891b.mo29121f();
    }

    @Override // p204p.w4u0
    /* JADX INFO: renamed from: g */
    public final int mo84665g(int i) {
        return w4u0.f247891b.mo84665g(i);
    }

    @Override // p204p.w4u0
    /* JADX INFO: renamed from: h */
    public final int mo41477h(int i, int i2) {
        return w4u0.f247891b.mo41477h(i, i2);
    }

    @Override // p204p.w4u0
    /* JADX INFO: renamed from: i */
    public final long mo84666i() {
        return w4u0.f247891b.mo84666i();
    }

    @Override // p204p.w4u0
    /* JADX INFO: renamed from: j */
    public final long mo41478j(long j) {
        throw null;
    }

    @Override // p204p.w4u0
    /* JADX INFO: renamed from: k */
    public final long mo41479k(long j, long j2) {
        return w4u0.f247891b.mo41479k(j, j2);
    }
}
