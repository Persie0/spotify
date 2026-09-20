package p204p;

import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class gmq implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f81444a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ imq f81445b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Runnable f81446c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ nfp f81447d;

    public /* synthetic */ gmq(imq imqVar, Runnable runnable, nfp nfpVar, int i) {
        this.f81444a = i;
        this.f81445b = imqVar;
        this.f81446c = runnable;
        this.f81447d = nfpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f81444a) {
            case 0:
                ExecutorService executorService = this.f81445b.f103767a;
                final int i = 0;
                final Runnable runnable = this.f81446c;
                final nfp nfpVar = this.f81447d;
                executorService.execute(new Runnable() { // from class: p.emq
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i) {
                            case 0:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e) {
                                    nfpVar.m64361m(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e2) {
                                    nfpVar.m64361m(e2);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                nfp nfpVar2 = nfpVar;
                                try {
                                    runnable2.run();
                                    nfpVar2.m64360l(null);
                                    return;
                                } catch (Exception e3) {
                                    nfpVar2.m64361m(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 1:
                ExecutorService executorService2 = this.f81445b.f103767a;
                final int i2 = 2;
                final Runnable runnable2 = this.f81446c;
                final nfp nfpVar2 = this.f81447d;
                executorService2.execute(new Runnable() { // from class: p.emq
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i2) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    nfpVar2.m64361m(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    nfpVar2.m64361m(e2);
                                    return;
                                }
                            default:
                                Runnable runnable3 = runnable2;
                                nfp nfpVar3 = nfpVar2;
                                try {
                                    runnable3.run();
                                    nfpVar3.m64360l(null);
                                    return;
                                } catch (Exception e3) {
                                    nfpVar3.m64361m(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
            default:
                ExecutorService executorService3 = this.f81445b.f103767a;
                final int i3 = 1;
                final Runnable runnable3 = this.f81446c;
                final nfp nfpVar3 = this.f81447d;
                executorService3.execute(new Runnable() { // from class: p.emq
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i3) {
                            case 0:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e) {
                                    nfpVar3.m64361m(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e2) {
                                    nfpVar3.m64361m(e2);
                                    return;
                                }
                            default:
                                Runnable runnable4 = runnable3;
                                nfp nfpVar4 = nfpVar3;
                                try {
                                    runnable4.run();
                                    nfpVar4.m64360l(null);
                                    return;
                                } catch (Exception e3) {
                                    nfpVar4.m64361m(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
        }
    }
}
