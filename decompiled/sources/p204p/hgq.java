package p204p;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hgq implements sxb1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f91189a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f91190b;

    public /* synthetic */ hgq(Object obj, int i) {
        this.f91189a = i;
        this.f91190b = obj;
    }

    @Override // p204p.sxb1
    public final void run() {
        switch (this.f91189a) {
            case 0:
                ((CountDownLatch) this.f91190b).countDown();
                break;
            case 1:
                hr81 hr81Var = ((w071) this.f91190b).f246662e;
                hr81Var.getClass();
                hr81Var.m48330A();
                qpo.m73450a();
                break;
            case 2:
                ((hr81) this.f91190b).mo34259w();
                break;
            default:
                ((AbstractC2440u5) this.f91190b).mo50698l();
                break;
        }
    }
}
