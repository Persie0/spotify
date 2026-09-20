package p204p;

import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes.dex */
public final class hmd implements r4m0 {

    /* JADX INFO: renamed from: A */
    public final lvn f92893A;

    /* JADX INFO: renamed from: B */
    public final kvn f92894B;

    /* JADX INFO: renamed from: C */
    public final udk f92895C;

    /* JADX INFO: renamed from: D */
    public final yln f92896D;

    /* JADX INFO: renamed from: E */
    public final ze90 f92897E;

    /* JADX INFO: renamed from: F */
    public final vmz f92898F;

    /* JADX INFO: renamed from: G */
    public final it9 f92899G;

    /* JADX INFO: renamed from: H */
    public final cob f92900H;

    /* JADX INFO: renamed from: I */
    public final no2 f92901I;

    /* JADX INFO: renamed from: J */
    public final ovn f92902J;

    /* JADX INFO: renamed from: K */
    public final qvn f92903K;

    /* JADX INFO: renamed from: L */
    public final ugn f92904L;

    /* JADX INFO: renamed from: M */
    public final svn f92905M;

    /* JADX INFO: renamed from: N */
    public final uvn f92906N;

    /* JADX INFO: renamed from: O */
    public final oom f92907O;

    /* JADX INFO: renamed from: P */
    public final pom f92908P;

    /* JADX INFO: renamed from: Q */
    public final vvn f92909Q;

    /* JADX INFO: renamed from: R */
    public final xvn f92910R;

    /* JADX INFO: renamed from: S */
    public final yvn f92911S;

    /* JADX INFO: renamed from: T */
    public final isp0 f92912T;

    /* JADX INFO: renamed from: U */
    public final zvn f92913U;

    /* JADX INFO: renamed from: V */
    public final xfp0 f92914V;

    /* JADX INFO: renamed from: W */
    public final bwn f92915W;

    /* JADX INFO: renamed from: X */
    public final cwn f92916X;

    /* JADX INFO: renamed from: Y */
    public final dwn f92917Y;

    /* JADX INFO: renamed from: Z */
    public final eom f92918Z;

    /* JADX INFO: renamed from: a */
    public final voc1 f92919a;

    /* JADX INFO: renamed from: a0 */
    public final fom f92920a0;

    /* JADX INFO: renamed from: b */
    public final Context f92921b;

    /* JADX INFO: renamed from: b0 */
    public final er70 f92922b0;

    /* JADX INFO: renamed from: c */
    public final pgo f92923c;

    /* JADX INFO: renamed from: c0 */
    public final egm0 f92924c0;

    /* JADX INFO: renamed from: d */
    public final z9j0 f92925d;

    /* JADX INFO: renamed from: d0 */
    public final mfb f92926d0;

    /* JADX INFO: renamed from: e */
    public final jnd f92927e;

    /* JADX INFO: renamed from: e0 */
    public final yun f92928e0;

    /* JADX INFO: renamed from: f */
    public final rk0 f92929f;

    /* JADX INFO: renamed from: f0 */
    public final z080 f92930f0;

    /* JADX INFO: renamed from: g */
    public final kcd f92931g;

    /* JADX INFO: renamed from: g0 */
    public final z080 f92932g0;

    /* JADX INFO: renamed from: h */
    public final gw80 f92933h;

    /* JADX INFO: renamed from: h0 */
    public final gom f92934h0;

    /* JADX INFO: renamed from: i */
    public final ra9 f92935i;

    /* JADX INFO: renamed from: i0 */
    public final f3p f92936i0;

    /* JADX INFO: renamed from: j */
    public final ynb f92937j;

    /* JADX INFO: renamed from: j0 */
    public final xre f92938j0;

    /* JADX INFO: renamed from: k */
    public final zun f92939k;

    /* JADX INFO: renamed from: k0 */
    public final scn f92940k0;

    /* JADX INFO: renamed from: l */
    public final hkh f92941l;

    /* JADX INFO: renamed from: l0 */
    public final xuk f92942l0;

    /* JADX INFO: renamed from: m */
    public final l89 f92943m;

    /* JADX INFO: renamed from: m0 */
    public final boolean f92944m0;

    /* JADX INFO: renamed from: n */
    public final gvn f92945n;

    /* JADX INFO: renamed from: n0 */
    public final pfm0 f92946n0;

    /* JADX INFO: renamed from: o */
    public final bxb f92947o;

    /* JADX INFO: renamed from: o0 */
    public final wg61 f92948o0;

    /* JADX INFO: renamed from: p */
    public final i4t0 f92949p;

    /* JADX INFO: renamed from: p0 */
    public final wg61 f92950p0;

    /* JADX INFO: renamed from: q */
    public final fud f92951q;

    /* JADX INFO: renamed from: r */
    public final nom f92952r;

    /* JADX INFO: renamed from: s */
    public final hre0 f92953s;

    /* JADX INFO: renamed from: t */
    public final ryj0 f92954t;

    /* JADX INFO: renamed from: u */
    public final v1k0 f92955u;

    /* JADX INFO: renamed from: v */
    public final i4t0 f92956v;

    /* JADX INFO: renamed from: w */
    public final tgn f92957w;

    /* JADX INFO: renamed from: x */
    public final x1p0 f92958x;

    /* JADX INFO: renamed from: y */
    public final rln f92959y;

    /* JADX INFO: renamed from: z */
    public final jvn f92960z;

