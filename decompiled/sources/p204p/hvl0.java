package p204p;

import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class hvl0 extends AbstractC2154n7 implements RandomAccess {

    /* JADX INFO: renamed from: a */
    public final iva[] f95747a;

    /* JADX INFO: renamed from: b */
    public final int[] f95748b;

    public hvl0(iva[] ivaVarArr, int[] iArr) {
        this.f95747a = ivaVarArr;
        this.f95748b = iArr;
    }

    @Override // p204p.AbstractC2282q6
    /* JADX INFO: renamed from: a */
    public final int mo33075a() {
        return this.f95747a.length;
    }

    @Override // p204p.AbstractC2282q6, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof iva) {
            return super.contains((iva) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.f95747a[i];
    }

    @Override // p204p.AbstractC2154n7, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof iva) {
            return super.indexOf((iva) obj);
        }
        return -1;
    }

    @Override // p204p.AbstractC2154n7, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof iva) {
            return super.lastIndexOf((iva) obj);
        }
        return -1;
    }
}
