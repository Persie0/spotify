package p204p;

import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: classes6.dex */
public final class b7m {

    /* JADX INFO: renamed from: a */
    public final epx f24315a;

    public b7m(epx epxVar) {
        this.f24315a = epxVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m28391a(String str, ibk ibkVar) {
        a7m a7mVar;
        if (ibkVar instanceof a7m) {
            a7mVar = (a7m) ibkVar;
            int i = a7mVar.f13101d;
            if ((i & Integer.MIN_VALUE) != 0) {
                a7mVar.f13101d = i - Integer.MIN_VALUE;
            } else {
                a7mVar = new a7m(this, ibkVar);
            }
        } else {
            a7mVar = new a7m(this, ibkVar);
        }
        Object objM96567o = a7mVar.f13099b;
        int i2 = a7mVar.f13101d;
        if (i2 == 0) {
            bga.m29073P(objM96567o);
            Single singleFirstOrError = ((jpx) this.f24315a).m53978b(new C1668ai("curationability", false, (gh00) new eml(str, 5))).filter(opg1.f167910S0).firstOrError();
            a7mVar.f13098a = str;
            a7mVar.f13101d = 1;
            objM96567o = zn91.m96567o(singleFirstOrError, a7mVar);
            yuk yukVar = yuk.f276404a;
            if (objM96567o == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = a7mVar.f13098a;
            bga.m29073P(objM96567o);
        }
        return Boolean.valueOf(((gqx) objM96567o).mo45449a(n4m.class, str).f72302c.f61974b != 4);
    }
}
