package p204p;

import java.util.Arrays;

/* JADX INFO: loaded from: classes11.dex */
public final class qs91 extends vdr0 {

    /* JADX INFO: renamed from: a */
    public short[] f192047a;

    /* JADX INFO: renamed from: b */
    public int f192048b;

    @Override // p204p.vdr0
    /* JADX INFO: renamed from: a */
    public final Object mo33759a() {
        return new ps91(Arrays.copyOf(this.f192047a, this.f192048b));
    }

    @Override // p204p.vdr0
    /* JADX INFO: renamed from: b */
    public final void mo33760b(int i) {
        short[] sArr = this.f192047a;
        if (sArr.length < i) {
            int length = sArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f192047a = Arrays.copyOf(sArr, i);
        }
    }

    @Override // p204p.vdr0
    /* JADX INFO: renamed from: d */
    public final int mo33761d() {
        return this.f192048b;
    }
}
