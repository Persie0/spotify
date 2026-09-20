package p204p;

import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.session.legacy.PlaybackStateCompat;

/* JADX INFO: loaded from: classes2.dex */
public final class tn20 implements wxb1 {

    /* JADX INFO: renamed from: a */
    public long f221864a;

    /* JADX INFO: renamed from: b */
    public final Object f221865b;

    public tn20(vuu0 vuu0Var) {
        this.f221865b = vuu0Var;
        this.f221864a = PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
    }

    @Override // p204p.wxb1
    /* JADX INFO: renamed from: a */
    public void mo33237a(VideoFrameProcessingException videoFrameProcessingException) {
        ((ze21) this.f221865b).f281861f.execute(new mpd0(24, this, videoFrameProcessingException));
    }

    @Override // p204p.wxb1
    /* JADX INFO: renamed from: b */
    public void mo81148b(long j, boolean z) {
        ze21 ze21Var = (ze21) this.f221865b;
        if (j == 0) {
            ze21Var.f281867l = true;
        }
        this.f221864a = j;
        ze21Var.f281861f.execute(new mci0(this, j, z, 1));
    }

    @Override // p204p.wxb1
    /* JADX INFO: renamed from: d */
    public void mo81149d(int i, int i2) {
        ((ze21) this.f221865b).f281861f.execute(new lci0(this, i, i2, 1));
    }

    @Override // p204p.wxb1
    /* JADX INFO: renamed from: e */
    public void mo81150e(float f) {
        ((ze21) this.f221865b).f281861f.execute(new kci0(this, f, 1));
    }

    @Override // p204p.wxb1
    /* JADX INFO: renamed from: j */
    public void mo33243j() {
        ((ze21) this.f221865b).f281861f.execute(new rsz0(this, 5));
    }

    public tn20(ze21 ze21Var) {
        this.f221865b = ze21Var;
    }
}
