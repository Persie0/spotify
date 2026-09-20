package p204p;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class r0g1 extends m0g1 {

    /* JADX INFO: renamed from: e */
    public static final r0g1 f194486e = new r0g1(0, new Object[0]);

    /* JADX INFO: renamed from: c */
    public final transient Object[] f194487c;

    /* JADX INFO: renamed from: d */
    public final transient int f194488d;

    public r0g1(int i, Object[] objArr) {
        this.f194487c = objArr;
        this.f194488d = i;
    }

    @Override // p204p.zzf1
    /* JADX INFO: renamed from: a */
    public final Object[] mo46356a() {
        return this.f194487c;
    }

    @Override // p204p.zzf1
    /* JADX INFO: renamed from: b */
    public final int mo46357b() {
        return 0;
    }

    @Override // p204p.zzf1
    /* JADX INFO: renamed from: d */
    public final int mo46358d() {
        return this.f194488d;
    }

    @Override // p204p.zzf1
    /* JADX INFO: renamed from: e */
    public final boolean mo46359e() {
        return false;
    }

    @Override // p204p.m0g1, p204p.zzf1
    /* JADX INFO: renamed from: f */
    public final int mo60465f(Object[] objArr) {
        Object[] objArr2 = this.f194487c;
        int i = this.f194488d;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        wj50.m88270i0(i, this.f194488d);
        Object obj = this.f194487c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f194488d;
    }
}
