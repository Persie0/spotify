package p204p;

import android.view.MotionEvent;
import android.view.Window;
import androidx.compose.p002ui.graphics.drawscope.DrawScope;
import com.google.protobuf.Any;
import com.spotify.offline_esperanto.proto.EsOffline$GetContextsProgressRequest;
import com.spotify.watchfeed.component.item.p185v2.OnboardingComponentV2;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class f0l0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f64681a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f64682b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0l0(Object obj, int i) {
        super(1);
        this.f64681a = i;
        this.f64682b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [p.fbk] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r3v17 */
    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        long j;
        long jM54450E;
        long j2;
        long jM54450E2;
        int i = 5;
        int i2 = 24;
        int i3 = 25;
        int i4 = 3;
        int i5 = 1;
        ?? r12 = 0;
        switch (this.f64681a) {
            case 0:
                g0l0 g0l0Var = (g0l0) this.f64682b;
                return new zux((fiz) obj, new xif0(22, mvl0.m62953p(new jif0(((tq80) g0l0Var.f75392c).m81306d(), 7)), g0l0Var), new ju0(g0l0Var, (fbk) r12, i2), i5);
            case 1:
                return q1l0.m71925b((q1l0) ((li0) this.f64682b).f133682d).map(fby.f67926S0).toFlowable(BackpressureStrategy.f7190d);
            case 2:
                return ((yiu) ((lq0) this.f64682b).f135886d).mo26174a(null);
            case 3:
                return ((fju) this.f64682b).mo26174a(null);
            case 4:
                Set set = (Set) obj;
                fwk0 fwk0Var = (fwk0) this.f64682b;
                cmw cmwVarM16130o = EsOffline$GetContextsProgressRequest.m16130o();
                cmwVarM16130o.m33408m(set);
                return new xk8(mvl0.m62953p(new px70(k0e1.m54985d(fwk0Var.callStream("spotify.offline_esperanto.proto.Offline", "SubscribeContextsProgress", (EsOffline$GetContextsProgressRequest) cmwVarM16130o.build()).map(q2z.f184736S0)), 23)), set, i);
            case 5:
                ((zvw0) obj).f286818d = ((avu0) this.f64682b).f20268g.f195574a;
                return w2a1.f247311a;
            case 6:
                DrawScope drawScope = (DrawScope) obj;
                ibf0 ibf0Var = (ibf0) this.f64682b;
                float f = ibf0Var.f100528e;
                long jMo294i1 = drawScope.mo294i1();
                c06 c06VarMo291d1 = drawScope.mo291d1();
                long jM31085B = c06VarMo291d1.m31085B();
                c06VarMo291d1.m31107v().mo25287p();
                try {
                    ((kca) c06VarMo291d1.f32694b).m56033p(f, f, jMo294i1);
                    r6l0.m74863f(drawScope, ibf0Var);
                    r6l0.m74865h(drawScope, ibf0Var);
                    stz0.m79358l(c06VarMo291d1, jM31085B);
                    float f2 = ibf0Var.f100527d;
                    long jMo294i2 = drawScope.mo294i1();
                    c06 c06VarMo291d2 = drawScope.mo291d1();
                    long jM31085B2 = c06VarMo291d2.m31085B();
                    c06VarMo291d2.m31107v().mo25287p();
                    try {
                        ((kca) c06VarMo291d2.f32694b).m56033p(f2, f2, jMo294i2);
                        r6l0.m74864g(drawScope, ibf0Var);
                        return w2a1.f247311a;
                    } finally {
                        stz0.m79358l(c06VarMo291d2, jM31085B2);
                    }
                } catch (Throwable th) {
                    stz0.m79358l(c06VarMo291d1, jM31085B);
                    throw th;
                }
            case 7:
                fi8 fi8Var = (fi8) obj;
                b7l0 b7l0Var = (b7l0) this.f64682b;
                w6l0 w6l0Var = b7l0Var.f24310c;
                if (w6l0Var == null) {
                    hj5 hj5Var = b7l0Var.f24309b;
                    ListIterator listIterator = hj5Var.listIterator(hj5Var.mo47661a());
                    while (listIterator.hasPrevious()) {
                        Object objPrevious = listIterator.previous();
                        if (((w6l0) objPrevious).f248420a) {
                            r12 = objPrevious;
                            w6l0Var = (w6l0) r12;
                        }
                    }
                    w6l0Var = (w6l0) r12;
                }
                if (w6l0Var != null) {
                    w6l0Var.mo42562c(fi8Var);
                }
                return w2a1.f247311a;
            case 8:
                return z8g1.m95591k(((q8l0) ((qce0) this.f64682b).f187342d).m72336a(((k8l0) obj).f120388a), 3);
            case 9:
                ((sal0) this.f64682b).m77643H1((o0w0) obj);
                return w2a1.f247311a;
            case 10:
                ((qsp) ((hmh0) obj)).f192162a = new zej0((px2) this.f64682b, 10);
                return w2a1.f247311a;
            case 11:
                return new C1778dh((a5j0) this.f64682b, (gh00) obj);
            case 12:
                ((zfl0) this.f64682b).m96029H1((o0w0) obj);
                return w2a1.f247311a;
            case 13:
                Map map = (Map) ((qgl0) this.f64682b).f188494a.get();
                OnboardingComponentV2 onboardingComponentV2M22799r = OnboardingComponentV2.m22799r(((Any) obj).m1913r());
                egl0 egl0Var = new egl0(null, null);
                OnboardingComponentV2 onboardingComponentV2 = onboardingComponentV2M22799r.m22803q() ? onboardingComponentV2M22799r : null;
                if (onboardingComponentV2 != null) {
                    Any anyM22801o = onboardingComponentV2.m22801o();
                    xwf xwfVar = (xwf) map.get(anyM22801o.m1912q());
                    xfb1 xfb1Var = xwfVar instanceof xfb1 ? (xfb1) xwfVar : null;
                    egl0Var = new egl0(xfb1Var != null ? (wfb1) xfb1Var.m92284a(anyM22801o) : null, null);
                }
                if (!onboardingComponentV2M22799r.m22802p()) {
                    onboardingComponentV2M22799r = null;
                }
                if (onboardingComponentV2M22799r == null) {
                    return egl0Var;
                }
                Any anyM22800n = onboardingComponentV2M22799r.m22800n();
                xwf xwfVar2 = (xwf) map.get(anyM22800n.m1912q());
                bl6 bl6Var = xwfVar2 instanceof bl6 ? (bl6) xwfVar2 : null;
                return new egl0(egl0Var.f59359a, bl6Var != null ? (al6) bl6Var.m92284a(anyM22800n) : null);
            case 14:
                return ((lju) ((e23) this.f64682b).f55317b).mo26174a(null);
            case 15:
                w49 w49Var = (w49) obj;
                kc60 kc60Var = ((iol0) this.f64682b).f104245a;
                synchronized (kc60Var.f121387e) {
                    j = kc60Var.f121382Z;
                    hvi0 hvi0Var = cks.f39079b;
                    long j3 = kc60Var.f121376L0;
                    ils ilsVar = ils.NANOSECONDS;
                    jM54450E = jwg1.m54450E(j3, ilsVar);
                    j2 = kc60Var.f121377M0;
                    jM54450E2 = jwg1.m54450E(kc60Var.f121378N0, ilsVar);
                }
                dhv0 dhv0Var = (dhv0) w49Var;
                dhv0Var.m36059a("ui.stutter.frame_count", j);
                dhv0Var.m36059a("ui.stutter.frame_duration", cks.m33188g(jM54450E) / 1.0E9d);
                dhv0Var.m36059a("ui.frame_count", j + j2);
                dhv0Var.m36059a("ui.frame_duration", cks.m33188g(cks.m33195n(jM54450E, jM54450E2)) / 1.0E9d);
                return w2a1.f247311a;
            case 16:
                return obj == ((mpi0) this.f64682b) ? "(this)" : String.valueOf(obj);
            case 17:
                return ((cxl0) this.f64682b).f43059b.f224724b;
            case 18:
                return ((sxl0) this.f64682b).f214922a.f224724b;
            case 19:
                return new vwt((eca) this.f64682b, i3);
            case 20:
                return ((k1m0) this.f64682b).f118392d;
            case 21:
                Set set2 = dd41.f47702f;
                return Boolean.valueOf(r46.m74708A((String) obj, (gn80) this.f64682b));
            case 22:
                Set set3 = dd41.f47702f;
                return Boolean.valueOf(r46.m74711D((String) obj, (fka1) this.f64682b));
            case 23:
                k1m0 k1m0Var = (k1m0) obj;
                c1m0 c1m0Var = (c1m0) this.f64682b;
                c1m0Var.f33152a.f278140a = k1m0Var;
                jjn0 jjn0Var = c1m0Var.f33156e;
                g9j0 g9j0Var = c1m0Var.f33158g;
                LinkedList linkedList = jjn0Var.f113061a;
                LinkedList linkedList2 = jjn0Var.f113061a;
                if (!linkedList.isEmpty()) {
                    gzi0 gzi0VarM44051a = g9j0Var.m44051a(n9j0.f151814a);
                    while (!linkedList2.isEmpty()) {
                        try {
                            j1m0.m52169d(k1m0Var.f118393e, (o1m0) linkedList2.remove());
                        } catch (Throwable th2) {
                            g9j0Var.m44054e(gzi0VarM44051a);
                            throw th2;
                        }
                    }
                    g9j0Var.m44054e(gzi0VarM44051a);
                }
                return w2a1.f247311a;
            case 24:
                return (Boolean) ((x10) this.f64682b).invoke(((i1m0) obj).f97551b);
            case 25:
                return Boolean.valueOf(((Window.Callback) this.f64682b).dispatchTouchEvent((MotionEvent) obj));
            case 26:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                if (((m7i0) ((ykn) this.f64682b).f273762h) != null) {
                    return new s9p0(zBooleanValue);
                }
                wj50.m88260d0("multiPlayer");
                throw null;
            case 27:
                ((z9q0) ((vdm) this.f64682b).f240430l).mo33364d();
                return lau.f131415a;
            case 28:
                v9m0 v9m0Var = (v9m0) this.f64682b;
                er70 er70Var = v9m0Var.f239004i;
                fiz fizVarM29488a = ((bjp) er70Var.get()).m29488a();
                ajp ajpVar = (ajp) v9m0Var.f239005t.get();
                fiz fizVarM97034k = zug1.m97034k(ajpVar.f16303a, ajpVar.f16304b, ajpVar.f16305c, Collections.singleton(y920.f270471c), new hgl(0, ajpVar, ajp.class, "fakeGroupData", "fakeGroupData()Lcom/spotify/connect/core/model/group/GroupData;", 0, 0, 6), new oye(ajpVar, 21));
                fiz fizVarM29488a2 = ((bjp) er70Var.get()).m29488a();
                er70 er70Var2 = v9m0Var.f239000e;
                nlz nlzVarM43302g = g0g1.m43302g(fizVarM29488a, fizVarM97034k, xtm0.m92074U(mvl0.m62953p(new zux(fizVarM29488a2, mvl0.m62953p(new evi(((wvo) er70Var2.get()).m89134a(), i3)), new rvk0(i4, i5, r12), i5)), new g3c0((fbk) r12, v9m0Var, i2)), new g82(4, 19, (fbk) r12));
                wvo wvoVar = (wvo) er70Var2.get();
                fiz fizVarM89134a = wvoVar.m89134a();
                Flowable flowable = wvoVar.f255540e;
                d0k[] d0kVarArr = bmu0.f28619a;
                int i6 = 2;
                zux zuxVar = new zux(xtm0.m92074U(new zux(fizVarM89134a, new vjz(mvl0.m62953p(new thl(new onc(flowable), wvoVar, 12)), new gc0(i6, 16, r12)), new ysl(i4, i, (fbk) r12), i5), new eud((fbk) r12, wvoVar, 14)), ((k3q) v9m0Var.f238997b.get()).m55279b(), new d6g0(v9m0Var, r12, i4), i5);
                vjz vjzVar = ((pqp) v9m0Var.f239001f.get()).f180356b;
                vjz vjzVar2 = ((ilp) v9m0Var.f239002g.get()).f103444b;
                mip mipVar = (mip) v9m0Var.f239003h.get();
                Iterable iterable = (Iterable) mipVar.f144058a.get();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : iterable) {
                    ((sp41) obj2).getClass();
                    arrayList.add(obj2);
                }
                List listM43711Y0 = g6f.m43711Y0(arrayList, new p3c(mipVar, 10));
                ArrayList arrayList2 = new ArrayList(i6f.m49804T(listM43711Y0, 10));
                Iterator it = listM43711Y0.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new vjz(((sp41) it.next()).f212732c, new gc0(i6, 22, r12)));
                }
                List listM43728j1 = g6f.m43728j1(arrayList2);
                int i7 = 0;
                vjz vjzVar3 = new vjz(new v78((fiz[]) listM43728j1.toArray(new fiz[0]), 7), new gc0(i6, 23, r12));
                dut dutVar = (dut) mipVar.f144059b.get();
                w2a1 w2a1Var = w2a1.f247311a;
                int i8 = 27;
                return g0g1.m43300e(zuxVar, vjzVar, vjzVar2, new zux(new zux(vjzVar3, new ysk(Collections.singletonList(new er40(w2a1Var, dutVar)), i8), new xa3(i4, i6, r12), i5), mipVar.f144061d.isEnabled() ? new ysk(Collections.singletonList(new er40(w2a1Var, (dut) mipVar.f144060c.get())), i8) : new ysk(lau.f131415a, i8), new xa3(i4, i4, r12), i5), nlzVarM43302g, new r9m0(i7, r12));
            default:
                return new mbm0((ct91) this.f64682b, (aey0) obj);
        }
    }
}
