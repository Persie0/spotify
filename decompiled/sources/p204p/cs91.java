package p204p;

import java.util.Arrays;

/* JADX INFO: loaded from: classes11.dex */
public final class cs91 extends vdr0 {

    /* JADX INFO: renamed from: a */
    public long[] f41497a;

    /* JADX INFO: renamed from: b */
    public int f41498b;

    @Override // p204p.vdr0
    /* JADX INFO: renamed from: a */
    public final Object mo33759a() {
        return new bs91(Arrays.copyOf(this.f41497a, this.f41498b));
    }

    @Override // p204p.vdr0
    /* JADX INFO: renamed from: b */
    public final void mo33760b(int i) {
        long[] jArr = this.f41497a;
        if (jArr.length < i) {
            int length = jArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f41497a = Arrays.copyOf(jArr, i);
        }
    }

    @Override // p204p.vdr0
    /* JADX INFO: renamed from: d */
    public final int mo33761d() {
        return this.f41498b;
    }
}
