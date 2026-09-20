package p204p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeFlatten;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class kfq implements Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f122215a;

    /* JADX INFO: renamed from: b */
    public final epx f122216b;

    public /* synthetic */ kfq(epx epxVar, int i) {
        this.f122215a = i;
        this.f122216b = epxVar;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0083  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    /* JADX INFO: renamed from: a */
    public Object m56303a(String str, ibk ibkVar) {
        jfq jfqVar;
        Object c6x0Var;
        String str2;
        b791 b791VarM75016a;
        uw01 uw01Var;
        switch (this.f122215a) {
            case 0:
                if (ibkVar instanceof jfq) {
                    jfqVar = (jfq) ibkVar;
                    int i = jfqVar.f111958c;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        jfqVar.f111958c = i - Integer.MIN_VALUE;
                    } else {
                        jfqVar = new jfq(this, ibkVar);
                    }
                } else {
                    jfqVar = new jfq(this, ibkVar);
                }
                Object objM96567o = jfqVar.f111956a;
                int i2 = jfqVar.f111958c;
                try {
                    if (i2 == 0) {
                        bga.m29073P(objM96567o);
                        Single singleFlatMap = ((jpx) this.f122216b).m53978b(new C1668ai("add-to-playlist", false, (gh00) new eml(str, 21))).filter(z9h1.f280791U0).firstOrError().flatMap(zp7.f284976W0);
                        jfqVar.f111958c = 1;
                        objM96567o = zn91.m96567o(singleFlatMap, jfqVar);
                        yuk yukVar = yuk.f276404a;
                        if (objM96567o == yukVar) {
                            return yukVar;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bga.m29073P(objM96567o);
                    }
                    c6x0Var = (u791) objM96567o;
                    break;
                } catch (Throwable th) {
                    c6x0Var = new c6x0(th);
                }
                aa91 aa91Var = null;
                if (c6x0Var instanceof c6x0) {
                    c6x0Var = null;
                }
                u791 u791Var = (u791) c6x0Var;
                if (u791Var != null && (b791VarM75016a = r991.m75016a((str2 = u791Var.f227542f))) != null) {
                    rzl0 rzl0Var = b791VarM75016a.f24196b;
                    String str3 = rzl0Var.f204174a;
                    String str4 = rzl0Var.f204175b;
                    aa91Var = new aa91(h6f.m46715L(str3, str4), new j891(rzl0Var.f204174a, str4, str2));
                }
                return aa91Var;
            default:
                if (ibkVar instanceof uw01) {
                    uw01Var = (uw01) ibkVar;
                    int i3 = uw01Var.f234543c;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        uw01Var.f234543c = i3 - Integer.MIN_VALUE;
                    } else {
                        uw01Var = new uw01(this, ibkVar);
                    }
                } else {
                    uw01Var = new uw01(this, ibkVar);
                }
                Object objM96571q = uw01Var.f234541a;
                int i4 = uw01Var.f234543c;
                if (i4 == 0) {
                    bga.m29073P(objM96571q);
                    Observable map = ((jpx) this.f122216b).m53978b(new C1668ai("episode-share", false, (gh00) new zpz0(str, 10))).filter(wjr0.f252023Y).map(new gt2(str, 10));
                    uw01Var.f234543c = 1;
                    objM96571q = zn91.m96571q(map, 1, null, uw01Var);
                    yuk yukVar2 = yuk.f276404a;
                    if (objM96571q == yukVar2) {
                        return yukVar2;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(objM96571q);
                }
                return (o5p0) ((fqx) objM96571q).f72301b;
        }
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        su00 su00Var = (su00) obj;
        String str = su00Var.f213969a;
        return new MaybeFlatten(((jpx) this.f122216b).m53978b(new C1668ai("gated-content-npv-widget", false, (gh00) new lpx(str, 27))).filter(ddy.f47906d).onErrorComplete().firstElement().m23369g(new b1h1(str, 10)), new i2v(su00Var, 17));
    }

    /* JADX INFO: renamed from: b */
    public Single m56304b(String str) {
        return ((jpx) this.f122216b).m53978b(new C1668ai("free-on-demand-download-upsell", false, (gh00) new eve0(str, 20))).filter(kaz.f120988S0).firstOrError().timeout(1L, TimeUnit.SECONDS).map(new gt2(str, 7)).onErrorReturnItem(new axk0(null, null, 7));
    }

    public kfq(r991 r991Var, epx epxVar) {
        this.f122215a = 0;
        this.f122216b = epxVar;
    }
}
