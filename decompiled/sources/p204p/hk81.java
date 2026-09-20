package p204p;

import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes8.dex */
public final class hk81 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f92386a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f92387b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hk81(Object obj, int i) {
        super(0);
        this.f92386a = i;
        this.f92387b = obj;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        int i = this.f92386a;
        int i2 = 20;
        boolean z = false;
        fbk fbkVar = null;
        w2a1 w2a1Var = w2a1.f247311a;
        Object obj = this.f92387b;
        switch (i) {
            case 0:
                return (kv91) ((i4t0) ((ik81) obj).f103065h).get();
            case 1:
                mto0 mto0Var = ((ep81) obj).f61582h;
                if (mto0Var != null && mto0Var != mto0.f147117b && mto0Var != mto0.f147116a) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                return ((mu91) obj).f147283a;
            case 3:
                lfd1 lfd1Var = (lfd1) ((rk40) obj).f199980b;
                lfd1Var.f132927f.m51847a();
                lfd1Var.f132926e = BehaviorSubject.m23795f();
                return w2a1Var;
            case 4:
                return (kv91) ((p8o) ((yb81) obj).f271102b).get();
            case 5:
                return new po31((n23) obj);
            case 6:
                return new tw71((je91) obj);
            case 7:
                return new cjc0((dut) ((p8o) ((p22) obj).f173215d).get(), c691.f34446V0);
            case 8:
                qik qikVar = (qik) obj;
                return new cjc0((iiv0) qikVar.f189023d, new zk81(qikVar, i2));
            case 9:
                ((cf91) obj).f37311d.invoke(a131.f11315a);
                return w2a1Var;
            case 10:
                return opo.m67570t(njg1.m64613f(), ((cm91) obj).f39629h);
            case 11:
                oa81 oa81Var = (oa81) obj;
                return Boolean.valueOf((((yum0) oa81Var.f163265b).getValue() == null && ((yum0) oa81Var.f163266c).getValue() == null) ? false : true);
            case 12:
                yb81 yb81Var = (yb81) obj;
                return Boolean.valueOf((((yum0) yb81Var.f271102b).getValue() == null && ((yum0) yb81Var.f271103c).getValue() == null) ? false : true);
            case 13:
                return ((r7i0) ((ks91) obj).f125892a.get()).mo43757c(true);
            case 14:
                ex91 ex91Var = (ex91) obj;
                return bzf1.m31027s(xtm0.m92074U((fiz) ex91Var.f63722c.invoke(), new zf01(fbkVar, ex91Var, 19)), kk40.m56661c(ex91Var.f63721b), hf11.m47320a(3, 0L), 1);
            case 15:
                fx91 fx91Var = (fx91) obj;
                return bzf1.m31027s(xtm0.m92074U((fiz) fx91Var.f74300b.invoke(), new zf01(fbkVar, fx91Var, i2)), kk40.m56661c(fx91Var.f74299a), hf11.m47320a(3, 0L), 1);
            case 16:
                oy91 oy91Var = (oy91) obj;
                Set set = oy91Var.f171713c;
                oxe oxeVar = oy91Var.f171711a;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : set) {
                    if (obj2 instanceof my91) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : arrayList) {
                    if (((my91) obj3).f148372c) {
                        arrayList2.add(obj3);
                    }
                }
                xy3 xy3Var = (xy3) oxeVar;
                xy3Var.m92400e("session_ui_plugins_init");
                ArrayList arrayList3 = new ArrayList(i6f.m49804T(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add((jvb0) ((my91) it.next()).f148371b.get());
                }
                Set setM43736n1 = g6f.m43736n1(arrayList3);
                xy3Var.m92396a("session_ui_plugins_init");
                return setM43736n1;
            case 17:
                ((ty91) ((yk0) obj).f273514c).mo24869a();
                return w2a1Var;
            case 18:
                f1a1 f1a1Var = (f1a1) obj;
                kv91 kv91Var = (kv91) f1a1Var.f64844f.get();
                yt91 yt91VarM96903c = f1a1Var.f64845g.f266109b.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("back_button", null, null, null, null));
                yt91VarM96903c.f276056j = false;
                kv91Var.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_navigate_back", 1, nau.f152117a), yt91VarM96903c.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
                f1a1Var.f64843e.mo47345e();
                return w2a1Var;
            case 19:
                return (ovf) ((i3a1) obj).f98083a.get();
            case 20:
                lda1 lda1Var = (lda1) obj;
                Map map = lda1Var.f132123g;
                oda1 oda1Var = lda1Var.f132119c;
                Object obj4 = map.get(oda1Var.f164141b);
                if (obj4 != null) {
                    return (nda1) obj4;
                }
                throw new IllegalArgumentException(("No UpdateSchedulePageConfig registered for key " + oda1Var.f164141b).toString());
            case 21:
                return (ry8) ((p8o) ((yk1) obj).f273534f).get();
            case 22:
                woa1 woa1Var = (woa1) obj;
                qpa1 qpa1Var = woa1Var.f253424f;
                kv91 kv91Var2 = qpa1Var.f191252a;
                ahg0 ahg0Var = qpa1Var.f191253b;
                ahg0Var.getClass();
                yt91 yt91VarM96903c2 = ahg0Var.f15692b.m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("get_started_button", null, null, null, null));
                yt91VarM96903c2.f276056j = false;
                zt91 zt91VarM94607a = yt91VarM96903c2.m94607a();
                AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
                String str = xgg1.m90861q2().f36164a;
                dv91 dv91Var = new dv91("hit", 1);
                String string = str.toString();
                if (string == null) {
                    string = "";
                }
                kv91Var2.mo57453r(new av91("", "", dv91Var, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string)), zt91VarM94607a, st91.f213865b, System.currentTimeMillis()), null);
                String str2 = xoc1.f264236y5.f243453a;
                if (str2 == null) {
                    throw new IllegalStateException("uri was not set!");
                }
                p6j0 p6j0Var = new p6j0(str2, "", false, false, 0, 0, false, null, null, null);
                woa1Var.f253425g = false;
                try {
                    woa1Var.f253420b.mo47348i(p6j0Var, pp91.m70529j(new pqm0("screenshotFilePath", woa1Var.f253422d.f274617a), new pqm0("feedbackReportMode", "ExternalFeedback")));
                    return w2a1Var;
                } catch (Throwable th) {
                    woa1Var.f253425g = true;
                    throw th;
                }
            case 23:
                lsa1 lsa1Var = ((isa1) obj).f105206d;
                lsa1Var.m59824a().mo57453r(((cpg0) lsa1Var.f136491d.getValue()).m33565e(), null);
                return w2a1Var;
            case 24:
                return (ijc1) ((nxa1) obj).invoke();
            case 25:
                ((e5b1) obj).f56340i.setValue(w2a1Var);
                return w2a1Var;
            case 26:
                xgb1 xgb1Var = (xgb1) obj;
                String str3 = xgb1Var.f261277h;
                String str4 = xgb1Var.f261283n;
                String str5 = xgb1Var.f261272c;
                String str6 = xgb1Var.f261284o;
                return new q4k(null, true, false, false, true, false, false, new ray(str3, null, str4, new cqj0(205, str5, str6 == null ? str5 : str6, null, false, true, false), 16), true, false, 0, false, false, false, false, false, null, false, false, null, false, null, null, null, false, false, 1073741021);
            case 27:
                return (zbr) ((xv41) ((wg61) ((xpv0) obj).f264750g).getValue()).getValue();
            case 28:
                return (vh21) ((oyp0) obj).f171834d;
            default:
                return (kv91) ((hwb1) obj).f95901a.get();
        }
    }
}
