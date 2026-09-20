package p204p;

import android.content.Context;
import com.comscore.streaming.ContentType;
import com.spotify.sessiontuningcontrols.proto.SignalPayloadProto$SignalPayload;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class hzz0 implements dut {

    /* JADX INFO: renamed from: L0 */
    public final luk f97063L0;

    /* JADX INFO: renamed from: N0 */
    public final tk9 f97065N0;

    /* JADX INFO: renamed from: O0 */
    public final m7t0 f97066O0;

    /* JADX INFO: renamed from: Q0 */
    public final cph f97068Q0;

    /* JADX INFO: renamed from: X */
    public final q831 f97069X;

    /* JADX INFO: renamed from: Y */
    public final z9j0 f97070Y;

    /* JADX INFO: renamed from: Z */
    public final luk f97071Z;

    /* JADX INFO: renamed from: a */
    public final fk60 f97072a;

    /* JADX INFO: renamed from: b */
    public final Context f97073b;

    /* JADX INFO: renamed from: c */
    public final v300 f97074c;

    /* JADX INFO: renamed from: d */
    public final String f97075d;

    /* JADX INFO: renamed from: e */
    public final hc80 f97076e;

    /* JADX INFO: renamed from: f */
    public final kq80 f97077f;

    /* JADX INFO: renamed from: g */
    public final yz80 f97078g;

    /* JADX INFO: renamed from: h */
    public final khy0 f97079h;

    /* JADX INFO: renamed from: i */
    public final hvj0 f97080i;

    /* JADX INFO: renamed from: t */
    public final ke4 f97081t;

    /* JADX INFO: renamed from: M0 */
    public final zv41 f97064M0 = jag1.m52819d(gbu.f78413a);

    /* JADX INFO: renamed from: P0 */
    public final j2a1 f97067P0 = new j2a1();

    public hzz0(fk60 fk60Var, Context context, v300 v300Var, String str, hc80 hc80Var, kq80 kq80Var, yz80 yz80Var, khy0 khy0Var, hvj0 hvj0Var, ke4 ke4Var, q831 q831Var, z9j0 z9j0Var, luk lukVar, luk lukVar2) {
        this.f97072a = fk60Var;
        this.f97073b = context;
        this.f97074c = v300Var;
        this.f97075d = str;
        this.f97076e = hc80Var;
        this.f97077f = kq80Var;
        this.f97078g = yz80Var;
        this.f97079h = khy0Var;
        this.f97080i = hvj0Var;
        this.f97081t = ke4Var;
        this.f97069X = q831Var;
        this.f97070Y = z9j0Var;
        this.f97071Z = lukVar;
        this.f97063L0 = lukVar2;
        this.f97065N0 = new tk9(khy0Var);
        this.f97066O0 = ujg1.m83276q(new ezz0(this, 0), gxz0.f85363L0, gpz0.f83292Z0, lukVar2, new ezz0(this, 1));
        fyf fyfVar = new fyf(new puz0(this, 4), true, 38000968);
        wpi0 wpi0Var = xwt.f266743a;
        this.f97068Q0 = new cph(fyfVar, 3);
    }

    /* JADX INFO: renamed from: g */
    public static Object m49290g(hzz0 hzz0Var, wyz0 wyz0Var, String str, z650 z650Var, mb61 mb61Var, int i) {
        return hzz0Var.m49292f(wyz0Var, str, (i & 2) != 0 ? null : z650Var, new C1673an(1, 28, null), gly0.f81204T0, mb61Var);
    }

    @Override // p204p.kzd1
    /* JADX INFO: renamed from: a */
    public final avt mo24358a() {
        return this.f97067P0;
    }

    @Override // p204p.ry8
    /* JADX INFO: renamed from: c */
    public final pwt mo24359c() {
        return this.f97068Q0;
    }

    /* JADX WARN: Code duplicated, block: B:178:0x0304  */
    /* JADX WARN: Code duplicated, block: B:179:0x0306  */
    /* JADX WARN: Code duplicated, block: B:183:0x031f  */
    /* JADX WARN: Code duplicated, block: B:189:0x032c  */
    /* JADX INFO: renamed from: e */
    public final void m49291e(qf40 qf40Var, String str, long j, boolean z, ie4 ie4Var, hvj0 hvj0Var, gh00 gh00Var, fxh0 fxh0Var, boolean z2, xq00 xq00Var, int i) {
        int i2;
        fxh0 fxh0Var2;
        xq00 xq00Var2;
        qf40 qf40Var2;
        boolean z3;
        qf40 qf40VarM67574x;
        boolean z4;
        boolean z5;
        Object objM91750T;
        ia7 ia7Var = t6x0.f217647t;
        xq00Var.m91775k0(-13284079);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? xq00Var.m91766g(qf40Var) : xq00Var.m91770i(qf40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91766g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91764f(j) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= xq00Var.m91768h(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= xq00Var.m91762e(ie4Var.ordinal()) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= xq00Var.m91770i(hvj0Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= xq00Var.m91770i(gh00Var) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= xq00Var.m91770i(fxh0Var) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= xq00Var.m91768h(z2) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= xq00Var.m91770i(this) ? 536870912 : 268435456;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 306783379) != 306783378)) {
            yw70 yw70VarM30763a = bx70.m30763a(0, 3, xq00Var);
            Object objM91750T2 = xq00Var.m91750T();
            h8s0 h8s0Var = h8s0.f88780a;
            if (objM91750T2 == ia7Var) {
                objM91750T2 = sam.m77645B(h8s0Var);
                xq00Var.m91793t0(objM91750T2);
            }
            kqi0 kqi0Var = (kqi0) objM91750T2;
            Object[] objArr = new Object[0];
            Object objM91750T3 = xq00Var.m91750T();
            if (objM91750T3 == ia7Var) {
                objM91750T3 = gly0.f81203S0;
                xq00Var.m91793t0(objM91750T3);
            }
            kqi0 kqi0Var2 = (kqi0) dul.m37018u(objArr, (eh00) objM91750T3, xq00Var, 48);
            int i3 = i2 & 14;
            boolean zM91770i = (i3 == 4 || ((i2 & 8) != 0 && xq00Var.m91770i(qf40Var))) | xq00Var.m91770i(yw70VarM30763a);
            Object objM91750T4 = xq00Var.m91750T();
            if (zM91770i || objM91750T4 == ia7Var) {
                objM91750T4 = new xay0(qf40Var, yw70VarM30763a, null, 14);
                xq00Var.m91793t0(objM91750T4);
            }
            int i4 = 8 | i3;
            hz40.m49237i(qf40Var, (th00) objM91750T4, xq00Var);
            boolean z6 = i3 == 4 || ((i2 & 8) != 0 && xq00Var.m91766g(qf40Var));
            Object objM91750T5 = xq00Var.m91750T();
            if (z6 || objM91750T5 == ia7Var) {
                ArrayList arrayList = new ArrayList(i6f.m49804T(qf40Var, 10));
                Iterator<E> it = qf40Var.iterator();
                while (it.hasNext()) {
                    arrayList.add(((wyz0) it.next()).f256414a);
                }
                objM91750T5 = Integer.valueOf(g6f.m43710X0(arrayList).hashCode());
                xq00Var.m91793t0(objM91750T5);
            }
            int iIntValue = ((Number) objM91750T5).intValue();
            Integer num = (Integer) kqi0Var2.getValue();
            boolean z7 = num == null || num.intValue() != iIntValue;
            Integer numValueOf = Integer.valueOf(iIntValue);
            Long lValueOf = Long.valueOf(j);
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zM91770i2 = ((i2 & 7168) == 2048) | (i3 == 4 || ((i2 & 8) != 0 && xq00Var.m91770i(qf40Var))) | xq00Var.m91770i(kqi0Var) | xq00Var.m91768h(z7) | xq00Var.m91770i(kqi0Var2) | xq00Var.m91762e(iIntValue) | xq00Var.m91770i(hvj0Var) | ((i2 & ContentType.LONG_FORM_ON_DEMAND) == 32) | ((i2 & 896) == 256) | ((i2 & 57344) == 16384);
            Object objM91750T6 = xq00Var.m91750T();
            if (zM91770i2 || objM91750T6 == ia7Var) {
                yyz0 yyz0Var = new yyz0(qf40Var, z7, z, iIntValue, hvj0Var, str, j, ie4Var, kqi0Var, kqi0Var2, null);
                xq00Var.m91793t0(yyz0Var);
                objM91750T6 = yyz0Var;
            }
            hz40.m49235g(numValueOf, lValueOf, boolValueOf, (th00) objM91750T6, xq00Var);
            if (((h8s0) kqi0Var.getValue()) == h8s0.f88783d) {
                xq00Var.m91771i0(-606932758);
                boolean zM91770i3 = xq00Var.m91770i(kqi0Var);
                Object objM91750T7 = xq00Var.m91750T();
                if (zM91770i3 || objM91750T7 == ia7Var) {
                    objM91750T7 = new uvy0(kqi0Var, 5);
                    xq00Var.m91793t0(objM91750T7);
                }
                fxh0Var2 = fxh0Var;
                xq00Var2 = xq00Var;
                p3h1.m69019c(qf40Var, this.f97065N0, gh00Var, (eh00) objM91750T7, fxh0Var2, xq00Var2, i4 | ((i2 >> 12) & 896) | ((i2 >> 9) & 57344));
                qf40Var2 = qf40Var;
                xq00Var2.m91788r(false);
            } else {
                qf40Var2 = qf40Var;
                fxh0Var2 = fxh0Var;
                xq00Var2 = xq00Var;
                xq00Var2.m91771i0(-606645388);
                if (((h8s0) kqi0Var.getValue()) == h8s0Var) {
                    qf40VarM67574x = lv21.f137205b;
                } else {
                    if (((h8s0) kqi0Var.getValue()) == h8s0.f88781b || ((h8s0) kqi0Var.getValue()) == h8s0.f88782c) {
                        z3 = true;
                        qf40VarM67574x = opo.m67574x(g6f.m43714b1(qf40Var2, 1));
                    } else {
                        qf40VarM67574x = qf40Var2;
                    }
                    fxh0 fxh0VarM61822f = mi21.m61822f(1.0f, fxh0Var2);
                    j4m0 j4m0Var = new j4m0(leu.m58816b(xq00Var2).f117230b.f224763f, leu.m58816b(xq00Var2).f117230b.f224760c, leu.m58816b(xq00Var2).f117230b.f224763f, leu.m58816b(xq00Var2).f117230b.f224763f);
                    if ((i2 & 234881024) == 67108864) {
                        z4 = z3;
                    } else {
                        z4 = false;
                    }
                    boolean zM91770i4 = z4 | xq00Var2.m91770i(kqi0Var) | xq00Var2.m91770i(this) | xq00Var2.m91770i(qf40VarM67574x);
                    if ((i2 & 3670016) != 1048576) {
                        z3 = false;
                    }
                    z5 = z3 | zM91770i4;
                    objM91750T = xq00Var2.m91750T();
                    if (z5 || objM91750T == ia7Var) {
                        gp1 gp1Var = new gp1(z2, qf40VarM67574x, kqi0Var, this, gh00Var);
                        xq00Var2.m91793t0(gp1Var);
                        objM91750T = gp1Var;
                    }
                    kk40.m56662d(fxh0VarM61822f, yw70VarM30763a, j4m0Var, (gh00) objM91750T, xq00Var2, 0, 0);
                    xq00Var2.m91788r(false);
                }
                z3 = true;
                fxh0 fxh0VarM61822f2 = mi21.m61822f(1.0f, fxh0Var2);
                j4m0 j4m0Var2 = new j4m0(leu.m58816b(xq00Var2).f117230b.f224763f, leu.m58816b(xq00Var2).f117230b.f224760c, leu.m58816b(xq00Var2).f117230b.f224763f, leu.m58816b(xq00Var2).f117230b.f224763f);
                if ((i2 & 234881024) == 67108864) {
                    z4 = z3;
                } else {
                    z4 = false;
                }
                boolean zM91770i5 = z4 | xq00Var2.m91770i(kqi0Var) | xq00Var2.m91770i(this) | xq00Var2.m91770i(qf40VarM67574x);
                if ((i2 & 3670016) != 1048576) {
                    z3 = false;
                }
                z5 = z3 | zM91770i5;
                objM91750T = xq00Var2.m91750T();
                if (z5) {
                    gp1 gp1Var2 = new gp1(z2, qf40VarM67574x, kqi0Var, this, gh00Var);
                    xq00Var2.m91793t0(gp1Var2);
                    objM91750T = gp1Var2;
                } else {
                    gp1 gp1Var3 = new gp1(z2, qf40VarM67574x, kqi0Var, this, gh00Var);
                    xq00Var2.m91793t0(gp1Var3);
                    objM91750T = gp1Var3;
                }
                kk40.m56662d(fxh0VarM61822f2, yw70VarM30763a, j4m0Var2, (gh00) objM91750T, xq00Var2, 0, 0);
                xq00Var2.m91788r(false);
            }
        } else {
            fxh0Var2 = fxh0Var;
            xq00Var2 = xq00Var;
            qf40Var2 = qf40Var;
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new zyz0(this, qf40Var2, str, j, z, ie4Var, hvj0Var, gh00Var, fxh0Var2, z2, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0095, code lost:
    
        if (m49293h(r8, r9, r0) == r6) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a6, code lost:
    
        if (r11.invoke(r0) == r6) goto L32;
     */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m49292f(wyz0 wyz0Var, String str, z650 z650Var, C1673an c1673an, eh00 eh00Var, ibk ibkVar) {
        fzz0 fzz0Var;
        gva byteString;
        if (ibkVar instanceof fzz0) {
            fzz0Var = (fzz0) ibkVar;
            int i = fzz0Var.f75214g;
            if ((i & Integer.MIN_VALUE) != 0) {
                fzz0Var.f75214g = i - Integer.MIN_VALUE;
            } else {
                fzz0Var = new fzz0(this, ibkVar);
            }
        } else {
            fzz0Var = new fzz0(this, ibkVar);
        }
        Object objM94973b = fzz0Var.f75212e;
        int i2 = fzz0Var.f75214g;
        Object obj = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                eh00Var = fzz0Var.f75211d;
                c1673an = fzz0Var.f75210c;
                str = fzz0Var.f75209b;
                wyz0Var = fzz0Var.f75208a;
                bga.m29073P(objM94973b);
            } else {
                if (i2 != 2 && i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wyz0Var = fzz0Var.f75208a;
                bga.m29073P(objM94973b);
            }
            zv41 zv41Var = this.f97064M0;
            zv41Var.m97091m(null, s601.m77304g0(wyz0Var.f256414a, (Set) zv41Var.getValue()));
            return w2a1.f247311a;
        }
        bga.m29073P(objM94973b);
        if (z650Var != null) {
            g221 g221VarM20946o = SignalPayloadProto$SignalPayload.m20946o();
            g221VarM20946o.m43368m(z650Var.f279709a);
            byteString = ((SignalPayloadProto$SignalPayload) g221VarM20946o.build()).toByteString();
        } else {
            byteString = null;
        }
        rz80 rz80Var = new rz80(str, (gva) null, byteString, 10);
        fzz0Var.f75208a = wyz0Var;
        fzz0Var.f75209b = str;
        fzz0Var.f75210c = c1673an;
        fzz0Var.f75211d = eh00Var;
        fzz0Var.f75214g = 1;
        objM94973b = yz80.m94973b(this.f97078g, this.f97075d, rz80Var, fzz0Var);
        if (objM94973b != obj) {
        }
        return obj;
        if (((p2x0) objM94973b).m68970c() == null) {
            eh00Var.invoke();
            fzz0Var.f75208a = wyz0Var;
            fzz0Var.f75209b = null;
            fzz0Var.f75210c = null;
            fzz0Var.f75211d = null;
            fzz0Var.f75214g = 2;
        } else {
            fzz0Var.f75208a = wyz0Var;
            fzz0Var.f75209b = null;
            fzz0Var.f75210c = null;
            fzz0Var.f75211d = null;
            fzz0Var.f75214g = 3;
        }
    }

    @Override // p204p.ry8
    public final uut getBehavior() {
        return this.f97066O0;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX INFO: renamed from: h */
    public final Object m49293h(wyz0 wyz0Var, String str, ibk ibkVar) throws Throwable {
        gzz0 gzz0Var;
        wyz0 wyz0Var2;
        if (ibkVar instanceof gzz0) {
            gzz0Var = (gzz0) ibkVar;
            int i = gzz0Var.f86079d;
            if ((i & Integer.MIN_VALUE) != 0) {
                gzz0Var.f86079d = i - Integer.MIN_VALUE;
            } else {
                gzz0Var = new gzz0(this, ibkVar);
            }
        } else {
            gzz0Var = new gzz0(this, ibkVar);
        }
        gzz0 gzz0Var2 = gzz0Var;
        Object obj = gzz0Var2.f86077b;
        int i2 = gzz0Var2.f86079d;
        fbk fbkVar = null;
        if (i2 == 0) {
            bga.m29073P(obj);
            rgp0 rgp0Var = new rgp0(this, wyz0Var, str, fbkVar, 25);
            gzz0Var2.f86076a = wyz0Var;
            gzz0Var2.f86079d = 1;
            Object objM89557A = x0h1.m89557A(this.f97071Z, rgp0Var, gzz0Var2);
            yuk yukVar = yuk.f276404a;
            if (objM89557A == yukVar) {
                return yukVar;
            }
            wyz0Var2 = wyz0Var;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wyz0Var2 = gzz0Var2.f86076a;
            bga.m29073P(obj);
        }
        String str2 = wyz0Var2.f256414a;
        khy0 khy0Var = this.f97079h;
        kv91 kv91Var = (kv91) khy0Var.f122742b;
        r2h0 r2h0Var = (r2h0) khy0Var.f122743c;
        r2h0Var.getClass();
        yt91 yt91VarM96903c = r2h0Var.f195145c.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("retry_snackbar", str2, null, null, null));
        yt91VarM96903c.f276056j = true;
        zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = zt91VarM94607a;
        nu91Var.f248108b = r2h0Var.f195144b;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        kv91Var.mo57449i((ou91) nu91Var.m87248a(), null);
        return w2a1.f247311a;
    }
}
