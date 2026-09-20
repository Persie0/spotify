package p204p;

import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: classes5.dex */
public final class aub {

    /* JADX INFO: renamed from: a */
    public final epx f19904a;

    public /* synthetic */ aub(epx epxVar) {
        this.f19904a = epxVar;
    }

    /* JADX INFO: renamed from: a */
    public mu5 m27171a(int i, String str) {
        return new mu5(k0e1.m54985d(((jpx) this.f19904a).m53978b(new C1668ai("capability", false, (gh00) new bm9(str, 15)))), str, i, 1);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public Object m27172b(String str, ibk ibkVar) {
        nr11 nr11Var;
        if (ibkVar instanceof nr11) {
            nr11Var = (nr11) ibkVar;
            int i = nr11Var.f157419d;
            if ((i & Integer.MIN_VALUE) != 0) {
                nr11Var.f157419d = i - Integer.MIN_VALUE;
            } else {
                nr11Var = new nr11(this, ibkVar);
            }
        } else {
            nr11Var = new nr11(this, ibkVar);
        }
        Object objM96571q = nr11Var.f157417b;
        int i2 = nr11Var.f157419d;
        if (i2 == 0) {
            bga.m29073P(objM96571q);
            Observable observableFilter = ((jpx) this.f19904a).m53978b(new C1668ai("episode-share", false, (gh00) new zpz0(str, 17))).filter(fkr0.f70602Z);
            nr11Var.f157416a = str;
            nr11Var.f157419d = 1;
            objM96571q = zn91.m96571q(observableFilter, 1, null, nr11Var);
            yuk yukVar = yuk.f276404a;
            if (objM96571q == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = nr11Var.f157416a;
            bga.m29073P(objM96571q);
        }
        gqx gqxVar = (gqx) objM96571q;
        v140 v140Var = (v140) gqxVar.mo45449a(v140.class, str).f72301b;
        daj dajVar = (daj) gqxVar.mo45449a(daj.class, str).f72301b;
        erc1 erc1Var = (erc1) gqxVar.mo45449a(erc1.class, str).f72301b;
        return new or11(v140Var, dajVar, erc1Var != null ? fvg1.m42877t(erc1Var) : null);
    }
}
