package p204p;

import android.view.View;
import android.widget.TextView;
import androidx.compose.p002ui.graphics.drawscope.DrawScope;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.music.R;
import com.spotify.nowplaying.uiusecases.seekbar.SuppressLayoutTextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes9.dex */
public final class szp extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f215626a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f215627b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f215628c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ szp(int i, Object obj, Object obj2) {
        super(1);
        this.f215626a = i;
        this.f215627b = obj;
        this.f215628c = obj2;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v4, types: [p.gh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r4v8, types: [p.gh00, p.qe70] */
    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        Object value;
        c06 c06VarMo291d1;
        switch (this.f215626a) {
            case 0:
                abd1 abd1Var = (abd1) obj;
                gh00 gh00Var = (gh00) this.f215627b;
                nxq0 nxq0Var = (nxq0) ((sdo) this.f215628c).f208052f;
                if (nxq0Var != null) {
                    gh00Var.invoke(new mxq0((oxq0) nxq0Var.f159581a.get(abd1Var.f14095a)));
                    return w2a1.f247311a;
                }
                wj50.m88260d0("model");
                throw null;
            case 1:
                q9r0 q9r0Var = (q9r0) obj;
                za7 za7Var = (za7) this.f215628c;
                if (q9r0Var.equals(p9r0.f175291a) || q9r0Var.equals(p9r0.f175292b)) {
                    ((gh00) this.f215627b).invoke(x7r0.f258984a);
                } else if (q9r0Var.equals(p9r0.f175294d)) {
                    ((ArtworkView) ((ykn) za7Var.f280995d).f273757c).setVisibility(4);
                } else {
                    if (!q9r0Var.equals(p9r0.f175293c) && !q9r0Var.equals(p9r0.f175295e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ((ArtworkView) ((ykn) za7Var.f280995d).f273757c).setVisibility(0);
                }
                return w2a1.f247311a;
            case 2:
                Object tag = ((View) obj).getTag();
                ovf ovfVar = tag instanceof ovf ? (ovf) tag : null;
                if (ovfVar != null) {
                    ovfVar.mo2820d((pwy0) this.f215628c);
                }
                if (ovfVar != null) {
                    ovfVar.mo2821c(new gxp(17, (gh00) this.f215627b));
                }
                return w2a1.f247311a;
            case 3:
                uw70 uw70Var = (uw70) obj;
                uw70.m84091c(uw70Var, "header", mah.f141593a, 2);
                uw70.m84091c(uw70Var, "spacer", mah.f141594b, 2);
                cs31 cs31Var = (cs31) this.f215627b;
                ArrayList arrayList = cs31Var.f41459b;
                uw70Var.mo30902e(arrayList.size(), new nq5(17, arrayList), new nq5(18, arrayList), new fyf(new ee1(arrayList, (i9q) this.f215628c, cs31Var, 8), true, 802480018));
                return w2a1.f247311a;
            case 4:
                return new rr0(11, (waq) this.f215627b, (kqi0) this.f215628c);
            case 5:
                ((ccq) this.f215627b).m32295b(2, (String) this.f215628c);
                return w2a1.f247311a;
            case 6:
                mcq mcqVar = (mcq) this.f215627b;
                hcq hcqVar = (hcq) this.f215628c;
                mcqVar.f142229d = hcqVar;
                zv41 zv41Var = mcqVar.f142231f;
                do {
                    value = zv41Var.getValue();
                } while (!zv41Var.m97089k(value, kkc0.m56701n0((Map) value, new pqm0(hcqVar.f89884a.f281364a, hcqVar))));
                eh00 eh00Var = hcqVar.f89888e;
                if (eh00Var != null) {
                    eh00Var.invoke();
                }
                return w2a1.f247311a;
            case 7:
                q9r0 q9r0Var2 = (q9r0) obj;
                p36 p36Var = (p36) this.f215628c;
                if (q9r0Var2.equals(p9r0.f175291a) || q9r0Var2.equals(p9r0.f175292b)) {
                    ((gh00) this.f215627b).invoke(fn81.f71231i);
                } else if (q9r0Var2.equals(p9r0.f175294d)) {
                    ((lq81) p36Var.f173561b).getArtwork().setVisibility(4);
                } else {
                    if (!q9r0Var2.equals(p9r0.f175293c) && !q9r0Var2.equals(p9r0.f175295e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ((lq81) p36Var.f173561b).getArtwork().setVisibility(0);
                }
                return w2a1.f247311a;
            case 8:
                wq81 wq81Var = (wq81) obj;
                deq deqVar = (deq) this.f215628c;
                ezw0 ezw0Var = deqVar.f48151f;
                boolean z = wq81Var instanceof uq81;
                uks uksVar = uks.f231358b;
                if (z) {
                    ((SuppressLayoutTextView) ezw0Var.f64485b).setTextAdjustingWidth(ezw0Var.m40413f((int) ((uq81) wq81Var).f232946a));
                    if (deqVar.f48145Y == uksVar) {
                        deqVar.m35812a();
                    }
                } else if (wq81Var instanceof sq81) {
                    ((SuppressLayoutTextView) ezw0Var.f64485b).setTextAdjustingWidth(ezw0Var.m40413f(deqVar.f48148c.getProgress()));
                    if (deqVar.f48145Y == uksVar) {
                        deqVar.m35812a();
                    }
                }
                ((gh00) this.f215627b).invoke(wq81Var);
                return w2a1.f247311a;
            case 9:
                int iIntValue = ((Number) obj).intValue();
                p36 p36Var2 = (p36) this.f215627b;
                yqd1 yqd1Var = (yqd1) p36Var2.f173565f;
                int i = (yqd1Var.f275200f * iIntValue) + yqd1Var.f275198d;
                vqd1 vqd1Var = (vqd1) p36Var2.f173563d;
                rqd1 rqd1Var = (rqd1) p36Var2.f173561b;
                qqd1 qqd1Var = rqd1Var.f201818b;
                mec1.m61568t(vqd1Var.f243933d, (String) qqd1Var.f191545b.invoke(Integer.valueOf(i)));
                ard1 ard1Var = (ard1) this.f215628c;
                TextView textView = ard1Var.f19036c;
                RecyclerView recyclerView = ard1Var.f19035b;
                textView.setText((CharSequence) qqd1Var.f191544a.invoke(Integer.valueOf(i)));
                textView.setTextColor((qqd1Var.f191547d || i != rqd1Var.f201817a.f180292d) ? vtg1.m86387n(textView, R.attr.baseTextBrightAccent) : vtg1.m86387n(textView, R.attr.baseTextBase));
                if (recyclerView.getScrollState() != 0) {
                    recyclerView.performHapticFeedback(1);
                }
                return w2a1.f247311a;
            case 10:
                djq djqVar = (djq) ((zoq) this.f215627b).f284859a;
                x0h1.m89578u(n5h1.m63737m(djqVar.f49720a), null, 0, new cjq(djqVar, ((qsj0) this.f215628c).f192139g, null, 0), 3);
                return w2a1.f247311a;
            case 11:
                ((drq) this.f215627b).f52377b.m61893B((yyx0) obj, (a5b) this.f215628c);
                return w2a1.f247311a;
            case 12:
                chc chcVar = (chc) obj;
                String str = chcVar.f37984a;
                List<bhc> list = chcVar.f37985b;
                w0r w0rVar = (w0r) this.f215627b;
                r0r r0rVar = (r0r) this.f215628c;
                ArrayList arrayList2 = new ArrayList(i6f.m49804T(list, 10));
                for (bhc bhcVar : list) {
                    String str2 = bhcVar.f27134a;
                    String str3 = bhcVar.f27135b;
                    arrayList2.add(new qec(w0rVar.f246795b > 420 ? 1 : ((h44) r0rVar.f194544c).m46620b() ? 3 : 2, str2, bhcVar.f27136c, str3));
                }
                int i2 = w0rVar.f246794a;
                return new wgc(str, arrayList2, i2, g6f.m43740p1(list, i2, i2).size(), 0);
            case 13:
                ArrayList arrayList3 = ((n1r) this.f215627b).f149491g;
                ((whu) obj).m88174b(arrayList3.size(), new fyf(new d9j(14, arrayList3, (j1r) this.f215628c), true, -1673449743), new l24(9, arrayList3));
                return w2a1.f247311a;
            case 14:
                f220 f220Var = (f220) obj;
                n3r n3rVar = (n3r) this.f215627b;
                w0r w0rVar2 = (w0r) this.f215628c;
                Iterator it = n3rVar.f150114b.iterator();
                while (it.hasNext()) {
                    ((k2r) it.next()).mo46502a(w0rVar2, f220Var);
                }
                return w2a1.f247311a;
            case 15:
                ((a7r) this.f215627b).f13127b.m61893B((yyx0) obj, (z6r) this.f215628c);
                return w2a1.f247311a;
            case 16:
                r9r r9rVar = (r9r) this.f215628c;
                ne2 ne2Var = new ne2(r9rVar, 8);
                hc80 hc80Var = (hc80) this.f215627b;
                hc80Var.getLifecycle().mo31986a(ne2Var);
                return new C2648zf(hc80Var, (zb80) ne2Var, (Object) r9rVar, 5);
            case 17:
                hbr hbrVar = (hbr) obj;
                abr abrVar = (abr) this.f215627b;
                if (hbrVar.equals(ebr.f58122a)) {
                    uud1 uud1Var = (uud1) this.f215628c;
                    abrVar.f14170c.m25616a(uud1Var.f234163a, uud1Var.f234165c, null, uud1Var.f234166d);
                    abrVar.m25372a();
                } else {
                    if (!hbrVar.equals(dbr.f47349a) && !hbrVar.equals(gbr.f78373a) && !hbrVar.equals(fbr.f67875a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    abrVar.m25372a();
                }
                return w2a1.f247311a;
            case 18:
                return new eew((xre) this.f215627b, new ab3((er70) this.f215628c, 4));
            case 19:
                d850 d850Var = (d850) obj;
                p7o p7oVar = (p7o) this.f215627b;
                jrw0 jrw0Var = (jrw0) p7oVar.f174732b;
                jrw0Var.f115332j = (String) this.f215628c;
                jrw0Var.m54199c();
                uw00.m84078d((uw00) p7oVar.f174733c, (String) this.f215628c, d850Var, null, new r7q(p7oVar, 16), 12);
                return w2a1.f247311a;
            case 20:
                qsp qspVar = (qsp) ((hmh0) obj);
                qspVar.f192162a = new yyq((our) this.f215627b, 7);
                qspVar.f192169h = new ji0((om0) this.f215628c, 2);
                return w2a1.f247311a;
            case 21:
                ((icp) obj).f100858d = new j27((np0) this.f215627b, (zu0) this.f215628c, null, 7);
                return w2a1.f247311a;
            case 22:
                return xtm0.m92074U(((aub) this.f215627b).m27171a(2, (String) obj), new eud((fbk) null, (vmz) this.f215628c, 23));
            case 23:
                if (((Boolean) ((wa31) this.f215627b).invoke((gcs) obj)).booleanValue()) {
                    return (r671) this.f215628c;
                }
                return null;
            case 24:
                DrawScope drawScope = (DrawScope) obj;
                DrawScope drawScope2 = (DrawScope) this.f215628c;
                yqq yqqVarM31108w = drawScope.mo291d1().m31108w();
                ko70 ko70VarM31110z = drawScope.mo291d1().m31110z();
                wqb wqbVarM31107v = drawScope.mo291d1().m31107v();
                long jM31085B = drawScope.mo291d1().m31085B();
                rx10 rx10Var = (rx10) drawScope.mo291d1().f32695c;
                gh00 gh00Var2 = (gh00) this.f215627b;
                yqq yqqVarM31108w2 = drawScope2.mo291d1().m31108w();
                ko70 ko70VarM31110z2 = drawScope2.mo291d1().m31110z();
                wqb wqbVarM31107v2 = drawScope2.mo291d1().m31107v();
                long jM31085B2 = drawScope2.mo291d1().m31085B();
                rx10 rx10Var2 = (rx10) drawScope2.mo291d1().f32695c;
                c06 c06VarMo291d2 = drawScope2.mo291d1();
                c06VarMo291d2.m31090G(yqqVarM31108w);
                c06VarMo291d2.m31093J(ko70VarM31110z);
                c06VarMo291d2.m31089F(wqbVarM31107v);
                c06VarMo291d2.m31095L(jM31085B);
                c06VarMo291d2.f32695c = rx10Var;
                wqbVarM31107v.mo25287p();
                try {
                    gh00Var2.invoke(drawScope2);
                    return w2a1.f247311a;
                } finally {
                    wqbVarM31107v.mo25279h();
                    c06VarMo291d1 = drawScope2.mo291d1();
                    c06VarMo291d1.m31090G(yqqVarM31108w2);
                    c06VarMo291d1.m31093J(ko70VarM31110z2);
                    c06VarMo291d1.m31089F(wqbVarM31107v2);
                    c06VarMo291d1.m31095L(jM31085B2);
                    c06VarMo291d1.f32695c = rx10Var2;
                }
            case 25:
                return xtm0.m92103x((xv41) this.f215627b, new shh((fl0) this.f215628c, (lks) obj, (fbk) null, 21));
            case 26:
                return xtm0.m92103x((xv41) this.f215627b, new shh((px2) this.f215628c, (mks) obj, (fbk) null, 22));
            case 27:
                ((y5t) ((xvo) this.f215627b).f266440b).f269549a.mo47347h("spotify:internal:sts:edit", pp91.m70529j(new pqm0("uri", (String) this.f215628c)));
                return w2a1.f247311a;
            case 28:
                uig0 uig0Var = (uig0) obj;
                mys mysVar = (mys) ((xjp) this.f215627b).f262185d;
                String str4 = (String) this.f215628c;
                mysVar.getClass();
                String strM63206c = mys.m63206c(str4);
                dv91 dv91Var = new dv91("hit", 1);
                String string = strM63206c.toString();
                if (string == null) {
                    string = "";
                }
                return new av91("", "", dv91Var, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string)), uig0Var.f230681a, st91.f213865b, System.currentTimeMillis());
            default:
                return new rr0(13, (wvs) this.f215627b, (s9p0) this.f215628c);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ szp(int i, Object obj, gh00 gh00Var) {
        super(1);
        this.f215626a = i;
        this.f215628c = obj;
        this.f215627b = gh00Var;
    }
}
