package p204p;

import android.view.KeyEvent;
import androidx.compose.p002ui.geometry.Offset;
import com.spotify.mediasession.mediasession.receiver.MediaButtonReceiver;
import io.reactivex.rxjava3.disposables.Disposable;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rv70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f203017a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f203018b;

    public /* synthetic */ rv70(int i, Object obj, Object obj2) {
        this.f203017a = i;
        this.f203018b = obj;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        sw70 sw70Var;
        ky70 ky70Var;
        int i = this.f203017a;
        float f = 0.0f;
        sw70 sw70Var2 = null;
        Object objInvoke = null;
        ky70 ky70Var2 = null;
        w2a1 w2a1Var = w2a1.f247311a;
        Object obj2 = this.f203018b;
        switch (i) {
            case 0:
                return new vwt((qv70) obj2, 12);
            case 1:
                qw70 qw70Var = (qw70) obj2;
                return qw70Var.m74040F1(((Integer) obj).intValue(), qw70Var.f193203e);
            case 2:
                yw70 yw70Var = (yw70) obj2;
                float f2 = -((Float) obj).floatValue();
                if ((f2 >= 0.0f || yw70Var.mo28417d()) && (f2 <= 0.0f || yw70Var.mo28416c())) {
                    if (Math.abs(yw70Var.f276895h) > 0.5f) {
                        pt40.m70893c("entered drag with non-zero pending scroll");
                    }
                    yw70Var.f276891d = true;
                    float f3 = yw70Var.f276895h + f2;
                    yw70Var.f276895h = f3;
                    if (Math.abs(f3) > 0.5f) {
                        float f4 = yw70Var.f276895h;
                        int iRound = Math.round(f4);
                        sw70 sw70VarM79528f = ((sw70) yw70Var.f276893f.getValue()).m79528f(iRound, !yw70Var.f276889b);
                        if (sw70VarM79528f == null || (sw70Var = yw70Var.f276890c) == null) {
                            sw70Var2 = sw70VarM79528f;
                        } else {
                            sw70 sw70VarM79528f2 = sw70Var.m79528f(iRound, true);
                            if (sw70VarM79528f2 != null) {
                                yw70Var.f276890c = sw70VarM79528f2;
                                sw70Var2 = sw70VarM79528f;
                            }
                        }
                        if (sw70Var2 != null) {
                            yw70Var.m94778g(sw70Var2, yw70Var.f276889b, true);
                            pqo0.m70679s(yw70Var.f276910w);
                            yw70Var.m94780i(f4 - yw70Var.f276895h, sw70Var2);
                        } else {
                            lp70 lp70Var = yw70Var.f276899l;
                            if (lp70Var != null) {
                                lp70Var.m59635l();
                            }
                            yw70Var.m94780i(f4 - yw70Var.f276895h, yw70Var.m94779h());
                        }
                    }
                    if (Math.abs(yw70Var.f276895h) > 0.5f) {
                        f2 -= yw70Var.f276895h;
                        yw70Var.f276895h = 0.0f;
                    }
                    f = f2;
                }
                return Float.valueOf(-f);
            case 3:
                e8y0 e8y0Var = (e8y0) obj2;
                return Boolean.valueOf(e8y0Var != null ? e8y0Var.mo38133b(obj) : true);
            case 4:
                jbr0 jbr0Var = (jbr0) obj2;
                ((Integer) obj).intValue();
                return jbr0Var;
            case 5:
                ry70 ry70Var = (ry70) obj2;
                float f5 = -((Float) obj).floatValue();
                yum0 yum0Var = ry70Var.f203831d;
                if ((f5 >= 0.0f || ry70Var.mo28417d()) && (f5 <= 0.0f || ry70Var.mo28416c())) {
                    if (Math.abs(ry70Var.f203842o) > 0.5f) {
                        pt40.m70893c("entered drag with non-zero pending scroll");
                    }
                    float f6 = ry70Var.f203842o + f5;
                    ry70Var.f203842o = f6;
                    if (Math.abs(f6) > 0.5f) {
                        float f7 = ry70Var.f203842o;
                        int iM72083N = q3d0.m72083N(f7);
                        ky70 ky70VarM57644f = ((ky70) yum0Var.getValue()).m57644f(iM72083N, !ry70Var.f203828a);
                        if (ky70VarM57644f == null || (ky70Var = ry70Var.f203829b) == null) {
                            ky70Var2 = ky70VarM57644f;
                        } else {
                            ky70 ky70VarM57644f2 = ky70Var.m57644f(iM72083N, true);
                            if (ky70VarM57644f2 != null) {
                                ry70Var.f203829b = ky70VarM57644f2;
                                ky70Var2 = ky70VarM57644f;
                            }
                        }
                        if (ky70Var2 != null) {
                            ry70Var.m76691f(ky70Var2, ry70Var.f203828a, true);
                            pqo0.m70679s(ry70Var.f203848u);
                            ry70Var.m76693h(f7 - ry70Var.f203842o, ky70Var2);
                        } else {
                            lp70 lp70Var2 = ry70Var.f203835h;
                            if (lp70Var2 != null) {
                                lp70Var2.m59635l();
                            }
                            ry70Var.m76693h(f7 - ry70Var.f203842o, (ky70) yum0Var.getValue());
                        }
                    }
                    if (Math.abs(ry70Var.f203842o) > 0.5f) {
                        f5 -= ry70Var.f203842o;
                        ry70Var.f203842o = 0.0f;
                    }
                    f = f5;
                }
                return Float.valueOf(-f);
            case 6:
                ((tgj) obj2).mo50174s1();
                return w2a1Var;
            case 7:
                return ((q2d0) obj2).m71998b(((Integer) obj).intValue());
            case 8:
                int i2 = MediaButtonReceiver.f5459i;
                ((byz0) obj).mo30932f().m90244c((KeyEvent) obj2, new xba0(14));
                return w2a1Var;
            case 9:
                fdx0 fdx0Var = (fdx0) obj;
                float fFloatValue = ((Number) ((gw4) obj2).m45912e()).floatValue();
                float fM76344d = rsh0.m76344d(fdx0Var, fFloatValue);
                float fM76345e = rsh0.m76345e(fdx0Var, fFloatValue);
                fdx0Var.m41391o(fM76345e == 0.0f ? 1.0f : fM76344d / fM76345e);
                fdx0Var.m41395u(rsh0.f202331c);
                return w2a1Var;
            case 10:
                gsh0 gsh0Var = (gsh0) obj2;
                gsh0Var.show();
                return new vwt(gsh0Var, 20);
            case 11:
                ((lsi0) obj2).mo54249c(null);
                return w2a1Var;
            case 12:
                return Boolean.valueOf(wj50.m88271j(((pfj0) obj).f177093b, (q2i0) obj2));
            case 13:
                float fFloatValue2 = ((Float) obj).floatValue();
                xom0 xom0Var = ((bpm0) obj2).f29546b;
                xom0Var.f264328q.m86438w(xom0Var.m91553j(((vum0) xom0Var.f264315d.f99667c).m86437v() + q3d0.m72083N(xom0Var.m91557o() != 0 ? fFloatValue2 / xom0Var.m91557o() : 0.0f)));
                return w2a1Var;
            case 14:
                x8q0 x8q0Var = (x8q0) obj2;
                cge cgeVar = (cge) obj;
                cgeVar.m32690a("type", ql51.f189739b, false);
                cgeVar.m32690a("value", gjg1.m44909K("kotlinx.serialization.Polymorphic<" + x8q0Var.f259208a.mo29111F() + '>', ntz0.f158457z0, new ktz0[0]), false);
                cgeVar.f37643b = x8q0Var.f259209b;
                return w2a1Var;
            case 15:
                ((msh) obj2).mo62745b(obj);
                return w2a1Var;
            case 16:
                ((hhv0) obj2).m47611a((jts) obj);
                return w2a1Var;
            case 17:
                t9y0 t9y0Var = (t9y0) obj2;
                kqi0 kqi0Var = (kqi0) obj;
                if (!(kqi0Var instanceof ab31)) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                ab31 ab31Var = (ab31) kqi0Var;
                if (ab31Var.getValue() != null) {
                    Object value = ab31Var.getValue();
                    wj50.m88279p(value);
                    objInvoke = t9y0Var.f218397b.invoke(value);
                }
                return new yum0(objInvoke, ab31Var.mo25318k());
            case 18:
                ((xxo) obj2).f267040h = (u561) obj;
                return w2a1Var;
            case 19:
                return ((ljx0) obj2).mo1159h((dlo) obj);
            case 20:
                ((Disposable) obj2).dispose();
                return w2a1Var;
            case 21:
                e8y0 e8y0Var2 = ((c8y0) obj2).f35334c;
                return Boolean.valueOf(e8y0Var2 != null ? e8y0Var2.mo38133b(obj) : true);
            case 22:
                qly0 qly0Var = (qly0) obj2;
                float fFloatValue3 = ((Float) obj).floatValue();
                vum0 vum0Var = qly0Var.f189941a;
                float fM86437v = vum0Var.m86437v() + fFloatValue3 + qly0Var.f189946f;
                float fM63436m = n0e1.m63436m(fM86437v, 0.0f, qly0Var.f189945e.m86437v());
                boolean z = fM86437v == fM63436m;
                float fM86437v2 = fM63436m - vum0Var.m86437v();
                int iRound2 = Math.round(fM86437v2);
                vum0Var.m86438w(vum0Var.m86437v() + iRound2);
                qly0Var.f189946f = fM86437v2 - iRound2;
                if (!z) {
                    fFloatValue3 = fM86437v2;
                }
                return Float.valueOf(fFloatValue3);
            case 23:
                nny0 nny0Var = (nny0) obj2;
                return new Offset(nny0Var.m65221c(nny0Var.f156529k, ((Offset) obj).f493a, nny0Var.f156528j));
            case 24:
                k6q0 k6q0Var = (k6q0) obj;
                if (((f2i0) obj2).mo40603e(k6q0Var.f119812c)) {
                    k6q0Var.m55602a();
                }
                return w2a1Var;
            case 25:
                return (rr60) obj2;
            case 26:
                lh21 lh21Var = (lh21) obj2;
                bqz0 bqz0Var = lh21Var.f133351g;
                wj50.m88279p(bqz0Var);
                if (!wj50.m88271j(lh21Var.f133351g, bqz0Var)) {
                    lfq0.m58914b("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
                }
                dqi0 dqi0Var = lh21Var.f133350f;
                Object obj3 = lh21Var.f133348d;
                if (dqi0Var != null) {
                    if (obj3 != null) {
                        lfq0.m58914b("workingSoleWatchedObject must be null when workingWatchSet is non-null");
                    }
                    dqi0Var.m36642a(obj);
                } else if (obj3 == null) {
                    lh21Var.f133348d = obj;
                } else {
                    dqi0 dqi0Var2 = sdy0.f208112a;
                    dqi0 dqi0Var3 = new dqi0();
                    dqi0Var3.m36642a(obj3);
                    dqi0Var3.m36642a(obj);
                    lh21Var.f133350f = dqi0Var3;
                    lh21Var.f133348d = null;
                }
                return w2a1Var;
            case 27:
                return Integer.valueOf(((ou21) obj2).m68076a(qkg1.m73117n(((q2i0) obj).f184647e)));
            case 28:
                return Boolean.valueOf(wj50.m88271j(((p9y) obj).f175324a, (z631) obj2));
            default:
                return Boolean.valueOf(wj50.m88271j(((o9y) obj).f163162a, (y631) obj2));
        }
    }

    public /* synthetic */ rv70(Object obj, int i) {
        this.f203017a = i;
        this.f203018b = obj;
    }
}
