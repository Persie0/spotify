package p204p;

import android.content.Context;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.spotify.adonappopen.repository.storage.AdOnAppOpenDatabase_Impl;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import com.spotify.mobius.functions.Consumer;
import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: renamed from: p.k3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2038k3 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f118709a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f118710b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2038k3(Object obj, int i) {
        super(0);
        this.f118709a = i;
        this.f118710b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, java.util.List] */
    @Override // p204p.eh00
    public final Object invoke() {
        int i = this.f118709a;
        int i2 = 3;
        int i3 = 0;
        fbk fbkVar = null;
        w2a1 w2a1Var = w2a1.f247311a;
        Object obj = this.f118710b;
        switch (i) {
            case 0:
                C2324r3 c2324r3 = (C2324r3) obj;
                return c2324r3.f195298b.m84067a(c2324r3.f195297a, c2324r3.f195301e);
            case 1:
                C1654a4 c1654a4 = (C1654a4) obj;
                return new C2324r3(c1654a4.f12089a, c1654a4.f12090b, c1654a4.f12091c, c1654a4.f12092d, c1654a4.f12093e, c1654a4.f12094f);
            case 2:
                luk lukVar = ((C2257pi) obj).f177771c;
                x461 x461VarM64613f = njg1.m64613f();
                lukVar.getClass();
                return opo.m67570t(lukVar, x461VarM64613f);
            case 3:
                return (MessageResponseToken) ((uf10) ((C1947hm) obj).f92784d).invoke();
            case 4:
                C2169nm c2169nm = (C2169nm) obj;
                x0h1.m89578u(n5h1.m63737m((r55) c2169nm.f155199e), null, 0, new C2095lm(c2169nm, fbkVar, i3), 3);
                return w2a1Var;
            case 5:
                Consumer consumer = (Consumer) ((C2223op) obj).f167725f;
                if (consumer != null) {
                    consumer.accept(C2383so.f211067a);
                    return w2a1Var;
                }
                wj50.m88260d0("consumer");
                throw null;
            case 6:
                return new nzx0(new C2482v4((C2313qt) obj, fbkVar, 6));
            case 7:
                return bzf1.m31029u(new C2373se(k0e1.m54985d((Observable) obj), i2), kk40.m56661c(opo.m67570t(qlg1.m73202g(), xsr.f265652b)), hf11.m47320a(3, 0L), Boolean.TRUE);
            case 8:
                g30 g30Var = (g30) obj;
                return new y30(g30Var.f76051b, g30Var.f76052c, g30Var.f76053d, g30Var.f76054e, g30Var.f76055f, g30Var.f76056g, g30Var.f76057h, g30Var.f76058i, g30Var.f76059t, g30Var.f76050a, g30Var.f76047X);
            case 9:
                return (dut) ((h30) obj).f87098b.invoke();
            case 10:
                ((r70) obj).f196400c.invoke();
                return w2a1Var;
            case 11:
                return Integer.valueOf(((fj0) obj).f70028a.f91626c.size());
            case 12:
                return new br0((AdOnAppOpenDatabase_Impl) obj);
            case 13:
                ((wr0) obj).m88795d();
                return w2a1Var;
            case 14:
                return new cjc0((dut) ((fa1) obj).f67404b.get(), hv0.f95494T0);
            case 15:
                hg6 hg6Var = (hg6) ((otn) ((px0) ((sti) ((zgm) obj).f282677a.f133244b).f213917a).f182174b).f169605Z5.get();
                jg31.m53271i(hg6Var);
                return new cjc0(new np0(hg6Var), hv0.f95506b1);
            case 16:
                tk1 tk1Var = (tk1) obj;
                return tk1Var.f221056c.mo27151a(uh1.f230319i, new uk1(tk1Var.f221063t));
            case 17:
                abk abkVar = (abk) ((bhm) ((yk1) obj).f273535g).f27216a.f133244b;
                Context context = (Context) ((nen) abkVar.f14138c).f153031a.f212437t1.f246642a;
                jg31.m53271i(context);
                voc1 voc1VarM58014g = ((l3n) abkVar.f14137b).m58014g();
                n93 n93Var = (n93) ((nen) abkVar.f14138c).f153032b.f169896r1.get();
                jg31.m53271i(n93Var);
                return new cjc0(new z080(context, voc1VarM58014g, n93Var), dk1.f49787L0);
            case 18:
                ((C2255pg) obj).invoke();
                return w2a1Var;
            case 19:
                ((C2038k3) obj).invoke();
                return w2a1Var;
            case 20:
                s73 s73Var = (s73) ((twy) obj).f224516h;
                if (s73Var != null) {
                    s73Var.cancel();
                }
                return w2a1Var;
            case 21:
                ((qq1) obj).m73464h1();
                return w2a1Var;
            case 22:
                ((wq1) obj).f253886j.m63782a(bda.f26062b);
                return w2a1Var;
            case 23:
                return (ijc1) ((bx1) obj).invoke();
            case 24:
                int i4 = wkm0.f252262Q0;
                return ujg1.m83280u((ScrollView) ((wx1) obj).f255875d.f177385b);
            case 25:
                return hug1.m48669n((CoordinatorLayout) ((ood0) obj).f167565b).mo15684j0(q040.class);
            case 26:
                ez1 ez1Var = (ez1) obj;
                bji bjiVar = ez1Var.f64236b;
                if (bjiVar != null) {
                    return (ez1) bjiVar.mo29483e(new dz1(ez1Var, i3));
                }
                return null;
            case 27:
                p02 p02Var = (p02) obj;
                p02Var.f172435S0.m60127a(p02Var.f172429M0.firstOrError().zipWith(p02Var.f172433Q0.m23327A(), s0o0.f204461e).observeOn(p02Var.f172434R0).subscribe(new o02(p02Var, 1), C1710bm.f28341t));
                return w2a1Var;
            case 28:
                return new cjc0((dut) ((lgm) ((p22) obj).f173215d).get(), hv1.f95524N0);
            default:
                t22 t22Var = (t22) obj;
                return new cjc0((ymn0) t22Var.f216410d, new lc1(t22Var, 18));
        }
    }
}
