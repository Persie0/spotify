package p204p;

import io.reactivex.rxjava3.core.Completable;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
public final class lk20 implements cut {

    /* JADX INFO: renamed from: L0 */
    public final Object f134210L0;

    /* JADX INFO: renamed from: M0 */
    public final avt f134211M0;

    /* JADX INFO: renamed from: N0 */
    public final ywt f134212N0;

    /* JADX INFO: renamed from: X */
    public final qe70 f134213X;

    /* JADX INFO: renamed from: Y */
    public final Object f134214Y;

    /* JADX INFO: renamed from: Z */
    public final Object f134215Z;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f134216a;

    /* JADX INFO: renamed from: b */
    public final boolean f134217b;

    /* JADX INFO: renamed from: c */
    public final xiz f134218c;

    /* JADX INFO: renamed from: d */
    public boolean f134219d;

    /* JADX INFO: renamed from: e */
    public final Object f134220e;

    /* JADX INFO: renamed from: f */
    public final Object f134221f;

    /* JADX INFO: renamed from: g */
    public final Object f134222g;

    /* JADX INFO: renamed from: h */
    public final Object f134223h;

    /* JADX INFO: renamed from: i */
    public final Object f134224i;

    /* JADX INFO: renamed from: t */
    public final Object f134225t;

    public lk20(z9j0 z9j0Var, eju ejuVar, wbq wbqVar, ry8 ry8Var, ry8 ry8Var2, ry8 ry8Var3, cjc0 cjc0Var, hgo hgoVar, yv7 yv7Var, si20 si20Var, List list, List list2, ry8 ry8Var4, boolean z, boolean z2, xv41 xv41Var, juk jukVar) {
        this.f134216a = 0;
        this.f134220e = ry8Var;
        this.f134221f = ry8Var2;
        this.f134222g = ry8Var3;
        this.f134223h = cjc0Var;
        this.f134224i = hgoVar;
        this.f134213X = si20Var;
        this.f134214Y = list;
        this.f134215Z = list2;
        this.f134225t = ry8Var4;
        this.f134217b = z;
        this.f134219d = z2;
        this.f134210L0 = new rfl(ejuVar.f60296d, wbqVar.m87678a(), 1);
        this.f134218c = vwf1.m86575i(new zux(xv41Var, yv7Var == null ? new ysk(null, 27) : yv7Var, new ysl(3, 23, (fbk) null), 1), if20.f101624Y0, lq00.f135900V0, jukVar, null, 16);
        this.f134211M0 = new j2a1();
        this.f134212N0 = hxg1.m49008u(new jk20(this, 0), new vy00(22, z9j0Var, this), new jk20(this, 1));
    }

    @Override // p204p.kzd1
    /* JADX INFO: renamed from: a */
    public final avt mo24358a() {
        switch (this.f134216a) {
            case 0:
                return (j2a1) this.f134211M0;
            default:
                return (i5x) this.f134211M0;
        }
    }

