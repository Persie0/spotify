package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class dbh1 extends ptg1 {

    /* JADX INFO: renamed from: c */
    public final transient Object[] f47321c;

    /* JADX INFO: renamed from: d */
    public final transient int f47322d;

    /* JADX INFO: renamed from: e */
    public final transient int f47323e = 1;

    public dbh1(int i, Object[] objArr) {
        this.f47321c = objArr;
        this.f47322d = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        vhf1.m85543R(i, this.f47323e);
        Object obj = this.f47321c[i + i + this.f47322d];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f47323e;
    }
}
