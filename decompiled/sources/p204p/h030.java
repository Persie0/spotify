package p204p;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class h030 extends mce {

    /* JADX INFO: renamed from: j */
    public byte[] f86118j;

    /* JADX INFO: renamed from: k */
    public volatile boolean f86119k;

    /* JADX INFO: renamed from: l */
    public byte[] f86120l;

    @Override // p204p.k7a0
    /* JADX INFO: renamed from: a */
    public final void mo38892a() {
        try {
            this.f142142i.mo28175u(this.f142135b);
            int i = 0;
            int i2 = 0;
            while (i != -1 && !this.f86119k) {
                byte[] bArr = this.f86118j;
                if (bArr.length < i2 + 16384) {
                    this.f86118j = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i = this.f142142i.read(this.f86118j, i2, 16384);
                if (i != -1) {
                    i2 += i;
                }
            }
            if (!this.f86119k) {
                this.f86120l = Arrays.copyOf(this.f86118j, i2);
            }
        } finally {
            mag1.m61306p(this.f142142i);
        }
    }

    @Override // p204p.k7a0
    /* JADX INFO: renamed from: b */
    public final void mo38893b() {
        this.f86119k = true;
    }
}
