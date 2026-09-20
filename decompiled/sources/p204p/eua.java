package p204p;

import java.util.Arrays;

/* JADX INFO: loaded from: classes11.dex */
public final class eua extends vdr0 {

    /* JADX INFO: renamed from: a */
    public byte[] f62925a;

    /* JADX INFO: renamed from: b */
    public int f62926b;

    public eua(byte[] bArr) {
        this.f62925a = bArr;
        this.f62926b = bArr.length;
        mo33760b(10);
    }

    @Override // p204p.vdr0
    /* JADX INFO: renamed from: a */
    public final Object mo33759a() {
        return Arrays.copyOf(this.f62925a, this.f62926b);
    }

    @Override // p204p.vdr0
    /* JADX INFO: renamed from: b */
    public final void mo33760b(int i) {
        byte[] bArr = this.f62925a;
        if (bArr.length < i) {
            int length = bArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f62925a = Arrays.copyOf(bArr, i);
        }
    }

    @Override // p204p.vdr0
    /* JADX INFO: renamed from: d */
    public final int mo33761d() {
        return this.f62926b;
    }

    /* JADX INFO: renamed from: e */
    public final void m40050e(byte b) {
        mo33760b(mo33761d() + 1);
        byte[] bArr = this.f62925a;
        int i = this.f62926b;
        this.f62926b = i + 1;
        bArr[i] = b;
    }
}
