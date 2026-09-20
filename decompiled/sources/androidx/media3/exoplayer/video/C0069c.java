package androidx.media3.exoplayer.video;

import android.content.Context;
import android.os.SystemClock;
import android.view.Surface;
import p204p.c95;
import p204p.gh61;
import p204p.gha;
import p204p.h0b1;

/* JADX INFO: renamed from: androidx.media3.exoplayer.video.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C0069c {

    /* JADX INFO: renamed from: a */
    public final C0068b f1079a;

    /* JADX INFO: renamed from: b */
    public final C0071e f1080b;

    /* JADX INFO: renamed from: c */
    public final long f1081c;

    /* JADX INFO: renamed from: d */
    public boolean f1082d;

    /* JADX INFO: renamed from: g */
    public long f1085g;

    /* JADX INFO: renamed from: i */
    public boolean f1087i;

    /* JADX INFO: renamed from: l */
    public boolean f1090l;

    /* JADX INFO: renamed from: m */
    public boolean f1091m;

    /* JADX INFO: renamed from: e */
    public int f1083e = 0;

    /* JADX INFO: renamed from: f */
    public long f1084f = -9223372036854775807L;

    /* JADX INFO: renamed from: h */
    public long f1086h = -9223372036854775807L;

    /* JADX INFO: renamed from: j */
    public float f1088j = 1.0f;

    /* JADX INFO: renamed from: k */
    public gh61 f1089k = gh61.f79843a;

    public C0069c(Context context, C0068b c0068b, long j) {
        this.f1079a = c0068b;
        this.f1081c = j;
        this.f1080b = new C0071e(context);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0079  */
    /* JADX WARN: Code duplicated, block: B:77:0x0140  */
    /* JADX INFO: renamed from: a */
    public final int m858a(long j, long j2, long j3, long j4, boolean z, boolean z2, long j5, long j6, gha ghaVar) {
        boolean z3;
        long j7;
        long j8;
        long j9;
        float f;
        float f2;
        ghaVar.f79860a = -9223372036854775807L;
        ghaVar.f79861b = -9223372036854775807L;
        boolean z4 = this.f1082d;
        if (z4 && this.f1084f == -9223372036854775807L) {
            this.f1084f = j2;
        }
        long jM46295W = (long) ((j - j2) / ((double) this.f1088j));
        if (z4) {
            this.f1089k.getClass();
            jM46295W -= h0b1.m46295W(SystemClock.elapsedRealtime()) - j3;
        }
        ghaVar.f79860a = jM46295W;
        if (!z || z2) {
            if (this.f1090l) {
                boolean z5 = false;
                if (this.f1086h == -9223372036854775807L || this.f1087i) {
                    int i = this.f1083e;
                    if (i != 0) {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    throw new IllegalStateException();
                                }
                                this.f1089k.getClass();
                                long jM46295W2 = h0b1.m46295W(SystemClock.elapsedRealtime()) - this.f1085g;
                                if (this.f1082d) {
                                    long j10 = this.f1084f;
                                    if (j10 == -9223372036854775807L || j10 == j2 || jM46295W >= -30000 || jM46295W2 <= 100000) {
                                    }
                                }
                                z3 = false;
                            } else if (j2 < j4) {
                                z3 = false;
                            }
                        }
                        z3 = true;
                    } else {
                        z3 = this.f1082d;
                    }
                } else {
                    z3 = false;
                }
                if (z3) {
                    return 0;
                }
                if (!this.f1082d || j2 == this.f1084f) {
                    return 5;
                }
                this.f1089k.getClass();
                long jNanoTime = System.nanoTime();
                C0071e c0071e = this.f1080b;
                long j11 = (ghaVar.f79860a * 1000) + jNanoTime;
                long j12 = c0071e.f1106n;
                if (j != j12) {
                    c0071e.f1107o = c0071e.f1104l;
                    c0071e.f1108p = c0071e.f1105m;
                    c0071e.f1109q = j12;
                    c0071e.f1102j = c0071e.f1103k;
                }
                long j13 = c0071e.f1107o;
                if (j13 != -1) {
                    if (j5 != -9223372036854775807L) {
                        f = (j6 - j13) * j5;
                        f2 = c0071e.f1100h;
                    } else {
                        f = (j - c0071e.f1109q) * 1000;
                        f2 = c0071e.f1100h;
                    }
                    long j14 = c0071e.f1108p + ((long) (f / f2));
                    if (Math.abs(j11 - j14) <= 20000000) {
                        j11 = j14;
                    } else {
                        c0071e.m866b();
                    }
                }
                c0071e.f1104l = j6;
                c0071e.f1105m = j11;
                c0071e.f1106n = j;
                VideoFrameReleaseHelper$VSyncSampler videoFrameReleaseHelper$VSyncSampler = c0071e.f1095c;
                if (videoFrameReleaseHelper$VSyncSampler == null) {
                    j9 = jNanoTime;
                } else {
                    long j15 = videoFrameReleaseHelper$VSyncSampler.sampledVsyncTimeNs;
                    long j16 = c0071e.f1095c.vsyncDurationNs;
                    if (j15 == -9223372036854775807L || j16 == -9223372036854775807L) {
                        j9 = jNanoTime;
                    } else {
                        long j17 = (((j11 - j15) / j16) * j16) + j15;
                        if (j11 <= j17) {
                            j7 = j17 - j16;
                        } else {
                            j17 += j16;
                            j7 = j17;
                        }
                        long j18 = j17 - j11;
                        long j19 = j11 - j7;
                        long jAbs = Math.abs(j18 - j19);
                        if (jAbs < j16 / 2) {
                            j8 = j7;
                            long j20 = j16 / 4;
                            j9 = jNanoTime;
                            if (jAbs < j20) {
                                long j21 = c0071e.f1102j;
                                if (j21 != 0) {
                                    c0071e.f1103k = j21;
                                } else {
                                    if (j18 < j19) {
                                        j20 = -j20;
                                    }
                                    c0071e.f1103k = j20;
                                }
                            } else {
                                c0071e.f1103k = 0L;
                            }
                        } else {
                            j8 = j7;
                            j9 = jNanoTime;
                            c0071e.f1103k = c0071e.f1102j;
                        }
                        if (j18 + c0071e.f1103k >= j19) {
                            j17 = j8;
                        }
                        j11 = j17 - ((j16 * 80) / 100);
                    }
                }
                ghaVar.f79861b = j11;
                long j22 = (j11 - j9) / 1000;
                ghaVar.f79860a = j22;
                boolean z6 = (this.f1086h == -9223372036854775807L || this.f1087i) ? false : true;
                if (this.f1079a.m835g1(j22, j2, j3, z2, z6)) {
                    return 4;
                }
                long j23 = ghaVar.f79860a;
                if (j23 < -30000 && !z2) {
                    z5 = true;
                }
                if (z5) {
                    return z6 ? 3 : 2;
                }
                return j23 > 50000 ? 5 : 1;
            }
            if (this.f1079a.m835g1(jM46295W, j2, j3, z2, true)) {
                return 4;
            }
            if (!this.f1082d || ghaVar.f79860a >= 30000) {
                this.f1091m = true;
                return 5;
            }
        }
        return 3;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m859b(boolean z) {
        if (z && (this.f1083e == 3 || (this.f1091m && !this.f1090l))) {
            this.f1086h = -9223372036854775807L;
            return true;
        }
        if (this.f1086h == -9223372036854775807L) {
            return false;
        }
        this.f1089k.getClass();
        if (SystemClock.elapsedRealtime() < this.f1086h) {
            return true;
        }
        this.f1086h = -9223372036854775807L;
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final void m860c(boolean z) {
        long jElapsedRealtime;
        this.f1087i = z;
        long j = this.f1081c;
        if (j > 0) {
            this.f1089k.getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime() + j;
        } else {
            jElapsedRealtime = -9223372036854775807L;
        }
        this.f1086h = jElapsedRealtime;
    }

    /* JADX INFO: renamed from: d */
    public final void m861d() {
        this.f1082d = true;
        this.f1089k.getClass();
        this.f1085g = h0b1.m46295W(SystemClock.elapsedRealtime());
        C0071e c0071e = this.f1080b;
        c0071e.f1096d = true;
        c0071e.m866b();
        if (!c0071e.f1094b) {
            VideoFrameReleaseHelper$VSyncSampler videoFrameReleaseHelper$VSyncSamplerMaybeBuildInstance = VideoFrameReleaseHelper$VSyncSampler.maybeBuildInstance(c0071e.f1093a);
            c0071e.f1095c = videoFrameReleaseHelper$VSyncSamplerMaybeBuildInstance;
            if (videoFrameReleaseHelper$VSyncSamplerMaybeBuildInstance != null) {
                videoFrameReleaseHelper$VSyncSamplerMaybeBuildInstance.listener = null;
            }
            c0071e.f1094b = true;
        }
        VideoFrameReleaseHelper$VSyncSampler videoFrameReleaseHelper$VSyncSampler = c0071e.f1095c;
        if (videoFrameReleaseHelper$VSyncSampler != null) {
            videoFrameReleaseHelper$VSyncSampler.register();
        }
        c0071e.m867c(false);
    }

    /* JADX INFO: renamed from: e */
    public final void m862e(int i) {
        if (i == 0) {
            this.f1083e = 1;
        } else if (i == 1) {
            this.f1083e = 0;
        } else {
            if (i != 2) {
                throw new IllegalStateException();
            }
            this.f1083e = Math.min(this.f1083e, 2);
        }
        this.f1080b.m866b();
    }

    /* JADX INFO: renamed from: f */
    public final void m863f(Surface surface) {
        this.f1090l = surface != null;
        this.f1091m = false;
        C0071e c0071e = this.f1080b;
        if (c0071e.f1097e != surface) {
            c0071e.m865a();
            c0071e.f1097e = surface;
            c0071e.m867c(true);
        }
        this.f1083e = Math.min(this.f1083e, 1);
    }

    /* JADX INFO: renamed from: g */
    public final void m864g(float f) {
        c95.m31843i(f > 0.0f);
        if (f == this.f1088j) {
            return;
        }
        this.f1088j = f;
        C0071e c0071e = this.f1080b;
        c0071e.f1100h = f;
        c0071e.m867c(false);
    }
}
