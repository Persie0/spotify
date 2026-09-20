package p204p;

import java.util.Collections;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public final class z970 extends qe70 implements xh00 {

    /* JADX INFO: renamed from: L0 */
    public static final z970 f280673L0;

    /* JADX INFO: renamed from: M0 */
    public static final z970 f280674M0;

    /* JADX INFO: renamed from: N0 */
    public static final z970 f280675N0;

    /* JADX INFO: renamed from: O0 */
    public static final z970 f280676O0;

    /* JADX INFO: renamed from: P0 */
    public static final z970 f280677P0;

    /* JADX INFO: renamed from: Q0 */
    public static final z970 f280678Q0;

    /* JADX INFO: renamed from: R0 */
    public static final z970 f280679R0;

    /* JADX INFO: renamed from: S0 */
    public static final z970 f280680S0;

    /* JADX INFO: renamed from: T0 */
    public static final z970 f280681T0;

    /* JADX INFO: renamed from: U0 */
    public static final z970 f280682U0;

    /* JADX INFO: renamed from: V0 */
    public static final z970 f280683V0;

    /* JADX INFO: renamed from: W0 */
    public static final z970 f280684W0;

    /* JADX INFO: renamed from: X */
    public static final z970 f280685X;

    /* JADX INFO: renamed from: X0 */
    public static final z970 f280686X0;

    /* JADX INFO: renamed from: Y */
    public static final z970 f280687Y;

    /* JADX INFO: renamed from: Y0 */
    public static final z970 f280688Y0;

    /* JADX INFO: renamed from: Z */
    public static final z970 f280689Z;

    /* JADX INFO: renamed from: Z0 */
    public static final z970 f280690Z0;

    /* JADX INFO: renamed from: a1 */
    public static final z970 f280691a1;

    /* JADX INFO: renamed from: b */
    public static final z970 f280692b;

    /* JADX INFO: renamed from: b1 */
    public static final z970 f280693b1;

    /* JADX INFO: renamed from: c */
    public static final z970 f280694c;

    /* JADX INFO: renamed from: c1 */
    public static final z970 f280695c1;

    /* JADX INFO: renamed from: d */
    public static final z970 f280696d;

    /* JADX INFO: renamed from: e */
    public static final z970 f280697e;

    /* JADX INFO: renamed from: f */
    public static final z970 f280698f;

    /* JADX INFO: renamed from: g */
    public static final z970 f280699g;

    /* JADX INFO: renamed from: h */
    public static final z970 f280700h;

    /* JADX INFO: renamed from: i */
    public static final z970 f280701i;

    /* JADX INFO: renamed from: t */
    public static final z970 f280702t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f280703a;

    static {
        int i = 4;
        f280692b = new z970(i, 0);
        f280694c = new z970(i, 1);
        f280696d = new z970(i, 2);
        f280697e = new z970(i, 3);
        f280698f = new z970(i, 4);
        f280699g = new z970(i, 5);
        f280700h = new z970(i, 6);
        f280701i = new z970(i, 7);
        f280702t = new z970(i, 8);
        f280685X = new z970(i, 9);
        f280687Y = new z970(i, 10);
        f280689Z = new z970(i, 11);
        f280673L0 = new z970(i, 12);
        f280674M0 = new z970(i, 13);
        f280675N0 = new z970(i, 14);
        f280676O0 = new z970(i, 15);
        f280677P0 = new z970(i, 16);
        f280678Q0 = new z970(i, 17);
        f280679R0 = new z970(i, 18);
        f280680S0 = new z970(i, 19);
        f280681T0 = new z970(i, 20);
        f280682U0 = new z970(i, 21);
        f280683V0 = new z970(i, 22);
        f280684W0 = new z970(i, 23);
        f280686X0 = new z970(i, 24);
        f280688Y0 = new z970(i, 25);
        f280690Z0 = new z970(i, 26);
        f280691a1 = new z970(i, 27);
        f280693b1 = new z970(i, 28);
        f280695c1 = new z970(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z970(int i, int i2) {
        super(i);
        this.f280703a = i2;
    }

    @Override // p204p.xh00
    /* JADX INFO: renamed from: M */
    public final Object mo24818M(Object obj, Object obj2, Object obj3, Object obj4) {
        String string;
        av91 av91Var;
        int i = this.f280703a;
        i080 i080Var = i080.f97156a;
        f080 f080Var = f080.f64568a;
        nau nauVar = nau.f152117a;
        switch (i) {
            case 0:
                kcg0 kcg0Var = (kcg0) obj;
                qec qecVar = (qec) obj2;
                if (!(((pec) obj4) instanceof pec)) {
                    throw new NoWhenBranchMatchedException();
                }
                String str = qecVar.f187890b;
                dv91 dv91Var = new dv91("hit", 1);
                string = str != null ? str.toString() : null;
                return new av91("", "", dv91Var, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string != null ? string : "")), kcg0Var.f121480b, kcg0Var.f121479a, System.currentTimeMillis());
            case 1:
                return new adg0(((wgc) obj).f251027a, Integer.valueOf(((Number) obj3).intValue()), (st91) obj4);
            case 2:
                return null;
            case 3:
                ((Number) obj3).intValue();
                return new k1h0((st91) obj4);
            case 4:
                k1h0 k1h0Var = (k1h0) obj;
                ue70 ue70Var = (ue70) obj2;
                if (!((te70) obj4).equals(te70.f219595a)) {
                    throw new NoWhenBranchMatchedException();
                }
                String strConcat = "spotify:page-match:landing:".concat(ue70Var.f229452a);
                dv91 dv91Var2 = new dv91("hit", 1);
                string = strConcat != null ? strConcat.toString() : null;
                return new av91("", "", dv91Var2, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string != null ? string : "")), k1h0Var.f118352b, k1h0Var.f118351a, System.currentTimeMillis());
            case 5:
                ((Number) obj3).intValue();
                return new amh0(new pkh0(6), 1);
            case 6:
                return null;
            case 7:
                ((Number) obj3).intValue();
                return new dyg0((st91) obj4);
            case 8:
                dyg0 dyg0Var = (dyg0) obj;
                return ((ni70) obj3).f154194a ? new av91("", "", new dv91("hit", 1), new bv91("setting_disable", 1, nauVar), dyg0Var.f54338b, dyg0Var.f54337a, System.currentTimeMillis()) : new av91("", "", new dv91("hit", 1), new bv91("setting_enable", 1, nauVar), dyg0Var.f54338b, dyg0Var.f54337a, System.currentTimeMillis());
            case 9:
                rlh0 rlh0Var = (rlh0) obj;
                mz70 mz70Var = (mz70) obj4;
                if (!(mz70Var instanceof mz70)) {
                    throw new NoWhenBranchMatchedException();
                }
                Integer numValueOf = Integer.valueOf(mz70Var.f148637a);
                String str2 = mz70Var.f148638b;
                yt91 yt91VarM96903c = rlh0Var.f200317a.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("top_chart_item", null, numValueOf, str2, "social"));
                yt91VarM96903c.f276056j = false;
                zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
                String str3 = mz70Var.f148638b;
                dv91 dv91Var3 = new dv91("hit", 1);
                string = str3 != null ? str3.toString() : null;
                return new av91("", "", dv91Var3, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string != null ? string : "")), zt91VarM94607a, st91.f213865b, System.currentTimeMillis());
            case 10:
                x8g0 x8g0Var = (x8g0) obj;
                j080 j080Var = (j080) obj4;
                fh0 fh0Var = ((e080) obj3).f54898a;
                if (!j080Var.equals(f080Var) && !j080Var.equals(i080Var)) {
                    throw new NoWhenBranchMatchedException();
                }
                String str4 = fh0Var.f69514h;
                String str5 = fh0Var.f69511e;
                yt91 yt91VarM96903c2 = x8g0Var.f259146a.m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("cta_card", str4, null, str5, null));
                yt91VarM96903c2.f276056j = true;
                zt91 zt91VarM94607a2 = yt91VarM96903c2.m94607a();
                String str6 = fh0Var.f69511e;
                dv91 dv91Var4 = new dv91("hit", 1);
                string = str6 != null ? str6.toString() : null;
                return new av91("", "", dv91Var4, new bv91("navigate_to_external_uri", 1, Collections.singletonMap("destination", string != null ? string : "")), zt91VarM94607a2, st91.f213865b, System.currentTimeMillis());
            case 11:
                e080 e080Var = (e080) obj3;
                j080 j080Var2 = (j080) obj4;
                fh0 fh0Var2 = e080Var.f54898a;
                String str7 = fh0Var2.f69514h;
                String str8 = e080Var.f54901d;
                yt91 yt91VarM96903c3 = ((j5h0) obj).f108967a.m96903c();
                yt91VarM96903c3.f276055i.add(new bu91("cta_card", str7, null, str8, ""));
                yt91VarM96903c3.f276056j = true;
                zt91 zt91VarM94607a3 = yt91VarM96903c3.m94607a();
                String str9 = fh0Var2.f69511e;
                if (j080Var2.equals(f080Var)) {
                    Set set = dd41.f47702f;
                    if (r46.m74723R(str9)) {
                        dv91 dv91Var5 = new dv91("hit", 1);
                        String string2 = str9.toString();
                        return new av91("", "", dv91Var5, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string2 != null ? string2 : "")), zt91VarM94607a3, st91.f213865b, System.currentTimeMillis());
                    }
                    dv91 dv91Var6 = new dv91("hit", 1);
                    String string3 = str9.toString();
                    return new av91("", "", dv91Var6, new bv91("navigate_to_external_uri", 1, Collections.singletonMap("destination", string3 != null ? string3 : "")), zt91VarM94607a3, st91.f213865b, System.currentTimeMillis());
                }
                if (!j080Var2.equals(i080Var)) {
                    throw new NoWhenBranchMatchedException();
                }
                String str10 = fh0Var2.f69514h;
                yt91 yt91VarM96903c4 = zt91VarM94607a3.m96903c();
                yt91VarM96903c4.f276055i.add(new bu91("cta_button", str10, null, str8, null));
                yt91VarM96903c4.f276056j = true;
                zt91 zt91VarM94607a4 = yt91VarM96903c4.m94607a();
                Set set2 = dd41.f47702f;
                if (r46.m74723R(str9)) {
                    dv91 dv91Var7 = new dv91("hit", 1);
                    String string4 = str9.toString();
                    av91Var = new av91("", "", dv91Var7, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string4 != null ? string4 : "")), zt91VarM94607a4, st91.f213865b, System.currentTimeMillis());
                } else {
                    dv91 dv91Var8 = new dv91("hit", 1);
                    String string5 = str9.toString();
                    av91Var = new av91("", "", dv91Var8, new bv91("navigate_to_external_uri", 1, Collections.singletonMap("destination", string5 != null ? string5 : "")), zt91VarM94607a4, st91.f213865b, System.currentTimeMillis());
                }
                return av91Var;
            case 12:
                ((Number) obj3).intValue();
                return ((e180) obj2).f55144h.f44187b;
            case 13:
                kv91 kv91Var = (kv91) obj2;
                a180 a180Var = (a180) obj4;
                zt91 zt91Var = ((j5h0) obj).f108967a;
                x080 x080Var = ((e180) obj3).f55137a;
                if (a180Var instanceof ox0) {
                    String str11 = ((ox0) a180Var).f170816a.f69514h;
                    String str12 = x080Var.f256827a;
                    yt91 yt91VarM96903c5 = zt91Var.m96903c();
                    yt91VarM96903c5.f276055i.add(new bu91("cta_card", str11, null, str12, ""));
                    yt91VarM96903c5.f276056j = true;
                    zt91 zt91VarM94607a5 = yt91VarM96903c5.m94607a();
                    nu91 nu91Var = new nu91();
                    nu91Var.f248107a = zt91VarM94607a5;
                    nu91Var.f248108b = st91.f213865b;
                    nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
                    kv91Var.mo57449i((ou91) nu91Var.m87248a(), null);
                    return null;
                }
                if (!(a180Var instanceof qaz0)) {
                    if (!(a180Var instanceof taz0)) {
                        if (a180Var instanceof f7f) {
                            return null;
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    String str13 = x080Var.f256827a;
                    yt91 yt91VarM96903c6 = zt91Var.m96903c();
                    yt91VarM96903c6.f276055i.add(new bu91("see_all_row", null, null, str13, null));
                    yt91VarM96903c6.f276056j = true;
                    zt91 zt91VarM94607a6 = yt91VarM96903c6.m94607a();
                    nu91 nu91Var2 = new nu91();
                    nu91Var2.f248107a = zt91VarM94607a6;
                    nu91Var2.f248108b = st91.f213865b;
                    nu91Var2.f248109c = Long.valueOf(System.currentTimeMillis());
                    kv91Var.mo57449i((ou91) nu91Var2.m87248a(), null);
                    return null;
                }
                String str14 = x080Var.f256827a;
                yt91 yt91VarM96903c7 = zt91Var.m96903c();
                yt91VarM96903c7.f276055i.add(new bu91("see_all_row", null, null, str14, null));
                yt91VarM96903c7.f276056j = true;
                zt91 zt91VarM94607a7 = yt91VarM96903c7.m94607a();
                voc1 voc1Var = xoc1.f263969Q2;
                Set set3 = dd41.f47702f;
                String str15 = voc1Var + ":episode:" + r46.m74726U(x080Var.f256827a).m35712j();
                dv91 dv91Var9 = new dv91("hit", 1);
                string = str15 != null ? str15.toString() : null;
                return new av91("", "", dv91Var9, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string != null ? string : "")), zt91VarM94607a7, st91.f213865b, System.currentTimeMillis());
            case 14:
                kv91 kv91Var2 = (kv91) obj2;
                a180 a180Var2 = (a180) obj4;
                zt91 zt91Var2 = ((x8g0) obj).f259146a;
                x080 x080Var2 = ((e180) obj3).f55137a;
                if (a180Var2 instanceof ox0) {
                    fh0 fh0Var3 = ((ox0) a180Var2).f170816a;
                    String str16 = fh0Var3.f69514h;
                    String str17 = fh0Var3.f69511e;
                    yt91 yt91VarM96903c8 = zt91Var2.m96903c();
                    yt91VarM96903c8.f276055i.add(new bu91("cta_card", str16, null, str17, null));
                    yt91VarM96903c8.f276056j = true;
                    zt91 zt91VarM94607a8 = yt91VarM96903c8.m94607a();
                    nu91 nu91Var3 = new nu91();
                    nu91Var3.f248107a = zt91VarM94607a8;
                    nu91Var3.f248108b = st91.f213865b;
                    nu91Var3.f248109c = Long.valueOf(System.currentTimeMillis());
                    kv91Var2.mo57449i((ou91) nu91Var3.m87248a(), null);
                    return null;
                }
                if (a180Var2 instanceof qaz0) {
                    String str18 = x080Var2.f256827a;
                    yt91 yt91VarM96903c9 = zt91Var2.m96903c();
                    yt91VarM96903c9.f276055i.add(new bu91("see_all_row", null, null, str18, null));
                    yt91VarM96903c9.f276056j = true;
                    zt91 zt91VarM94607a9 = yt91VarM96903c9.m94607a();
                    String str19 = xoc1.f263985S2.f243453a;
                    dv91 dv91Var10 = new dv91("hit", 1);
                    string = str19 != null ? str19.toString() : null;
                    return new av91("", "", dv91Var10, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string != null ? string : "")), zt91VarM94607a9, st91.f213865b, System.currentTimeMillis());
                }
                if (!(a180Var2 instanceof taz0)) {
                    if (a180Var2 instanceof f7f) {
                        return null;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                String str20 = x080Var2.f256827a;
                yt91 yt91VarM96903c10 = zt91Var2.m96903c();
                yt91VarM96903c10.f276055i.add(new bu91("see_all_row", null, null, str20, null));
                yt91VarM96903c10.f276056j = true;
                zt91 zt91VarM94607a10 = yt91VarM96903c10.m94607a();
                nu91 nu91Var4 = new nu91();
                nu91Var4.f248107a = zt91VarM94607a10;
                nu91Var4.f248108b = st91.f213865b;
                nu91Var4.f248109c = Long.valueOf(System.currentTimeMillis());
                kv91Var2.mo57449i((ou91) nu91Var4.m87248a(), null);
                return null;
            case 15:
                ((Number) obj3).intValue();
                return new nmg0(((ie80) obj).f101344a, (st91) obj4);
            case 16:
                nmg0 nmg0Var = (nmg0) obj;
                String str21 = ((je80) obj3).f111504e;
                if (ne80.f152956a[((ge80) obj4).ordinal()] != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                if (str21.length() <= 0) {
                    return null;
                }
                dv91 dv91Var11 = new dv91("hit", 1);
                String string6 = str21.toString();
                return new av91("", "", dv91Var11, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string6 != null ? string6 : "")), nmg0Var.f155426b, nmg0Var.f155425a, System.currentTimeMillis());
            case 17:
                ((Number) obj3).intValue();
                return new h3h0((st91) obj4);
            case 18:
                h3h0 h3h0Var = (h3h0) obj;
                if (re80.f198314a[((pe80) obj4).ordinal()] != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                yt91 yt91VarM96903c11 = h3h0Var.f87234b.m96903c();
                yt91VarM96903c11.f276055i.add(new bu91("add_songs_button", null, null, null, null));
                yt91VarM96903c11.f276056j = false;
                return new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nauVar), yt91VarM96903c11.m94607a(), h3h0Var.f87233a, System.currentTimeMillis());
            case 19:
                ((Number) obj3).intValue();
                return new skh0(new g4h0(new tkh0((st91) obj4)));
            case 20:
                ((Number) obj3).intValue();
                return new tkh0((st91) obj4);
            case 21:
                ((Number) obj3).intValue();
                return new tkh0((st91) obj4);
            case 22:
                tkh0 tkh0Var = (tkh0) obj;
                ci80 ci80Var = (ci80) obj4;
                di80 di80Var = ((gi80) obj2).f80092a;
                if (!(di80Var instanceof ei80) || !(ci80Var instanceof bi80)) {
                    return null;
                }
                ei80 ei80Var = (ei80) di80Var;
                yt91 yt91VarM96903c12 = tkh0Var.f221152b.m96903c();
                yt91VarM96903c12.f276055i.add(new bu91("item_list", null, null, null, null));
                yt91VarM96903c12.f276056j = false;
                zt91 zt91VarM94607a11 = yt91VarM96903c12.m94607a();
                Integer numValueOf2 = Integer.valueOf(ei80Var.f59802b);
                String str22 = ei80Var.f59801a;
                yt91 yt91VarM96903c13 = zt91VarM94607a11.m96903c();
                yt91VarM96903c13.f276055i.add(new bu91("preview_item", null, numValueOf2, str22, null));
                yt91VarM96903c13.f276056j = false;
                zt91 zt91VarM94607a12 = yt91VarM96903c13.m94607a();
                String str23 = ei80Var.f59801a;
                dv91 dv91Var12 = new dv91("hit", 1);
                string = str23 != null ? str23.toString() : null;
                return new av91("", "", dv91Var12, new bv91("play", 1, Collections.singletonMap("item_to_be_played", string != null ? string : "")), zt91VarM94607a12, tkh0Var.f221151a, System.currentTimeMillis());
            case 23:
                return new av91("", "", new dv91("hit", 1), new bv91("ui_select", 1, nauVar), ((xjh0) obj).f262136a, st91.f213865b, System.currentTimeMillis());
            case 24:
                ((Number) obj3).intValue();
                return new mtg0((st91) obj4);
            case 25:
                mtg0 mtg0Var = (mtg0) obj;
                l390 l390Var = (l390) obj2;
                if (!((k390) obj4).equals(k390.f118815a)) {
                    throw new NoWhenBranchMatchedException();
                }
                String str24 = l390Var.f129241c;
                yt91 yt91VarM96903c14 = mtg0Var.f147070b.m96903c();
                yt91VarM96903c14.f276055i.add(new bu91("navigate_button", null, null, str24, null));
                yt91VarM96903c14.f276056j = false;
                zt91 zt91VarM94607a13 = yt91VarM96903c14.m94607a();
                String str25 = l390Var.f129241c;
                dv91 dv91Var13 = new dv91("hit", 1);
                string = str25 != null ? str25.toString() : null;
                return new av91("", "", dv91Var13, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string != null ? string : "")), zt91VarM94607a13, mtg0Var.f147069a, System.currentTimeMillis());
            case 26:
                ((Number) obj3).intValue();
                return new ckh0(null, null, (st91) obj4);
            case 27:
                bkh0 bkh0Var = (bkh0) obj;
                return new av91("", "", new dv91("hit", 1), new bv91("ui_navigate", 1, Collections.singletonMap("destination", "spotify:collection:your-episodes:settings")), bkh0Var.f27933a, ((ckh0) ((g4h0) bkh0Var.f27934b.f76422c).f76422c).f39013a, System.currentTimeMillis());
            case 28:
                xch0 xch0Var = (xch0) obj;
                y890 y890Var = (y890) obj4;
                if (y890Var instanceof x890) {
                    return xch0Var.m90395a(xoc1.f264147n4.f243453a);
                }
                if (y890Var instanceof w890) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            default:
                qtg0 qtg0Var = (qtg0) obj;
                if (((v990) obj4) instanceof u990) {
                    return new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nauVar), qtg0Var.f192381a, st91.f213865b, System.currentTimeMillis());
                }
                return null;
        }
    }
}
