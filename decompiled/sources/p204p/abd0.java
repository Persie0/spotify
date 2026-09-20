package p204p;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import androidx.media3.exoplayer.video.C0068b;
import androidx.media3.exoplayer.video.VideoSink$VideoSinkException;

/* JADX INFO: loaded from: classes3.dex */
public final class abd0 implements g9c1 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0068b f14094b;

    public abd0(C0068b c0068b) {
        this.f14094b = c0068b;
    }

    @Override // p204p.g9c1
    /* JADX INFO: renamed from: a */
    public final void mo24871a() {
        C0068b c0068b = this.f14094b;
        Surface surface = c0068b.f1034C2;
        if (surface != null) {
            bka1 bka1Var = c0068b.f1062j2;
            Handler handler = (Handler) bka1Var.f27887b;
            if (handler != null) {
                handler.post(new vpo(bka1Var, surface, SystemClock.elapsedRealtime(), 3));
            }
            c0068b.f1037F2 = true;
        }
    }

    @Override // p204p.g9c1
    /* JADX INFO: renamed from: c */
    public final void mo24873c(VideoSink$VideoSinkException videoSink$VideoSinkException) {
        r300 r300Var = videoSink$VideoSinkException.f1017a;
        C0068b c0068b = this.f14094b;
        c0068b.f239214V1 = c0068b.m65998b(videoSink$VideoSinkException, r300Var, false, 7001);
    }

    @Override // p204p.g9c1
    /* JADX INFO: renamed from: d */
    public final void mo24874d() {
        C0068b c0068b = this.f14094b;
        if (c0068b.f1034C2 != null) {
            c0068b.m840j1(0, 1);
        }
    }

    @Override // p204p.g9c1
    /* JADX INFO: renamed from: e */
    public final void mo25348e() {
        jjx jjxVar = this.f14094b.f239236h1;
        if (jjxVar != null) {
            jjxVar.m53580a();
        }
    }

    @Override // p204p.g9c1
    /* JADX INFO: renamed from: b */
    public final void mo24872b(k9c1 k9c1Var) {
    }
}
