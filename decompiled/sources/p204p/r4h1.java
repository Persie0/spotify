package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class r4h1 extends ptg1 {

    /* JADX INFO: renamed from: e */
    public static final r4h1 f195777e = new r4h1(0, new Object[0]);

    /* JADX INFO: renamed from: c */
    public final transient Object[] f195778c;

    /* JADX INFO: renamed from: d */
    public final transient int f195779d;

    public r4h1(int i, Object[] objArr) {
        this.f195778c = objArr;
        this.f195779d = i;
    }

    @Override // p204p.ptg1, p204p.dlg1
    /* JADX INFO: renamed from: a */
    public final int mo36358a(Object[] objArr) {
        Object[] objArr2 = this.f195778c;
        int i = this.f195779d;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // p204p.dlg1
    /* JADX INFO: renamed from: b */
    public final int mo36359b() {
        return this.f195779d;
    }

    @Override // p204p.dlg1
    /* JADX INFO: renamed from: d */
    public final int mo36360d() {
        return 0;
    }

    @Override // p204p.dlg1
    /* JADX INFO: renamed from: e */
    public final Object[] mo36361e() {
        return this.f195778c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        vhf1.m85543R(i, this.f195779d);
        Object obj = this.f195778c[i];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f195779d;
    }
}
