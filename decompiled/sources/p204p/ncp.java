package p204p;

import android.widget.FrameLayout;
import com.spotify.base.java.logging.Logger;
import com.spotify.libs.connect.events.proto.ConnectDeviceDiscoverySnapshot;
import com.spotify.player.model.ContextTrack;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
public final class ncp implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f152565a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f152566b;

    public /* synthetic */ ncp(Object obj, int i) {
        this.f152565a = i;
        this.f152566b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: b */
    public Object m64164b(fbk fbkVar) {
        hf10 hf10Var;
        di41 di41Var;
        C2169nm c2169nm = (C2169nm) this.f152566b;
        if (fbkVar instanceof hf10) {
            hf10Var = (hf10) fbkVar;
            int i = hf10Var.f90580c;
            if ((i & Integer.MIN_VALUE) != 0) {
                hf10Var.f90580c = i - Integer.MIN_VALUE;
            } else {
                hf10Var = new hf10(this, fbkVar);
            }
        } else {
            hf10Var = new hf10(this, fbkVar);
        }
        Object objM90448c = hf10Var.f90578a;
        int i2 = hf10Var.f90580c;
        if (i2 == 0) {
            bga.m29073P(objM90448c);
            xf10 xf10Var = (xf10) c2169nm.f155196b;
            nry nryVar = new nry(c2169nm, 18);
            hf10Var.f90580c = 1;
            objM90448c = xf10Var.m90448c(nryVar, hf10Var);
            yuk yukVar = yuk.f276404a;
            if (objM90448c == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM90448c);
        }
        if (((Boolean) objM90448c).booleanValue() && (di41Var = c2169nm.f155200f) != null) {
            di41Var.mo26601e(null);
        }
        return w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:146:0x025c  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) throws Throwable {
        Object objMo28649H1;
        boolean z;
        long jCurrentTimeMillis;
        Integer num;
        switch (this.f152565a) {
            case 0:
                e6r e6rVar = (e6r) obj;
                pcp pcpVar = (pcp) this.f152566b;
                Iterator it = e6rVar.f56710a.iterator();
                while (it.hasNext()) {
                    pcpVar.f176189a.m73616a((ConnectDeviceDiscoverySnapshot) it.next());
                }
                pcpVar.f176194f = e6rVar;
                return w2a1.f247311a;
            case 1:
                ContextTrack contextTrack = (ContextTrack) obj;
                wj50.m88279p(contextTrack);
                String strM38002e0 = e72.m38002e0(contextTrack);
                jvp jvpVar = (jvp) this.f152566b;
                ArrayList arrayList = jvpVar.f116440z1;
                if (arrayList == null) {
                    wj50.m88260d0("chipViewHolders");
                    throw null;
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((hxt) it2.next()).m49046g(strM38002e0);
                }
                hxt hxtVar = jvpVar.f116375A1;
                if (hxtVar == null) {
                    wj50.m88260d0("trackInfoVH");
                    throw null;
                }
                hxtVar.m49046g(new gg81(contextTrack.uri(), e72.m38000d0(contextTrack, ContextTrack.Metadata.KEY_POINTER_URI)));
                hxt hxtVar2 = jvpVar.f116376B1;
                if (hxtVar2 == null) {
                    wj50.m88260d0("artworkVH");
                    throw null;
                }
                String strM38024u = e72.m38024u(contextTrack);
                if (strM38024u == null) {
                    strM38024u = e72.m38000d0(contextTrack, "image_small_url");
                    if (strM38024u == null) {
                        strM38024u = e72.m38000d0(contextTrack, "image_url");
                    }
                    if (strM38024u == null) {
                        strM38024u = "";
                    }
                }
                hxtVar2.m49046g(new v86(strM38002e0, strM38024u));
                return w2a1.f247311a;
            case 2:
                wab wabVar = (wab) obj;
                Objects.toString(wabVar);
                ((u2q) this.f152566b).f226138j.mo46962a(wabVar);
                return w2a1.f247311a;
            case 3:
                wab wabVar2 = (wab) obj;
                Objects.toString(wabVar2);
                ((w2q) this.f152566b).f247409f.mo46962a(wabVar2);
                return w2a1.f247311a;
            case 4:
                ((Boolean) obj).booleanValue();
                Object objM88154i = whp.m88154i((whp) this.f152566b, fbkVar);
                return objM88154i == yuk.f276404a ? objM88154i : w2a1.f247311a;
            case 5:
                Set set = ((nkq) this.f152566b).f154927d;
                int iOrdinal = ((kkq) obj).ordinal();
                if (iOrdinal == 0) {
                    Iterator it3 = set.iterator();
                    while (it3.hasNext()) {
                        ((cvb0) ((er70) it3.next()).get()).mo25302c();
                    }
                } else if (iOrdinal == 1) {
                    Iterator it4 = set.iterator();
                    while (it4.hasNext()) {
                        ((cvb0) ((er70) it4.next()).get()).mo25303d();
                    }
                } else if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                return w2a1.f247311a;
            case 6:
                ((Boolean) obj).booleanValue();
                tpq tpqVar = (tpq) this.f152566b;
                Object objM89557A = x0h1.m89557A(tpqVar.f222578e, new yse(tpqVar, null, 25), fbkVar);
                return objM89557A == yuk.f276404a ? objM89557A : w2a1.f247311a;
            case 7:
                eu6 eu6Var = (eu6) this.f152566b;
                eu6Var.f62886k = (ContextTrack) obj;
                eu6Var.m40035i();
                return w2a1.f247311a;
            case 8:
                c8r c8rVar = (c8r) obj;
                c8r c8rVar2 = c8r.f35307c;
                w2a1 w2a1Var = w2a1.f247311a;
                if (c8rVar != c8rVar2) {
                    ((sg01) ((f7r) this.f152566b).f66767c.get()).m78019a(qpv0.f191387a.mo54112b(f7r.class), w2a1Var).m72724a(null, Boolean.TRUE, null);
                }
                return w2a1Var;
            case 9:
                ((mdr) this.f152566b).invoke((hdr) obj, fbkVar);
                return w2a1.f247311a;
            case 10:
                ((uer) this.f152566b).f229594h.m97090l((ifr) obj);
                return w2a1.f247311a;
            case 11:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                ((e3v) this.f152566b).invoke(bool);
                return w2a1.f247311a;
            case 12:
                ((Boolean) obj).booleanValue();
                Object objM44621a = ((cjs) this.f152566b).f38677a.m44621a(fbkVar);
                return objM44621a == yuk.f276404a ? objM44621a : w2a1.f247311a;
            case 13:
                b650 b650Var = (b650) obj;
                hxu hxuVar = (hxu) this.f152566b;
                boolean z2 = b650Var instanceof m3r0;
                yuk yukVar = yuk.f276404a;
                if (z2) {
                    Object objMo28650I1 = hxuVar.mo28650I1(fbkVar);
                    if (objMo28650I1 == yukVar) {
                        return objMo28650I1;
                    }
                } else if (b650Var instanceof n3r0) {
                    Object objMo28649H2 = hxuVar.mo28649H1(fbkVar);
                    if (objMo28649H2 == yukVar) {
                        return objMo28649H2;
                    }
                } else if ((b650Var instanceof l3r0) && (objMo28649H1 = hxuVar.mo28649H1(fbkVar)) == yukVar) {
                    return objMo28649H1;
                }
                return w2a1.f247311a;
            case 14:
                ContextTrack contextTrack2 = (ContextTrack) obj;
                hxt hxtVar3 = ((i3v) this.f152566b).f98282G1;
                if (hxtVar3 != null) {
                    hxtVar3.m49046g(new gg81(contextTrack2.uri(), e72.m38000d0(contextTrack2, ContextTrack.Metadata.KEY_POINTER_URI)));
                    return w2a1.f247311a;
                }
                wj50.m88260d0("trackInfoVH");
                throw null;
            case 15:
                vy9 vy9Var = (vy9) this.f152566b;
                if (((Boolean) obj).booleanValue()) {
                    ((dit0) vy9Var.f246020b).mo28403a();
                    Object objM85090a = ((vb11) ((l7v) vy9Var.f246024f)).m85090a(qte.f192367a, 4, 1, fbkVar);
                    if (objM85090a == yuk.f276404a) {
                        return objM85090a;
                    }
                }
                return w2a1.f247311a;
            case 16:
                Object objM87009n = w1h1.m87009n((p7v) ((i4t0) ((clb) this.f152566b).f39233d).get(), ((Boolean) obj).booleanValue(), fbkVar);
                return objM87009n == yuk.f276404a ? objM87009n : w2a1.f247311a;
            case 17:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                fdv fdvVar = (fdv) this.f152566b;
                FrameLayout frameLayout = fdvVar.f68576g;
                if (zBooleanValue) {
                    frameLayout.removeAllViews();
                    fdvVar.f68573d.m88811a(fdvVar.f68570a, true);
                } else if (frameLayout.getChildCount() == 0) {
                    frameLayout.addView(fdvVar.f68572c.f274303t);
                }
                return w2a1.f247311a;
            case 18:
                kpv kpvVar = (kpv) this.f152566b;
                Logger.m3969e(s571.m77251j("[CAL] Entity loop updated in ", kpvVar.f125130M0.mo24455a(), ", invalidating screen"), new Object[0]);
                kpvVar.m70120c();
                return w2a1.f247311a;
            case 19:
                ((u5y) this.f152566b).m70120c();
                return w2a1.f247311a;
            case 20:
                i1p0 i1p0Var = (i1p0) obj;
                xpo xpoVar = (xpo) this.f152566b;
                i1p0 i1p0Var2 = (i1p0) xpoVar.f264697g;
                if (i1p0Var2 != null && i1p0Var2.f97560a && (i1p0Var == null || !i1p0Var.f97560a)) {
                    Long l = i1p0Var != null ? new Long(i1p0Var.f97564e) : null;
                    if (l != null && l.longValue() == 0) {
                        l = null;
                    }
                    if (l != null) {
                        jCurrentTimeMillis = l.longValue();
                    } else {
                        ((wy3) ((xre) xpoVar.f264695e)).getClass();
                        jCurrentTimeMillis = System.currentTimeMillis();
                    }
                    long j = xpoVar.f264692b;
                    i1p0 i1p0Var3 = (i1p0) xpoVar.f264697g;
                    if (i1p0Var3 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    xpoVar.f264692b = (jCurrentTimeMillis - i1p0Var3.f97564e) + j;
                }
                i1p0 i1p0Var4 = (i1p0) xpoVar.f264697g;
                if (i1p0Var4 == null || !(z = i1p0Var4.f97560a)) {
                    xpoVar.f264697g = i1p0Var;
                } else if (!wj50.m88271j(Boolean.valueOf(z), i1p0Var != null ? Boolean.valueOf(i1p0Var.f97560a) : null)) {
                    xpoVar.f264697g = i1p0Var;
                }
                if (((Long) xpoVar.f264696f) == null && i1p0Var != null && i1p0Var.f97560a) {
                    xpoVar.f264696f = new Long(i1p0Var.f97564e);
                }
                return w2a1.f247311a;
            case 21:
                Object objM62066a = ((mk90) this.f152566b).m62066a(obj, fbkVar);
                return objM62066a == yuk.f276404a ? objM62066a : w2a1.f247311a;
            case 22:
                dnz dnzVar = (dnz) this.f152566b;
                dnzVar.f50902e.onNext(obj);
                long jDecrementAndGet = dnz.f50899f.decrementAndGet(dnzVar);
                w2a1 w2a1Var2 = w2a1.f247311a;
                if (jDecrementAndGet > 0) {
                    qlg1.m73220y(dnzVar.f248218c);
                    return w2a1Var2;
                }
                hqb hqbVar = new hqb(1, seg1.m77914f(fbkVar));
                hqbVar.m48222q();
                dnz.f50900g.set(dnzVar, hqbVar);
                Object objM48221p = hqbVar.m48221p();
                return objM48221p == yuk.f276404a ? objM48221p : w2a1Var2;
            case 23:
                soz sozVar = (soz) obj;
                bq6 bq6Var = ((ioz) this.f152566b).f104313b;
                int i = sozVar.f212700b;
                String str = sozVar.f212699a;
                int iM38547C = edb.m38547C(i);
                if (iM38547C == 0) {
                    bq6Var.mo30184b(new aq6(str));
                } else {
                    if (iM38547C != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bq6Var.mo30183a(new aq6(str));
                }
                return w2a1.f247311a;
            case 24:
                Object objEmit = ((koz) this.f152566b).f124931c.emit((soz) obj, fbkVar);
                return objEmit == yuk.f276404a ? objEmit : w2a1.f247311a;
            case 25:
                i200 i200Var = (i200) obj;
                k200 k200Var = (k200) this.f152566b;
                if (!wj50.m88271j(i200Var, k200Var.f118464e) && k200Var.f118462c.getResources().getConfiguration().smallestScreenWidthDp < 600) {
                    dwl0 dwl0Var = k200Var.f118461b;
                    int i2 = i200Var != null ? i200Var.f97687a : 0;
                    int i3 = i2 == 0 ? -1 : j200.f107895a[edb.m38547C(i2)];
                    if (i3 == -1) {
                        num = null;
                    } else if (i3 == 1) {
                        num = 1;
                    } else if (i3 == 2) {
                        num = 0;
                    } else if (i3 != 3) {
                        if (i3 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        num = null;
                    } else {
                        num = 14;
                    }
                    dwl0Var.f53724a.mo15686u(num != null ? num.intValue() : -1);
                }
                k200Var.f118464e = i200Var;
                return w2a1.f247311a;
            case 26:
                if (((Boolean) obj).booleanValue()) {
                    kg00 kg00Var = (kg00) this.f152566b;
                    ((bdl0) kg00Var.f122259d).m28838a(kg00Var.f122257b.f143248a);
                }
                return w2a1.f247311a;
            case 27:
                pqm0 pqm0Var = (pqm0) obj;
                Set set2 = (Set) pqm0Var.f180350a;
                Map map = (Map) pqm0Var.f180351b;
                ku00 ku00Var = (ku00) this.f152566b;
                Set set3 = set2;
                int iM31820L = c95.m31820L(i6f.m49804T(set3, 10));
                if (iM31820L < 16) {
                    iM31820L = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iM31820L);
                for (Object obj2 : set3) {
                    st00 st00Var = (st00) obj2;
                    String str2 = st00Var.f213752b;
                    if (str2 == null) {
                        str2 = st00Var.f213751a;
                    }
                    linkedHashMap.put(str2, obj2);
                }
                ku00Var.f126422f = linkedHashMap;
                ku00Var.f126423g.m97090l(map);
                return w2a1.f247311a;
            case 28:
                return m64164b(fbkVar);
            default:
                pi10 pi10Var = (pi10) obj;
                zm10 zm10Var = (zm10) this.f152566b;
                c9k c9kVar = zm10Var.f284124g;
                l480 l480Var = zm10Var.f284122e;
                if (pi10Var instanceof oi10) {
                    oi10 oi10Var = (oi10) pi10Var;
                    int iM38547C2 = edb.m38547C(oi10Var.f165640c);
                    int i4 = 1;
                    if (iM38547C2 != 0) {
                        if (iM38547C2 == 1) {
                            i4 = 2;
                        } else if (iM38547C2 == 2) {
                            i4 = 3;
                        } else {
                            if (iM38547C2 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            i4 = 4;
                        }
                    }
                    String str3 = oi10Var.f165638a;
                    tm10 tm10Var = new tm10(str3, oi10Var.f165639b, i4, oi10Var.f165641d);
                    api apiVarM39792j = erg1.m39792j(zm10Var.f284121d, str3);
                    if (apiVarM39792j != null) {
                        l480Var.m58131a(apiVarM39792j.mo26695k());
                    }
                    x0h1.m89578u(c9kVar, null, 0, new sqt(zm10Var, new p200(4, zm10Var, tm10Var), (fbk) null), 3);
                } else if (pi10Var instanceof mi10) {
                    l480Var.m58131a(null);
                    x0h1.m89578u(c9kVar, null, 0, new sqt(zm10Var, new xm10(zm10Var, 0), (fbk) null), 3);
                } else if (!(pi10Var instanceof ni10)) {
                    throw new NoWhenBranchMatchedException();
                }
                return w2a1.f247311a;
        }
    }
}
