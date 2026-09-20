package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class rez extends mf9 {
    /* JADX INFO: renamed from: d */
    public static int m75419d(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }
}
