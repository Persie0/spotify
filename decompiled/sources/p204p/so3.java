package p204p;

import android.content.Intent;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.premiummarketing.premiumdestinationpage.p130v1.CTAClickEvent;
import com.spotify.premiummarketing.premiumdestinationpage.p130v1.FlavorPageViewModel;
import com.spotify.premiummarketing.premiumdestinationpage.p130v1.OfferCardBenefitItem;
import com.spotify.premiummarketing.premiumdestinationpage.p130v1.PlanDetailViewModel;
import com.spotify.premiummarketing.premiumdestinationpage.p130v1.PremiumOfferCTA;
import com.spotify.premiummarketing.premiumdestinationpage.p130v1.PremiumOfferCard;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class so3 implements InterfaceC1810ed, Function, BiFunction, v94, vd50, gwy, Predicate, InterfaceC1698bb {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f211084a;

    public /* synthetic */ so3(int i) {
        this.f211084a = i;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:31:0x0053  */
    /* JADX WARN: Code duplicated, block: B:34:0x005b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x005d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0060  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: i */
    public static final void m78605i(so3 so3Var, float f, float f2, float f3, xq00 xq00Var, int i, int i2) {
        int i3;
        float f4;
        boolean z;
        float f5;
        pgv0 pgv0VarM91796v;
        float f6;
        xq00Var.m91775k0(1001251140);
        if ((i & 6) == 0) {
            i3 = (xq00Var.m91760d(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= xq00Var.m91760d(f2) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                f4 = f3;
                i3 |= xq00Var.m91760d(f4) ? 256 : 128;
            }
            if ((i3 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (xq00Var.m91752Y(i3 & 1, z)) {
                if (i4 != 0) {
                    f6 = 0;
                } else {
                    f6 = f4;
                }
                dha.m36004a(xtm0.m92060G(nec.m64246i(epv0.m39673I("standard_row_shimmer_box", zsf1.m96832C(mi21.m61824h(f2, mi21.m61838v(f, cxh0.f43038a)), 0.0f, f6, 0.0f, 0.0f, 13)), leu.m58815a(xq00Var).f112823a.f229875b.f123093a, hmx0.m47993b(leu.m58816b(xq00Var).f117234f.f148186b)), 0L, null, 15), xq00Var, 0);
                f5 = f6;
            } else {
                xq00Var.m91757b0();
                f5 = f4;
            }
            pgv0VarM91796v = xq00Var.m91796v();
            if (pgv0VarM91796v != null) {
                pgv0VarM91796v.f177419d = new nt6(so3Var, f, f2, f5, i, i2, 3);
            }
        }
        i3 |= 384;
        f4 = f3;
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (xq00Var.m91752Y(i3 & 1, z)) {
            if (i4 != 0) {
                f6 = 0;
            } else {
                f6 = f4;
            }
            dha.m36004a(xtm0.m92060G(nec.m64246i(epv0.m39673I("standard_row_shimmer_box", zsf1.m96832C(mi21.m61824h(f2, mi21.m61838v(f, cxh0.f43038a)), 0.0f, f6, 0.0f, 0.0f, 13)), leu.m58815a(xq00Var).f112823a.f229875b.f123093a, hmx0.m47993b(leu.m58816b(xq00Var).f117234f.f148186b)), 0L, null, 15), xq00Var, 0);
            f5 = f6;
        } else {
            xq00Var.m91757b0();
            f5 = f4;
        }
        pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new nt6(so3Var, f, f2, f5, i, i2, 3);
        }
    }

    /* JADX INFO: renamed from: j */
    public static final kcf m78606j(String str) {
        return new kcf(2, str != null ? dq60.m36606f("com.spotify.music.extra.ERROR", str) : null);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: k */
    public static final flv0 m78607k(Integer num) {
        fv31 fv31Var = bqi0.f29819c;
        if (num != null) {
            flv0 flv0Var = (flv0) bqi0.f29820d.get(Integer.valueOf(num.intValue()));
            if (flv0Var != null) {
                return flv0Var;
            }
        }
        return bqi0.f29821e;
    }

    /* JADX INFO: renamed from: l */
    public static final List m78608l(String str) {
        fv31 fv31Var = z8v0.f280576b;
        if (str == null) {
            return lau.f131415a;
        }
        List listM88477a1 = wl51.m88477a1(str, new String[]{"\n"}, 0, 6);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM88477a1) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: m */
    public static fh61 m78609m(int i, int i2) {
        return new fh61(i, i2, 0, i401.f98369R0);
    }

    /* JADX INFO: renamed from: n */
    public static fh61 m78610n() {
        return new fh61(0, 0, 2, ky51.f127669X0);
    }

    /* JADX INFO: renamed from: o */
    public static int m78611o() {
        int i;
        synchronized (sd40.f207877l) {
            i = sd40.f207876k;
            sd40.f207876k = i + 1;
        }
        return i;
    }

    @Override // p204p.v94
    /* JADX INFO: renamed from: K0 */
    public /* bridge */ /* synthetic */ void mo24956K0(Object obj) {
    }

    @Override // p204p.InterfaceC1698bb
    public boolean accept(Object obj) {
        Set set = dd41.f47702f;
        Intent intent = ((wb21) obj).f249680a;
        return r46.m74726U(intent != null ? intent.getDataString() : null).m35719q() != null;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        switch (this.f211084a) {
            case 1:
                hv31 hv31Var = (hv31) obj;
                if (hv31Var.mo48717l(tf7.f219867d, 0) != 1) {
                    lv31 lv31VarEdit = hv31Var.edit();
                    lv31VarEdit.m60053f(tf7.f219868e);
                    lv31VarEdit.m60053f(tf7.f219869f);
                    lv31VarEdit.m60053f(tf7.f219870g);
                    for (lv3 lv3Var : lv3.values()) {
                        fv31 fv31Var = tf7.f219867d;
                        lv31VarEdit.m60053f(on3.m67386e(lv3Var));
                        lv31VarEdit.m60053f(on3.m67387f(lv3Var));
                        lv31VarEdit.m60053f(on3.m67388h(lv3Var));
                    }
                    lv31VarEdit.m60049b(tf7.f219867d, 1);
                    lv31VarEdit.m60054g();
                }
                return hv31Var;
            default:
                return frq.f72648h.get(obj);
        }
    }

    @Override // p204p.InterfaceC1810ed
    /* JADX INFO: renamed from: b */
    public boolean mo38504b(nbb nbbVar) {
        return true;
    }

    @Override // p204p.gwy
    /* JADX INFO: renamed from: c */
    public String mo36684c() {
        return null;
    }

    @Override // p204p.vd50
    public Object convert(int i) {
        klw klwVar;
        if (i == 0) {
            klwVar = klw.ENCRYPTION_SCHEME_UNKNOWN;
        } else if (i != 1) {
            klwVar = i != 2 ? null : klw.ENCRYPTION_SCHEME_CTR;
        } else {
            klwVar = klw.ENCRYPTION_SCHEME_CBCS;
        }
        return klwVar == null ? klw.UNRECOGNIZED : klwVar;
    }

    @Override // p204p.gwy
    /* JADX INFO: renamed from: d */
    public byte[] mo36685d() {
        return null;
    }

    /* JADX INFO: renamed from: g */
    public void m78612g(p6a0 p6a0Var, boolean z, gh00 gh00Var, el8 el8Var, vh00 vh00Var, vh00 vh00Var2, vh00 vh00Var3, vh00 vh00Var4, vh00 vh00Var5, vh00 vh00Var6, vh00 vh00Var7, vh00 vh00Var8, vh00 vh00Var9, vh00 vh00Var10, vh00 vh00Var11, xq00 xq00Var, int i) {
        int i2;
        boolean z2;
        el8 el8Var2;
        vh00 vh00Var12;
        xq00Var.m91775k0(1591054137);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91766g(p6a0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            z2 = z;
            i2 |= xq00Var.m91768h(z2) ? 32 : 16;
        } else {
            z2 = z;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91770i(gh00Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            el8Var2 = el8Var;
            i2 |= xq00Var.m91770i(el8Var2) ? 2048 : 1024;
        } else {
            el8Var2 = el8Var;
        }
        if ((i & 24576) == 0) {
            vh00Var12 = vh00Var;
            i2 |= xq00Var.m91770i(vh00Var12) ? 16384 : 8192;
        } else {
            vh00Var12 = vh00Var;
        }
        if ((i & 196608) == 0) {
            i2 |= xq00Var.m91770i(vh00Var2) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i2 |= xq00Var.m91770i(vh00Var3) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= xq00Var.m91770i(vh00Var4) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= xq00Var.m91770i(vh00Var5) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= xq00Var.m91770i(vh00Var6) ? 536870912 : 268435456;
        }
        int i3 = i2;
        if (xq00Var.m91752Y(i3 & 1, ((i3 & 306783379) == 306783378 && (((((((xq00Var.m91770i(vh00Var7) ? (char) 4 : (char) 2) | (xq00Var.m91770i(vh00Var8) ? ' ' : (char) 16)) | (xq00Var.m91770i(vh00Var9) ? 256 : 128)) | (xq00Var.m91770i(vh00Var10) ? 2048 : 1024)) | (xq00Var.m91770i(vh00Var11) ? (char) 16384 : (char) 8192)) | (xq00Var.m91766g(this) ? (char) 0 : (char) 0)) & 74899) == 74898) ? false : true)) {
            rkk.m75772x(1905866999, new xx9(z2, p6a0Var, el8Var2, vh00Var5, this, vh00Var6, vh00Var3, vh00Var7, vh00Var12, vh00Var4, vh00Var8, vh00Var10, vh00Var11, vh00Var9, vh00Var2), xq00Var).mo24510D0(gh00Var, xq00Var, Integer.valueOf(((i3 >> 6) & 14) | 48));
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new um41(this, p6a0Var, z, gh00Var, el8Var, vh00Var, vh00Var2, vh00Var3, vh00Var4, vh00Var5, vh00Var6, vh00Var7, vh00Var8, vh00Var9, vh00Var10, vh00Var11, i);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m78613h(int i, xq00 xq00Var) {
        xq00Var.m91775k0(1030791524);
        int i2 = (xq00Var.m91766g(this) ? 4 : 2) | i;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 3) != 2)) {
            float f = leu.m58816b(xq00Var).f117230b.f224759b;
            boolean zM91760d = xq00Var.m91760d(f);
            Object objM91750T = xq00Var.m91750T();
            if (zM91760d || objM91750T == t6x0.f217647t) {
                objM91750T = new kyu(1, null, 3, null, zsf1.m96848h(f, 0.0f, 2), null, null, 0, null, 490);
                xq00Var.m91793t0(objM91750T);
            }
            p711.m69222a(epv0.m39673I("standard_row_loader", mi21.m61822f(1.0f, cxh0.f43038a)), (kyu) objM91750T, null, false, null, null, null, null, null, rkk.m75772x(-1788087461, new wm41(this, 0), xq00Var), null, rkk.m75772x(1379273372, new wm41(this, 1), xq00Var), null, null, null, rkk.m75772x(-1618508384, new wm41(this, 2), xq00Var), xq00Var, 805306438, 196656, 30204);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new zm31(this, i, 10);
        }
    }

    /* JADX INFO: renamed from: p */
    public synchronized rb5 m78614p() {
        rb5 rb5Var;
        try {
            if (rb5.f197463Z == null) {
                rb5.f197463Z = new rb5(5, aba0.m25342a(p8y.m69343a()), new C2011jd(1));
            }
            rb5Var = rb5.f197463Z;
            if (rb5Var == null) {
                wj50.m88260d0("instance");
                throw null;
            }
        } catch (Throwable th) {
            throw th;
        }
        return rb5Var;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0063  */
    /* JADX INFO: renamed from: q */
    public smq0 m78615q(String str, int i, PremiumOfferCard premiumOfferCard) {
        ae50 ae50VarM19704B = premiumOfferCard.m19704B();
        ArrayList arrayList = new ArrayList(i6f.m49804T(ae50VarM19704B, 10));
        Iterator<E> it = ae50VarM19704B.iterator();
        while (true) {
            int i2 = 2;
            if (!it.hasNext()) {
                break;
            }
            OfferCardBenefitItem offerCardBenefitItem = (OfferCardBenefitItem) it.next();
            String strM19588s = offerCardBenefitItem.m19588s();
            String strM19586q = offerCardBenefitItem.m19586q();
            String strM19589t = offerCardBenefitItem.m19589t();
            String strM19587r = offerCardBenefitItem.m19587r();
            if (strM19587r == null) {
                i2 = 0;
            } else {
                int iHashCode = strM19587r.hashCode();
                if (iHashCode != -1808450477) {
                    if (iHashCode == 0) {
                        strM19587r.equals("");
                    } else if (iHashCode == 104264043 && strM19587r.equals("muted")) {
                    }
                    i2 = 0;
                } else if (strM19587r.equals("highlighted")) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
            }
            arrayList.add(new etk0(strM19588s, strM19586q, i2, strM19589t));
        }
        return new smq0(premiumOfferCard.m19710I() == ftk0.V3 ? 3 : 2, premiumOfferCard.m19703A(), premiumOfferCard.m19716O(), premiumOfferCard.m19713L(), premiumOfferCard.m19711J(), premiumOfferCard.m19712K(), premiumOfferCard.m19707F(), premiumOfferCard.m19708G(), arrayList, premiumOfferCard.m19706E(), premiumOfferCard.m19705C(), premiumOfferCard.m19705C(), premiumOfferCard.m19717P() ? m78616r(str, i, premiumOfferCard.m19714M()) : null, premiumOfferCard.m19718Q() ? m78616r(str, i, premiumOfferCard.m19715N()) : null, iw3.m51784j(str, i, premiumOfferCard.m19709H()));
    }

    /* JADX INFO: renamed from: r */
    public omq0 m78616r(String str, int i, PremiumOfferCTA premiumOfferCTA) {
        ogz ogzVar;
        String title = premiumOfferCTA.getTitle();
        CTAClickEvent cTAClickEventM19683r = premiumOfferCTA.m19683r();
        m1b m1bVar = new m1b(cTAClickEventM19683r.getName(), cTAClickEventM19683r.getUri(), cTAClickEventM19683r.m19543q());
        boolean zM19686v = premiumOfferCTA.m19686v();
        if (premiumOfferCTA.m19687w()) {
            FlavorPageViewModel flavorPageViewModelM19684t = premiumOfferCTA.m19684t();
            ae50 ae50VarM19556y = flavorPageViewModelM19684t.m19556y();
            ArrayList arrayList = new ArrayList(i6f.m49804T(ae50VarM19556y, 10));
            int i2 = 0;
            for (Object obj : ae50VarM19556y) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    h6f.m46722S();
                    throw null;
                }
                PlanDetailViewModel planDetailViewModel = (PlanDetailViewModel) obj;
                String strM19619v = planDetailViewModel.m19619v();
                String strM19616s = planDetailViewModel.m19616s();
                String strM19620w = planDetailViewModel.m19620w();
                String strM19621x = planDetailViewModel.m19621x();
                if (wl51.m88460J0(strM19621x)) {
                    strM19621x = planDetailViewModel.m19617t();
                }
                arrayList.add(new e8o0(i2, strM19619v, strM19616s, strM19620w, strM19621x, planDetailViewModel.m19618u()));
                i2 = i3;
            }
            ogzVar = new ogz(flavorPageViewModelM19684t.getPlanName(), flavorPageViewModelM19684t.m19552t(), flavorPageViewModelM19684t.m19557z(), flavorPageViewModelM19684t.m19554w(), flavorPageViewModelM19684t.m19555x(), arrayList, flavorPageViewModelM19684t.m19553u());
        } else {
            ogzVar = null;
        }
        return new omq0(title, m1bVar, zM19686v, ogzVar, iw3.m51784j(str, i, premiumOfferCTA.m19685u()));
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        PlayerState playerState = (PlayerState) obj;
        ContextTrack contextTrack = (ContextTrack) playerState.track().mo49283h();
        if (!playerState.isPlaying() || contextTrack == null || !e72.m37986T(contextTrack)) {
            return false;
        }
        String str = (String) contextTrack.metadata().get(ContextTrack.Metadata.KEY_MEDIA_EXTERNAL_URL);
        if (str == null) {
            str = "";
        }
        return !wl51.m88460J0(str) && playerState.playbackId().mo49279c();
    }

    public /* synthetic */ so3(Object obj, int i) {
        this.f211084a = i;
    }

    public /* synthetic */ so3(boolean z) {
        this.f211084a = 12;
    }

    public so3(sp5 sp5Var, gg5 gg5Var) {
        this.f211084a = 8;
    }

    public so3(uc5 uc5Var, h15 h15Var, iw3 iw3Var) {
        this.f211084a = 19;
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        switch (this.f211084a) {
            case 2:
                j2a j2aVar = (j2a) obj2;
                return (!(j2aVar instanceof i2a) || ((Set) obj).contains("social_radar")) ? j2aVar : h2a.f86935a;
            default:
                return (List) obj;
        }
    }

    @Override // p204p.gwy
    /* JADX INFO: renamed from: a */
    public void mo36682a() {
    }

    @Override // p204p.gwy
    /* JADX INFO: renamed from: e */
    public void mo36686e() {
    }

    @Override // p204p.gwy
    /* JADX INFO: renamed from: f */
    public void mo36687f(long j, String str) {
    }
}
