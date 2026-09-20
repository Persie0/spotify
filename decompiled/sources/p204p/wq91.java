package p204p;

import java.util.Arrays;

/* JADX INFO: loaded from: classes11.dex */
public final class wq91 extends vdr0 {

    /* JADX INFO: renamed from: a */
    public byte[] f253952a;

    /* JADX INFO: renamed from: b */
    public int f253953b;

    @Override // p204p.vdr0
    /* JADX INFO: renamed from: a */
    public final Object mo33759a() {
        return new vq91(Arrays.copyOf(this.f253952a, this.f253953b));
    }

    @Override // p204p.vdr0
    /* JADX INFO: renamed from: b */
    public final void mo33760b(int i) {
        byte[] bArr = this.f253952a;
        if (bArr.length < i) {
            int length = bArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f253952a = Arrays.copyOf(bArr, i);
        }
    }

    @Override // p204p.vdr0
    /* JADX INFO: renamed from: d */
    public final int mo33761d() {
        return this.f253953b;
    }
}
