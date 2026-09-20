package p204p;

import java.util.Arrays;

/* JADX INFO: loaded from: classes11.dex */
public final class rg11 extends vdr0 {

    /* JADX INFO: renamed from: a */
    public short[] f198798a;

    /* JADX INFO: renamed from: b */
    public int f198799b;

    @Override // p204p.vdr0
    /* JADX INFO: renamed from: a */
    public final Object mo33759a() {
        return Arrays.copyOf(this.f198798a, this.f198799b);
    }

    @Override // p204p.vdr0
    /* JADX INFO: renamed from: b */
    public final void mo33760b(int i) {
        short[] sArr = this.f198798a;
        if (sArr.length < i) {
            int length = sArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f198798a = Arrays.copyOf(sArr, i);
        }
    }

    @Override // p204p.vdr0
    /* JADX INFO: renamed from: d */
    public final int mo33761d() {
        return this.f198799b;
    }
}
