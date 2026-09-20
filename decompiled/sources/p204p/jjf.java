package p204p;

import com.spotify.mobius.Next;
import com.spotify.music.R;
import com.spotify.searchview.proto.Entity;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public final class jjf extends qe70 implements th00 {

    /* JADX INFO: renamed from: L0 */
    public static final jjf f113003L0;

    /* JADX INFO: renamed from: M0 */
    public static final jjf f113004M0;

    /* JADX INFO: renamed from: N0 */
    public static final jjf f113005N0;

    /* JADX INFO: renamed from: O0 */
    public static final jjf f113006O0;

    /* JADX INFO: renamed from: P0 */
    public static final jjf f113007P0;

    /* JADX INFO: renamed from: Q0 */
    public static final jjf f113008Q0;

    /* JADX INFO: renamed from: R0 */
    public static final jjf f113009R0;

    /* JADX INFO: renamed from: S0 */
    public static final jjf f113010S0;

    /* JADX INFO: renamed from: T0 */
    public static final jjf f113011T0;

    /* JADX INFO: renamed from: U0 */
    public static final jjf f113012U0;

    /* JADX INFO: renamed from: V0 */
    public static final jjf f113013V0;

    /* JADX INFO: renamed from: W0 */
    public static final jjf f113014W0;

    /* JADX INFO: renamed from: X */
    public static final jjf f113015X;

    /* JADX INFO: renamed from: X0 */
    public static final jjf f113016X0;

    /* JADX INFO: renamed from: Y */
    public static final jjf f113017Y;

    /* JADX INFO: renamed from: Y0 */
    public static final jjf f113018Y0;

    /* JADX INFO: renamed from: Z */
    public static final jjf f113019Z;

    /* JADX INFO: renamed from: Z0 */
    public static final jjf f113020Z0;

    /* JADX INFO: renamed from: a1 */
    public static final jjf f113021a1;

    /* JADX INFO: renamed from: b */
    public static final jjf f113022b;

    /* JADX INFO: renamed from: b1 */
    public static final jjf f113023b1;

    /* JADX INFO: renamed from: c */
    public static final jjf f113024c;

    /* JADX INFO: renamed from: c1 */
    public static final jjf f113025c1;

    /* JADX INFO: renamed from: d */
    public static final jjf f113026d;

    /* JADX INFO: renamed from: e */
    public static final jjf f113027e;

    /* JADX INFO: renamed from: f */
    public static final jjf f113028f;

    /* JADX INFO: renamed from: g */
    public static final jjf f113029g;

    /* JADX INFO: renamed from: h */
    public static final jjf f113030h;

    /* JADX INFO: renamed from: i */
    public static final jjf f113031i;

    /* JADX INFO: renamed from: t */
    public static final jjf f113032t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f113033a;

    static {
        int i = 2;
        f113022b = new jjf(i, 0);
        f113024c = new jjf(i, 1);
        f113026d = new jjf(i, 2);
        f113027e = new jjf(i, 3);
        f113028f = new jjf(i, 4);
        f113029g = new jjf(i, 5);
        f113030h = new jjf(i, 6);
        f113031i = new jjf(i, 7);
        f113032t = new jjf(i, 8);
        f113015X = new jjf(i, 9);
        f113017Y = new jjf(i, 10);
        f113019Z = new jjf(i, 11);
        f113003L0 = new jjf(i, 12);
        f113004M0 = new jjf(i, 13);
        f113005N0 = new jjf(i, 14);
        f113006O0 = new jjf(i, 15);
        f113007P0 = new jjf(i, 16);
        f113008Q0 = new jjf(i, 17);
        f113009R0 = new jjf(i, 18);
        f113010S0 = new jjf(i, 19);
        f113011T0 = new jjf(i, 20);
        f113012U0 = new jjf(i, 21);
        f113013V0 = new jjf(i, 22);
        f113014W0 = new jjf(i, 23);
        f113016X0 = new jjf(i, 24);
        f113018Y0 = new jjf(i, 25);
        f113020Z0 = new jjf(i, 26);
        f113021a1 = new jjf(i, 27);
        f113023b1 = new jjf(i, 28);
        f113025c1 = new jjf(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jjf(int i, int i2) {
        super(i);
        this.f113033a = i2;
    }

    /* JADX WARN: Code duplicated, block: B:132:0x033e  */
    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        qm70 qm70Var;
        int i;
        int i2 = this.f113033a;
        cxh0 cxh0Var = cxh0.f43038a;
        w2a1 w2a1Var = w2a1.f247311a;
        boolean zM88271j = true;
        boolean z = false;
        switch (i2) {
            case 0:
                return null;
            case 1:
                ojf ojfVar = (ojf) obj;
                kmf kmfVar = (kmf) obj2;
                return Next.m15606h(kmf.m56898a(kmfVar, null, null, null, null, null, (ojfVar.f166065c || (qm70Var = ojfVar.f166064b) == null) ? kmfVar.f124137g : qm70Var, null, null, false, null, null, null, false, null, null, null, null, false, 524223));
            case 2:
                return bjg1.m29433T((kmf) obj2);
            case 3:
                ((Number) obj).intValue();
                uhf uhfVar = (uhf) obj2;
                if (uhfVar instanceof jhf) {
                    return edb.m38564m("comment-", ((jhf) uhfVar).f112430b.m22147u());
                }
                if (uhfVar instanceof mhf) {
                    return edb.m38564m("reply-", ((mhf) uhfVar).f143779b.m22249u());
                }
                if (uhfVar instanceof nhf) {
                    return edb.m38564m("preview-", ((nhf) uhfVar).f153997b);
                }
                if (uhfVar instanceof thf) {
                    return edb.m38564m("footer-", ((thf) uhfVar).f220415b);
                }
                if (uhfVar instanceof lhf) {
                    return "loading-footer";
                }
                if (uhfVar instanceof ohf) {
                    return "sensitive-warning";
                }
                if (uhfVar instanceof phf) {
                    return "sensitive-replies-warning";
                }
                if (uhfVar instanceof qhf) {
                    return "showing-all-header";
                }
                if (uhfVar instanceof shf) {
                    return "sensitive-replies-header";
                }
                if (uhfVar instanceof rhf) {
                    return "sensitive-replies-footer";
                }
                throw new NoWhenBranchMatchedException();
            case 4:
                nkf nkfVar = (nkf) obj;
                return new okf(nkfVar.f154865a, nkfVar.f154866b, nkfVar.f154867c, nkfVar.f154868d, nkfVar.f154869e);
            case 5:
                av31 av31Var = (av31) obj2;
                if (av31Var instanceof yu31) {
                    return new mjo(new jjo(((yu31) av31Var).f276272a.toString()));
                }
                if (av31Var instanceof zu31) {
                    return new ojo(((zu31) av31Var).f286335a);
                }
                throw new NoWhenBranchMatchedException();
            case 6:
                zbr zbrVar = (zbr) obj;
                zbr zbrVar2 = (zbr) obj2;
                return Boolean.valueOf(zbrVar.f281385a == zbrVar2.f281385a && zbrVar.f281386b == zbrVar2.f281386b && zbrVar.f281387c == zbrVar2.f281387c && zbrVar.f281388d == zbrVar2.f281388d && zbrVar.f281389e == zbrVar2.f281389e);
            case 7:
                return vkf1.m85877w((fxh0) obj, new ue9(27, (gh00) obj2));
            case 8:
                orf orfVar = (orf) obj;
                qho qhoVar = (qho) obj2;
                if (!(qhoVar instanceof oho)) {
                    return new qrf(orfVar.f168549a);
                }
                String str = orfVar.f168549a;
                sj81 sj81Var = (sj81) ((oho) qhoVar).f165512a;
                String str2 = sj81Var.f209779a;
                String str3 = sj81Var.f209780b;
                String str4 = sj81Var.f209781c;
                List list = sj81Var.f209782d;
                tjo tjoVar = trf.f223056a;
                if (list.contains(aaj.f13852d)) {
                    i = 1;
                } else {
                    i = list.contains(aaj.f13850b) ? 2 : 0;
                }
                return new prf(i, str, str2, str3, str4);
            case 9:
                l6c l6cVar = (l6c) obj2;
                return new osf((nsf) obj, new uo80(l6cVar.f130302a, z).m83597h(), l6cVar.f130303b);
            case 10:
                return null;
            case 11:
                r57 r57Var = (r57) obj;
                r57 r57Var2 = (r57) obj2;
                String str5 = r57Var2.f195981c;
                String str6 = r57Var.f195981c;
                if (str6 == null) {
                    if (str5 != null || !wj50.m88271j(r57Var.f195979a, r57Var2.f195979a)) {
                        zM88271j = false;
                    }
                } else if (str5 == null) {
                    zM88271j = false;
                } else {
                    zM88271j = wj50.m88271j(str6, str5);
                }
                return Boolean.valueOf(zM88271j);
            case 12:
                return Boolean.TRUE;
            case 13:
                return Boolean.TRUE;
            case 14:
                return Boolean.valueOf(wj50.m88271j(obj, obj2));
            case 15:
                return null;
            case 16:
                xq00 xq00Var = (xq00) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (xq00Var.m91752Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    vig1.m85646a(0, k0e1.m54977L(R.string.about_songdna_title, xq00Var), k0e1.m54977L(R.string.about_songdna_body, xq00Var), xq00Var, null);
                } else {
                    xq00Var.m91757b0();
                }
                return w2a1Var;
            case 17:
                xq00 xq00Var2 = (xq00) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (xq00Var2.m91752Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    AbstractC2389su.m79366a(((tfu) xq00Var2.m91774k(AbstractC2389su.f213966a)).m80707a(xq00Var2), 0, xq00Var2, null);
                } else {
                    xq00Var2.m91757b0();
                }
                return w2a1Var;
            case 18:
                xq00 xq00Var3 = (xq00) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (xq00Var3.m91752Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    dha.m36004a(xtm0.m92060G(mi21.m61834r(((tfu) xq00Var3.m91774k(AbstractC2389su.f213966a)).m80707a(xq00Var3), cxh0Var), 0L, hmx0.f93097a, 13), xq00Var3, 0);
                } else {
                    xq00Var3.m91757b0();
                }
                return w2a1Var;
            case 19:
                xq00 xq00Var4 = (xq00) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                if (xq00Var4.m91752Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    y85.m93057b(bsu.f30386c, new rgj(k0e1.m54977L(R.string.profile_context_menu_button_accessibility_description, xq00Var4)), null, leu.m58815a(xq00Var4).f112824b.f138758b, 0L, false, xq00Var4, bsu.f30387d, 52);
                } else {
                    xq00Var4.m91757b0();
                }
                return w2a1Var;
            case 20:
                xq00 xq00Var5 = (xq00) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                if (xq00Var5.m91752Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.profile_message_button_label, xq00Var5), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var5, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    xq00Var5.m91757b0();
                }
                return w2a1Var;
            case 21:
                xq00 xq00Var6 = (xq00) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                if (xq00Var6.m91752Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    y85.m93057b(jqu.f115003c, new rgj(k0e1.m54977L(R.string.profile_profile_settings_button_accessibility_description, xq00Var6)), null, leu.m58815a(xq00Var6).f112824b.f138758b, 0L, false, xq00Var6, jqu.f115004d, 52);
                } else {
                    xq00Var6.m91757b0();
                }
                return w2a1Var;
            case 22:
                xq00 xq00Var7 = (xq00) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                if (xq00Var7.m91752Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    bsu bsuVar = bsu.f30386c;
                    rgj rgjVar = new rgj(k0e1.m54977L(R.string.ads_context_menu_button_content_description, xq00Var7));
                    gfp gfpVar = leu.f132721a;
                    y85.m93057b(bsuVar, rgjVar, null, ((diu) iiu.f102631a.f258037b).f49477b, 0L, false, xq00Var7, bsu.f30387d, 52);
                } else {
                    xq00Var7.m91757b0();
                }
                return w2a1Var;
            case 23:
                xq00 xq00Var8 = (xq00) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                if (xq00Var8.m91752Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    y85.m93057b(xuu.f266174c, qgj.f188480a, mi21.m61834r(32, cxh0Var), 0L, 0L, false, xq00Var8, xuu.f266175d | 48, 56);
                } else {
                    xq00Var8.m91757b0();
                }
                return w2a1Var;
            case 24:
                xq00 xq00Var9 = (xq00) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                if (xq00Var9.m91752Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    y85.m93057b(zuu.f286518c, qgj.f188480a, mi21.m61834r(32, cxh0Var), 0L, 0L, false, xq00Var9, zuu.f286519d | 48, 56);
                } else {
                    xq00Var9.m91757b0();
                }
                return w2a1Var;
            case 25:
                xq00 xq00Var10 = (xq00) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                if (xq00Var10.m91752Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    y85.m93057b(avu.f20261c, qgj.f188480a, mi21.m61834r(32, cxh0Var), 0L, 0L, false, xq00Var10, avu.f20262d | 48, 56);
                } else {
                    xq00Var10.m91757b0();
                }
                return w2a1Var;
            case 26:
                xq00 xq00Var11 = (xq00) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                if (xq00Var11.m91752Y(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    y85.m93057b(yuu.f276473c, qgj.f188480a, mi21.m61834r(32, cxh0Var), 0L, 0L, false, xq00Var11, yuu.f276474d | 48, 56);
                } else {
                    xq00Var11.m91757b0();
                }
                return w2a1Var;
            case 27:
                xq00 xq00Var12 = (xq00) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                if (!xq00Var12.m91752Y(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    xq00Var12.m91757b0();
                }
                return w2a1Var;
            case 28:
                xq00 xq00Var13 = (xq00) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                if (xq00Var13.m91752Y(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    wjg1.m88322a(null, null, false, null, dlm0.f50256a, null, null, null, xq00Var13, 0, 239);
                } else {
                    xq00Var13.m91757b0();
                }
                return w2a1Var;
            default:
                xq00 xq00Var14 = (xq00) obj;
                int iIntValue14 = ((Number) obj2).intValue();
                if (xq00Var14.m91752Y(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    ahf1.m25932d(k0e1.m54977L(R.string.add_child_account_nudge_continue_button, xq00Var14), null, null, 0L, null, null, 0, false, null, 0, null, xq00Var14, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                } else {
                    xq00Var14.m91757b0();
                }
                return w2a1Var;
        }
    }
}
