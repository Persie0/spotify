package p204p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableScanSeed;
import io.reactivex.rxjava3.processors.PublishProcessor;
import io.reactivex.rxjava3.schedulers.Schedulers;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class r12 implements onp {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f194686a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f194687b;

    public /* synthetic */ r12(Object obj, int i) {
        this.f194686a = i;
        this.f194687b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00a9  */
    @Override // p204p.onp
    public final void onStart(hc80 hc80Var) {
        zl7 zl7Var;
        switch (this.f194686a) {
            case 0:
                s1e1 s1e1Var = ((t12) this.f194687b).f216124e;
                lh51 lh51Var = (lh51) s1e1Var.f204705d;
                x0h1.m89578u((c9k) lh51Var.f133394c, null, 0, new C1819em(lh51Var, null, 6), 3);
                v12 v12Var = (v12) s1e1Var.f204703b;
                if (v12Var.f236221a) {
                    om0.m67311c((om0) s1e1Var.f204704c, qm0.FOREGROUNDED, v12Var.f236222b, 0L, null, null, null, null, 96);
                    return;
                }
                return;
            case 1:
                o2a o2aVar = (o2a) this.f194687b;
                o2aVar.f160998b.mo23384c(new n10(o2aVar, 19));
                return;
            case 2:
                e0b e0bVar = (e0b) this.f194687b;
                e0bVar.f54929j = ((rwx0) e0bVar.f54923d).f203428a.map(xzk.f267706i).distinctUntilChanged().subscribe(new cf8(e0bVar, 17));
                return;
            case 3:
                ((hr91) this.f194687b).start();
                return;
            case 4:
                u190 u190Var = (u190) this.f194687b;
                di41 di41Var = u190Var.f225725f;
                fbk fbkVar = null;
                if (di41Var != null) {
                    di41Var.mo26601e(null);
                }
                u190Var.f225725f = x0h1.m89578u(kk40.m56661c(u190Var.f225724e), null, 0, new cj40(u190Var, fbkVar, 4), 3);
                return;
            case 5:
                rvw0 rvw0Var = (rvw0) ((tw80) this.f194687b).f224371g;
                if (rvw0Var == null) {
                    wj50.m88260d0("sessionContraption");
                    throw null;
                }
                cyz0 cyz0Var = (cyz0) rvw0Var.f203139a;
                if (cyz0Var != null && (zl7Var = cyz0Var.f43409a) != null) {
                    if (zl7Var instanceof wl7) {
                        qgy0 qgy0Var = (qgy0) ((i4t0) rvw0Var.f203141c).get();
                        if (!(qgy0Var instanceof gy41)) {
                            throw new IllegalStateException("Unknown scope implementation");
                        }
                        if (((jph0) ((gy41) qgy0Var)).m53951c() != null) {
                            ((xoi0) rvw0Var.f203144f).mo33104m(zl7Var);
                        }
                    } else {
                        ((xoi0) rvw0Var.f203144f).mo33104m(zl7Var);
                    }
                }
                iwr iwrVar = (iwr) rvw0Var.f203145g;
                Flowable flowableM23322h = Flowable.m23322h((Flowable) ((wg61) rvw0Var.f203146h).getValue(), (Flowable) ((wg61) rvw0Var.f203147i).getValue(), u6j0.f227358L0);
                b9v0 b9v0Var = new b9v0(rvw0Var, 18);
                flowableM23322h.getClass();
                iwrVar.m51848b(new FlowableScanSeed(flowableM23322h, Functions.m23431h(yl7.f273926a), b9v0Var).m23332L((Scheduler) ((i4t0) rvw0Var.f203142d).get()).subscribe(new l2s0(rvw0Var, 26)));
                return;
            case 6:
                sef0 sef0Var = (sef0) this.f194687b;
                nsz0 nsz0Var = (nsz0) sef0Var.f208287d;
                nsz0Var.disable();
                iwr iwrVar2 = (iwr) sef0Var.f208288e;
                PublishProcessor publishProcessor = nsz0Var.f157938b;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                publishProcessor.getClass();
                iwrVar2.m51848b(publishProcessor.m23354r(1000L, Schedulers.f10369b).m23356t(Functions.f7225a).m23360y(new l3d0(sef0Var, 12)).subscribe(new qbj0(sef0Var, 11)));
                nsz0Var.enable();
                return;
            case 7:
                sdk0.m77846a((sdk0) this.f194687b);
                return;
            case 8:
                ((ykn) this.f194687b).m94105w1();
                return;
            case 9:
                ((xoi0) ((flw0) this.f194687b).f70879c).mo33104m(q301.f184770a);
                return;
            default:
                hr91 hr91Var = ((yb21) this.f194687b).f271058a;
                if (hr91Var != null) {
                    hr91Var.start();
                    return;
                }
                return;
        }
    }

    @Override // p204p.onp
    public final void onStop(hc80 hc80Var) {
        switch (this.f194686a) {
            case 0:
                s1e1 s1e1Var = ((t12) this.f194687b).f216124e;
                lh51 lh51Var = (lh51) s1e1Var.f204705d;
                x0h1.m89578u((c9k) lh51Var.f133394c, null, 0, new C2069kx(lh51Var, null, 2), 3);
                v12 v12Var = (v12) s1e1Var.f204703b;
                if (v12Var.f236221a) {
                    om0.m67311c((om0) s1e1Var.f204704c, qm0.BACKGROUNDED, v12Var.f236222b, 0L, null, null, null, null, 96);
                    return;
                }
                return;
            case 1:
                o2a o2aVar = (o2a) this.f194687b;
                o2aVar.f160998b.mo23384c(new zu3(o2aVar, 3));
                return;
            case 2:
                Disposable disposable = ((e0b) this.f194687b).f54929j;
                if (disposable != null) {
                    disposable.dispose();
                    return;
                }
                return;
            case 3:
                ((hr91) this.f194687b).stop();
                return;
            case 4:
                di41 di41Var = ((u190) this.f194687b).f225725f;
                if (di41Var != null) {
                    di41Var.mo26601e(null);
                    return;
                }
                return;
            case 5:
                rvw0 rvw0Var = (rvw0) ((tw80) this.f194687b).f224371g;
                if (rvw0Var == null) {
                    wj50.m88260d0("sessionContraption");
                    throw null;
                }
                ((iwr) rvw0Var.f203145g).m51847a();
                ((xoi0) rvw0Var.f203144f).mo33104m(yl7.f273926a);
                return;
            case 6:
                sef0 sef0Var = (sef0) this.f194687b;
                ((nsz0) sef0Var.f208287d).disable();
                ((iwr) sef0Var.f208288e).m51847a();
                return;
            case 7:
                sdk0.m77846a((sdk0) this.f194687b);
                return;
            case 8:
                ((ykn) this.f194687b).m94105w1();
                return;
            case 9:
                ((xoi0) ((flw0) this.f194687b).f70879c).mo33104m(q301.f184771b);
                return;
            default:
                hr91 hr91Var = ((yb21) this.f194687b).f271058a;
                if (hr91Var != null) {
                    hr91Var.stop();
                    return;
                }
                return;
        }
    }
}
