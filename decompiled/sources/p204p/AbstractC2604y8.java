package p204p;

import java.util.Random;

/* JADX INFO: renamed from: p.y8 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2604y8 extends w4u0 {
    @Override // p204p.w4u0
    /* JADX INFO: renamed from: a */
    public final int mo29120a(int i) {
        return ((-i) >> 31) & (mo41480l().nextInt() >>> (32 - i));
    }

    @Override // p204p.w4u0
    /* JADX INFO: renamed from: b */
    public final double mo84662b() {
        return mo41480l().nextDouble();
    }

    @Override // p204p.w4u0
    /* JADX INFO: renamed from: e */
    public final float mo84664e() {
        return mo41480l().nextFloat();
    }

    @Override // p204p.w4u0
    /* JADX INFO: renamed from: f */
    public final int mo29121f() {
        return mo41480l().nextInt();
    }

    @Override // p204p.w4u0
    /* JADX INFO: renamed from: g */
    public final int mo84665g(int i) {
        return mo41480l().nextInt(i);
    }

    @Override // p204p.w4u0
    /* JADX INFO: renamed from: i */
    public final long mo84666i() {
        return mo41480l().nextLong();
    }

    /* JADX INFO: renamed from: l */
    public abstract Random mo41480l();
}
