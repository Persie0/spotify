package p204p;

import java.util.Arrays;

/* JADX INFO: loaded from: classes11.dex */
public final class x1s extends vdr0 {

    /* JADX INFO: renamed from: a */
    public double[] f257264a;

    /* JADX INFO: renamed from: b */
    public int f257265b;

    @Override // p204p.vdr0
    /* JADX INFO: renamed from: a */
    public final Object mo33759a() {
        return Arrays.copyOf(this.f257264a, this.f257265b);
    }

    @Override // p204p.vdr0
    /* JADX INFO: renamed from: b */
    public final void mo33760b(int i) {
        double[] dArr = this.f257264a;
        if (dArr.length < i) {
            int length = dArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f257264a = Arrays.copyOf(dArr, i);
        }
    }

    @Override // p204p.vdr0
    /* JADX INFO: renamed from: d */
    public final int mo33761d() {
        return this.f257265b;
    }
}
