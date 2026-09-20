package p204p;

import com.spotify.mobius.coroutines.C1037x558fa59a;
import com.spotify.mobius.coroutines.C1044a;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.SerialDisposable;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableDefer;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromPublisher;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public final class dio0 {

    /* JADX INFO: renamed from: a */
    public final hki0 f49449a;

    /* JADX INFO: renamed from: b */
    public final e940 f49450b;

    /* JADX INFO: renamed from: c */
    public final q831 f49451c;

    /* JADX INFO: renamed from: d */
    public final z9j0 f49452d;

    /* JADX INFO: renamed from: e */
    public final luk f49453e;

    /* JADX INFO: renamed from: f */
    public final Scheduler f49454f;

    /* JADX INFO: renamed from: g */
    public final SerialDisposable f49455g = new SerialDisposable();

    /* JADX INFO: renamed from: h */
    public final C1044a f49456h;

    public dio0(hki0 hki0Var, e940 e940Var, q831 q831Var, z9j0 z9j0Var, luk lukVar, luk lukVar2, Scheduler scheduler) {
        this.f49449a = hki0Var;
        this.f49450b = e940Var;
        this.f49451c = q831Var;
        this.f49452d = z9j0Var;
        this.f49453e = lukVar2;
        this.f49454f = scheduler;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderM42464h = fr0.m42464h(MobiusCoroutines.f5725a);
        C1037x558fa59a c1037x558fa59a = new C1037x558fa59a();
        aio0 aio0Var = new aio0(this);
        jqv0 jqv0Var = qpv0.f191387a;
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(lho0.class), c1037x558fa59a.m15633a(aio0Var));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(kho0.class), new C1037x558fa59a().m15633a(new cio0(this)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(mho0.class), new C1037x558fa59a().m15633a(new xho0(this)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(sho0.class), new C1037x558fa59a().m15633a(new yho0(this)));
        this.f49456h = new C1044a(lukVar, coroutinesSubtypeEffectHandlerBuilderM42464h);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m36126a(dio0 dio0Var, lho0 lho0Var, ibk ibkVar) {
        who0 who0Var;
        Object objM47847c;
        if (ibkVar instanceof who0) {
            who0Var = (who0) ibkVar;
            int i = who0Var.f251417d;
            if ((i & Integer.MIN_VALUE) != 0) {
                who0Var.f251417d = i - Integer.MIN_VALUE;
            } else {
                who0Var = new who0(dio0Var, ibkVar);
            }
        } else {
            who0Var = new who0(dio0Var, ibkVar);
        }
        Object obj = who0Var.f251415b;
        int i2 = who0Var.f251417d;
        if (i2 == 0) {
            bga.m29073P(obj);
            hki0 hki0Var = dio0Var.f49449a;
            String str = lho0Var.f133610a;
            int i3 = lho0Var.f133611b;
            who0Var.f251414a = lho0Var;
            who0Var.f251417d = 1;
            objM47847c = hki0Var.m47847c(i3, str, who0Var);
            yuk yukVar = yuk.f276404a;
            if (objM47847c == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lho0Var = who0Var.f251414a;
            bga.m29073P(obj);
            objM47847c = ((s6x0) obj).f206218a;
        }
        Throwable thM77348a = s6x0.m77348a(objM47847c);
        if (thM77348a != null) {
            return new rjo0(lho0Var.f133611b, thM77348a);
        }
        xkx0 xkx0Var = (xkx0) objM47847c;
        x401 x401Var = new x401();
        String str2 = xkx0Var.f262955c;
        if (str2 != null) {
            x401Var.add(str2);
        }
        for (wit0 wit0Var : xkx0Var.f262959g) {
            flt0 flt0Var = wit0Var.f251747c;
            if (flt0Var instanceof blt0) {
                x401Var.add(((blt0) flt0Var).f28286a);
            } else if (flt0Var instanceof dlt0) {
                x401Var.add("https://learning-public-assets-cdn.spotifycdn.com/quiz/quotes.png");
            }
            brc1 brc1Var = wit0Var.f251751g.f65356b;
            if (brc1Var instanceof arc1) {
                Iterator it = ((arc1) brc1Var).f19017a.iterator();
                while (it.hasNext()) {
                    fb6 fb6Var = ((yqc1) it.next()).f275190a;
                    db6 db6Var = fb6Var instanceof db6 ? (db6) fb6Var : null;
                    if (db6Var != null) {
                        uc40 uc40Var = db6Var.f47223a;
                        if (uc40Var instanceof tc40) {
                            x401Var.add(((tc40) uc40Var).f219007a);
                        } else {
                            if (!(uc40Var instanceof sc40)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            x401Var.add(((sc40) uc40Var).f207649a);
                        }
                    }
                }
            }
        }
        x401 x401VarM63425d = n0e1.m63425d(x401Var);
        ArrayList arrayList = new ArrayList(i6f.m49804T(x401VarM63425d, 10));
        Object it2 = x401VarM63425d.iterator();
        while (((s2v) it2).hasNext()) {
            Flowable flowableM23306x = new CompletableDefer(new ve0(13, dio0Var, (String) ((lec0) it2).next())).m23305v(5L, TimeUnit.SECONDS, dio0Var.f49454f, null).m23306x();
            Predicate predicate = Functions.f7232h;
            arrayList.add(new CompletableFromPublisher(flowableM23306x.m23337R(1L, predicate)).m23299p(predicate));
        }
        dio0Var.f49455g.m23400a(Completable.m23289m(arrayList).subscribe());
        return new sjo0(xkx0Var);
    }
}
