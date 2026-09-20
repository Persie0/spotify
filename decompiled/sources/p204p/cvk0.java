package p204p;

import com.spotify.mobius.Next;
import com.spotify.player.model.PlayerState;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class cvk0 extends qe70 implements th00 {

    /* JADX INFO: renamed from: L0 */
    public static final cvk0 f42446L0;

    /* JADX INFO: renamed from: M0 */
    public static final cvk0 f42447M0;

    /* JADX INFO: renamed from: N0 */
    public static final cvk0 f42448N0;

    /* JADX INFO: renamed from: O0 */
    public static final cvk0 f42449O0;

    /* JADX INFO: renamed from: P0 */
    public static final cvk0 f42450P0;

    /* JADX INFO: renamed from: Q0 */
    public static final cvk0 f42451Q0;

    /* JADX INFO: renamed from: R0 */
    public static final cvk0 f42452R0;

    /* JADX INFO: renamed from: S0 */
    public static final cvk0 f42453S0;

    /* JADX INFO: renamed from: T0 */
    public static final cvk0 f42454T0;

    /* JADX INFO: renamed from: U0 */
    public static final cvk0 f42455U0;

    /* JADX INFO: renamed from: V0 */
    public static final cvk0 f42456V0;

    /* JADX INFO: renamed from: W0 */
    public static final cvk0 f42457W0;

    /* JADX INFO: renamed from: X */
    public static final cvk0 f42458X;

    /* JADX INFO: renamed from: X0 */
    public static final cvk0 f42459X0;

    /* JADX INFO: renamed from: Y */
    public static final cvk0 f42460Y;

    /* JADX INFO: renamed from: Y0 */
    public static final cvk0 f42461Y0;

    /* JADX INFO: renamed from: Z */
    public static final cvk0 f42462Z;

    /* JADX INFO: renamed from: Z0 */
    public static final cvk0 f42463Z0;

    /* JADX INFO: renamed from: a1 */
    public static final cvk0 f42464a1;

    /* JADX INFO: renamed from: b */
    public static final cvk0 f42465b;

    /* JADX INFO: renamed from: b1 */
    public static final cvk0 f42466b1;

    /* JADX INFO: renamed from: c */
    public static final cvk0 f42467c;

    /* JADX INFO: renamed from: c1 */
    public static final cvk0 f42468c1;

    /* JADX INFO: renamed from: d */
    public static final cvk0 f42469d;

    /* JADX INFO: renamed from: e */
    public static final cvk0 f42470e;

    /* JADX INFO: renamed from: f */
    public static final cvk0 f42471f;

    /* JADX INFO: renamed from: g */
    public static final cvk0 f42472g;

    /* JADX INFO: renamed from: h */
    public static final cvk0 f42473h;

    /* JADX INFO: renamed from: i */
    public static final cvk0 f42474i;

    /* JADX INFO: renamed from: t */
    public static final cvk0 f42475t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42476a;

    static {
        int i = 2;
        f42465b = new cvk0(i, 0);
        f42467c = new cvk0(i, 1);
        f42469d = new cvk0(i, 2);
        f42470e = new cvk0(i, 3);
        f42471f = new cvk0(i, 4);
        f42472g = new cvk0(i, 5);
        f42473h = new cvk0(i, 6);
        f42474i = new cvk0(i, 7);
        f42475t = new cvk0(i, 8);
        f42458X = new cvk0(i, 9);
        f42460Y = new cvk0(i, 10);
        f42462Z = new cvk0(i, 11);
        f42446L0 = new cvk0(i, 12);
        f42447M0 = new cvk0(i, 13);
        f42448N0 = new cvk0(i, 14);
        f42449O0 = new cvk0(i, 15);
        f42450P0 = new cvk0(i, 16);
        f42451Q0 = new cvk0(i, 17);
        f42452R0 = new cvk0(i, 18);
        f42453S0 = new cvk0(i, 19);
        f42454T0 = new cvk0(i, 20);
        f42455U0 = new cvk0(i, 21);
        f42456V0 = new cvk0(i, 22);
        f42457W0 = new cvk0(i, 23);
        f42459X0 = new cvk0(i, 24);
        f42461Y0 = new cvk0(i, 25);
        f42463Z0 = new cvk0(i, 26);
        f42464a1 = new cvk0(i, 27);
        f42466b1 = new cvk0(i, 28);
        f42468c1 = new cvk0(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cvk0(int i, int i2) {
        super(i);
        this.f42476a = i2;
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        List list;
        Map map;
        String str;
        Integer numM29807r0;
        String str2;
        String str3;
        m340 m340Var;
        z240 z240VarM60640a;
        cbf0 cbf0VarM35556a;
        cbf0 cbf0VarM35556a2;
        switch (this.f42476a) {
            case 0:
                Boolean bool = (Boolean) obj2;
                bool.booleanValue();
                return new zuk0(bool);
            case 1:
                return new jvk0((List) obj2);
            case 2:
                return new pvk0((List) obj2);
            case 3:
                return new ywk0(obj, ((Boolean) obj2).booleanValue());
            case 4:
                ldh0 ldh0Var = (ldh0) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                vch0 vch0Var = ldh0Var.f132176b;
                nau nauVar = nau.f152117a;
                return zBooleanValue ? new av91("", "", new dv91("hit", 1), new bv91("setting_enable", 1, nauVar), ldh0Var.f132175a, vch0Var.f240134b, System.currentTimeMillis()) : new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nauVar), ldh0Var.f132175a, vch0Var.f240134b, System.currentTimeMillis());
            case 5:
                b2l0 b2l0Var = (b2l0) obj;
                d2y d2yVar = (d2y) obj2;
                String str4 = b2l0Var.f22631a;
                return new c2l0(str4, b2l0Var.f22632b, b2l0Var.f22633c, b2l0Var.f22634d, b2l0Var.f22635e, b2l0Var.f22636f, d2yVar.f44687c, d2yVar.f44686b, bga.m29074Q(d2yVar.f44685a, str4));
            case 6:
                g6l0 g6l0Var = (g6l0) obj;
                j6l0 j6l0Var = (j6l0) obj2;
                return new h6l0(bjf1.m29409q(g6l0Var), j6l0Var.f109351d, j6l0Var.f109348a, j6l0Var.f109349b, j6l0Var.f109350c, g6l0Var.mo37944a(), j6l0Var.f109352e, j6l0Var.f109353f, j6l0Var.f109354g);
            case 7:
                v140 v140Var = (v140) obj;
                daj dajVar = (daj) obj2;
                String str5 = v140Var != null ? v140Var.f236243a : null;
                boolean z = false;
                if (dajVar != null && (list = dajVar.f47053d) != null && list.contains(baj.f25220c)) {
                    z = true;
                }
                return new i6l0(str5, z);
            case 8:
                return new n6f(n6f.f150866f);
            case 9:
                o8l0 o8l0Var = (o8l0) obj2;
                if (o8l0Var instanceof n8l0) {
                    n8l0 n8l0Var = (n8l0) o8l0Var;
                    return new l8l0(n8l0Var.f151558a, n8l0Var.f151559b, true);
                }
                if (o8l0Var.equals(m8l0.f141092a)) {
                    return new l8l0(0, 0, false);
                }
                throw new NoWhenBranchMatchedException();
            case 10:
                del0 del0Var = (del0) obj2;
                return new eel0((String) obj, del0Var.f48121a.f231263a, del0Var.f48122b);
            case 11:
                return null;
            case 12:
                return null;
            case 13:
                return Next.m15608j();
            case 14:
                Iterable<dx80> iterable = (List) obj;
                hz80 hz80Var = (hz80) obj2;
                if (iterable == null) {
                    iterable = lau.f131415a;
                }
                ArrayList arrayList = new ArrayList(i6f.m49804T(iterable, 10));
                for (dx80 dx80Var : iterable) {
                    String str6 = dx80Var.f53899c;
                    Map map2 = dx80Var.f53902f;
                    gkk gkkVarM74663k = r3h1.m74663k((String) map2.get("type"));
                    String str7 = (String) map2.get("record_count");
                    arrayList.add(new vjm0(str6, gkkVarM74663k, str7 != null ? bm51.m29807r0(str7) : null));
                }
                return new e7m0((hz80Var == null || (map = hz80Var.f96822X) == null || (str = (String) map.get("total_number_of_connections")) == null || (numM29807r0 = bm51.m29807r0(str)) == null) ? 0 : numM29807r0.intValue(), arrayList);
            case 15:
                return (q9m0) obj2;
            case 16:
                kdd1 kdd1Var = (kdd1) obj;
                kdd1 kdd1Var2 = (kdd1) obj2;
                ArrayList arrayListM43700N0 = g6f.m43700N0(kdd1Var2.f121663b, kdd1Var.f121663b);
                fpm0 fpm0Var = kdd1Var.f121664c;
                String str8 = fpm0Var != null ? fpm0Var.f71932a : null;
                fpm0 fpm0Var2 = kdd1Var2.f121664c;
                return kdd1.m56170a(kdd1Var, arrayListM43700N0, new fpm0(str8, fpm0Var2 != null ? fpm0Var2.f71933b : null), kdd1Var2.f121668g, 953);
            case 17:
                kdd1 kdd1Var3 = (kdd1) obj;
                kdd1 kdd1Var4 = (kdd1) obj2;
                ArrayList arrayListM43700N1 = g6f.m43700N0(kdd1Var3.f121663b, kdd1Var4.f121663b);
                fpm0 fpm0Var3 = kdd1Var4.f121664c;
                String str9 = fpm0Var3 != null ? fpm0Var3.f71932a : null;
                fpm0 fpm0Var4 = kdd1Var3.f121664c;
                return kdd1.m56170a(kdd1Var3, arrayListM43700N1, new fpm0(str9, fpm0Var4 != null ? fpm0Var4.f71933b : null), null, 1017);
            case 18:
                return ((sim0) obj2).f209571d.m78109e();
            case 19:
                return (aqm0) obj2;
            case 20:
                bqm0 bqm0Var = (bqm0) obj;
                ebf0 ebf0Var = (ebf0) obj2;
                String str10 = bqm0Var.f29854b;
                dbf0 dbf0VarM38368c = ebf0Var.m38368c(upm0.class, str10);
                wj50.m88279p(dbf0VarM38368c);
                cbf0 cbf0VarM35556a3 = dbf0VarM38368c.m35556a();
                wj50.m88279p(cbf0VarM35556a3);
                upm0 upm0Var = (upm0) cbf0VarM35556a3.f36107a;
                dbf0 dbf0VarM38368c2 = ebf0Var.m38368c(v140.class, str10);
                erc1 erc1Var = null;
                v140 v140Var2 = (dbf0VarM38368c2 == null || (cbf0VarM35556a2 = dbf0VarM38368c2.m35556a()) == null) ? null : (v140) cbf0VarM35556a2.f36107a;
                dbf0 dbf0VarM38368c3 = ebf0Var.m38368c(erc1.class, str10);
                if (dbf0VarM38368c3 != null && (cbf0VarM35556a = dbf0VarM38368c3.m35556a()) != null) {
                    erc1Var = (erc1) cbf0VarM35556a.f36107a;
                }
                if (erc1Var == null || (m340Var = erc1Var.f62079a) == null || (z240VarM60640a = m340Var.m60640a(a340.f11860a)) == null || (str2 = z240VarM60640a.f278475a.f198763a) == null) {
                    str2 = upm0Var.f232731b;
                }
                String str11 = str2;
                String str12 = upm0Var.f232736g;
                String str13 = upm0Var.f232737h;
                if (str13.length() == 0) {
                    str13 = upm0Var.f232733d;
                }
                String str14 = str13;
                if (v140Var2 == null || (str3 = v140Var2.f236243a) == null) {
                    str3 = "";
                }
                return new eqm0(str11, str12, str14, str3, bqm0Var.f29854b, upm0Var.f232738i.f84403b, upm0Var.f232735f == 5);
            case 21:
                xq00 xq00Var = (xq00) obj;
                ((Number) obj2).intValue();
                xq00Var.m91771i0(157620536);
                jez jezVar = new jez(0, 0, 0, 0);
                xq00Var.m91788r(false);
                return jezVar;
            case 22:
                xq00 xq00Var2 = (xq00) obj;
                ((Number) obj2).intValue();
                xq00Var2.m91771i0(6784280);
                jez jezVar2 = new jez(0, 0, 0, 0);
                xq00Var2.m91788r(false);
                return jezVar2;
            case 23:
                return (fwh0) obj;
            case 24:
                return (gwh0) obj;
            case 25:
                v1n0 v1n0Var = (v1n0) obj;
                String str15 = v1n0Var.f236416a;
                String str16 = v1n0Var.f236417b;
                String str17 = v1n0Var.f236418c;
                String str18 = v1n0Var.f236419d;
                boolean z2 = v1n0Var.f236420e;
                boolean z3 = v1n0Var.f236421f;
                boolean z4 = v1n0Var.f236422g;
                int iM73724d = qsg1.m73724d(v1n0Var);
                boolean z5 = v1n0Var.f236425j;
                PlayerState playerState = ((t2y) obj2).f216638a;
                String strM47210B = hdi.m47210B(playerState);
                String str19 = v1n0Var.f236416a;
                return new w1n0(iM73724d, (strM47210B.equals(str19) && playerState.isPaused()) ? 2 : (hdi.m47210B(playerState).equals(str19) && playerState.isPlaying()) ? 1 : 3, str15, str16, str17, str18, z2, z3, z4, z5);
            case 26:
                sin0 sin0Var = (sin0) obj;
                r730 r730Var = (r730) obj2;
                if (!wj50.m88271j(r730Var, n730.f151064a)) {
                    if (!(r730Var instanceof q730)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ArrayList<o730> arrayList2 = ((q730) r730Var).f186022b.f174553a;
                    ArrayList arrayList3 = new ArrayList(i6f.m49804T(arrayList2, 10));
                    for (o730 o730Var : arrayList2) {
                        u730 u730Var = o730Var.f162455a;
                        arrayList3.add(new rin0(u730Var != null ? new qin0(u730Var.f227488a, u730Var.f227489b, u730Var.f227490c) : null, o730Var.f162456b));
                    }
                    if (!arrayList3.isEmpty()) {
                        return new uin0(sin0Var.f209574a, arrayList3, sin0Var.f209576c);
                    }
                }
                return tin0.f220713a;
            case 27:
                return new lkn0((jkn0) obj, ((Boolean) obj2).booleanValue());
            case 28:
                smn0 smn0Var = (smn0) obj2;
                return new umn0(!smn0Var.f210689a, smn0Var.f210691c, (tmn0) obj);
            default:
                return new n6f(((jiu) obj).f112824b.f138760d);
        }
    }
}
