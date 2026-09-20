package p204p;

import android.app.Application;
import android.os.Handler;
import android.provider.Settings;

/* JADX INFO: loaded from: classes4.dex */
public final class l6p0 extends f0p0 {

    /* JADX INFO: renamed from: z1 */
    public static final /* synthetic */ qr60[] f130425z1 = {new spi0(l6p0.class, "latestState", "getLatestState()Lcom/spotify/adsinternal/playback/video/observer/PlaybackVolumeObserver$AudioState;", 0), new spi0(l6p0.class, "currentVolume", "getCurrentVolume()I", 0)};

    /* JADX INFO: renamed from: s1 */
    public final dt0 f130426s1;

    /* JADX INFO: renamed from: t1 */
    public final om0 f130427t1;

    /* JADX INFO: renamed from: u1 */
    public final hz6 f130428u1;

    /* JADX INFO: renamed from: v1 */
    public final Application f130429v1;

    /* JADX INFO: renamed from: w1 */
    public final ar8 f130430w1;

    /* JADX INFO: renamed from: x1 */
    public final k6p0 f130431x1;

    /* JADX INFO: renamed from: y1 */
    public final k6p0 f130432y1;

    public l6p0(dt0 dt0Var, et0 et0Var, om0 om0Var, hz6 hz6Var, Application application, Handler handler) {
        super(et0Var);
        this.f130426s1 = dt0Var;
        this.f130427t1 = om0Var;
        this.f130428u1 = hz6Var;
        this.f130429v1 = application;
        this.f130430w1 = new ar8(this, handler, 2);
        this.f130431x1 = new k6p0(new j6p0(false, ((pz6) hz6Var).m71693d()), this, 0);
        this.f130432y1 = new k6p0(Integer.valueOf(((pz6) hz6Var).m71693d()), this, 1);
    }

    /* JADX INFO: renamed from: X */
    public static final void m58383X(l6p0 l6p0Var, qm0 qm0Var, String str) {
        om0 om0Var = l6p0Var.f130427t1;
        dt0 dt0Var = l6p0Var.f130426s1;
        f0p0.m40496W(l6p0Var, om0Var, qm0Var, dt0Var.f52681a, null, str, dt0Var.f52683c, 4);
    }

    @Override // p204p.ozo0
    /* JADX INFO: renamed from: P */
    public final void mo36164P(long j, long j2, boolean z) {
        qr60[] qr60VarArr = f130425z1;
        qr60 qr60Var = qr60VarArr[0];
        k6p0 k6p0Var = this.f130431x1;
        j6p0 j6p0Var = (j6p0) k6p0Var.f61172a;
        int i = j6p0Var.f109377b;
        j6p0Var.getClass();
        k6p0Var.m39516c(qr60VarArr[0], this, new j6p0(z, i));
    }

    @Override // p204p.f0p0, p204p.ma9, p204p.ozo0
    /* JADX INFO: renamed from: Q */
    public final void mo25537Q(clq clqVar, int i, long j, long j2) {
        super.mo25537Q(clqVar, i, j, j2);
        this.f130429v1.getContentResolver().unregisterContentObserver(this.f130430w1);
    }

    @Override // p204p.f0p0
    /* JADX INFO: renamed from: U */
    public final void mo40498U(long j) {
        this.f130429v1.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this.f130430w1);
    }
}
