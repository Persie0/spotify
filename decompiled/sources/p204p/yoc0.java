package p204p;

import io.reactivex.rxjava3.core.Completable;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public final class yoc0 implements dut {

    /* JADX INFO: renamed from: M0 */
    public final cph f274623M0;

    /* JADX INFO: renamed from: X */
    public final boolean f274624X;

    /* JADX INFO: renamed from: Z */
    public boolean f274626Z;

    /* JADX INFO: renamed from: a */
    public final e940 f274627a;

    /* JADX INFO: renamed from: b */
    public final ync0 f274628b;

    /* JADX INFO: renamed from: c */
    public final jiz f274629c;

    /* JADX INFO: renamed from: d */
    public final cl8 f274630d;

    /* JADX INFO: renamed from: e */
    public final om0 f274631e;

    /* JADX INFO: renamed from: f */
    public final lrc0 f274632f;

    /* JADX INFO: renamed from: g */
    public final hgb0 f274633g;

    /* JADX INFO: renamed from: h */
    public final lrc0 f274634h;

    /* JADX INFO: renamed from: i */
    public final vmb0 f274635i;

    /* JADX INFO: renamed from: t */
    public final zmy f274636t;

    /* JADX INFO: renamed from: Y */
    public final xiz f274625Y = axf1.m27398m(new voc0(this, 0), new voc0(this, 1), new jtb0(this, 14), null, new voc0(this, 2), 8);

    /* JADX INFO: renamed from: L0 */
    public final i5x f274622L0 = mhf1.m61771p(this).m94133b(n0c0.f148981P0, n0c0.f148982Q0);

    public yoc0(e940 e940Var, ync0 ync0Var, jiz jizVar, cl8 cl8Var, om0 om0Var, lrc0 lrc0Var, hgb0 hgb0Var, lrc0 lrc0Var2, vmb0 vmb0Var, zmy zmyVar, boolean z) {
        this.f274627a = e940Var;
        this.f274628b = ync0Var;
        this.f274629c = jizVar;
        this.f274630d = cl8Var;
        this.f274631e = om0Var;
        this.f274632f = lrc0Var;
        this.f274633g = hgb0Var;
        this.f274634h = lrc0Var2;
        this.f274635i = vmb0Var;
        this.f274636t = zmyVar;
        this.f274624X = z;
        fyf fyfVar = new fyf(new eoa0(this, 17), true, -167747213);
        wpi0 wpi0Var = xwt.f266743a;
        this.f274623M0 = new cph(fyfVar, 3);
    }

    @Override // p204p.kzd1
    /* JADX INFO: renamed from: a */
    public final avt mo24358a() {
        return this.f274622L0;
    }

    @Override // p204p.ry8
    /* JADX INFO: renamed from: c */
    public final pwt mo24359c() {
        return this.f274623M0;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00df A[Catch: CancellationException -> 0x004a, Exception -> 0x016a, TryCatch #0 {Exception -> 0x016a, blocks: (B:13:0x0035, B:19:0x0045, B:24:0x004f, B:47:0x00df, B:49:0x00e8, B:42:0x00cd, B:53:0x00f6), top: B:74:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00e8 A[Catch: CancellationException -> 0x004a, Exception -> 0x016a, TRY_LEAVE, TryCatch #0 {Exception -> 0x016a, blocks: (B:13:0x0035, B:19:0x0045, B:24:0x004f, B:47:0x00df, B:49:0x00e8, B:42:0x00cd, B:53:0x00f6), top: B:74:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f2, code lost:
    
        if (r2.invoke(r6) == r11) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00fe, code lost:
    
        if (r7.mo26574b(r3, r0, r6, r2) == r11) goto L55;
     */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m94278e(spc0 spc0Var, tpc0 tpc0Var, rpc0 rpc0Var, cvt cvtVar, ibk ibkVar) {
        woc0 woc0Var;
        boolean z;
        if (ibkVar instanceof woc0) {
            woc0Var = (woc0) ibkVar;
            int i = woc0Var.f253434d;
            if ((i & Integer.MIN_VALUE) != 0) {
                woc0Var.f253434d = i - Integer.MIN_VALUE;
            } else {
                woc0Var = new woc0(this, ibkVar);
            }
        } else {
            woc0Var = new woc0(this, ibkVar);
        }
        Object obj = woc0Var.f253432b;
        int i2 = woc0Var.f253434d;
        yuk yukVar = yuk.f276404a;
        try {
            try {
                try {
                    if (i2 != 0) {
                        if (i2 == 1) {
                            z = woc0Var.f253431a;
                            bga.m29073P(obj);
                            if (!z) {
                                this.f274635i.invoke();
                                if (this.f274624X) {
                                    zmy zmyVar = this.f274636t;
                                    woc0Var.f253431a = z;
                                    woc0Var.f253434d = 2;
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
                    boolean zM88271j = wj50.m88271j(rpc0Var, mpc0.f145969a);
                    om0 om0Var = this.f274631e;
                    hgb0 hgb0Var = this.f274633g;
                    if (zM88271j || wj50.m88271j(rpc0Var, lpc0.f135730a)) {
                        om0.m67311c(om0Var, qm0.CLICKED, spc0Var.f212800a, null, null, null, null, null, 124);
                        hgb0Var.invoke(spc0Var.f212809j, cvtVar);
                    } else {
                        boolean zM88271j2 = wj50.m88271j(rpc0Var, ppc0.f180008a);
                        lrc0 lrc0Var = this.f274632f;
                        if (zM88271j2 || wj50.m88271j(rpc0Var, npc0.f156935a)) {
                            om0.m67311c(om0Var, qm0.DISMISSED, spc0Var.f212800a, null, null, null, null, null, 124);
                            lrc0Var.invoke();
                        } else {
                            if (wj50.m88271j(rpc0Var, opc0.f167864a)) {
                                Set set = dd41.f47702f;
                                String str = spc0Var.f212810k;
                                String str2 = spc0Var.f212800a;
                                gn80 gn80Var = r46.m74726U(str).f47709c;
                                gn80 gn80Var2 = gn80.PRERELEASE;
                                ync0 ync0Var = this.f274628b;
                                if (gn80Var == gn80Var2) {
                                    boolean z2 = tpc0Var.f222504o;
                                    Completable completableMo26575c = ync0Var.mo26575c(str, str2, z2);
                                    woc0Var.f253431a = z2;
                                    woc0Var.f253434d = 1;
                                    if (zn91.m96565n(completableMo26575c, woc0Var) != yukVar) {
                                        z = z2;
                                        if (!z) {
                                            this.f274635i.invoke();
                                            if (this.f274624X) {
                                                zmy zmyVar2 = this.f274636t;
                                                woc0Var.f253431a = z;
                                                woc0Var.f253434d = 2;
                                            }
                                        }
                                    }
                                } else {
                                    boolean z3 = tpc0Var.f222504o;
                                    woc0Var.f253434d = 3;
                                }
                                return yukVar;
                            }
                            if (wj50.m88271j(rpc0Var, kpc0.f125028a)) {
                                if (!this.f274626Z) {
                                    om0.m67311c(om0Var, qm0.IMPRESSION, spc0Var.f212800a, null, null, null, null, null, 124);
                                    this.f274626Z = true;
                                }
                            } else if (wj50.m88271j(rpc0Var, jpc0.f114610a)) {
                                om0.m67311c(om0Var, qm0.ERROR, spc0Var.f212800a, null, null, null, null, null, 124);
                                lrc0Var.invoke();
                            } else {
                                if (!wj50.m88271j(rpc0Var, qpc0.f191265a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                this.f274634h.invoke();
                            }
                        }
                    }
                    return w2a1.f247311a;
                } catch (Exception unused) {
                }
            } catch (CancellationException e) {
                throw e;
            }
        } catch (CancellationException e2) {
            throw e2;
        }
    }

    @Override // p204p.ry8
    public final uut getBehavior() {
        return this.f274625Y;
    }
}
