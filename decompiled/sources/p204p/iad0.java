package p204p;

import com.spotify.music.R;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class iad0 implements xh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ List f100226a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ qf40 f100227b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gh00 f100228c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f100229d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ float f100230e;

    public iad0(List list, qf40 qf40Var, gh00 gh00Var, boolean z, float f) {
        this.f100226a = list;
        this.f100227b = qf40Var;
        this.f100228c = gh00Var;
        this.f100229d = z;
        this.f100230e = f;
    }

    @Override // p204p.xh00
    /* JADX INFO: renamed from: M */
    public final Object mo24818M(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        cxh0 cxh0Var;
        boolean z;
        ft70 ft70Var = (ft70) obj;
        int iIntValue = ((Number) obj2).intValue();
        xq00 xq00Var = (xq00) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (xq00Var.m91766g(ft70Var) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= xq00Var.m91762e(iIntValue) ? 32 : 16;
        }
        boolean z2 = (i & 147) != 146;
        ug5 ug5Var = xq00Var.f264811a;
        if (xq00Var.m91752Y(i & 1, z2)) {
            ead0 ead0Var = (ead0) this.f100226a.get(iIntValue);
            xq00Var.m91771i0(-329001932);
            wb9 wb9Var = d7f0.f46170g;
            Object objM91750T = xq00Var.m91750T();
            ia7 ia7Var = t6x0.f217647t;
            if (objM91750T == ia7Var) {
                objM91750T = r0d0.f194460c1;
                xq00Var.m91793t0(objM91750T);
            }
            cxh0 cxh0Var2 = cxh0.f43038a;
            fxh0 fxh0VarM96644b = zoz0.m96644b(cxh0Var2, false, (gh00) objM91750T);
            m6d0 m6d0VarM36007d = dha.m36007d(wb9Var, false);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM96644b);
            soh.f211194A.getClass();
            C2087le c2087le = roh.f201257b;
            if (ug5Var == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(c2087le);
            } else {
                xq00Var.m91799w0();
            }
            yhh yhhVar = roh.f201262g;
            zsf1.m96835F(m6d0VarM36007d, yhhVar, xq00Var);
            yhh yhhVar2 = roh.f201261f;
            zsf1.m96835F(wpn0VarM91778m, yhhVar2, xq00Var);
            Integer numValueOf = Integer.valueOf(iHashCode);
            yhh yhhVar3 = roh.f201265j;
            zsf1.m96835F(numValueOf, yhhVar3, xq00Var);
            vlh vlhVar = roh.f201266k;
            zsf1.m96833D(vlhVar, xq00Var);
            yhh yhhVar4 = roh.f201259d;
            zsf1.m96835F(fxh0VarM48286s, yhhVar4, xq00Var);
            String strM54978M = k0e1.m54978M(ead0Var.f57626c == 2 ? R.string.media_carousel_video_item_content_description : R.string.media_carousel_item_content_description, new Object[]{Integer.valueOf(iIntValue + 1), Integer.valueOf(((AbstractC2282q6) this.f100227b).mo33075a())}, xq00Var);
            m6d0 m6d0VarM36007d2 = dha.m36007d(d7f0.f46166e, false);
            int iHashCode2 = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m2 = xq00Var.m91778m();
            fxh0 fxh0VarM48286s2 = hqg1.m48286s(xq00Var, cxh0Var2);
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(c2087le);
            } else {
                xq00Var.m91799w0();
            }
            zsf1.m96835F(m6d0VarM36007d2, yhhVar, xq00Var);
            zsf1.m96835F(wpn0VarM91778m2, yhhVar2, xq00Var);
            pi9.m70088m(iHashCode2, xq00Var, yhhVar3, xq00Var, vlhVar);
            zsf1.m96835F(fxh0VarM48286s2, yhhVar4, xq00Var);
            rgj rgjVar = new rgj(strM54978M);
            gh00 gh00Var = this.f100228c;
            boolean zM91766g = xq00Var.m91766g(gh00Var) | xq00Var.m91770i(ead0Var);
            Object objM91750T2 = xq00Var.m91750T();
            if (zM91766g || objM91750T2 == ia7Var) {
                objM91750T2 = new had0(gh00Var, ead0Var, 0);
                xq00Var.m91793t0(objM91750T2);
            }
            kad0.m55904b(ead0Var, this.f100229d, rgjVar, this.f100230e, (eh00) objM91750T2, xq00Var, 0);
            if (ead0Var.f57626c == 2) {
                xq00Var.m91771i0(1050906199);
                cxh0Var = cxh0Var2;
                z = false;
                vzb1.m86876a(0, ead0Var.f57629f, xq00Var, pha.f177517a.mo66946b(cxh0Var));
                xq00Var.m91788r(false);
            } else {
                cxh0Var = cxh0Var2;
                z = false;
                xq00Var.m91771i0(1051064764);
                xq00Var.m91788r(false);
            }
            xq00Var.m91788r(true);
            fmx0 fmx0Var = hmx0.f93097a;
            sju sjuVar = sju.f209931e;
            wb9 wb9Var2 = d7f0.f46174i;
            float f = leu.m58816b(xq00Var).f117230b.f224759b;
            boolean z3 = z;
            j4m0 j4m0Var = new j4m0(f, f, f, f);
            fxh0 fxh0VarM29070M = bga.m29070M(cxh0Var, 5, -5);
            boolean zM91766g2 = xq00Var.m91766g(gh00Var) | xq00Var.m91770i(ead0Var);
            Object objM91750T3 = xq00Var.m91750T();
            if (zM91766g2 || objM91750T3 == ia7Var) {
                objM91750T3 = new had0(gh00Var, ead0Var, 1);
                xq00Var.m91793t0(objM91750T3);
            }
            zn91.m96545d(hdi.m47247x(fxh0VarM29070M, false, null, null, null, (eh00) objM91750T3, 15), wb9Var2, fmx0Var, sjuVar, j4m0Var, null, false, null, null, null, null, tsg.f223307a, xq00Var, 0, 48, 2016);
            xq00Var.m91788r(true);
            xq00Var.m91788r(z3);
        } else {
            xq00Var.m91757b0();
        }
        return w2a1.f247311a;
    }
}
