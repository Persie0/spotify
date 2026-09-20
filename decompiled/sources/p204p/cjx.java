package p204p;

import android.media.MediaFormat;

/* JADX INFO: loaded from: classes3.dex */
public final class cjx implements oxb1, dgb, iap0 {

    /* JADX INFO: renamed from: a */
    public oxb1 f38696a;

    /* JADX INFO: renamed from: b */
    public dgb f38697b;

    /* JADX INFO: renamed from: c */
    public oxb1 f38698c;

    /* JADX INFO: renamed from: d */
    public dgb f38699d;

    @Override // p204p.oxb1
    /* JADX INFO: renamed from: a */
    public final void mo33002a(long j, long j2, r300 r300Var, MediaFormat mediaFormat) {
        long j3;
        long j4;
        r300 r300Var2;
        MediaFormat mediaFormat2;
        oxb1 oxb1Var = this.f38698c;
        if (oxb1Var != null) {
            oxb1Var.mo33002a(j, j2, r300Var, mediaFormat);
            mediaFormat2 = mediaFormat;
            r300Var2 = r300Var;
            j4 = j2;
            j3 = j;
        } else {
            j3 = j;
            j4 = j2;
            r300Var2 = r300Var;
            mediaFormat2 = mediaFormat;
        }
        oxb1 oxb1Var2 = this.f38696a;
        if (oxb1Var2 != null) {
            oxb1Var2.mo33002a(j3, j4, r300Var2, mediaFormat2);
        }
    }

    @Override // p204p.dgb
    /* JADX INFO: renamed from: b */
    public final void mo33003b(long j, float[] fArr) {
        dgb dgbVar = this.f38699d;
        if (dgbVar != null) {
            dgbVar.mo33003b(j, fArr);
        }
        dgb dgbVar2 = this.f38697b;
        if (dgbVar2 != null) {
            dgbVar2.mo33003b(j, fArr);
        }
    }

    @Override // p204p.iap0
    /* JADX INFO: renamed from: c */
    public final void mo827c(int i, Object obj) {
        if (i == 7) {
            this.f38696a = (oxb1) obj;
            return;
        }
        if (i == 8) {
            this.f38697b = (dgb) obj;
            return;
        }
        if (i != 10000) {
            return;
        }
        y541 y541Var = (y541) obj;
        if (y541Var == null) {
            this.f38698c = null;
            this.f38699d = null;
        } else {
            this.f38698c = y541Var.getVideoFrameMetadataListener();
            this.f38699d = y541Var.getCameraMotionListener();
        }
    }

    @Override // p204p.dgb
    /* JADX INFO: renamed from: d */
    public final void mo33004d() {
        dgb dgbVar = this.f38699d;
        if (dgbVar != null) {
            dgbVar.mo33004d();
        }
        dgb dgbVar2 = this.f38697b;
        if (dgbVar2 != null) {
            dgbVar2.mo33004d();
        }
    }
}