    public hmd(voc1 voc1Var, Context context, pgo pgoVar, z9j0 z9j0Var, jnd jndVar, rk0 rk0Var, kcd kcdVar, gw80 gw80Var, ra9 ra9Var, ynb ynbVar, zun zunVar, hkh hkhVar, l89 l89Var, gvn gvnVar, bxb bxbVar, h4t0 h4t0Var, fud fudVar, nom nomVar, hre0 hre0Var, ryj0 ryj0Var, v1k0 v1k0Var, h4t0 h4t0Var2, tgn tgnVar, x1p0 x1p0Var, rln rlnVar, jvn jvnVar, dvn dvnVar, lvn lvnVar, kvn kvnVar, udk udkVar, mvn mvnVar, yln ylnVar, ze90 ze90Var, vmz vmzVar, it9 it9Var, cob cobVar, no2 no2Var, ovn ovnVar, qvn qvnVar, ugn ugnVar, svn svnVar, uvn uvnVar, oom oomVar, pom pomVar, vvn vvnVar, xvn xvnVar, yvn yvnVar, isp0 isp0Var, zvn zvnVar, xfp0 xfp0Var, bwn bwnVar, cwn cwnVar, dwn dwnVar, eom eomVar, fom fomVar, er70 er70Var, egm0 egm0Var, mfb mfbVar, yun yunVar, z080 z080Var, z080 z080Var2, gom gomVar, f3p f3pVar, xre xreVar, scn scnVar, xuk xukVar) {
        this.f92919a = voc1Var;
        this.f92921b = context;
        this.f92923c = pgoVar;
        this.f92925d = z9j0Var;
        this.f92927e = jndVar;
        this.f92929f = rk0Var;
        this.f92931g = kcdVar;
        this.f92933h = gw80Var;
        this.f92935i = ra9Var;
        this.f92937j = ynbVar;
        this.f92939k = zunVar;
        this.f92941l = hkhVar;
        this.f92943m = l89Var;
        this.f92945n = gvnVar;
        this.f92947o = bxbVar;
        this.f92949p = h4t0Var;
        this.f92951q = fudVar;
        this.f92952r = nomVar;
        this.f92953s = hre0Var;
        this.f92954t = ryj0Var;
        this.f92955u = v1k0Var;
        this.f92956v = h4t0Var2;
        this.f92957w = tgnVar;
        this.f92958x = x1p0Var;
        this.f92959y = rlnVar;
        this.f92960z = jvnVar;
        this.f92893A = lvnVar;
        this.f92894B = kvnVar;
        this.f92895C = udkVar;
        this.f92896D = ylnVar;
        this.f92897E = ze90Var;
        this.f92898F = vmzVar;
        this.f92899G = it9Var;
        this.f92900H = cobVar;
        this.f92901I = no2Var;
        this.f92902J = ovnVar;
        this.f92903K = qvnVar;
        this.f92904L = ugnVar;
        this.f92905M = svnVar;
        this.f92906N = uvnVar;
        this.f92907O = oomVar;
        this.f92908P = pomVar;
        this.f92909Q = vvnVar;
        this.f92910R = xvnVar;
        this.f92911S = yvnVar;
        this.f92912T = isp0Var;
        this.f92913U = zvnVar;
        this.f92914V = xfp0Var;
        this.f92915W = bwnVar;
        this.f92916X = cwnVar;
        this.f92917Y = dwnVar;
        this.f92918Z = eomVar;
        this.f92920a0 = fomVar;
        this.f92922b0 = er70Var;
        this.f92924c0 = egm0Var;
        this.f92926d0 = mfbVar;
        this.f92928e0 = yunVar;
        this.f92930f0 = z080Var;
        this.f92932g0 = z080Var2;
        this.f92934h0 = gomVar;
        this.f92936i0 = f3pVar;
        this.f92938j0 = xreVar;
        this.f92940k0 = scnVar;
        this.f92942l0 = xukVar;
        boolean zM53820h = jndVar.m53820h();
        this.f92944m0 = zM53820h;
        ro80 ro80VarM44508o = geg1.m44508o();
        AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
        ro80VarM44508o.add(new q040(xgg1.m90894v0(), voc1Var, null));
        ro80VarM44508o.add(new h380(k0e1.f118031g));
        int i = 1;
        ro80VarM44508o.add(new tkm0(null, 2, 1));
        ro80VarM44508o.add(new a6m0(true));
        ro80VarM44508o.add(new maa0());
        ro80VarM44508o.add(new e6m0(true));
        int i2 = 0;
        ro80VarM44508o.add(new sw91(14, true, false, false));
        ro80VarM44508o.add(new ayd1(16));
        if (zM53820h) {
            ro80VarM44508o.add(new fda(null, bda.f26062b, null, 0, null, null, false, false, true, 1789));
        }
        qfm0[] qfm0VarArr = (qfm0[]) geg1.m44506m(ro80VarM44508o).toArray(new qfm0[0]);
        this.f92946n0 = new pfm0((qfm0[]) Arrays.copyOf(qfm0VarArr, qfm0VarArr.length), false);
        this.f92948o0 = new wg61(new emd(this, i2));
        this.f92950p0 = new wg61(new emd(this, i));
    }

    /* JADX INFO: renamed from: A */
    public static final ArrayList m47940A(hmd hmdVar, List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!wj50.m88271j(((pla1) obj).getUsername(), hmdVar.f92927e.m53819g())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: j */
    public static final idu m47948j(hmd hmdVar) {
        return (idu) hmdVar.f92948o0.getValue();
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: a */
    public final pfm0 mo24326a() {
        return this.f92946n0;
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: b */
    public final u6m0 mo24327b() {
        return this.f92941l.m47840a(tky.m81027c(new v4a0[0], new mr0(this, null, 23)), rkk.m75763o(new sgd(this, 1), true, 1557340420), new u5a0(new dmd(this), f4c.f65733U0, wqb0.f253965P0, fcd.f68088h), new hlh(null, null, null, false, 63));
    }
}
