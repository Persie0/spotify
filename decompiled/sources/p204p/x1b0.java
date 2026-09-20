package p204p;

import java.util.Arrays;

/* JADX INFO: loaded from: classes11.dex */
public final class x1b0 extends vdr0 {

    /* JADX INFO: renamed from: a */
    public long[] f257123a;

    /* JADX INFO: renamed from: b */
    public int f257124b;

    @Override // p204p.vdr0
    /* JADX INFO: renamed from: a */
    public final Object mo33759a() {
        return Arrays.copyOf(this.f257123a, this.f257124b);
    }

    @Override // p204p.vdr0
    /* JADX INFO: renamed from: b */
    public final void mo33760b(int i) {
        long[] jArr = this.f257123a;
        if (jArr.length < i) {
            int length = jArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f257123a = Arrays.copyOf(jArr, i);
        }
    }

    @Override // p204p.vdr0
    /* JADX INFO: renamed from: d */
    public final int mo33761d() {
        return this.f257124b;
    }
}
