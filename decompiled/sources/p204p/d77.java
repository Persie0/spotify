package p204p;

import android.media.AudioTrack;

/* JADX INFO: loaded from: classes3.dex */
public final class d77 {

    /* JADX INFO: renamed from: a */
    public final c77 f46005a;

    /* JADX INFO: renamed from: b */
    public final int f46006b;

    /* JADX INFO: renamed from: c */
    public final ihj0 f46007c;

    /* JADX INFO: renamed from: d */
    public int f46008d;

    /* JADX INFO: renamed from: e */
    public long f46009e;

    /* JADX INFO: renamed from: f */
    public long f46010f;

    /* JADX INFO: renamed from: g */
    public long f46011g;

    /* JADX INFO: renamed from: h */
    public long f46012h;

    /* JADX INFO: renamed from: i */
    public long f46013i;

    public d77(AudioTrack audioTrack, ihj0 ihj0Var) {
        this.f46005a = new c77(audioTrack);
        this.f46006b = audioTrack.getSampleRate();
        this.f46007c = ihj0Var;
        m35186a(0);
    }

    /* JADX INFO: renamed from: a */
    public final void m35186a(int i) {
        this.f46008d = i;
        if (i == 0) {
            this.f46011g = 0L;
            this.f46012h = -1L;
            this.f46013i = -9223372036854775807L;
            this.f46009e = System.nanoTime() / 1000;
            this.f46010f = 10000L;
            return;
        }
        if (i == 1) {
            this.f46010f = 10000L;
            return;
        }
        if (i == 2 || i == 3) {
            this.f46010f = 10000000L;
        } else {
            if (i != 4) {
                throw new IllegalStateException();
            }
            this.f46010f = 500000L;
        }
    }
}
