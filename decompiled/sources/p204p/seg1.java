package p204p;

import android.util.TypedValue;
import com.comscore.streaming.ContentType;
import com.spotify.casita.p040v1.resolved.Heading;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes4.dex */
public abstract class seg1 {

    /* JADX INFO: renamed from: a */
    public static final agy f208292a = new agy("video-preview-carousel-npv-scroll");

    /* JADX INFO: renamed from: b */
    public static sd40 f208293b;

    /* JADX INFO: renamed from: c */
    public static sd40 f208294c;

    /* JADX INFO: renamed from: a */
    public static final void m77909a(long j, boolean z, fxh0 fxh0Var, eh00 eh00Var, xq00 xq00Var, int i) {
        fxh0 fxh0Var2;
        xq00Var.m91775k0(-1005006745);
        int i2 = i | (xq00Var.m91764f(j) ? 4 : 2) | (xq00Var.m91768h(z) ? 32 : 16) | 384 | (xq00Var.m91770i(eh00Var) ? 2048 : 1024);
        if (xq00Var.m91752Y(i2 & 1, (i2 & 1171) != 1170)) {
            float f = leu.m58816b(xq00Var).f117232d.f137887c;
            fxh0Var2 = cxh0.f43038a;
            fxh0 fxh0VarM47247x = hdi.m47247x(zsf1.m96865y(leu.m58816b(xq00Var).f117230b.f224761d, mi21.m61834r(f, fxh0Var2)), false, null, null, null, eh00Var, 15);
            m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46166e, false);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM47247x);
            soh.f211194A.getClass();
            C2087le c2087le = roh.f201257b;
            if (xq00Var.f264811a == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(c2087le);
            } else {
                xq00Var.m91799w0();
            }
            zsf1.m96835F(m6d0VarM36007d, roh.f201262g, xq00Var);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var);
            zsf1.m96833D(roh.f201266k, xq00Var);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var);
            ffg1.m41534c(z, j, mi21.m61820d(1.0f, fxh0Var2), leu.m58816b(xq00Var).f117231c.f127593b, xq00Var, ((i2 << 3) & ContentType.LONG_FORM_ON_DEMAND) | ((i2 >> 3) & 14), 0);
            xq00Var.m91788r(true);
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new yl8(j, z, fxh0Var2, eh00Var, i);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m77910b(ms51 ms51Var, eh00 eh00Var, xq00 xq00Var, int i) {
        String strM12k;
        xq00Var.m91775k0(-2096301756);
        int i2 = (xq00Var.m91766g(ms51Var) ? 4 : 2) | i | (xq00Var.m91770i(eh00Var) ? 32 : 16);
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            boolean z = ms51Var instanceof ls51;
            if (z) {
                xq00Var.m91771i0(-206320597);
                xq00Var.m91788r(false);
                strM12k = ((ls51) ms51Var).f136450a;
            } else {
                strM12k = AbstractC0000a.m12k(xq00Var, -206319834, R.string.bluejay_confirm_submit_error_body_generic, xq00Var, false);
            }
            String strM12k2 = (ms51Var.equals(ks51.f125841a) || z) ? AbstractC0000a.m12k(xq00Var, -206313532, R.string.bluejay_confirm_submit_error_cta_got_it, xq00Var, false) : AbstractC0000a.m12k(xq00Var, -206311001, R.string.bluejay_confirm_submit_error_cta_try_again, xq00Var, false);
            String strM54977L = k0e1.m54977L(R.string.bluejay_confirm_submit_error_title, xq00Var);
            boolean z2 = (i2 & ContentType.LONG_FORM_ON_DEMAND) == 32;
            Object objM91750T = xq00Var.m91750T();
            if (z2 || objM91750T == t6x0.f217647t) {
                objM91750T = new sp11(12, eh00Var);
                xq00Var.m91793t0(objM91750T);
            }
            kku.m56741a(eh00Var, null, null, strM54977L, strM12k, new gku(strM12k2, new peu(u40.f226523c, (eh00) objM91750T)), null, xq00Var, ((i2 >> 3) & 14) | 262144, 70);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new sni(ms51Var, eh00Var, i, 1);
        }
    }

    /* JADX INFO: renamed from: c */
    public static ozi0 m77911c(TypedValue typedValue, ozi0 ozi0Var, ozi0 ozi0Var2, String str, String str2) throws XmlPullParserException {
        if (ozi0Var == null || ozi0Var == ozi0Var2) {
            return ozi0Var == null ? ozi0Var2 : ozi0Var;
        }
        StringBuilder sbM38573v = edb.m38573v("Type is ", str, " but found ", str2, ": ");
        sbM38573v.append(typedValue.data);
        throw new XmlPullParserException(sbM38573v.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public static fbk m77912d(fbk fbkVar, fbk fbkVar2, th00 th00Var) {
        if (th00Var instanceof ly8) {
            return ((ly8) th00Var).create(fbkVar, fbkVar2);
        }
        juk context = fbkVar2.getContext();
        return context == dau.f47107a ? new zj50(fbkVar2, fbkVar, th00Var) : new ak50(fbkVar2, context, th00Var, fbkVar);
    }

    /* JADX INFO: renamed from: e */
    public static final ewm0 m77913e(nw80 nw80Var) {
        String str = nw80Var.f159047a;
        String str2 = (String) nw80Var.f159053g.get("children_group_id");
        if (str2 == null) {
            str2 = "";
        }
        return new ewm0(str, str2);
    }

    /* JADX INFO: renamed from: f */
    public static fbk m77914f(fbk fbkVar) {
        fbk<Object> fbkVarIntercepted;
        ibk ibkVar = fbkVar instanceof ibk ? (ibk) fbkVar : null;
        return (ibkVar == null || (fbkVarIntercepted = ibkVar.intercepted()) == null) ? fbkVar : fbkVarIntercepted;
    }

    /* JADX INFO: renamed from: g */
    public static k590 m77915g(Map map) {
        String string;
        Set set = k590.f119450a;
        String str = (String) map.get("generation_status");
        if (str == null || (string = wl51.m88491o1(str).toString()) == null) {
            string = "";
        }
        return sam.m77680s(string);
    }

    /* JADX INFO: renamed from: h */
    public static final Collection m77916h(Collection collection, gh00 gh00Var) {
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        int i = zw21.f286894c;
        zw21 zw21VarM71231p = pwb.m71231p();
        while (!linkedList.isEmpty()) {
            Object objM43741q0 = g6f.m43741q0(linkedList);
            int i2 = zw21.f286894c;
            zw21 zw21VarM71231p2 = pwb.m71231p();
            ArrayList arrayListM95142g = z1m0.m95142g(objM43741q0, linkedList, gh00Var, new jt70(zw21VarM71231p2, 8));
            if (arrayListM95142g.size() == 1 && zw21VarM71231p2.isEmpty()) {
                zw21VarM71231p.add(g6f.m43705S0(arrayListM95142g));
            } else {
                Object objM95150s = z1m0.m95150s(arrayListM95142g, gh00Var);
                cab cabVar = (cab) gh00Var.invoke(objM95150s);
                for (Object obj : arrayListM95142g) {
                    wj50.m88279p(obj);
                    if (!z1m0.m95145k(cabVar, (cab) gh00Var.invoke(obj))) {
                        zw21VarM71231p2.add(obj);
                    }
                }
                if (!zw21VarM71231p2.isEmpty()) {
                    zw21VarM71231p.addAll(zw21VarM71231p2);
                }
                zw21VarM71231p.add(objM95150s);
            }
        }
        return zw21VarM71231p;
    }

    /* JADX INFO: renamed from: i */
    public static final un20 m77917i(Heading heading, boolean z) {
        int iM5648q = heading.m5648q();
        int i = iM5648q == 0 ? -1 : e9z0.f57555a[edb.m38547C(iM5648q)];
        if (i == 1) {
            if (z) {
                return new xml0(heading.m5652u().m5663r(), heading.m5652u().m5661p(), new cbv("", "", ""));
            }
            return new rzd1(heading.m5652u().m5663r(), 240, heading.m5652u().m5661p(), heading.m5652u().m5664s() ? heading.m5652u().m5662q().m5709p() : null, false, heading.m5652u().m5664s() ? heading.m5652u().m5662q().getUri() : null);
        }
        if (i == 2) {
            return z ? new xml0(heading.m5647p().getFormat(), heading.m5647p().m5640q(), new cbv(heading.m5647p().m5639o().getTitle(), heading.m5647p().m5639o().getUri(), heading.m5647p().m5639o().getImageUrl())) : new km91(heading.m5647p().getFormat(), heading.m5647p().m5640q(), new cbv(heading.m5647p().m5639o().getTitle(), heading.m5647p().m5639o().getUri(), heading.m5647p().m5639o().getImageUrl()));
        }
        if (i != 3) {
            if (i != 4) {
                return null;
            }
            return new ky41(heading.m5651t().m5851r(), heading.m5651t().m5850q(), heading.m5651t().getImageUrl(), heading.m5651t().m5849p());
        }
        String title = heading.m5649r().getTitle();
        String subtitle = heading.m5649r().getSubtitle();
        String strM5657p = heading.m5649r().m5657p();
        String uri = heading.m5649r().m5658q().getUri();
        wj50.m88279p(uri);
        return new ho20(title, 8, subtitle, strM5657p, false, !wl51.m88460J0(uri) ? uri : null);
    }

    /* JADX INFO: renamed from: j */
    public static final void m77918j(vb40 vb40Var) {
        if (vb40Var.f239401c != null) {
            throw new IllegalArgumentException("request.target must be null.");
        }
        if (((gb80) zuj0.m97054q(vb40Var, zb40.f281240e)) != null) {
            throw new IllegalArgumentException("request.lifecycle must be null.");
        }
    }
}