    @Override // p204p.qy8
    /* JADX INFO: renamed from: c */
    public final ywt mo24632c() {
        switch (this.f134216a) {
            case 0:
                return (eos) this.f134212N0;
            default:
                return (twt) this.f134212N0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00e3 A[Catch: CancellationException -> 0x005b, Exception -> 0x0169, TryCatch #0 {CancellationException -> 0x005b, blocks: (B:19:0x0056, B:24:0x0060, B:47:0x00e3, B:49:0x00ee, B:42:0x00d1), top: B:74:0x003e }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00ee A[Catch: CancellationException -> 0x005b, Exception -> 0x0169, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x005b, blocks: (B:19:0x0056, B:24:0x0060, B:47:0x00e3, B:49:0x00ee, B:42:0x00d1), top: B:74:0x003e }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0030  */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00fa, code lost:
    
        if (r2.invoke(r10) == r15) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0106, code lost:
    
        if (r8.mo26574b(r3, r0, r10, r2) == r15) goto L55;
     */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m59205e(spc0 spc0Var, tpc0 tpc0Var, rpc0 rpc0Var, cvt cvtVar, ibk ibkVar) {
        vpc0 vpc0Var;
        boolean z;
        om0 om0Var = (om0) this.f134224i;
        lrc0 lrc0Var = (lrc0) this.f134225t;
        ync0 ync0Var = (ync0) this.f134221f;
        hgb0 hgb0Var = (hgb0) this.f134213X;
        if (ibkVar instanceof vpc0) {
            vpc0Var = (vpc0) ibkVar;
            int i = vpc0Var.f243658d;
            if ((i & Integer.MIN_VALUE) != 0) {
                vpc0Var.f243658d = i - Integer.MIN_VALUE;
            } else {
                vpc0Var = new vpc0(this, ibkVar);
            }
        } else {
            vpc0Var = new vpc0(this, ibkVar);
        }
        Object obj = vpc0Var.f243656b;
        int i2 = vpc0Var.f243658d;
        yuk yukVar = yuk.f276404a;
        try {
            try {
                try {
                    if (i2 != 0) {
                        if (i2 == 1) {
                            z = vpc0Var.f243655a;
                            bga.m29073P(obj);
                            if (!z) {
                                ((vmb0) this.f134215Z).invoke();
                                if (this.f134217b) {
                                    zmy zmyVar = (zmy) this.f134210L0;
                                    vpc0Var.f243655a = z;
                                    vpc0Var.f243658d = 2;
                                }
                            }
                        } else if (i2 == 2) {
                            bga.m29073P(obj);
                        } else {
                            if (i2 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            bga.m29073P(obj);
                        }
                        return w2a1.f247311a;
                    }
                    bga.m29073P(obj);
                    if (wj50.m88271j(rpc0Var, mpc0.f145969a) || wj50.m88271j(rpc0Var, lpc0.f135730a)) {
                        om0.m67311c(om0Var, qm0.CLICKED, spc0Var.f212800a, null, null, null, null, null, 124);
                        hgb0Var.invoke(spc0Var.f212809j, cvtVar);
                    } else if (wj50.m88271j(rpc0Var, ppc0.f180008a) || wj50.m88271j(rpc0Var, npc0.f156935a)) {
                        om0.m67311c(om0Var, qm0.DISMISSED, spc0Var.f212800a, null, null, null, null, null, 124);
                        lrc0Var.invoke();
                    } else {
                        if (wj50.m88271j(rpc0Var, opc0.f167864a)) {
                            Set set = dd41.f47702f;
                            String str = spc0Var.f212810k;
                            String str2 = spc0Var.f212800a;
                            if (r46.m74726U(str).f47709c == gn80.PRERELEASE) {
                                boolean z2 = tpc0Var.f222504o;
                                Completable completableMo26575c = ync0Var.mo26575c(str, str2, z2);
                                vpc0Var.f243655a = z2;
                                vpc0Var.f243658d = 1;
                                if (zn91.m96565n(completableMo26575c, vpc0Var) != yukVar) {
                                    z = z2;
                                    if (!z) {
                                        ((vmb0) this.f134215Z).invoke();
                                        if (this.f134217b) {
                                            zmy zmyVar2 = (zmy) this.f134210L0;
                                            vpc0Var.f243655a = z;
                                            vpc0Var.f243658d = 2;
                                        }
                                    }
                                }
                            } else {
                                boolean z3 = tpc0Var.f222504o;
                                vpc0Var.f243658d = 3;
                            }
                            return yukVar;
                        }
                        if (wj50.m88271j(rpc0Var, kpc0.f125028a)) {
                            if (!this.f134219d) {
                                om0.m67311c(om0Var, qm0.IMPRESSION, spc0Var.f212800a, null, null, null, null, null, 124);
                                this.f134219d = true;
                            }
                        } else if (wj50.m88271j(rpc0Var, jpc0.f114610a)) {
                            om0.m67311c(om0Var, qm0.ERROR, spc0Var.f212800a, null, null, null, null, null, 124);
                            lrc0Var.invoke();
                        } else {
                            if (!wj50.m88271j(rpc0Var, qpc0.f191265a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            ((lrc0) this.f134214Y).invoke();
                        }
                    }
                    return w2a1.f247311a;
                } catch (CancellationException e) {
                    throw e;
                }
            } catch (CancellationException e2) {
                throw e2;
            }
        } catch (Exception unused) {
        }
    }

    @Override // p204p.qy8
    public final uut getBehavior() {
        switch (this.f134216a) {
            case 0:
                break;
        }
        return this.f134218c;
    }

    public lk20(e940 e940Var, ync0 ync0Var, jiz jizVar, cl8 cl8Var, om0 om0Var, lrc0 lrc0Var, hgb0 hgb0Var, lrc0 lrc0Var2, vmb0 vmb0Var, zmy zmyVar, boolean z) {
        this.f134216a = 1;
        this.f134220e = e940Var;
        this.f134221f = ync0Var;
        this.f134222g = jizVar;
        this.f134223h = cl8Var;
        this.f134224i = om0Var;
        this.f134225t = lrc0Var;
        this.f134213X = hgb0Var;
        this.f134214Y = lrc0Var2;
        this.f134215Z = vmb0Var;
        this.f134210L0 = zmyVar;
        this.f134217b = z;
        this.f134218c = vwf1.m86576j(new upc0(this, 0), new upc0(this, 1), new jtb0(this, 15), new upc0(this, 2), 8);
        this.f134211M0 = mhf1.m61771p(this).m94133b(n0c0.f148983R0, n0c0.f148984S0);
        this.f134212N0 = q0f1.m71838m(new yhb0(this, 9));
    }
}
