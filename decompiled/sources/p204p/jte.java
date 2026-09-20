package p204p;

import android.content.Context;
import android.view.ViewGroup;
import com.comscore.streaming.ContentType;
import com.spotify.music.R;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class jte extends qe70 implements xh00 {

    /* JADX INFO: renamed from: L0 */
    public static final jte f115821L0;

    /* JADX INFO: renamed from: M0 */
    public static final jte f115822M0;

    /* JADX INFO: renamed from: N0 */
    public static final jte f115823N0;

    /* JADX INFO: renamed from: O0 */
    public static final jte f115824O0;

    /* JADX INFO: renamed from: P0 */
    public static final jte f115825P0;

    /* JADX INFO: renamed from: Q0 */
    public static final jte f115826Q0;

    /* JADX INFO: renamed from: R0 */
    public static final jte f115827R0;

    /* JADX INFO: renamed from: S0 */
    public static final jte f115828S0;

    /* JADX INFO: renamed from: T0 */
    public static final jte f115829T0;

    /* JADX INFO: renamed from: U0 */
    public static final jte f115830U0;

    /* JADX INFO: renamed from: V0 */
    public static final jte f115831V0;

    /* JADX INFO: renamed from: W0 */
    public static final jte f115832W0;

    /* JADX INFO: renamed from: X */
    public static final jte f115833X;

    /* JADX INFO: renamed from: X0 */
    public static final jte f115834X0;

    /* JADX INFO: renamed from: Y */
    public static final jte f115835Y;

    /* JADX INFO: renamed from: Y0 */
    public static final jte f115836Y0;

    /* JADX INFO: renamed from: Z */
    public static final jte f115837Z;

    /* JADX INFO: renamed from: Z0 */
    public static final jte f115838Z0;

    /* JADX INFO: renamed from: a1 */
    public static final jte f115839a1;

    /* JADX INFO: renamed from: b */
    public static final jte f115840b;

    /* JADX INFO: renamed from: b1 */
    public static final jte f115841b1;

    /* JADX INFO: renamed from: c */
    public static final jte f115842c;

    /* JADX INFO: renamed from: c1 */
    public static final jte f115843c1;

    /* JADX INFO: renamed from: d */
    public static final jte f115844d;

    /* JADX INFO: renamed from: e */
    public static final jte f115845e;

    /* JADX INFO: renamed from: f */
    public static final jte f115846f;

    /* JADX INFO: renamed from: g */
    public static final jte f115847g;

    /* JADX INFO: renamed from: h */
    public static final jte f115848h;

    /* JADX INFO: renamed from: i */
    public static final jte f115849i;

    /* JADX INFO: renamed from: t */
    public static final jte f115850t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f115851a;

    static {
        int i = 4;
        f115840b = new jte(i, 0);
        f115842c = new jte(i, 1);
        f115844d = new jte(i, 2);
        f115845e = new jte(i, 3);
        f115846f = new jte(i, 4);
        f115847g = new jte(i, 5);
        f115848h = new jte(i, 6);
        f115849i = new jte(i, 7);
        f115850t = new jte(i, 8);
        f115833X = new jte(i, 9);
        f115835Y = new jte(i, 10);
        f115837Z = new jte(i, 11);
        f115821L0 = new jte(i, 12);
        f115822M0 = new jte(i, 13);
        f115823N0 = new jte(i, 14);
        f115824O0 = new jte(i, 15);
        f115825P0 = new jte(i, 16);
        f115826Q0 = new jte(i, 17);
        f115827R0 = new jte(i, 18);
        f115828S0 = new jte(i, 19);
        f115829T0 = new jte(i, 20);
        f115830U0 = new jte(i, 21);
        f115831V0 = new jte(i, 22);
        f115832W0 = new jte(i, 23);
        f115834X0 = new jte(i, 24);
        f115836Y0 = new jte(i, 25);
        f115838Z0 = new jte(i, 26);
        f115839a1 = new jte(i, 27);
        f115841b1 = new jte(i, 28);
        f115843c1 = new jte(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jte(int i, int i2) {
        super(i);
        this.f115851a = i2;
    }

    @Override // p204p.xh00
    /* JADX INFO: renamed from: M */
    public final Object mo24818M(Object obj, Object obj2, Object obj3, Object obj4) {
        String string;
        av91 av91Var;
        av91 av91Var2;
        int i;
        int i2;
        boolean z;
        int i3;
        int i4;
        boolean z2;
        int i5 = this.f115851a;
        int i6 = 13;
        nau nauVar = nau.f152117a;
        w2a1 w2a1Var = w2a1.f247311a;
        switch (i5) {
            case 0:
                ((Number) obj3).intValue();
                return new j4h0((st91) obj4);
            case 1:
                j4h0 j4h0Var = (j4h0) obj;
                if (kte.f126251a[((gte) obj4).ordinal()] == 1) {
                    return new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nauVar), j4h0Var.f108702b, j4h0Var.f108701a, System.currentTimeMillis());
                }
                throw new NoWhenBranchMatchedException();
            case 2:
                return new C1778dh(7, (Context) obj2, (ViewGroup) obj3, (gh00) obj4);
            case 3:
                rgh0 rgh0Var = (rgh0) obj;
                dye dyeVar = (dye) obj4;
                if (!(dyeVar instanceof dye)) {
                    throw new NoWhenBranchMatchedException();
                }
                String strM38566o = edb.m38566o("spotify:artist:", (String) g6f.m43687A0(wl51.m88477a1(dyeVar.f54307a, new String[]{":"}, 0, 6)), ":dna:blend:", (String) g6f.m43687A0(wl51.m88477a1(dyeVar.f54308b, new String[]{":"}, 0, 6)));
                dv91 dv91Var = new dv91("hit", 1);
                string = strM38566o != null ? strM38566o.toString() : null;
                return new av91("", "", dv91Var, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string != null ? string : "")), rgh0Var.f198960a, st91.f213865b, System.currentTimeMillis());
            case 4:
                neh0 neh0Var = (neh0) obj;
                bze bzeVar = (bze) obj4;
                if (!(bzeVar instanceof bze)) {
                    throw new NoWhenBranchMatchedException();
                }
                pqm0 pqm0Var = bzeVar.f32479a ? new pqm0(peh0.PLAYLIST_COLLABORATORS_OFF, oeh0.PLAYLIST_COLLABORATORS_ON) : new pqm0(peh0.PLAYLIST_COLLABORATORS_ON, oeh0.PLAYLIST_COLLABORATORS_OFF);
                return new av91("", "", new dv91("hit", 1), new bv91("toggle_state", 1, kkc0.m56695h0(new pqm0("state_before_toggle", ((peh0) pqm0Var.f180350a).f176757a), new pqm0("state_after_toggle", ((oeh0) pqm0Var.f180351b).f164444a))), neh0Var.f152990a, neh0Var.f152991b.f240134b, System.currentTimeMillis());
            case 5:
                ((Number) obj3).intValue();
                return new i0h0((st91) obj4);
            case 6:
                i0h0 i0h0Var = (i0h0) obj;
                return new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nauVar), i0h0Var.f97244b, i0h0Var.f97243a, System.currentTimeMillis());
            case 7:
                a5f a5fVar = (a5f) obj;
                ((Number) obj3).intValue();
                st91 st91Var = (st91) obj4;
                String str = a5fVar.f12505f;
                String str2 = a5fVar.f12506g;
                if (wl51.m88460J0(str2)) {
                    str2 = str;
                }
                return new jbh0(str2, str, a5fVar.f12500a, st91Var);
            case 8:
                jbh0 jbh0Var = (jbh0) obj;
                a5f a5fVar2 = (a5f) obj2;
                b5f b5fVar = (b5f) obj3;
                y4f y4fVar = (y4f) obj4;
                zt91 zt91Var = jbh0Var.f110801b;
                if (y4fVar instanceof u4f) {
                    return jbh0Var.m52908a(a5fVar2.f12500a);
                }
                if (!(y4fVar instanceof w4f)) {
                    if ((y4fVar instanceof v4f) || (y4fVar instanceof x4f)) {
                        return null;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                if (b5fVar.f23571c) {
                    yt91 yt91VarM96903c = zt91Var.m96903c();
                    yt91VarM96903c.f276055i.add(new bu91("show_less_button", null, null, null, null));
                    yt91VarM96903c.f276056j = false;
                    av91Var = new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nauVar), yt91VarM96903c.m94607a(), jbh0Var.f110800a, System.currentTimeMillis());
                } else {
                    yt91 yt91VarM96903c2 = zt91Var.m96903c();
                    yt91VarM96903c2.f276055i.add(new bu91("show_all_button", null, null, null, null));
                    yt91VarM96903c2.f276056j = false;
                    av91Var = new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nauVar), yt91VarM96903c2.m94607a(), jbh0Var.f110800a, System.currentTimeMillis());
                }
                return av91Var;
            case 9:
                ((Number) obj3).intValue();
                return new tng0((st91) obj4);
            case 10:
                rfg0 rfg0Var = (rfg0) obj;
                idf idfVar = (idf) obj3;
                hdf hdfVar = (hdf) obj4;
                zt91 zt91Var2 = rfg0Var.f198647b;
                if (hdfVar instanceof ycf) {
                    return new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nauVar), rfg0Var.f198647b, rfg0Var.f198646a, System.currentTimeMillis());
                }
                if (hdfVar instanceof adf) {
                    yt91 yt91VarM96903c3 = zt91Var2.m96903c();
                    yt91VarM96903c3.f276055i.add(new bu91("comment_input_field", null, null, null, null));
                    yt91VarM96903c3.f276056j = false;
                    av91Var2 = new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nauVar), yt91VarM96903c3.m94607a(), rfg0Var.f198646a, System.currentTimeMillis());
                } else if (hdfVar instanceof zcf) {
                    String str3 = ((zcf) hdfVar).f281502a;
                    yt91 yt91VarM96903c4 = zt91Var2.m96903c();
                    yt91VarM96903c4.f276055i.add(new bu91("comment_row", "unpinned", null, str3, null));
                    yt91VarM96903c4.f276056j = false;
                    yt91 yt91VarM96903c5 = yt91VarM96903c4.m94607a().m96903c();
                    yt91VarM96903c5.f276055i.add(new bu91("context_menu_button", null, null, null, null));
                    yt91VarM96903c5.f276056j = false;
                    av91Var2 = new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nauVar), yt91VarM96903c5.m94607a(), rfg0Var.f198646a, System.currentTimeMillis());
                } else if (hdfVar instanceof ddf) {
                    yt91 yt91VarM96903c6 = zt91Var2.m96903c();
                    yt91VarM96903c6.f276055i.add(new bu91("sensitive_comments_disclaimer", null, null, null, null));
                    yt91VarM96903c6.f276056j = true;
                    av91Var2 = new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nauVar), yt91VarM96903c6.m94607a(), rfg0Var.f198646a, System.currentTimeMillis());
                } else if (hdfVar instanceof bdf) {
                    String str4 = ((bdf) hdfVar).f26090a;
                    yt91 yt91VarM96903c7 = zt91Var2.m96903c();
                    yt91VarM96903c7.f276055i.add(new bu91("comment_row", "unpinned", null, str4, null));
                    yt91VarM96903c7.f276056j = false;
                    yt91 yt91VarM96903c8 = yt91VarM96903c7.m94607a().m96903c();
                    yt91VarM96903c8.f276055i.add(new bu91("reply_button", null, null, null, null));
                    yt91VarM96903c8.f276056j = false;
                    av91Var2 = new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nauVar), yt91VarM96903c8.m94607a(), rfg0Var.f198646a, System.currentTimeMillis());
                } else if (hdfVar instanceof cdf) {
                    String str5 = ((cdf) hdfVar).f36881a;
                    yt91 yt91VarM96903c9 = zt91Var2.m96903c();
                    yt91VarM96903c9.f276055i.add(new bu91("comment_row", "unpinned", null, str5, null));
                    yt91VarM96903c9.f276056j = false;
                    yt91 yt91VarM96903c10 = yt91VarM96903c9.m94607a().m96903c();
                    yt91VarM96903c10.f276055i.add(new bu91("reply_preview", null, null, null, null));
                    yt91VarM96903c10.f276056j = false;
                    av91Var2 = new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nauVar), yt91VarM96903c10.m94607a(), rfg0Var.f198646a, System.currentTimeMillis());
                } else {
                    if (!(hdfVar instanceof fdf)) {
                        if (hdfVar.equals(edf.f58510a) || (hdfVar instanceof gdf)) {
                            return null;
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    fdf fdfVar = (fdf) hdfVar;
                    String str6 = fdfVar.f68493a;
                    yt91 yt91VarM96903c11 = zt91Var2.m96903c();
                    yt91VarM96903c11.f276055i.add(new bu91("comment_row", "unpinned", null, str6, null));
                    yt91VarM96903c11.f276056j = false;
                    zt91 zt91VarM94607a = yt91VarM96903c11.m94607a();
                    String str7 = fdfVar.f68495c + ":" + fdfVar.f68496d;
                    yt91 yt91VarM96903c12 = zt91VarM94607a.m96903c();
                    yt91VarM96903c12.f276055i.add(new bu91("timestamp", null, null, null, str7));
                    yt91VarM96903c12.f276056j = true;
                    zt91 zt91VarM94607a2 = yt91VarM96903c12.m94607a();
                    String str8 = idfVar.f101090a;
                    dv91 dv91Var2 = new dv91("hit", 1);
                    string = str8 != null ? str8.toString() : null;
                    av91Var2 = new av91("", "", dv91Var2, new bv91("play", 1, Collections.singletonMap("item_to_be_played", string != null ? string : "")), zt91VarM94607a2, rfg0Var.f198646a, System.currentTimeMillis());
                }
                return av91Var2;
            case 11:
                ((Number) obj3).intValue();
                return new ufg0(((kmf) obj2).f124131a);
            case 12:
                ((Number) obj3).intValue();
                return new ufg0(((okf) obj2).f166325b);
            case 13:
                ((Number) obj3).intValue();
                return new ecg0((st91) obj4);
            case 14:
                ecg0 ecg0Var = (ecg0) obj;
                yt91 yt91VarM96903c13 = ecg0Var.f58323b.m96903c();
                yt91VarM96903c13.f276055i.add(new bu91("companion_content_items", null, null, null, null));
                yt91VarM96903c13.f276056j = false;
                yt91 yt91VarM96903c14 = yt91VarM96903c13.m94607a().m96903c();
                yt91VarM96903c14.f276055i.add(new bu91("image_item", null, null, null, null));
                yt91VarM96903c14.f276056j = false;
                return new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nauVar), yt91VarM96903c14.m94607a(), ecg0Var.f58322a, System.currentTimeMillis());
            case 15:
                yt91 yt91VarM96903c15 = ((geg0) obj).f79118a.m96903c();
                yt91VarM96903c15.f276055i.add(new bu91("compliance_disclaimer", null, null, null, null));
                yt91VarM96903c15.f276056j = false;
                yt91VarM96903c15.m94607a();
                String str9 = ((avf) obj4).f20180a;
                new dv91("hit", 1);
                String string2 = str9 != null ? str9.toString() : null;
                new bv91("navigate_to_external_uri", 1, Collections.singletonMap("destination", string2 != null ? string2 : ""));
                st91 st91Var2 = st91.f213865b;
                System.currentTimeMillis();
                return null;
            case 16:
                pqm0 pqm0Var2 = (pqm0) obj2;
                ((Number) obj4).intValue();
                xqg1.m91854c((qf40) pqm0Var2.f180350a, (b80) pqm0Var2.f180351b, null, (xq00) obj3, 0, 4);
                return w2a1Var;
            case 17:
                t91 t91Var = (t91) obj;
                int iIntValue = ((Number) obj4).intValue();
                wj50.m88279p(t91Var);
                dvg1.m37099a(t91Var, (gh00) obj2, null, (xq00) obj3, iIntValue & ContentType.LONG_FORM_ON_DEMAND);
                return w2a1Var;
            case 18:
                by2 by2Var = (by2) obj;
                gh00 gh00Var = (gh00) obj2;
                xq00 xq00Var = (xq00) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i = iIntValue2 | (xq00Var.m91766g(by2Var) ? 4 : 2);
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= xq00Var.m91770i(gh00Var) ? 32 : 16;
                }
                if (xq00Var.m91752Y(i & 1, (i & 147) != 146)) {
                    tg1.m80711a(by2Var, zsf1.m96832C(cxh0.f43038a, 0.0f, leu.m58816b(xq00Var).f117230b.f224763f, 0.0f, leu.m58816b(xq00Var).f117230b.f224763f, 5), gh00Var, xq00Var, ((i << 3) & 896) | (i & 14));
                } else {
                    xq00Var.m91757b0();
                }
                return w2a1Var;
            case 19:
                hn3 hn3Var = (hn3) obj;
                gh00 gh00Var2 = (gh00) obj2;
                xq00 xq00Var2 = (xq00) obj3;
                int iIntValue3 = ((Number) obj4).intValue();
                ia7 ia7Var = t6x0.f217647t;
                if ((iIntValue3 & 6) == 0) {
                    i2 = iIntValue3 | (xq00Var2.m91766g(hn3Var) ? 4 : 2);
                } else {
                    i2 = iIntValue3;
                }
                if ((iIntValue3 & 48) == 0) {
                    i2 |= xq00Var2.m91770i(gh00Var2) ? 32 : 16;
                }
                if (xq00Var2.m91752Y(i2 & 1, (i2 & 147) != 146)) {
                    int i7 = i2 & ContentType.LONG_FORM_ON_DEMAND;
                    boolean z3 = i7 == 32;
                    Object objM91750T = xq00Var2.m91750T();
                    if (z3 || objM91750T == ia7Var) {
                        objM91750T = new lzf(15, gh00Var2);
                        xq00Var2.m91793t0(objM91750T);
                    }
                    eh00 eh00Var = (eh00) objM91750T;
                    z = i7 == 32;
                    Object objM91750T2 = xq00Var2.m91750T();
                    if (z || objM91750T2 == ia7Var) {
                        objM91750T2 = new lzf(16, gh00Var2);
                        xq00Var2.m91793t0(objM91750T2);
                    }
                    nec.m64238a(hn3Var, eh00Var, (eh00) objM91750T2, xq00Var2, i2 & 14);
                } else {
                    xq00Var2.m91757b0();
                }
                return w2a1Var;
            case 20:
                ((Boolean) obj2).booleanValue();
                xq00 xq00Var3 = (xq00) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if (!xq00Var3.m91752Y(iIntValue4 & 1, (iIntValue4 & 129) != 128)) {
                    xq00Var3.m91757b0();
                }
                return w2a1Var;
            case 21:
                u2e u2eVar = (u2e) obj;
                gh00 gh00Var3 = (gh00) obj2;
                xq00 xq00Var4 = (xq00) obj3;
                int iIntValue5 = ((Number) obj4).intValue();
                if ((iIntValue5 & 6) == 0) {
                    i3 = iIntValue5 | (xq00Var4.m91766g(u2eVar) ? 4 : 2);
                } else {
                    i3 = iIntValue5;
                }
                if ((iIntValue5 & 48) == 0) {
                    i3 |= xq00Var4.m91770i(gh00Var3) ? 32 : 16;
                }
                if (xq00Var4.m91752Y(i3 & 1, (i3 & 147) != 146)) {
                    vig1.m85649d(null, null, null, null, rkk.m75772x(-339129365, new eib(i6, (Object) u2eVar, gh00Var3), xq00Var4), xq00Var4, 24576, 15);
                } else {
                    xq00Var4.m91757b0();
                }
                return w2a1Var;
            case 22:
                pvf1.m71153i((((Number) obj4).intValue() >> 3) & 14, (String) obj2, (xq00) obj3, null);
                return w2a1Var;
            case 23:
                d0f d0fVar = (d0f) obj;
                gh00 gh00Var4 = (gh00) obj2;
                xq00 xq00Var5 = (xq00) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                ia7 ia7Var2 = t6x0.f217647t;
                if ((iIntValue6 & 6) == 0) {
                    i4 = iIntValue6 | ((iIntValue6 & 8) == 0 ? xq00Var5.m91766g(d0fVar) : xq00Var5.m91770i(d0fVar) ? 4 : 2);
                } else {
                    i4 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i4 |= xq00Var5.m91770i(gh00Var4) ? 32 : 16;
                }
                if (!xq00Var5.m91752Y(i4 & 1, (i4 & 147) != 146)) {
                    xq00Var5.m91757b0();
                } else if (d0fVar instanceof zze) {
                    xq00Var5.m91771i0(-1068915873);
                    zze zzeVar = (zze) d0fVar;
                    z2 = (i4 & ContentType.LONG_FORM_ON_DEMAND) == 32;
                    Object objM91750T3 = xq00Var5.m91750T();
                    if (z2 || objM91750T3 == ia7Var2) {
                        objM91750T3 = new d4g(29, gh00Var4);
                        xq00Var5.m91793t0(objM91750T3);
                    }
                    kpg1.m57028a(zzeVar, (eh00) objM91750T3, null, xq00Var5, i4 & 14);
                    xq00Var5.m91788r(false);
                } else if (d0fVar instanceof b0f) {
                    xq00Var5.m91771i0(-1068911748);
                    b0f b0fVar = (b0f) d0fVar;
                    z2 = (i4 & ContentType.LONG_FORM_ON_DEMAND) == 32;
                    Object objM91750T4 = xq00Var5.m91750T();
                    if (z2 || objM91750T4 == ia7Var2) {
                        objM91750T4 = new j7g(0, gh00Var4);
                        xq00Var5.m91793t0(objM91750T4);
                    }
                    k0y0.m55026j(b0fVar, (eh00) objM91750T4, null, xq00Var5, i4 & 14);
                    xq00Var5.m91788r(false);
                } else {
                    if (!(d0fVar instanceof c0f)) {
                        throw lq51.m59703i(-1068917792, xq00Var5, false);
                    }
                    xq00Var5.m91771i0(-1068907386);
                    c0f c0fVar = (c0f) d0fVar;
                    boolean z4 = (i4 & ContentType.LONG_FORM_ON_DEMAND) == 32;
                    Object objM91750T5 = xq00Var5.m91750T();
                    if (z4 || objM91750T5 == ia7Var2) {
                        objM91750T5 = new j7g(1, gh00Var4);
                        xq00Var5.m91793t0(objM91750T5);
                    }
                    hv90.m48740g(c0fVar, (eh00) objM91750T5, null, xq00Var5, i4 & 14);
                    xq00Var5.m91788r(false);
                }
                return w2a1Var;
            case 24:
                ((Number) obj4).intValue();
                return w2a1Var;
            case 25:
                gh00 gh00Var5 = (gh00) obj2;
                xq00 xq00Var6 = (xq00) obj3;
                int iIntValue7 = ((Number) obj4).intValue();
                ia7 ia7Var3 = t6x0.f217647t;
                n4j n4jVarM76561v = rwg1.m76561v((s3j) obj);
                int i8 = (iIntValue7 & ContentType.LONG_FORM_ON_DEMAND) ^ 48;
                boolean z5 = (i8 > 32 && xq00Var6.m91766g(gh00Var5)) || (iIntValue7 & 48) == 32;
                Object objM91750T6 = xq00Var6.m91750T();
                if (z5 || objM91750T6 == ia7Var3) {
                    objM91750T6 = new rsf(12, gh00Var5);
                    xq00Var6.m91793t0(objM91750T6);
                }
                gh00 gh00Var6 = (gh00) objM91750T6;
                boolean z6 = (i8 > 32 && xq00Var6.m91766g(gh00Var5)) || (iIntValue7 & 48) == 32;
                Object objM91750T7 = xq00Var6.m91750T();
                if (z6 || objM91750T7 == ia7Var3) {
                    objM91750T7 = new rsf(i6, gh00Var5);
                    xq00Var6.m91793t0(objM91750T7);
                }
                gh00 gh00Var7 = (gh00) objM91750T7;
                z = (i8 > 32 && xq00Var6.m91766g(gh00Var5)) || (iIntValue7 & 48) == 32;
                Object objM91750T8 = xq00Var6.m91750T();
                if (z || objM91750T8 == ia7Var3) {
                    objM91750T8 = new C1902gm(25, gh00Var5);
                    xq00Var6.m91793t0(objM91750T8);
                }
                mwg1.m63022b(n4jVarM76561v, gh00Var6, gh00Var7, (th00) objM91750T8, null, xq00Var6, 0);
                return w2a1Var;
            case 26:
                zzg1.m97317p((ry8) obj, obj2, (xq00) obj3, ((Number) obj4).intValue() & 126);
                return w2a1Var;
            case 27:
                zzg1.m97318q((qy8) obj, obj2, (xq00) obj3, ((Number) obj4).intValue() & 126);
                return w2a1Var;
            case 28:
                ((Number) obj2).intValue();
                xq00 xq00Var7 = (xq00) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                if (xq00Var7.m91752Y(iIntValue8 & 1, (iIntValue8 & 129) != 128)) {
                    pye.m71612b(0, xq00Var7);
                } else {
                    xq00Var7.m91757b0();
                }
                return w2a1Var;
            default:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                xq00 xq00Var8 = (xq00) obj3;
                ((Number) obj4).intValue();
                if (zBooleanValue) {
                    xq00Var8.m91771i0(-1791618015);
                    y85.m93057b(lsu.f136611c, new rgj(k0e1.m54977L(R.string.media_trimmer_preview_button_pause_content_description, xq00Var8)), null, 0L, 0L, false, xq00Var8, lsu.f136612d, 60);
                    xq00Var8.m91788r(false);
                } else {
                    xq00Var8.m91771i0(-1791330397);
                    y85.m93057b(psu.f180961c, new rgj(k0e1.m54977L(R.string.media_trimmer_preview_button_play_content_description, xq00Var8)), null, 0L, 0L, false, xq00Var8, psu.f180962d, 60);
                    xq00Var8.m91788r(false);
                }
                return w2a1Var;
        }
    }
}
