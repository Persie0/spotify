package p204p;

import java.util.RandomAccess;

/* JADX INFO: loaded from: classes11.dex */
public final class ck5 extends AbstractC2154n7 implements RandomAccess {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int[] f38817a;

    public ck5(int[] iArr) {
        this.f38817a = iArr;
    }

    @Override // p204p.AbstractC2282q6
    /* JADX INFO: renamed from: a */
    public final int mo33075a() {
        return this.f38817a.length;
    }

    @Override // p204p.AbstractC2282q6, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Integer)) {
            return false;
        }
        return bk5.m29619k0(this.f38817a, ((Number) obj).intValue());
    }

    @Override // java.util.List
    public final Object get(int i) {
        return Integer.valueOf(this.f38817a[i]);
    }

    @Override // p204p.AbstractC2154n7, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        return bk5.m29588K0(this.f38817a, ((Number) obj).intValue());
    }

    @Override // p204p.AbstractC2282q6, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f38817a.length == 0;
    }

    @Override // p204p.AbstractC2154n7, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Number) obj).intValue();
        int[] iArr = this.f38817a;
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (iIntValue == iArr[length]) {
                    return length;
                }
                if (i >= 0) {
                    length = i;
                }
            }
        }
        return -1;
    }
}
