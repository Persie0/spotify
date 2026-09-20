package p204p;

import java.util.Arrays;

/* JADX INFO: loaded from: classes11.dex */
public final class ntc extends vdr0 {

    /* JADX INFO: renamed from: a */
    public char[] f158043a;

    /* JADX INFO: renamed from: b */
    public int f158044b;

    @Override // p204p.vdr0
    /* JADX INFO: renamed from: a */
    public final Object mo33759a() {
        return Arrays.copyOf(this.f158043a, this.f158044b);
    }

    @Override // p204p.vdr0
    /* JADX INFO: renamed from: b */
    public final void mo33760b(int i) {
        char[] cArr = this.f158043a;
        if (cArr.length < i) {
            int length = cArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f158043a = Arrays.copyOf(cArr, i);
        }
    }

    @Override // p204p.vdr0
    /* JADX INFO: renamed from: d */
    public final int mo33761d() {
        return this.f158044b;
    }
}
