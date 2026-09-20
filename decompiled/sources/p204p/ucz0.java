package p204p;

import java.util.Comparator;

/* JADX INFO: loaded from: classes5.dex */
public final class ucz0 implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f229145a;

    public ucz0(int i) {
        this.f229145a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int iIntValue = ((Number) obj).intValue();
        int i = this.f229145a;
        return jlg1.m53703m(Integer.valueOf(Math.abs(iIntValue - i)), Integer.valueOf(Math.abs(((Number) obj2).intValue() - i)));
    }
}
