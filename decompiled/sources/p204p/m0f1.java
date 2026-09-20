package p204p;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class m0f1 extends k0f1 {

    /* JADX INFO: renamed from: i */
    public static final m0f1 f138666i = new m0f1(new Object[0]);

    /* JADX INFO: renamed from: h */
    public final transient Object[] f138667h;

    public m0f1(Object[] objArr) {
        super(0);
        this.f138667h = objArr;
    }

    @Override // p204p.k0f1, p204p.h0f1
    /* JADX INFO: renamed from: a */
    public final int mo46350a(Object[] objArr) {
        System.arraycopy(this.f138667h, 0, objArr, 0, 0);
        return 0;
    }

    @Override // p204p.h0f1
    /* JADX INFO: renamed from: b */
    public final int mo46351b() {
        return 0;
    }

    @Override // p204p.h0f1
    /* JADX INFO: renamed from: d */
    public final int mo46352d() {
        return 0;
    }

    @Override // p204p.h0f1
    /* JADX INFO: renamed from: e */
    public final Object[] mo46353e() {
        return this.f138667h;
    }

    @Override // java.util.List
    public final Object get(int i) {
        ex60.m40169c(i, 0);
        Object obj = this.f138667h[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return 0;
    }
}
