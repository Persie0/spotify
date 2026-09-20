package p204p;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.view.View;
import androidx.compose.p002ui.graphics.drawscope.DrawScope;
import com.spotify.tome.pageactivity.PageActivity;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class m5l0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f140255a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f140256b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f140257c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m5l0(int i, Object obj, Object obj2) {
        super(1);
        this.f140255a = i;
        this.f140256b = obj;
        this.f140257c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [p.fbk] */
    /* JADX WARN: Type inference failed for: r10v2, types: [p.ph30] */
    /* JADX WARN: Type inference failed for: r13v11, types: [p.gh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r13v20, types: [p.qe70, p.th00] */
    /* JADX WARN: Type inference failed for: r13v21, types: [p.gh00, p.qe70] */
    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        rth rthVar;
        usv0 usv0Var;
        kfm0 kfm0Var;
        int i = this.f140255a;
        int i2 = 26;
        String strValueOf = "";
        int i3 = 8;
        int i4 = 5;
        int i5 = 0;
        int i6 = 1;
        int i7 = 2;
        Object obj2 = 0;
        ckk0VarM56300a = null;
        ckk0 ckk0VarM56300a = null;
        ssv0VarM83914b = null;
        ssv0 ssv0VarM83914b = null;
        w2a1 w2a1Var = w2a1.f247311a;
        Object obj3 = this.f140257c;
        Object obj4 = this.f140256b;
        switch (i) {
            case 0:
                h9b h9bVar = (h9b) obj;
                n5l0 n5l0Var = (n5l0) obj3;
                n2x0 n2x0Var = (n2x0) obj4;
                String strM78534b = n2x0Var.f149862f.m78534b("Location");
                if (strM78534b == null) {
                    strM78534b = null;
                }
                if (strM78534b != null) {
                    ph30 ph30Var = n2x0Var.f149857a.f20037a;
                    ph30Var.getClass();
                    try {
                        rthVar = new rth();
                        rthVar.m76391l(ph30Var, strM78534b);
                    } catch (IllegalArgumentException unused) {
                        rthVar = null;
                    }
                    strValueOf = String.valueOf(rthVar != null ? rthVar.m76382c() : 0);
                    break;
                }
                ((wy3) n5l0Var.f150582b).getClass();
                h9bVar.m46865a(System.currentTimeMillis(), new un71(dyh0.m37342a()), strValueOf);
                h9bVar.f88911b++;
                return w2a1Var;
            case 1:
                zvw0 zvw0Var = (zvw0) obj;
                n2x0 n2x0Var2 = (n2x0) obj4;
                zvw0Var.f286826l = dq60.m36607g((wy3) ((o5l0) obj3).f162036b);
                zvw0Var.f286835u = hvi0.m48881q();
                if (zvw0Var.f286818d == null) {
                    zvw0Var.f286818d = n2x0Var2.f149858b.f195574a;
                }
                if (zvw0Var.f286819e == null) {
                    zvw0Var.f286819e = Integer.valueOf(n2x0Var2.f149860d);
                }
                return w2a1Var;
            case 2:
                rdl0 rdl0Var = (rdl0) obj3;
                gh00 gh00Var = (gh00) obj4;
                if (((Boolean) obj).booleanValue()) {
                    gh00Var.invoke(new sdl0(((qdl0) rdl0Var).f187708a));
                } else {
                    gh00Var.invoke(new zdl0(((qdl0) rdl0Var).f187708a));
                }
                return w2a1Var;
            case 3:
                gkl0 gkl0Var = (gkl0) obj4;
                List listM43728j1 = g6f.m43728j1(gkl0Var.f80830c);
                ((uw70) obj).mo30902e(listM43728j1.size(), new xyf0(7, listM43728j1), new xyf0(i3, listM43728j1), new fyf(new ee1(listM43728j1, (ril0) obj3, gkl0Var, 19), true, 2039820996));
                return w2a1Var;
            case 4:
                ((Boolean) obj).booleanValue();
                ((eh00) obj4).invoke();
                ((View) obj3).performHapticFeedback(Build.VERSION.SDK_INT >= 30 ? 16 : 1);
                return w2a1Var;
            case 5:
                WeakHashMap weakHashMap = doc1.f51017a;
                doc1.f51017a.put((View) obj4, (wca) obj3);
                return new nm4(i4);
            case 6:
                if (!wj50.m88271j((ada) ((kqi0) obj3).getValue(), yca.f271432a) && (usv0Var = (usv0) obj4) != null) {
                    ssv0VarM83914b = usv0Var.m83914b();
                }
                return new vwt(ssv0VarM83914b, 24);
            case 7:
                ofm0 ofm0Var = (ofm0) ((kqi0) obj4).getValue();
                if (ofm0Var != null && (kfm0Var = (kfm0) obj3) != null) {
                    ckk0VarM56300a = kfm0Var.m56300a(ofm0Var);
                }
                return new je0(2, ckk0VarM56300a);
            case 8:
                ((rlv0) obj4).f200373a = new mx9(((Number) obj).intValue(), (PageActivity) obj3);
                return w2a1Var;
            case 9:
                ((pcf) ((vxx) obj4).f245851d).m69577a(new pnx0((Intent) obj3, (e301) obj));
                return w2a1Var;
            case 10:
                ((qe70) obj4).invoke(((hsg1) obj3).mo32679v((Intent) obj, -1));
                return w2a1Var;
            case 11:
                return ((hsg1) obj4).mo32677q((Context) obj, obj3);
            case 12:
                v9m0.m84980l((v9m0) obj4, (uw70) obj, (q9m0) obj3);
                return w2a1Var;
            case 13:
                return new vwt(((kfm0) obj4).m56300a((ofm0) obj3), i2);
            case 14:
                rlm0 rlm0Var = new rlm0((gh00) obj3);
                jsa jsaVar = (jsa) obj4;
                ((poh) jsaVar.f115456b).f179711b.add(rlm0Var);
                return new rr0(i2, jsaVar, rlm0Var);
            case 15:
                tgj tgjVar = (tgj) obj;
                xom0 xom0Var = (xom0) obj4;
                tgjVar.mo50174s1();
                rv41 rv41Var = (rv41) obj3;
                if (((Number) rv41Var.getValue()).floatValue() > 0.0f) {
                    lom0 lom0VarM91555l = xom0Var.m91555l();
                    i82 i82Var = xom0Var.f264315d;
                    if (!lom0VarM91555l.f135459a.isEmpty()) {
                        float fMax = Math.max(((int) (xom0Var.m91555l().m59576g() & 4294967295L)) / xom0Var.mo37269m(), tgjVar.mo35989Z0(5));
                        float fM84031v = ((((uum0) i82Var.f99668d).m84031v() + ((vum0) i82Var.f99667c).m86437v()) / xom0Var.mo37269m()) * ((int) (xom0Var.m91555l().m59576g() & 4294967295L));
                        gfp gfpVar = leu.f132721a;
                        long j = ((giu) iiu.f102631a.f258039d).f80261e;
                        float f = 4;
                        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (tgjVar.mo295n() >> 32)) - tgjVar.mo35989Z0(f)) - tgjVar.mo35989Z0(3))) << 32) | (((long) Float.floatToRawIntBits(fM84031v)) & 4294967295L);
                        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(tgjVar.mo35989Z0(f))) << 32) | (((long) Float.floatToRawIntBits(fMax)) & 4294967295L);
                        float fFloatValue = ((Number) rv41Var.getValue()).floatValue();
                        float fMo35989Z0 = tgjVar.mo35989Z0(f);
                        DrawScope.m274Y(tgjVar, j, jFloatToRawIntBits, jFloatToRawIntBits2, (((long) Float.floatToRawIntBits(fMo35989Z0)) << 32) | (((long) Float.floatToRawIntBits(fMo35989Z0)) & 4294967295L), null, fFloatValue, 208);
                    }
                }
                return w2a1Var;
            case 16:
                ((icp) obj).f100858d = new ij60((Optional) obj4, (z9j0) obj3, (fbk) null);
                return w2a1Var;
            case 17:
                String str = (String) obj;
                wwm0 wwm0Var = (wwm0) obj4;
                kv91 kv91Var = (kv91) wwm0Var.f255792d.getValue();
                yt91 yt91VarM96903c = wwm0Var.f255790b.f57926b.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("footer_support_link_button", null, null, null, null));
                yt91VarM96903c.f276056j = false;
                zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
                dv91 dv91Var = new dv91("hit", 1);
                String string = str.toString();
                kv91Var.mo57453r(new av91("", "", dv91Var, new bv91("navigate_to_webview_uri", 1, Collections.singletonMap("destination", string != null ? string : "")), zt91VarM94607a, st91.f213865b, System.currentTimeMillis()), null);
                ((gh00) obj3).invoke(new ixw(str));
                return w2a1Var;
            case 18:
                ((icp) obj).f100858d = new j27((th00) obj4, (s0n0) obj3, (fbk) null);
                return w2a1Var;
            case 19:
                ((qe70) obj4).invoke(obj);
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) obj3;
                if (pendingResult != null) {
                    pendingResult.finish();
                }
                return w2a1Var;
            case 20:
                ron0 ron0Var = (ron0) obj4;
                return new bq0(new vjz(ron0Var.m76075c(), new mri0(i7, i7, obj2)), ron0Var, (String) obj3, (Set) obj, 14);
            case 21:
                List list = ((exn0) obj4).f63804a;
                ((whu) obj).m88174b(list.size(), new fyf(new jam0(i4, list, (gh00) obj3), true, 1658481532), new C2602y6(28, list));
                return w2a1Var;
            case 22:
                f220 f220Var = (f220) obj;
                tfm0 tfm0Var = (tfm0) obj3;
                Iterator it = ((Set) ((he90) obj4).f90380d).iterator();
                while (it.hasNext()) {
                    ((g5o0) it.next()).mo43617a(f220Var.f65091a, f220Var, tfm0Var);
                }
                return w2a1Var;
            case 23:
                ((Boolean) obj).booleanValue();
                ((gh00) obj4).invoke((teo0) obj3);
                return w2a1Var;
            case 24:
                oio0 oio0Var = (oio0) obj;
                u190 u190Var = (u190) obj4;
                ou8 ou8Var = u190Var.f225727h;
                bjo0 bjo0Var = (bjo0) obj3;
                vq50 vq50Var = oio0Var.f165850c;
                String strMo45408o = vq50Var.mo45408o();
                e97 e97Var = bjo0Var.f27746h;
                return g0g1.m43301f(ou8Var, new vdm0(k0e1.m54985d(e97Var.m38221a(strMo45408o).flatMapObservable(new s5f1(e97Var, 23))), i7), new zux(u190Var.m82196b(), new uxc0(bjo0Var.f27747i, i3), new b16(bjo0Var, oio0Var, obj2, 6), i6), vq50Var instanceof iq50 ? fag1.m41151B(bjo0Var.f27741c, bjo0Var.f27738Z, oio0Var) : new ysk(new xio0(null), 27), new yio0(oio0Var, obj2, i5));
            case 25:
                ((ij9) obj4).f102760a.mo47342b((String) obj3, (d850) obj, null);
                return w2a1Var;
            case 26:
                return ((uoa) obj4).m83604h((uno0) obj, (vmo0) obj3);
            case 27:
                return ((uoa) obj4).m83604h((uno0) obj, (o0e0) obj3);
            case 28:
                boo0 boo0Var = (boo0) obj4;
                x0h1.m89578u(n5h1.m63737m(boo0Var.f29216c), boo0Var.f29217d, 0, new rpk0(boo0Var, (String) obj3, (d850) obj, null, 27), 2);
                return w2a1Var;
            default:
                foo0 foo0Var = (foo0) obj4;
                x0h1.m89578u(n5h1.m63737m(foo0Var.f71579d), foo0Var.f71580e, 0, new rpk0(foo0Var, (List) obj3, (d850) obj, null, 28), 2);
                return w2a1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m5l0(gh00 gh00Var, BroadcastReceiver.PendingResult pendingResult) {
        super(1);
        this.f140255a = 19;
        this.f140256b = (qe70) gh00Var;
        this.f140257c = pendingResult;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m5l0(gh00 gh00Var, hsg1 hsg1Var) {
        super(1);
        this.f140255a = 10;
        this.f140256b = (qe70) gh00Var;
        this.f140257c = hsg1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m5l0(th00 th00Var, s0n0 s0n0Var) {
        super(1);
        this.f140255a = 18;
        this.f140256b = (qe70) th00Var;
        this.f140257c = s0n0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m5l0(o5l0 o5l0Var, n2x0 n2x0Var) {
        super(1);
        this.f140255a = 1;
        this.f140257c = o5l0Var;
        this.f140256b = n2x0Var;
    }
}
