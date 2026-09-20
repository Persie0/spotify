package p204p;

import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes6.dex */
public final class t1w {

    /* JADX INFO: renamed from: a */
    public final epx f216363a;

    public /* synthetic */ t1w(epx epxVar) {
        this.f216363a = epxVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public Object m79884a(List list, ibk ibkVar) {
        l611 l611Var;
        if (ibkVar instanceof l611) {
            l611Var = (l611) ibkVar;
            int i = l611Var.f130142c;
            if ((i & Integer.MIN_VALUE) != 0) {
                l611Var.f130142c = i - Integer.MIN_VALUE;
            } else {
                l611Var = new l611(this, ibkVar);
            }
        } else {
            l611Var = new l611(this, ibkVar);
        }
        Object objM86755t = l611Var.f130140a;
        int i2 = l611Var.f130142c;
        if (i2 == 0) {
            bga.m29073P(objM86755t);
            if (list.isEmpty()) {
                return nau.f152117a;
            }
            Flowable flowable = ((jpx) this.f216363a).m53978b(new C1668ai("recents", false, (gh00) new f5q0(9, list))).toFlowable(BackpressureStrategy.f7190d);
            d0k[] d0kVarArr = bmu0.f28619a;
            uxc0 uxc0Var = new uxc0(new onc(flowable), 23);
            l611Var.f130142c = 1;
            objM86755t = vyf1.m86755t(uxc0Var, l611Var);
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
        List<fqx> listMo45450b = ((gqx) objM86755t).mo45450b(eua1.class);
        ArrayList arrayList = new ArrayList();
        for (fqx fqxVar : listMo45450b) {
            eua1 eua1Var = (eua1) fqxVar.f72301b;
            pqm0 pqm0Var = eua1Var != null ? new pqm0(fqxVar.f72300a, eua1Var) : null;
            if (pqm0Var != null) {
                arrayList.add(pqm0Var);
            }
        }
        return kkc0.m56705r0(arrayList);
    }

    /* JADX INFO: renamed from: b */
    public Single m79885b(gpx gpxVar) {
        if (i6f.m49805U(gpxVar.f83262a.values()).isEmpty()) {
            return Single.just(new hpx(nau.f152117a));
        }
        return ((jpx) this.f216363a).m53978b(new C1668ai("assisted-curation", false, (gh00) new c7x(gpxVar, 10))).filter(uwk.f234684b1).timeout(10L, TimeUnit.SECONDS, Observable.error(new TimeoutException())).firstOrError().map(new dmu(6, gpxVar, this));
    }
}
