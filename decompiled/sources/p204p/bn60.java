package p204p;

import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.options.LoggingParams;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class bn60 extends iz8 {

    /* JADX INFO: renamed from: L0 */
    public final lwr f28710L0;

    /* JADX INFO: renamed from: X */
    public final nbm0 f28711X;

    /* JADX INFO: renamed from: Y */
    public final u010 f28712Y;

    /* JADX INFO: renamed from: Z */
    public final Observable f28713Z;

    /* JADX INFO: renamed from: g */
    public final Scheduler f28714g;

    /* JADX INFO: renamed from: h */
    public final dks f28715h;

    /* JADX INFO: renamed from: i */
    public final dks f28716i;

    /* JADX INFO: renamed from: t */
    public final yvt0 f28717t;

    /* JADX WARN: Illegal instructions before constructor call */
    public bn60(Scheduler scheduler, m600 m600Var, yvt0 yvt0Var, nbm0 nbm0Var, u010 u010Var, Observable observable) {
        dks dksVarM36312a = dks.m36312a(0, 6L);
        dks dksVarM36312a2 = dks.m36312a(0, 10L);
        dks dksVarM36312a3 = dks.m36312a(0, 5L);
        super(scheduler, m600Var, dksVarM36312a);
        this.f28714g = scheduler;
        this.f28715h = dksVarM36312a2;
        this.f28716i = dksVarM36312a3;
        this.f28717t = yvt0Var;
        this.f28711X = nbm0Var;
        this.f28712Y = u010Var;
        this.f28713Z = observable;
        this.f28710L0 = new lwr();
    }

    /* JADX INFO: renamed from: c */
    public static final void m29926c(bn60 bn60Var) {
        Scheduler scheduler = bn60Var.f28714g;
        lwr lwrVar = bn60Var.f28710L0;
        m600 m600Var = bn60Var.f107162b;
        ConcurrentHashMap concurrentHashMap = bn60Var.f107164d;
        Collection collectionValues = concurrentHashMap.values();
        ArrayList<azb> arrayList = new ArrayList(i6f.m49804T(collectionValues, 10));
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            arrayList.add(((hz8) it.next()).f96809a);
        }
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
        for (azb azbVar : arrayList) {
            ConcurrentHashMap.KeySetView keySetView = bn60Var.f107165e;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : keySetView) {
                if (((k2q) obj).mo45305d()) {
                    arrayList3.add(obj);
                }
            }
            arrayList2.add(new pqm0(azbVar, g6f.m43728j1(arrayList3)));
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (!((Collection) ((pqm0) obj2).f180351b).isEmpty()) {
                arrayList4.add(obj2);
            }
        }
        for (pqm0 pqm0Var : g6f.m43728j1(arrayList4)) {
            concurrentHashMap.remove(pqm0Var.f180350a);
            bn60Var.m51981b((azb) pqm0Var.f180350a, (List) pqm0Var.f180351b);
        }
        Collection collectionValues2 = concurrentHashMap.values();
        ArrayList arrayList5 = new ArrayList();
        for (Object obj3 : collectionValues2) {
            hz8 hz8Var = (hz8) obj3;
            wj50.m88279p(hz8Var);
            z050 z050VarMo27574i = hz8Var.f96810b;
            dks dksVar = bn60Var.f107163c;
            long j = dksVar.f50019a;
            if (j != 0) {
                z050VarMo27574i = z050VarMo27574i.mo27574i(j, gce.SECONDS);
            }
            int i = dksVar.f50020b;
            if (i != 0) {
                z050VarMo27574i = z050VarMo27574i.mo27574i(i, gce.NANOS);
            }
            Scheduler scheduler2 = bn60Var.f107161a;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            scheduler2.getClass();
            if (z050VarMo27574i.compareTo(z050.m95040p6(Scheduler.m23383a(timeUnit))) < 0) {
                arrayList5.add(obj3);
            }
        }
        ArrayList arrayList6 = new ArrayList(i6f.m49804T(arrayList5, 10));
        Iterator it2 = arrayList5.iterator();
        while (it2.hasNext()) {
            arrayList6.add(((hz8) it2.next()).f96809a);
        }
        Iterator it3 = g6f.m43728j1(arrayList6).iterator();
        while (it3.hasNext()) {
            if (((hz8) concurrentHashMap.remove((azb) it3.next())) != null) {
                m600Var.m60909J(1, "Expired", gbu.f78413a);
            }
        }
        boolean zIsEmpty = concurrentHashMap.isEmpty();
        if (!zIsEmpty) {
            lwrVar.m60129c();
        }
        if (zIsEmpty) {
            return;
        }
        z650 z650VarM60910L = m600Var.m60910L();
        yvt0 yvt0Var = bn60Var.f28717t;
        PlayOrigin playOriginCreate = PlayOrigin.create("driving-jumpstart");
        LoggingParams.Builder builderInteractionId = LoggingParams.builder().interactionId(z650VarM60910L.f279709a);
        kbm0 kbm0Var = bn60Var.f28711X.get();
        String str = kbm0Var != null ? kbm0Var.f121231a : null;
        if (str == null) {
            str = "";
        }
        lwrVar.m60127a(yvt0.m94745a(yvt0Var, playOriginCreate, builderInteractionId.pageInstanceId(str).build(), null, 28).observeOn(scheduler).timeout(bn60Var.f28715h.m36317f(), TimeUnit.MILLISECONDS, scheduler).subscribeOn(scheduler).subscribe(new tjp(27, bn60Var, z650VarM60910L), new an60(bn60Var, 0)));
    }

    /* JADX INFO: renamed from: d */
    public static final void m29927d(bn60 bn60Var, String str, Throwable th) {
        ConcurrentHashMap concurrentHashMap = bn60Var.f107164d;
        Iterator it = concurrentHashMap.entrySet().iterator();
        while (it.hasNext()) {
            azb azbVar = ((hz8) ((Map.Entry) it.next()).getValue()).f96809a;
            m600 m600Var = bn60Var.f107162b;
            String message = th.getMessage();
            if (message == null) {
                message = th.getClass().getName();
            }
            m600Var.m60909J(2, str + ": " + message, gbu.f78413a);
        }
        concurrentHashMap.clear();
        bn60Var.f28710L0.m60129c();
    }
}
