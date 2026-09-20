package p204p;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class fmq implements jmq {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f71106a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ imq f71107b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Runnable f71108c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ long f71109d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ long f71110e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ TimeUnit f71111f;

    public /* synthetic */ fmq(imq imqVar, Runnable runnable, long j, long j2, TimeUnit timeUnit, int i) {
        this.f71106a = i;
        this.f71107b = imqVar;
        this.f71108c = runnable;
        this.f71109d = j;
        this.f71110e = j2;
        this.f71111f = timeUnit;
    }

    @Override // p204p.jmq
    /* JADX INFO: renamed from: b */
    public final ScheduledFuture mo36423b(nfp nfpVar) {
        switch (this.f71106a) {
            case 0:
                imq imqVar = this.f71107b;
                return imqVar.f103768b.scheduleAtFixedRate(new gmq(imqVar, this.f71108c, nfpVar, 0), this.f71109d, this.f71110e, this.f71111f);
            default:
                imq imqVar2 = this.f71107b;
                return imqVar2.f103768b.scheduleWithFixedDelay(new gmq(imqVar2, this.f71108c, nfpVar, 2), this.f71109d, this.f71110e, this.f71111f);
        }
    }
}
