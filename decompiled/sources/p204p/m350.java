package p204p;

import java.util.Arrays;

/* JADX INFO: loaded from: classes11.dex */
public final class m350 extends vdr0 {

    /* JADX INFO: renamed from: a */
    public int[] f139532a;

    /* JADX INFO: renamed from: b */
    public int f139533b;

    @Override // p204p.vdr0
    /* JADX INFO: renamed from: a */
    public final Object mo33759a() {
        return Arrays.copyOf(this.f139532a, this.f139533b);
    }

    @Override // p204p.vdr0
    /* JADX INFO: renamed from: b */
    public final void mo33760b(int i) {
        int[] iArr = this.f139532a;
        if (iArr.length < i) {
            int length = iArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f139532a = Arrays.copyOf(iArr, i);
        }
    }

    @Override // p204p.vdr0
    /* JADX INFO: renamed from: d */
    public final int mo33761d() {
        return this.f139533b;
    }
}
