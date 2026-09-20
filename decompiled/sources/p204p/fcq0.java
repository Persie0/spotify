package p204p;

import com.comscore.streaming.ContentType;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import java.util.Collections;

/* JADX INFO: loaded from: classes11.dex */
public final class fcq0 implements kxf {

    /* JADX INFO: renamed from: a */
    public final n93 f68227a;

    /* JADX INFO: renamed from: b */
    public final z5f f68228b;

    /* JADX INFO: renamed from: c */
    public final voc1 f68229c;

    /* JADX INFO: renamed from: d */
    public final yfd1 f68230d;

    /* JADX INFO: renamed from: e */
    public final z9j0 f68231e;

    /* JADX INFO: renamed from: f */
    public final dzj f68232f;

    /* JADX INFO: renamed from: g */
    public final czj f68233g;

    /* JADX INFO: renamed from: h */
    public final kv91 f68234h;

    /* JADX INFO: renamed from: i */
    public final qwx0 f68235i;

    /* JADX INFO: renamed from: j */
    public final epx f68236j;

    /* JADX INFO: renamed from: k */
    public final siy f68237k;

    /* JADX INFO: renamed from: l */
    public final ovf f68238l;

    public fcq0(uwa uwaVar, n93 n93Var, z5f z5fVar, voc1 voc1Var, yfd1 yfd1Var, z9j0 z9j0Var, dzj dzjVar, czj czjVar, kv91 kv91Var, qwx0 qwx0Var, epx epxVar, siy siyVar) {
        this.f68227a = n93Var;
        this.f68228b = z5fVar;
        this.f68229c = voc1Var;
        this.f68230d = yfd1Var;
        this.f68231e = z9j0Var;
        this.f68232f = dzjVar;
        this.f68233g = czjVar;
        this.f68234h = kv91Var;
        this.f68235i = qwx0Var;
        this.f68236j = epxVar;
        this.f68237k = siyVar;
        this.f68238l = uwaVar.mo26174a(null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: d */
    public static final Object m41338d(fcq0 fcq0Var, lwf lwfVar, String str, boolean z, ibk ibkVar) {
        ecq0 ecq0Var;
        Object c6x0Var;
        siy siyVar = fcq0Var.f68237k;
        if (ibkVar instanceof ecq0) {
            ecq0Var = (ecq0) ibkVar;
            int i = ecq0Var.f58376e;
            if ((i & Integer.MIN_VALUE) != 0) {
                ecq0Var.f58376e = i - Integer.MIN_VALUE;
            } else {
                ecq0Var = new ecq0(fcq0Var, ibkVar);
            }
        } else {
            ecq0Var = new ecq0(fcq0Var, ibkVar);
        }
        Object objM96567o = ecq0Var.f58374c;
        int i2 = ecq0Var.f58376e;
        boolean z2 = true;
        try {
            if (i2 == 0) {
                bga.m29073P(objM96567o);
                Single singleM63880c = fcq0Var.f68227a.m63880c(Collections.singletonList(str), fcq0Var.f68229c.f243453a, "", z, new f93(31, null));
                ecq0Var.f58372a = lwfVar;
                ecq0Var.f58373b = str;
                ecq0Var.f58376e = 1;
                objM96567o = zn91.m96567o(singleM63880c, ecq0Var);
                yuk yukVar = yuk.f276404a;
                if (objM96567o == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = ecq0Var.f58373b;
                lwfVar = ecq0Var.f58372a;
                bga.m29073P(objM96567o);
            }
            c6x0Var = (m93) objM96567o;
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        String str2 = str;
        boolean z3 = c6x0Var instanceof c6x0;
        if (!z3) {
            if (z3) {
                c6x0Var = null;
            }
            m93 m93Var = (m93) c6x0Var;
            if (wj50.m88271j(m93Var, new j93(null))) {
                yfd1.m93554f(fcq0Var.f68230d, lwfVar.f137561e, "prerelease_card", str2, null, new cj1(z2, str2, 22), 8);
                siyVar.m78245a(2, Collections.singletonMap("itemUri", str2));
            } else if (wj50.m88271j(m93Var, new k93(null))) {
                yfd1.m93554f(fcq0Var.f68230d, lwfVar.f137561e, "prerelease_card", str2, null, new cj1(false, str2, 22), 8);
                siyVar.m78245a(3, Collections.singletonMap("itemUri", str2));
            } else if (wj50.m88271j(m93Var, new l93())) {
                yfd1.m93554f(fcq0Var.f68230d, lwfVar.f137561e, "prerelease_card", str2, null, s9q0.f207020e, 8);
            }
        }
        return w2a1.f247311a;
    }

    @Override // p204p.kxf
    /* JADX INFO: renamed from: b */
    public final twf mo24314b(vwf vwfVar, lwf lwfVar) {
        ccq0 ccq0Var = (ccq0) vwfVar;
        return new twf(new swf(lwfVar.f137561e, "prerelease_card", ccq0Var.f36594a, ccq0Var.f36602i));
    }

    @Override // p204p.kxf
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void mo24313a(ccq0 ccq0Var, lwf lwfVar, fxh0 fxh0Var, xq00 xq00Var, int i) {
        int i2;
        Observable observableCombineLatest;
        boolean z;
        fcq0 fcq0Var = this;
        String str = ccq0Var.f36594a;
        xq00Var.m91775k0(-247963514);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91766g(ccq0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? xq00Var.m91766g(lwfVar) : xq00Var.m91770i(lwfVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91766g(fxh0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= xq00Var.m91770i(fcq0Var) ? 2048 : 1024;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 1171) != 1170)) {
            yab yabVarM54985d = k0e1.m54985d(z5f.m95457d(fcq0Var.f68228b, "", new String[]{str}).map(new m08(str, 7)).onErrorComplete().distinctUntilChanged());
            Boolean bool = Boolean.FALSE;
            kqi0 kqi0VarM77670i = sam.m77670i(yabVarM54985d, bool, null, xq00Var, 48, 2);
            if (fcq0Var.f68233g.m34453a()) {
                observableCombineLatest = Observable.combineLatest(((rwx0) fcq0Var.f68235i).f203428a.map(uty.f234024Z0).distinctUntilChanged(), ((jpx) fcq0Var.f68236j).m53978b(new C1668ai("prerelease-card", false, (gh00) new k5n0(str, 26))).map(new ze8(str, 12)).distinctUntilChanged(), q2z.f184749b1);
            } else {
                observableCombineLatest = Observable.just(bool);
            }
            kqi0 kqi0VarM77670i2 = sam.m77670i(k0e1.m54985d(observableCombineLatest), bool, null, xq00Var, 48, 2);
            Object objM91750T = xq00Var.m91750T();
            ia7 ia7Var = t6x0.f217647t;
            if (objM91750T == ia7Var) {
                z = false;
                bjk0 bjk0Var = new bjk0(ccq0Var, fcq0Var, kqi0VarM77670i2, kqi0VarM77670i, 22);
                fcq0Var = fcq0Var;
                objM91750T = sam.m77674m(bjk0Var);
                xq00Var.m91793t0(objM91750T);
            } else {
                z = false;
            }
            rv41 rv41Var = (rv41) objM91750T;
            boolean zM91770i = xq00Var.m91770i(fcq0Var);
            Object objM91750T2 = xq00Var.m91750T();
            if (zM91770i || objM91750T2 == ia7Var) {
                objM91750T2 = new kfp0(fcq0Var, 16);
                xq00Var.m91793t0(objM91750T2);
            }
            gh00 gh00Var = (gh00) objM91750T2;
            boolean zM91770i2 = xq00Var.m91770i(fcq0Var) | (((i2 & ContentType.LONG_FORM_ON_DEMAND) == 32 || ((i2 & 64) != 0 && xq00Var.m91770i(lwfVar))) ? true : z);
            if ((i2 & 14) == 4) {
                z = true;
            }
            boolean z2 = zM91770i2 | z;
            Object objM91750T3 = xq00Var.m91750T();
            if (z2 || objM91750T3 == ia7Var) {
                o3e0 o3e0Var = new o3e0(fcq0Var, rv41Var, lwfVar, ccq0Var, 23);
                xq00Var.m91793t0(o3e0Var);
                objM91750T3 = o3e0Var;
            }
            g0b1.m43261b(gh00Var, fxh0Var, (gh00) objM91750T3, xq00Var, (i2 >> 3) & ContentType.LONG_FORM_ON_DEMAND, 0);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new i0m0(this, ccq0Var, lwfVar, fxh0Var, i, 18);
        }
    }
}
