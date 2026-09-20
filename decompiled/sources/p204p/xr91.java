package p204p;

import java.util.Arrays;

/* JADX INFO: loaded from: classes11.dex */
public final class xr91 extends vdr0 {

    /* JADX INFO: renamed from: a */
    public int[] f265303a;

    /* JADX INFO: renamed from: b */
    public int f265304b;

    @Override // p204p.vdr0
    /* JADX INFO: renamed from: a */
    public final Object mo33759a() {
        return new wr91(Arrays.copyOf(this.f265303a, this.f265304b));
    }

    @Override // p204p.vdr0
    /* JADX INFO: renamed from: b */
    public final void mo33760b(int i) {
        int[] iArr = this.f265303a;
        if (iArr.length < i) {
            int length = iArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f265303a = Arrays.copyOf(iArr, i);
        }
    }

    @Override // p204p.vdr0
    /* JADX INFO: renamed from: d */
    public final int mo33761d() {
        return this.f265304b;
    }
}
