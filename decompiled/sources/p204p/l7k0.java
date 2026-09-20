package p204p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.coroutines.C1045b;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxMobius;
import com.spotify.nowplaying.scroll.container.ScrollCardsContainer;
import com.spotify.nowplaying.scroll.view.NowPlayingScrollView;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableRefCount;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class l7k0 implements fek0 {

    /* JADX INFO: renamed from: A */
    public zv41 f130667A;

    /* JADX INFO: renamed from: B */
    public boolean f130668B;

    /* JADX INFO: renamed from: a */
    public final mbk0 f130669a;

    /* JADX INFO: renamed from: b */
    public final i4t0 f130670b;

    /* JADX INFO: renamed from: c */
    public final i4t0 f130671c;

    /* JADX INFO: renamed from: d */
    public final fiz f130672d;

    /* JADX INFO: renamed from: e */
    public final b5y0 f130673e;

    /* JADX INFO: renamed from: f */
    public final Set f130674f;

    /* JADX INFO: renamed from: g */
    public final o0i f130675g;

    /* JADX INFO: renamed from: h */
    public final kbk0 f130676h;

    /* JADX INFO: renamed from: i */
    public final w5m f130677i;

    /* JADX INFO: renamed from: j */
    public final l181 f130678j;

    /* JADX INFO: renamed from: k */
    public final n9r0 f130679k;

    /* JADX INFO: renamed from: l */
    public final kj4 f130680l;

    /* JADX INFO: renamed from: m */
    public final luk f130681m;

    /* JADX INFO: renamed from: n */
    public final luk f130682n;

    /* JADX INFO: renamed from: o */
    public final m680 f130683o;

    /* JADX INFO: renamed from: p */
    public MobiusLoop f130684p;

    /* JADX INFO: renamed from: q */
    public nky0 f130685q;

    /* JADX INFO: renamed from: r */
    public c9k f130686r;

    /* JADX INFO: renamed from: s */
    public flw0 f130687s;

    /* JADX INFO: renamed from: t */
    public jhz0 f130688t;

    /* JADX INFO: renamed from: u */
    public iqp0 f130689u;

    /* JADX INFO: renamed from: v */
    public final zv41 f130690v = jag1.m52819d(gbu.f78413a);

    /* JADX INFO: renamed from: w */
    public x5m f130691w;

    /* JADX INFO: renamed from: x */
    public sky0 f130692x;

    /* JADX INFO: renamed from: y */
    public tp80 f130693y;

    /* JADX INFO: renamed from: z */
    public l5k0 f130694z;

    public l7k0(mbk0 mbk0Var, i4t0 i4t0Var, i4t0 i4t0Var2, eyd eydVar, b5y0 b5y0Var, Set set, o0i o0iVar, kbk0 kbk0Var, w5m w5mVar, l181 l181Var, n9r0 n9r0Var, kj4 kj4Var, luk lukVar, luk lukVar2, m680 m680Var) {
        this.f130669a = mbk0Var;
        this.f130670b = i4t0Var;
        this.f130671c = i4t0Var2;
        this.f130672d = eydVar;
        this.f130673e = b5y0Var;
        this.f130674f = set;
        this.f130675g = o0iVar;
        this.f130676h = kbk0Var;
        this.f130677i = w5mVar;
        this.f130678j = l181Var;
        this.f130679k = n9r0Var;
        this.f130680l = kj4Var;
        this.f130681m = lukVar;
        this.f130682n = lukVar2;
        this.f130683o = m680Var;
    }

    /* JADX INFO: renamed from: c */
    public static ArrayList m58417c(kt41 kt41Var, Set set) {
        List data = kt41Var.getData();
        ArrayList arrayList = new ArrayList();
        for (Object obj : data) {
            h7k0 h7k0Var = (h7k0) obj;
            Set set2 = set;
            if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                Iterator it = set2.iterator();
                while (it.hasNext()) {
                    if (((ife) ((q5k0) it.next()).mo33468d()).mo28587A().isAssignableFrom(h7k0Var.getClass())) {
                        arrayList.add(obj);
                        break;
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public final void m58418b() {
        sky0 sky0Var = this.f130692x;
        if (sky0Var != null) {
            sky0Var.f210221d = 0;
            sky0Var.f210222e = null;
            sky0Var.f210223f = 0;
            zv41 zv41Var = sky0Var.f210219b;
            Boolean bool = Boolean.FALSE;
            zv41Var.getClass();
            zv41Var.m97091m(null, bool);
        }
        this.f130667A = null;
        tp80 tp80Var = this.f130693y;
        if (tp80Var != null) {
            ((xp80) tp80Var).m91650a();
        }
        this.f130693y = null;
        l5k0 l5k0Var = this.f130694z;
        if (l5k0Var != null) {
            l5k0Var.f129962a.m25872i();
        }
        this.f130694z = null;
        nky0 nky0Var = this.f130685q;
        if (nky0Var != null) {
            ScrollCardsContainer scrollCardsContainer = (ScrollCardsContainer) nky0Var;
            mky0 mky0Var = scrollCardsContainer.f6283a;
            if (mky0Var != null) {
                mky0Var.setAdapter(null);
                oc80 oc80Var = mky0Var.f144711j2;
                if (oc80Var.f163857d.m41223a(fb80.f67752c)) {
                    oc80Var.m66678i(fb80.f67750a);
                }
            }
            scrollCardsContainer.removeAllViews();
            scrollCardsContainer.f6283a = null;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m58419d(gek0 gek0Var, nky0 nky0Var, cq6 cq6Var, t9p0 t9p0Var, boolean z) {
        mbk0 mbk0Var;
        jhz0 jhz0Var;
        this.f130685q = nky0Var;
        c9k c9kVarM56661c = kk40.m56661c(opo.m67570t(njg1.m64613f(), this.f130682n));
        this.f130686r = c9kVarM56661c;
        juk jukVar = c9kVarM56661c.f35578a;
        luk lukVar = this.f130681m;
        this.f130687s = new flw0(this.f130672d, new c9k(jukVar.mo26608y(lukVar)));
        this.f130688t = new jhz0(21);
        NowPlayingScrollView nowPlayingScrollView = (NowPlayingScrollView) gek0Var;
        FlowableRefCount flowableRefCount = nowPlayingScrollView.f6287i1;
        d0k[] d0kVarArr = bmu0.f28619a;
        onc oncVar = new onc(flowableRefCount);
        c9k c9kVar = this.f130686r;
        fbk fbkVar = null;
        if (c9kVar == null) {
            wj50.m88260d0("scope");
            throw null;
        }
        b5y0 b5y0Var = this.f130673e;
        this.f130689u = new iqp0((hcn) b5y0Var.f23789b, (fiz) b5y0Var.f23790c, oncVar, c9kVar);
        kj4 kj4Var = this.f130680l;
        if (kj4Var.m56547d() && (gek0Var instanceof NowPlayingScrollView)) {
            NowPlayingScrollView nowPlayingScrollView2 = (NowPlayingScrollView) gek0Var;
            int iM56545b = kj4Var.m56545b();
            c9k c9kVar2 = this.f130686r;
            if (c9kVar2 == null) {
                wj50.m88260d0("scope");
                throw null;
            }
            this.f130692x = new sky0(nowPlayingScrollView2, iM56545b, c9kVar2, lukVar);
        }
        x5m x5mVarMo37945b = this.f130677i.mo37945b(null, this.f130690v, new bya0(this, fbkVar, 7));
        x5mVarMo37945b.start();
        this.f130691w = x5mVarMo37945b;
        Set set = this.f130674f;
        ArrayList arrayList = new ArrayList(i6f.m49804T(set, 10));
        Iterator it = set.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            mbk0Var = this.f130669a;
            if (!zHasNext) {
                break;
            } else {
                arrayList.add(((p5k0) it.next()).mo33179a(mbk0Var, new ccj0(cq6Var, 12), t9p0Var, x5mVarMo37945b.mo28301c()));
            }
        }
        Set setM43736n1 = g6f.m43736n1(arrayList);
        v3j0 v3j0Var = new v3j0(8, setM43736n1, this);
        o0i o0iVar = this.f130675g;
        pny0 pny0Var = (pny0) o0iVar.f160396c;
        fiz fizVar = (fiz) o0iVar.f160395b;
        fus0 fus0Var = (fus0) o0iVar.f160400g;
        hj4 hj4Var = (hj4) o0iVar.f160397d;
        jj4 jj4Var = (jj4) o0iVar.f160398e;
        kj4 kj4Var2 = (kj4) o0iVar.f160399f;
        o040 o040Var = (o040) o0iVar.f160401h;
        boolean z2 = o0iVar.f160394a;
        se0 se0Var = (se0) o0iVar.f160402i;
        itb1 itb1Var = (itb1) o0iVar.f160403j;
        xre xreVar = (xre) o0iVar.f160404k;
        luk lukVar2 = (luk) o0iVar.f160405l;
        o5k0 o5k0Var = new o5k0(v3j0Var, pny0Var, fizVar, fus0Var, hj4Var, jj4Var, kj4Var2, o040Var, z2, se0Var, itb1Var, xreVar, lukVar2);
        c9k c9kVar3 = this.f130686r;
        if (c9kVar3 == null) {
            wj50.m88260d0("scope");
            throw null;
        }
        sky0 sky0Var = this.f130692x;
        nuu0 nuu0Var = sky0Var != null ? sky0Var.f210220c : null;
        nuu0 nuu0VarM31029u = bzf1.m31029u(fizVar, c9kVar3, hf11.f90581a, null);
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderM15658c = RxMobius.m15658c();
        subtypeEffectHandlerBuilderM15658c.m15665g(igt.class, new tsy(v3j0Var, pny0Var, hj4Var.m47650a(), fus0Var, jj4Var, kj4Var2.m56548e(), z2, se0Var, xreVar));
        subtypeEffectHandlerBuilderM15658c.m15665g(elt.class, new ynb0(new flw0(nuu0VarM31029u, xreVar, nuu0Var, 0), 6));
        MobiusLoop.Builder builderMo15592d = Mobius.m15582d(m5k0.f140246a, RxConnectables.m15653a(subtypeEffectHandlerBuilderM15658c.m15666h())).mo15592d(new n5k0(o5k0Var));
        boolean zM56544a = kj4Var2.m56544a();
        boolean zM56548e = kj4Var2.m56548e();
        jif0 jif0Var = new jif0(new kmx(nuu0VarM31029u, 8), 22);
        ro80 ro80VarM44508o = geg1.m44508o();
        ro80VarM44508o.add(new hhk(mvl0.m62952o(jif0Var, klx0.f124003t), zM56548e, xreVar, o040Var));
        if (zM56544a) {
            ro80VarM44508o.add(new f3i0(ryf1.m76713k(mvl0.m62953p(k0e1.m54985d(itb1Var.m51626a())), 1), nuu0VarM31029u, o040Var, 23));
        }
        ro80 ro80VarM44506m = geg1.m44506m(ro80VarM44508o);
        FlowEventSources.Companion companion = FlowEventSources.f5713a;
        fiz[] fizVarArr = (fiz[]) ro80VarM44506m.toArray(new fiz[0]);
        fiz[] fizVarArr2 = (fiz[]) Arrays.copyOf(fizVarArr, fizVarArr.length);
        companion.getClass();
        MobiusLoop mobiusLoopMo15595g = builderMo15592d.mo15596h(new C1045b(lukVar2, fizVarArr2)).mo15595g(new pt41(""));
        this.f130684p = mobiusLoopMo15595g;
        this.f130668B = true;
        mobiusLoopMo15595g.m15601b(new c3e(6, this, setM43736n1));
        gek0Var.mo15992b(mbk0Var.mo61417l().m85159e());
        flw0 flw0Var = this.f130687s;
        if (flw0Var != null) {
            di41 di41Var = (di41) flw0Var.f70880d;
            fbk fbkVar2 = null;
            if (di41Var != null) {
                di41Var.mo26601e(null);
            }
            flw0Var.f70880d = x0h1.m89578u((c9k) flw0Var.f70879c, null, 0, new xay0(flw0Var, gek0Var, fbkVar2, 4), 3);
        }
        if (z && (jhz0Var = this.f130688t) != null) {
            ((iwr) jhz0Var.f112587b).m51848b(Flowable.m23322h(gek0Var.mo15991a(), nowPlayingScrollView.f6288j1, ykq0.f273795S0).m23343X(new gc41(gek0Var, 8)).subscribe(new s651(gek0Var, 5), cz31.f43435L0));
        }
        iqp0 iqp0Var = this.f130689u;
        if (iqp0Var != null) {
            di41 di41Var2 = (di41) iqp0Var.f104825f;
            if (di41Var2 != null) {
                di41Var2.mo26601e(null);
            }
            iqp0Var.f104825f = x0h1.m89578u((xuk) iqp0Var.f104824e, null, 0, new q2y0(iqp0Var, null, 6), 3);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m58420e() {
        this.f130668B = false;
        MobiusLoop mobiusLoop = this.f130684p;
        if (mobiusLoop != null) {
            mobiusLoop.dispose();
        }
        c9k c9kVar = this.f130686r;
        if (c9kVar != null) {
            kk40.m56680v(c9kVar, null);
        }
        iqp0 iqp0Var = this.f130689u;
        if (iqp0Var != null) {
            di41 di41Var = (di41) iqp0Var.f104825f;
            if (di41Var != null) {
                di41Var.mo26601e(null);
            }
            iqp0Var.f104825f = null;
        }
        this.f130689u = null;
        flw0 flw0Var = this.f130687s;
        if (flw0Var != null) {
            di41 di41Var2 = (di41) flw0Var.f70880d;
            if (di41Var2 != null) {
                di41Var2.mo26601e(null);
            }
            flw0Var.f70880d = null;
        }
        this.f130687s = null;
        jhz0 jhz0Var = this.f130688t;
        if (jhz0Var != null) {
            ((iwr) jhz0Var.f112587b).m51847a();
        }
        this.f130688t = null;
        m58418b();
        this.f130692x = null;
        x5m x5mVar = this.f130691w;
        if (x5mVar != null) {
            x5mVar.stop();
        }
        this.f130691w = null;
    }
}
