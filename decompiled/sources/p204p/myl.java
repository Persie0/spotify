package p204p;

import android.media.MediaCodec;

/* JADX INFO: loaded from: classes3.dex */
public final class myl {

    /* JADX INFO: renamed from: a */
    public byte[] f148471a;

    /* JADX INFO: renamed from: b */
    public byte[] f148472b;

    /* JADX INFO: renamed from: c */
    public int f148473c;

    /* JADX INFO: renamed from: d */
    public int[] f148474d;

    /* JADX INFO: renamed from: e */
    public int[] f148475e;

    /* JADX INFO: renamed from: f */
    public int f148476f;

    /* JADX INFO: renamed from: g */
    public int f148477g;

    /* JADX INFO: renamed from: h */
    public int f148478h;

    /* JADX INFO: renamed from: i */
    public final MediaCodec.CryptoInfo f148479i;

    /* JADX INFO: renamed from: j */
    public final ujh f148480j;

    public myl() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f148479i = cryptoInfo;
        this.f148480j = new ujh(cryptoInfo);
    }
}
