package p204p;

import io.reactivex.rxjava3.core.Single;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class dho implements dn81 {

    /* JADX INFO: renamed from: a */
    public final wg61 f49134a;

    /* JADX INFO: renamed from: b */
    public final tjo f49135b = pag1.m69487w(new rko(new jqx(qpv0.f191387a.mo54112b(us6.class)), 1, zdm.f281740Q0, new pko(zdm.f281742S0), zdm.f281741R0), zdm.f281743T0);

    public dho(opx opxVar) {
        this.f49134a = new wg61(new xgo(opxVar, 0));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public static final Object m36055c(dho dhoVar, String str, ibk ibkVar) {
        cho choVar;
        if (ibkVar instanceof cho) {
            choVar = (cho) ibkVar;
            int i = choVar.f38051c;
            if ((i & Integer.MIN_VALUE) != 0) {
                choVar.f38051c = i - Integer.MIN_VALUE;
            } else {
                choVar = new cho(dhoVar, ibkVar);
            }
        } else {
            choVar = new cho(dhoVar, ibkVar);
        }
        Object objM76980u = choVar.f38049a;
        int i2 = choVar.f38051c;
        fbk fbkVar = null;
        try {
            if (i2 == 0) {
                bga.m29073P(objM76980u);
                ygo ygoVar = new ygo(dhoVar, str, fbkVar, 1);
                choVar.f38051c = 1;
                objM76980u = s1h1.m76980u(5000L, ygoVar, choVar);
                yuk yukVar = yuk.f276404a;
                if (objM76980u == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM76980u);
            }
            return (String) objM76980u;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // p204p.dn81
    /* JADX INFO: renamed from: a */
    public final Single mo36056a(List list) {
        return mo36057b(list).map(let.f132697T0).map(new aho(list)).onErrorReturn(new bho(list));
    }

    @Override // p204p.dn81
    /* JADX INFO: renamed from: b */
    public final Single mo36057b(List list) {
        if (list.isEmpty()) {
            Single singleJust = Single.just(nau.f152117a);
            wj50.m88279p(singleJust);
            return singleJust;
        }
        Single singleOnErrorReturn = vjf1.m85770t(dau.f47107a, new r2m(list, this, null, 7)).onErrorReturn(ket.f121954T0);
        wj50.m88279p(singleOnErrorReturn);
        return singleOnErrorReturn;
    }
}
