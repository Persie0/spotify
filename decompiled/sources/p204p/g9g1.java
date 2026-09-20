package p204p;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.AbstractC0110a;
import com.comscore.streaming.ContentType;
import com.google.protobuf.StringValue;
import com.spotify.identity.proto.p081v3.Identity$UserProfile;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONException;
import org.json.JSONObject;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes4.dex */
public abstract class g9g1 {

    /* JADX INFO: renamed from: a */
    public static final vw21 f77793a = new vw21(1);

    /* JADX INFO: renamed from: b */
    public static final rv21 f77794b = new rv21();

    /* JADX INFO: renamed from: c */
    public static sd40 f77795c;

    /* JADX INFO: renamed from: d */
    public static sd40 f77796d;

    /* JADX INFO: renamed from: a */
    public static final void m44025a(s9p0 s9p0Var, Object[] objArr, th00 th00Var, xq00 xq00Var, int i) {
        xq00Var.m91775k0(2006961661);
        int i2 = (i & 6) == 0 ? (xq00Var.m91770i(s9p0Var) ? 4 : 2) | i : i;
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91770i(th00Var) ? 256 : 128;
        }
        xq00Var.m91765f0(249841326, Integer.valueOf(objArr.length));
        int i3 = i2 | (xq00Var.m91762e(objArr.length) ? 32 : 0);
        for (Object obj : objArr) {
            i3 |= xq00Var.m91770i(obj) ? 32 : 0;
        }
        xq00Var.m91788r(false);
        if ((i3 & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i3 |= 16;
        }
        if (xq00Var.m91752Y(i3 & 1, (i3 & 147) != 146)) {
            kqi0 kqi0VarM77671j = sam.m77671j(s9p0Var.f206993b, xq00Var, 0);
            mbq mbqVar = new mbq(2);
            mbqVar.m61422c(objArr);
            Boolean bool = (Boolean) kqi0VarM77671j.getValue();
            bool.booleanValue();
            mbqVar.m61421b(bool);
            ArrayList arrayList = mbqVar.f141956a;
            Object[] array = arrayList.toArray(new Object[arrayList.size()]);
            boolean zM91770i = xq00Var.m91770i(kqi0VarM77671j) | xq00Var.m91770i(th00Var);
            Object objM91750T = xq00Var.m91750T();
            if (zM91770i || objM91750T == t6x0.f217647t) {
                objM91750T = new sai0(th00Var, kqi0VarM77671j, null, 0);
                xq00Var.m91793t0(objM91750T);
            }
            hz40.m49238j(array, (th00) objM91750T, xq00Var);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new nde0((Object) s9p0Var, (Object) objArr, (Object) th00Var, i, 5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0059  */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:33:0x005f  */
    /* JADX WARN: Code duplicated, block: B:36:0x007f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0086  */
    /* JADX WARN: Code duplicated, block: B:39:0x008a  */
    /* JADX WARN: Code duplicated, block: B:43:0x014a  */
    /* JADX WARN: Code duplicated, block: B:46:0x018f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0197  */
    /* JADX WARN: Code duplicated, block: B:50:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:52:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:55:0x01da  */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static final void m44026b(cpa cpaVar, String str, fxh0 fxh0Var, xq00 xq00Var, int i, int i2) {
        fxh0 fxh0Var2;
        boolean z;
        fxh0 fxh0Var3;
        pgv0 pgv0VarM91796v;
        cxh0 cxh0Var;
        fxh0 fxh0Var4;
        aaf aafVarM87496a;
        int iHashCode;
        wpn0 wpn0VarM91778m;
        fxh0 fxh0VarM48286s;
        C2087le c2087le;
        String str2 = str;
        xq00Var.m91775k0(-1294251811);
        ug5 ug5Var = xq00Var.f264811a;
        int i3 = (xq00Var.m91766g(cpaVar) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i3 |= xq00Var.m91766g(str2) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                fxh0Var2 = fxh0Var;
                i3 |= xq00Var.m91766g(fxh0Var2) ? 256 : 128;
            }
            if ((i3 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (xq00Var.m91752Y(i3 & 1, z)) {
                cxh0Var = cxh0.f43038a;
                if (i4 != 0) {
                    fxh0Var4 = cxh0Var;
                } else {
                    fxh0Var4 = fxh0Var2;
                }
                aafVarM87496a = w9f.m87496a(bj5.f27612c, d7f0.f46144O0, xq00Var, 0);
                iHashCode = Long.hashCode(xq00Var.f264809T);
                wpn0VarM91778m = xq00Var.m91778m();
                fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0Var4);
                soh.f211194A.getClass();
                c2087le = roh.f201257b;
                if (ug5Var != null) {
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
                zsf1.m96835F(aafVarM87496a, yhhVar, xq00Var);
                yhh yhhVar2 = roh.f201261f;
                zsf1.m96835F(wpn0VarM91778m, yhhVar2, xq00Var);
                Integer numValueOf = Integer.valueOf(iHashCode);
                yhh yhhVar3 = roh.f201265j;
                zsf1.m96835F(numValueOf, yhhVar3, xq00Var);
                vlh vlhVar = roh.f201266k;
                zsf1.m96833D(vlhVar, xq00Var);
                yhh yhhVar4 = roh.f201259d;
                zsf1.m96835F(fxh0VarM48286s, yhhVar4, xq00Var);
                q9g1.m72382e(0.0f, 0, xq00Var, zsf1.m96831B(cv9.m33990h(1.0f, cxh0Var, true), leu.m58816b(xq00Var).f117230b.f224769l, leu.m58816b(xq00Var).f117230b.f224769l * 2, leu.m58816b(xq00Var).f117230b.f224769l, leu.m58816b(xq00Var).f117230b.f224765h));
                fxh0 fxh0Var5 = fxh0Var4;
                int i5 = i3;
                ahf1.m25932d(k0e1.m54977L(R.string.stp_loading_page_text, xq00Var), mi21.m61822f(1.0f, zsf1.m96865y(leu.m58816b(xq00Var).f117230b.f224763f, cxh0Var)), leu.m58818d(xq00Var).f64968d, leu.m58815a(xq00Var).f112824b.f138757a, new h171(3), null, 0, false, null, 0, null, xq00Var, 0, 0, 2016);
                if (1.0f <= 0.0d) {
                    kt40.m57301a("invalid weight; must be greater than zero");
                }
                riw0.m75615i(xq00Var, new cr70(1.0f, true));
                fxh0 fxh0VarM96832C = zsf1.m96832C(zsf1.m96865y(leu.m58816b(xq00Var).f117230b.f224763f, cxh0Var), 0.0f, 0.0f, 0.0f, leu.m58816b(xq00Var).f117230b.f224769l, 7);
                m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46166e, false);
                int iHashCode2 = Long.hashCode(xq00Var.f264809T);
                wpn0 wpn0VarM91778m2 = xq00Var.m91778m();
                fxh0 fxh0VarM48286s2 = hqg1.m48286s(xq00Var, fxh0VarM96832C);
                xq00Var.m91779m0();
                if (xq00Var.f264808S) {
                    xq00Var.m91776l(c2087le);
                } else {
                    xq00Var.m91799w0();
                }
                zsf1.m96835F(m6d0VarM36007d, yhhVar, xq00Var);
                zsf1.m96835F(wpn0VarM91778m2, yhhVar2, xq00Var);
                AbstractC0000a.m20s(iHashCode2, xq00Var, yhhVar3, xq00Var, vlhVar);
                zsf1.m96835F(fxh0VarM48286s2, yhhVar4, xq00Var);
                str2 = str;
                mif1.m61869b(cpaVar, new sob(str2), null, null, xq00Var, i5 & 14, 12);
                xq00Var.m91788r(true);
                xq00Var.m91788r(true);
                fxh0Var3 = fxh0Var5;
            } else {
                xq00Var.m91757b0();
                fxh0Var3 = fxh0Var2;
            }
            pgv0VarM91796v = xq00Var.m91796v();
            if (pgv0VarM91796v != null) {
                pgv0VarM91796v.f177419d = new a4j0(cpaVar, str2, fxh0Var3, i, i2, 13);
            }
        }
        i3 |= 384;
        fxh0Var2 = fxh0Var;
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (xq00Var.m91752Y(i3 & 1, z)) {
            cxh0Var = cxh0.f43038a;
            if (i4 != 0) {
                fxh0Var4 = cxh0Var;
            } else {
                fxh0Var4 = fxh0Var2;
            }
            aafVarM87496a = w9f.m87496a(bj5.f27612c, d7f0.f46144O0, xq00Var, 0);
            iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0VarM91778m = xq00Var.m91778m();
            fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0Var4);
            soh.f211194A.getClass();
            c2087le = roh.f201257b;
            if (ug5Var != null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(c2087le);
            } else {
                xq00Var.m91799w0();
            }
            yhh yhhVar5 = roh.f201262g;
            zsf1.m96835F(aafVarM87496a, yhhVar5, xq00Var);
            yhh yhhVar6 = roh.f201261f;
            zsf1.m96835F(wpn0VarM91778m, yhhVar6, xq00Var);
            Integer numValueOf2 = Integer.valueOf(iHashCode);
            yhh yhhVar7 = roh.f201265j;
            zsf1.m96835F(numValueOf2, yhhVar7, xq00Var);
            vlh vlhVar2 = roh.f201266k;
            zsf1.m96833D(vlhVar2, xq00Var);
            yhh yhhVar8 = roh.f201259d;
            zsf1.m96835F(fxh0VarM48286s, yhhVar8, xq00Var);
            q9g1.m72382e(0.0f, 0, xq00Var, zsf1.m96831B(cv9.m33990h(1.0f, cxh0Var, true), leu.m58816b(xq00Var).f117230b.f224769l, leu.m58816b(xq00Var).f117230b.f224769l * 2, leu.m58816b(xq00Var).f117230b.f224769l, leu.m58816b(xq00Var).f117230b.f224765h));
            fxh0 fxh0Var6 = fxh0Var4;
            int i6 = i3;
            ahf1.m25932d(k0e1.m54977L(R.string.stp_loading_page_text, xq00Var), mi21.m61822f(1.0f, zsf1.m96865y(leu.m58816b(xq00Var).f117230b.f224763f, cxh0Var)), leu.m58818d(xq00Var).f64968d, leu.m58815a(xq00Var).f112824b.f138757a, new h171(3), null, 0, false, null, 0, null, xq00Var, 0, 0, 2016);
            if (1.0f <= 0.0d) {
                kt40.m57301a("invalid weight; must be greater than zero");
            }
            riw0.m75615i(xq00Var, new cr70(1.0f, true));
            fxh0 fxh0VarM96832C2 = zsf1.m96832C(zsf1.m96865y(leu.m58816b(xq00Var).f117230b.f224763f, cxh0Var), 0.0f, 0.0f, 0.0f, leu.m58816b(xq00Var).f117230b.f224769l, 7);
            m6d0 m6d0VarM36007d2 = dha.m36007d(d7f0.f46166e, false);
            int iHashCode3 = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m3 = xq00Var.m91778m();
            fxh0 fxh0VarM48286s3 = hqg1.m48286s(xq00Var, fxh0VarM96832C2);
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(c2087le);
            } else {
                xq00Var.m91799w0();
            }
            zsf1.m96835F(m6d0VarM36007d2, yhhVar5, xq00Var);
            zsf1.m96835F(wpn0VarM91778m3, yhhVar6, xq00Var);
            AbstractC0000a.m20s(iHashCode3, xq00Var, yhhVar7, xq00Var, vlhVar2);
            zsf1.m96835F(fxh0VarM48286s3, yhhVar8, xq00Var);
            str2 = str;
            mif1.m61869b(cpaVar, new sob(str2), null, null, xq00Var, i6 & 14, 12);
            xq00Var.m91788r(true);
            xq00Var.m91788r(true);
            fxh0Var3 = fxh0Var6;
        } else {
            xq00Var.m91757b0();
            fxh0Var3 = fxh0Var2;
        }
        pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new a4j0(cpaVar, str2, fxh0Var3, i, i2, 13);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final vh00 m44027c(st50 st50Var, vco vcoVar, xq00 xq00Var) {
        xq00Var.m91771i0(1785965740);
        if (st50Var == null) {
            xq00Var.m91788r(false);
            return null;
        }
        String strM79234b = st50Var.m79234b(vcoVar, false, xq00Var, 48);
        if (strM79234b == null) {
            xq00Var.m91788r(false);
            return null;
        }
        boolean zM91766g = xq00Var.m91766g(strM79234b) | xq00Var.m91766g(vcoVar);
        Object objM91750T = xq00Var.m91750T();
        if (zM91766g || objM91750T == t6x0.f217647t) {
            objM91750T = new fyf(new vt6(new pt50(st50Var, strM79234b, vcoVar), vcoVar, 0), true, -493941105);
            xq00Var.m91793t0(objM91750T);
        }
        vh00 vh00Var = (vh00) objM91750T;
        xq00Var.m91788r(false);
        return vh00Var;
    }

    /* JADX INFO: renamed from: d */
    public static final vh00 m44028d(cv41 cv41Var, ry8 ry8Var, gh00 gh00Var, xq00 xq00Var) {
        xq00Var.m91771i0(-1560443242);
        Object objInvoke = gh00Var.invoke(cv41Var);
        if (objInvoke == null) {
            xq00Var.m91788r(false);
            return null;
        }
        boolean zM91766g = xq00Var.m91766g(ry8Var) | xq00Var.m91766g(objInvoke);
        Object objM91750T = xq00Var.m91750T();
        if (zM91766g || objM91750T == t6x0.f217647t) {
            objM91750T = new fyf(new C1776df(16, ry8Var, objInvoke), true, -1754636103);
            xq00Var.m91793t0(objM91750T);
        }
        vh00 vh00Var = (vh00) objM91750T;
        xq00Var.m91788r(false);
        return vh00Var;
    }

    /* JADX INFO: renamed from: e */
    public static final int m44029e(String str) {
        Set set = dd41.f47702f;
        dd41 dd41VarM74726U = r46.m74726U(str);
        he41 he41Var = dd41VarM74726U.f47710d;
        if (he41Var != null) {
            if (he41Var.mo27216a() != 1) {
                return 2;
            }
        } else {
            if (dd41VarM74726U.f47709c == gn80.DUMMY) {
                return 3;
            }
            Uri uri = Uri.parse(str);
            List<String> pathSegments = uri.getPathSegments();
            if (wj50.m88271j(pathSegments != null ? (String) g6f.m43745s0(pathSegments) : null, "internal") || wj50.m88271j(uri.getHost(), "internal") || bm51.m29803n0(str, "spotify:internal:", false)) {
                return 2;
            }
        }
        return 1;
    }

    /* JADX INFO: renamed from: f */
    public static int m44030f(zjv0 zjv0Var, d180 d180Var, View view, View view2, AbstractC0110a abstractC0110a, boolean z) {
        if (abstractC0110a.m1097I() == 0 || zjv0Var.m96246b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(AbstractC0110a.m1083V(view) - AbstractC0110a.m1083V(view2)) + 1;
        }
        return Math.min(d180Var.mo34605n(), d180Var.mo34595d(view2) - d180Var.mo34598g(view));
    }

    /* JADX INFO: renamed from: g */
    public static int m44031g(zjv0 zjv0Var, d180 d180Var, View view, View view2, AbstractC0110a abstractC0110a, boolean z, boolean z2) {
        if (abstractC0110a.m1097I() == 0 || zjv0Var.m96246b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z2 ? Math.max(0, (zjv0Var.m96246b() - Math.max(AbstractC0110a.m1083V(view), AbstractC0110a.m1083V(view2))) - 1) : Math.max(0, Math.min(AbstractC0110a.m1083V(view), AbstractC0110a.m1083V(view2)));
        if (z) {
            return Math.round((iMax * (Math.abs(d180Var.mo34595d(view2) - d180Var.mo34598g(view)) / (Math.abs(AbstractC0110a.m1083V(view) - AbstractC0110a.m1083V(view2)) + 1))) + (d180Var.mo34604m() - d180Var.mo34598g(view)));
        }
        return iMax;
    }

    /* JADX INFO: renamed from: h */
    public static int m44032h(zjv0 zjv0Var, d180 d180Var, View view, View view2, AbstractC0110a abstractC0110a, boolean z) {
        if (abstractC0110a.m1097I() == 0 || zjv0Var.m96246b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return zjv0Var.m96246b();
        }
        return (int) (((d180Var.mo34595d(view2) - d180Var.mo34598g(view)) / (Math.abs(AbstractC0110a.m1083V(view) - AbstractC0110a.m1083V(view2)) + 1)) * zjv0Var.m96246b());
    }

    /* JADX INFO: renamed from: i */
    public static ago m44033i(rio rioVar) {
        return new ago(rioVar, null);
    }

    /* JADX INFO: renamed from: j */
    public static ago m44034j(a6a1 a6a1Var, p7f0 p7f0Var) {
        return new ago(a6a1Var, p7f0Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: k */
    public static final Object m44035k(p140 p140Var, String str, String str2, ibk ibkVar) {
        dua1 dua1Var;
        String value;
        String value2;
        if (ibkVar instanceof dua1) {
            dua1Var = (dua1) ibkVar;
            int i = dua1Var.f53025b;
            if ((i & Integer.MIN_VALUE) != 0) {
                dua1Var.f53025b = i - Integer.MIN_VALUE;
            } else {
                dua1Var = new dua1(ibkVar);
            }
        } else {
            dua1Var = new dua1(ibkVar);
        }
        Object objMo68766b = dua1Var.f53024a;
        int i2 = dua1Var.f53025b;
        if (i2 == 0) {
            bga.m29073P(objMo68766b);
            dua1Var.f53025b = 1;
            objMo68766b = p140Var.mo68766b(str, str2, dua1Var);
            Object obj = yuk.f276404a;
            if (objMo68766b == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objMo68766b);
        }
        Identity$UserProfile identity$UserProfile = (Identity$UserProfile) objMo68766b;
        StringValue stringValueM11953x = identity$UserProfile.m11953x();
        String str3 = null;
        if (stringValueM11953x != null && (value = stringValueM11953x.getValue()) != null) {
            if (value.length() <= 0) {
                value = null;
            }
            if (value != null) {
                StringValue stringValueM11952w = identity$UserProfile.m11952w();
                if (stringValueM11952w != null && (value2 = stringValueM11952w.getValue()) != null && value2.length() > 0) {
                    str3 = value2;
                }
                return new e0x0(value, str3);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    public static final boolean m44036l(b2s0 b2s0Var) {
        l64 l64Var = b2s0Var.f22687a;
        return l64Var.m58271d() || l64Var.m58272e() || l64Var.m58273f() || l64Var.m58287t() || l64Var.m58270c();
    }

    /* JADX INFO: renamed from: m */
    public static String m44037m() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("init", System.currentTimeMillis());
        } catch (JSONException unused) {
            p8y p8yVar = p8y.f175080a;
        }
        return jSONObject.toString();
    }

    /* JADX INFO: renamed from: n */
    public static final boolean m44038n(Bundle bundle, Bundle bundle2) {
        if (bundle.size() != bundle2.size() || !bundle.keySet().containsAll(bundle2.keySet())) {
            return false;
        }
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if ((obj instanceof Bundle) && (obj2 instanceof Bundle)) {
                if (!m44038n((Bundle) obj, (Bundle) obj2)) {
                    return false;
                }
            } else if (!wj50.m88271j(obj, obj2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: o */
    public static final rv41 m44039o(s9p0 s9p0Var, xq00 xq00Var) {
        kqi0 kqi0VarM77671j = sam.m77671j(s9p0Var.f206993b, xq00Var, 0);
        Object objM91750T = xq00Var.m91750T();
        Object obj = t6x0.f217647t;
        fbk fbkVar = null;
        if (objM91750T == obj) {
            objM91750T = sam.m77645B(((Boolean) kqi0VarM77671j.getValue()).booleanValue() ? s9p0Var.m77588a() : null);
            xq00Var.m91793t0(objM91750T);
        }
        kqi0 kqi0Var = (kqi0) objM91750T;
        Boolean bool = (Boolean) kqi0VarM77671j.getValue();
        bool.booleanValue();
        boolean zM91770i = xq00Var.m91770i(kqi0VarM77671j) | xq00Var.m91770i(kqi0Var) | xq00Var.m91770i(s9p0Var);
        Object objM91750T2 = xq00Var.m91750T();
        if (zM91770i || objM91750T2 == obj) {
            Object rzb0Var = new rzb0(s9p0Var, kqi0VarM77671j, kqi0Var, fbkVar, 11);
            xq00Var.m91793t0(rzb0Var);
            objM91750T2 = rzb0Var;
        }
        hz40.m49237i(bool, (th00) objM91750T2, xq00Var);
        Object objM91750T3 = xq00Var.m91750T();
        if (objM91750T3 == obj) {
            objM91750T3 = sam.m77674m(new gyc(kqi0VarM77671j, kqi0Var, 7));
            xq00Var.m91793t0(objM91750T3);
        }
        return (rv41) objM91750T3;
    }

    /* JADX INFO: renamed from: p */
    public static voc1 m44040p(AbstractC2616yk abstractC2616yk, a370 a370Var) {
        uoc1 uoc1Var;
        String str;
        boolean z = a370Var instanceof y270;
        C2499vk c2499vk = C2499vk.f242097b;
        C2418tk c2418tk = C2418tk.f221040b;
        C2341rk c2341rk = C2341rk.f199931b;
        C2538wk c2538wk = C2538wk.f252074b;
        C2379sk c2379sk = C2379sk.f209961b;
        C2217ok c2217ok = C2217ok.f166194b;
        C2296qk c2296qk = C2296qk.f189394b;
        C2167nk c2167nk = C2167nk.f154711b;
        C2259pk c2259pk = C2259pk.f178330b;
        C2575xk c2575xk = C2575xk.f262251b;
        if (z) {
            if (wj50.m88271j(abstractC2616yk, c2575xk)) {
                return xoc1.f264162p3;
            }
            if (wj50.m88271j(abstractC2616yk, c2259pk)) {
                return xoc1.f263898H3;
            }
            if (abstractC2616yk instanceof C2461uk) {
                throw new IllegalStateException("TransitionConsent is not supported in the creation flow");
            }
            if (wj50.m88271j(abstractC2616yk, c2167nk)) {
                return xoc1.f264154o3;
            }
            if (wj50.m88271j(abstractC2616yk, c2296qk)) {
                return xoc1.f264122k3;
            }
            if (wj50.m88271j(abstractC2616yk, c2217ok)) {
                return xoc1.f264130l3;
            }
            if (wj50.m88271j(abstractC2616yk, c2379sk)) {
                return xoc1.f264138m3;
            }
            if (wj50.m88271j(abstractC2616yk, c2538wk)) {
                return xoc1.f264202u3;
            }
            if (wj50.m88271j(abstractC2616yk, c2341rk)) {
                return xoc1.f264186s3;
            }
            if (wj50.m88271j(abstractC2616yk, c2418tk)) {
                return xoc1.f264194t3;
            }
            if (wj50.m88271j(abstractC2616yk, c2499vk)) {
                throw new IllegalStateException("TransitionSubmit is not supported in the creation flow");
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!(a370Var instanceof z270)) {
            throw new NoWhenBranchMatchedException();
        }
        String value = ((z270) a370Var).f278507a.getValue();
        if (wj50.m88271j(abstractC2616yk, c2575xk)) {
            return xoc1.f264226x3;
        }
        if (wj50.m88271j(abstractC2616yk, c2259pk)) {
            return xoc1.f263898H3;
        }
        if (abstractC2616yk instanceof C2461uk) {
            uoc1Var = xoc1.f264242z3;
            str = "spotify:internal:kid-account-transition:consent:";
        } else {
            if (wj50.m88271j(abstractC2616yk, c2167nk)) {
                return xoc1.f264154o3;
            }
            if (!wj50.m88271j(abstractC2616yk, c2296qk)) {
                if (wj50.m88271j(abstractC2616yk, c2217ok)) {
                    return xoc1.f263850B3;
                }
                if (wj50.m88271j(abstractC2616yk, c2379sk)) {
                    return xoc1.f263866D3;
                }
                if (wj50.m88271j(abstractC2616yk, c2538wk)) {
                    return xoc1.f264210v3;
                }
                if (wj50.m88271j(abstractC2616yk, c2341rk)) {
                    return xoc1.f263882F3;
                }
                if (wj50.m88271j(abstractC2616yk, c2418tk)) {
                    throw new IllegalStateException("Submit is not supported in the transition flow");
                }
                if (wj50.m88271j(abstractC2616yk, c2499vk)) {
                    return xoc1.f263890G3;
                }
                throw new NoWhenBranchMatchedException();
            }
            uoc1Var = xoc1.f263842A3;
            str = "spotify:internal:kid-account-transition:legal-consent:";
        }
        return ptl.m70998s(str, value, uoc1Var);
    }
}
