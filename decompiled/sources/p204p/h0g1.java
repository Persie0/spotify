package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class h0g1 extends m0g1 {

    /* JADX INFO: renamed from: c */
    public final transient int f86288c;

    /* JADX INFO: renamed from: d */
    public final transient int f86289d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ m0g1 f86290e;

    public h0g1(m0g1 m0g1Var, int i, int i2) {
        this.f86290e = m0g1Var;
        this.f86288c = i;
        this.f86289d = i2;
    }

    @Override // p204p.zzf1
    /* JADX INFO: renamed from: a */
    public final Object[] mo46356a() {
        return this.f86290e.mo46356a();
    }

    @Override // p204p.zzf1
    /* JADX INFO: renamed from: b */
    public final int mo46357b() {
        return this.f86290e.mo46357b() + this.f86288c;
    }

    @Override // p204p.zzf1
    /* JADX INFO: renamed from: d */
    public final int mo46358d() {
        return this.f86290e.mo46357b() + this.f86288c + this.f86289d;
    }

    @Override // p204p.zzf1
    /* JADX INFO: renamed from: e */
    public final boolean mo46359e() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        wj50.m88270i0(i, this.f86289d);
        return this.f86290e.get(i + this.f86288c);
    }

    @Override // p204p.m0g1, java.util.List
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final m0g1 subList(int i, int i2) {
        wj50.m88272j0(i, i2, this.f86289d);
        int i3 = this.f86288c;
        return this.f86290e.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f86289d;
    }
}
