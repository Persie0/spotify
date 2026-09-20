package p204p;

import android.content.Context;
import android.os.Bundle;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import java.util.UUID;

/* JADX INFO: loaded from: classes9.dex */
public final class az1 implements Function, BiFunction, b800, SingleOnSubscribe {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f21393a;

    /* JADX INFO: renamed from: b */
    public Object f21394b;

    public /* synthetic */ az1(Object obj, int i) {
        this.f21393a = i;
        this.f21394b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public Object m27560a(UUID uuid, ibk ibkVar) {
        qv4 qv4Var;
        if (ibkVar instanceof qv4) {
            qv4Var = (qv4) ibkVar;
            int i = qv4Var.f192867c;
            if ((i & Integer.MIN_VALUE) != 0) {
                qv4Var.f192867c = i - Integer.MIN_VALUE;
            } else {
                qv4Var = new qv4(this, ibkVar);
            }
        } else {
            qv4Var = new qv4(this, ibkVar);
        }
        Object obj = qv4Var.f192865a;
        int i2 = qv4Var.f192867c;
        if (i2 == 0) {
            bga.m29073P(obj);
            l0e1 l0e1Var = (l0e1) this.f21394b;
            l0e1Var.getClass();
            jbb jbbVar = (jbb) cv9.m33994l(uuid, l0e1Var).f30112b;
            qv4Var.f192867c = 1;
            Object objM63423c = n0e1.m63423c(jbbVar, qv4Var);
            yuk yukVar = yuk.f276404a;
            if (objM63423c == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
        }
        return w2a1.f247311a;
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        ((v02) this.f21394b).m84366g((String) obj, (am81) obj2);
        return w2a1.f247311a;
    }

    @Override // p204p.b800
    /* JADX INFO: renamed from: b */
    public void mo27561b(String str, Bundle bundle) {
        ajy0 ajy0Var;
        if (str.hashCode() == -198424014 && str.equals("ALLBOARDING_SCREEN_RESPONSE") && (ajy0Var = (ajy0) bundle.getParcelable("ALLBOARDING_SCREEN_RESPONSE")) != null) {
            cxe cxeVar = (cxe) this.f21394b;
            ((uyi0) cxeVar.f43011a).m84266t();
            ((k23) cxeVar.f43014d).invoke(ajy0Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public Object m27562c(lnl0 lnl0Var, ibk ibkVar) {
        rv4 rv4Var;
        if (ibkVar instanceof rv4) {
            rv4Var = (rv4) ibkVar;
            int i = rv4Var.f202995c;
            if ((i & Integer.MIN_VALUE) != 0) {
                rv4Var.f202995c = i - Integer.MIN_VALUE;
            } else {
                rv4Var = new rv4(this, ibkVar);
            }
        } else {
            rv4Var = new rv4(this, ibkVar);
        }
        Object obj = rv4Var.f202993a;
        int i2 = rv4Var.f202995c;
        if (i2 == 0) {
            bga.m29073P(obj);
            jbb jbbVar = (jbb) ((l0e1) this.f21394b).m55006s(lnl0Var).f30112b;
            rv4Var.f202995c = 1;
            Object objM63423c = n0e1.m63423c(jbbVar, rv4Var);
            yuk yukVar = yuk.f276404a;
            if (objM63423c == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
        }
        return w2a1.f247311a;
    }

    /* JADX INFO: renamed from: d */
    public void m27563d(gh0 gh0Var, Long l, String str, String str2) {
        if (gh0Var.mo29282h().length() == 0) {
            return;
        }
        om0.m67311c((om0) this.f21394b, qm0.CLICKED, gh0Var.mo29280c(), l, str, str2, null, null, 64);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public Enum m27564e(UUID uuid, ibk ibkVar) {
        sv4 sv4Var;
        if (ibkVar instanceof sv4) {
            sv4Var = (sv4) ibkVar;
            int i = sv4Var.f214311c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sv4Var.f214311c = i - Integer.MIN_VALUE;
            } else {
                sv4Var = new sv4(this, ibkVar);
            }
        } else {
            sv4Var = new sv4(this, ibkVar);
        }
        Object objM86755t = sv4Var.f214309a;
        int i2 = sv4Var.f214311c;
        if (i2 == 0) {
            bga.m29073P(objM86755t);
            fiz fizVarM27743y = b04.m27743y(((l0e1) this.f21394b).f128405B0.mo1155F(), uuid);
            sv4Var.f214311c = 1;
            objM86755t = vyf1.m86755t(fizVarM27743y, sv4Var);
            yuk yukVar = yuk.f276404a;
            if (objM86755t == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM86755t);
        }
        i0e1 i0e1Var = (i0e1) objM86755t;
        if (i0e1Var != null) {
            return i0e1Var.f97219b;
        }
        return null;
    }

    @Override // io.reactivex.rxjava3.core.SingleOnSubscribe
    public void subscribe(SingleEmitter singleEmitter) {
        bji bjiVar;
        switch (this.f21393a) {
            case 15:
                singleEmitter.onSuccess(new zt3(((Boolean) Single.create(new ac5((du3) this.f21394b, 12)).blockingGet()).booleanValue()));
                break;
            case 16:
                fy3 fy3Var = (fy3) this.f21394b;
                singleEmitter.onSuccess(new dy3((cy3) Single.create(new ac5(fy3Var, 13)).blockingGet(), ((Number) Single.create(new dg10(fy3Var, 13)).blockingGet()).intValue()));
                break;
            default:
                gi5 gi5Var = (gi5) this.f21394b;
                fnk0 fnk0Var = gi5Var.f80068r;
                if (fnk0Var == null || !fnk0Var.m42228h("apps-music-libs-eventsender.heartbeat_retry_interval")) {
                    bjiVar = fnk0Var;
                    bjiVar = gi5Var.f80069s;
                }
                if (bjiVar != null) {
                }
                break;
        }
    }

    public az1() {
        this.f21393a = 26;
    }

    public az1(Scheduler scheduler, r3n0 r3n0Var, s59 s59Var, Observable observable) {
        this.f21393a = 1;
        Observable map = observable.startWithItem(afa0.f15106b).map(efy.f59163d1);
        this.f21394b = Observable.combineLatest(Observable.combineLatest(((hzb) ((gzb) r3n0Var.f195525b)).f96882c, (Observable) r3n0Var.f195527d, new hvj0(r3n0Var, 25)), s59Var.f205758a, map, xzk.f267683Q0).skipWhile(b5v.f23719Y0).observeOn(scheduler).distinctUntilChanged().replay(1).m23778f();
    }

    /* JADX WARN: Code duplicated, block: B:24:0x008c  */
    /* JADX WARN: Code duplicated, block: B:65:0x008d A[SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v4 java.lang.Object, still in use, count: 2, list:
          (r6v4 java.lang.Object) from 0x0087: PHI (r6 I:??) = (r6v1 java.lang.Object), (r6v4 java.lang.Object) binds: [B:20:0x0086, B:67:0x0087] A[DONT_GENERATE, DONT_INLINE]
          (r6v4 java.lang.Object) from 0x007c: CHECK_CAST (java.lang.String) (r6v4 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public java.lang.Object mo98394apply(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.az1.mo98394apply(java.lang.Object):java.lang.Object");
    }

    public az1(Context context) {
        this.f21393a = 20;
        this.f21394b = l0e1.m57799S(context);
    }
}
