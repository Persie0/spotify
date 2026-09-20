package p204p;

import io.reactivex.rxjava3.core.Flowable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class cm91 implements uw21 {

    /* JADX INFO: renamed from: X */
    public final ou8 f39620X;

    /* JADX INFO: renamed from: Y */
    public xuk f39621Y;

    /* JADX INFO: renamed from: a */
    public final voi f39622a;

    /* JADX INFO: renamed from: b */
    public final xi9 f39623b;

    /* JADX INFO: renamed from: c */
    public final arm f39624c;

    /* JADX INFO: renamed from: d */
    public final cdp f39625d;

    /* JADX INFO: renamed from: e */
    public final hv31 f39626e;

    /* JADX INFO: renamed from: f */
    public final xre f39627f;

    /* JADX INFO: renamed from: g */
    public final luk f39628g;

    /* JADX INFO: renamed from: h */
    public final luk f39629h;

    /* JADX INFO: renamed from: i */
    public final hb11 f39630i;

    /* JADX INFO: renamed from: t */
    public final hb11 f39631t;

    public cm91(Flowable flowable, voi voiVar, xi9 xi9Var, arm armVar, cdp cdpVar, hv31 hv31Var, xre xreVar, luk lukVar, luk lukVar2) {
        this.f39622a = voiVar;
        this.f39623b = xi9Var;
        this.f39624c = armVar;
        this.f39625d = cdpVar;
        this.f39626e = hv31Var;
        this.f39627f = xreVar;
        this.f39628g = lukVar;
        this.f39629h = lukVar2;
        hb11 hb11VarM52092t = j0g1.m52092t(0, 1, 0, 5);
        this.f39630i = hb11VarM52092t;
        this.f39631t = hb11VarM52092t;
        d0k[] d0kVarArr = bmu0.f28619a;
        this.f39620X = new ou8(ryf1.m76714l(mvl0.m62953p(new p741(new onc(flowable), 5)), new qd5()), 16);
        this.f39621Y = edb.m38577z(lukVar2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: a */
    public static final Object m33368a(cm91 cm91Var, ibk ibkVar) throws Throwable {
        yl91 yl91Var;
        s5p s5pVar;
        api apiVarM77296c;
        Map map;
        ArrayList arrayList;
        List listMo26709y;
        yc8 yc8Var;
        gg8 gg8VarM93335b;
        voi voiVar = cm91Var.f39622a;
        if (ibkVar instanceof yl91) {
            yl91Var = (yl91) ibkVar;
            int i = yl91Var.f273964e;
            if ((i & Integer.MIN_VALUE) != 0) {
                yl91Var.f273964e = i - Integer.MIN_VALUE;
            } else {
                yl91Var = new yl91(cm91Var, ibkVar);
            }
        } else {
            yl91Var = new yl91(cm91Var, ibkVar);
        }
        Object obj = yl91Var.f273962c;
        int i2 = yl91Var.f273964e;
        if (i2 == 0) {
            bga.m29073P(obj);
            fbk fbkVar = null;
            if (fr0.m42463g((wy3) cm91Var.f39627f, cm91Var.f39626e.mo48712g(dm91.f50478a, 0L)) >= 43200000 && ((apiVarM77296c = (s5pVar = (s5p) voiVar).m77296c()) == null || apiVarM77296c.mo26697m())) {
                List listM77298g = s5pVar.m77298g();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : listM77298g) {
                    api apiVar = (api) obj2;
                    if (!apiVar.mo26697m() && !apiVar.mo26700p() && apiVar.mo26699o() && apiVar.getType() == xfr.f261083f && ((listMo26709y = apiVar.mo26709y()) == null || !listMo26709y.isEmpty())) {
                        Iterator it = listMo26709y.iterator();
                        while (it.hasNext()) {
                            if (bm51.m29803n0((String) it.next(), "video/", false)) {
                                arrayList2.add(obj2);
                                break;
                            }
                        }
                    }
                }
                listM77298g.size();
                arrayList2.size();
                if (!arrayList2.isEmpty()) {
                    Map map2 = (Map) cm91Var.f39623b.m91108a().getValue();
                    luk lukVar = cm91Var.f39628g;
                    r611 r611Var = new r611(cm91Var, fbkVar, 16);
                    yl91Var.f273960a = arrayList2;
                    yl91Var.f273961b = map2;
                    yl91Var.f273964e = 1;
                    Object objM89557A = x0h1.m89557A(lukVar, r611Var, yl91Var);
                    yuk yukVar = yuk.f276404a;
                    if (objM89557A == yukVar) {
                        return yukVar;
                    }
                    map = map2;
                    obj = objM89557A;
                    arrayList = arrayList2;
                }
            }
            return null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        map = yl91Var.f273961b;
        arrayList = yl91Var.f273960a;
        bga.m29073P(obj);
        Map map3 = (Map) obj;
        dm91.m36403b(arrayList, map, map3);
        api apiVar2 = (api) g6f.m43741q0(g6f.m43711Y0(g6f.m43711Y0(arrayList, cm91Var.f39624c.m26960a(map3)), k3u0.m55295L(map)));
        apiVar2.getClass();
        qi9 qi9Var = (qi9) map.get(apiVar2.mo26689e());
        if (qi9Var != null && (yc8Var = qi9Var.f188963a) != null && (gg8VarM93335b = yc8Var.m93335b()) != null) {
            qyg1.m74180J(gg8VarM93335b.m44661a());
        }
        Objects.toString(map3.get(apiVar2.mo26695k()));
        return new qw21(new dk91(apiVar2.getType(), apiVar2.mo26679A(), apiVar2.getName(), apiVar2.mo26689e(), apiVar2.mo26686H().f191320a, wgg0.TV_ADOPTION), cm91Var);
    }

    @Override // p204p.uw21
    /* JADX INFO: renamed from: c */
    public final void mo33369c(int i) {
        int iM38547C = edb.m38547C(i);
        hv31 hv31Var = this.f39626e;
        if (iM38547C == 0) {
            fr0.m42475s((wy3) this.f39627f, hv31Var.edit(), dm91.f50478a);
        } else if (iM38547C != 1) {
            if (iM38547C != 2) {
                throw new NoWhenBranchMatchedException();
            }
            lv31 lv31VarEdit = hv31Var.edit();
            lv31VarEdit.m60050c(dm91.f50478a, 0L);
            lv31VarEdit.m60054g();
        }
    }

    @Override // p204p.uw21
    public final fiz getState() {
        return this.f39631t;
    }

    @Override // p204p.uw21
    public final void start() {
        xuk xukVarM37073v = dv9.m37073v(this.f39621Y, new hk81(this, 10));
        this.f39621Y = xukVarM37073v;
        x0h1.m89578u(xukVarM37073v, null, 0, new wm81(this, null, 9), 3);
    }

    @Override // p204p.uw21
    public final void stop() {
        kk40.m56680v(this.f39621Y, null);
    }
}
