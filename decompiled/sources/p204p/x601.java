package p204p;

import com.spotify.playbacknative.AudioDriver;

/* JADX INFO: loaded from: classes2.dex */
public final class x601 {

    /* JADX INFO: renamed from: a */
    public int f258552a;

    /* JADX INFO: renamed from: b */
    public final int[] f258553b = new int[10];

    /* JADX INFO: renamed from: a */
    public final int m90052a() {
        return (this.f258552a & 16) != 0 ? this.f258553b[4] : AudioDriver.SPOTIFY_MAX_VOLUME;
    }

    /* JADX INFO: renamed from: b */
    public final void m90053b(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.f258553b;
            if (i >= iArr.length) {
                return;
            }
            this.f258552a = (1 << i) | this.f258552a;
            iArr[i] = i2;
        }
    }
}
