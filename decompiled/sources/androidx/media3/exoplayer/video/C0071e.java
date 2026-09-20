package androidx.media3.exoplayer.video;

import android.content.Context;
import android.os.Build;
import android.view.Surface;

/* JADX INFO: renamed from: androidx.media3.exoplayer.video.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C0071e {

    /* JADX INFO: renamed from: a */
    public final Context f1093a;

    /* JADX INFO: renamed from: b */
    public boolean f1094b;

    /* JADX INFO: renamed from: c */
    public VideoFrameReleaseHelper$VSyncSampler f1095c;

    /* JADX INFO: renamed from: d */
    public boolean f1096d;

    /* JADX INFO: renamed from: e */
    public Surface f1097e;

    /* JADX INFO: renamed from: f */
    public float f1098f;

    /* JADX INFO: renamed from: g */
    public float f1099g;

    /* JADX INFO: renamed from: h */
    public float f1100h = 1.0f;

    /* JADX INFO: renamed from: i */
    public int f1101i = 0;

    /* JADX INFO: renamed from: j */
    public long f1102j;

    /* JADX INFO: renamed from: k */
    public long f1103k;

    /* JADX INFO: renamed from: l */
    public long f1104l;

    /* JADX INFO: renamed from: m */
    public long f1105m;

    /* JADX INFO: renamed from: n */
    public long f1106n;

    /* JADX INFO: renamed from: o */
    public long f1107o;

    /* JADX INFO: renamed from: p */
    public long f1108p;

    /* JADX INFO: renamed from: q */
    public long f1109q;

    public C0071e(Context context) {
        this.f1093a = context;
    }

    /* JADX INFO: renamed from: a */
    public final void m865a() {
        Surface surface;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.f1097e) == null || this.f1101i == Integer.MIN_VALUE || this.f1099g == 0.0f || !surface.isValid()) {
            return;
        }
        this.f1099g = 0.0f;
        VideoFrameReleaseHelper$Api30.setSurfaceFrameRate(this.f1097e, 0.0f);
    }

    /* JADX INFO: renamed from: b */
    public final void m866b() {
        this.f1107o = -1L;
        this.f1104l = -1L;
        this.f1106n = -9223372036854775807L;
        this.f1102j = 0L;
        this.f1103k = 0L;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0027  */
    /* JADX INFO: renamed from: c */
    public final void m867c(boolean z) {
        Surface surface;
        float f;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.f1097e) == null || this.f1101i == Integer.MIN_VALUE || !surface.isValid()) {
            return;
        }
        if (this.f1096d) {
            float f2 = this.f1098f;
            if (f2 != -1.0f) {
                f = f2 * this.f1100h;
            } else {
                f = 0.0f;
            }
        } else {
            f = 0.0f;
        }
        if (z || this.f1099g != f) {
            this.f1099g = f;
            VideoFrameReleaseHelper$Api30.setSurfaceFrameRate(this.f1097e, f);
        }
    }
}
