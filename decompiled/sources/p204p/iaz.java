package p204p;

import android.view.View;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.music.R;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerError;
import com.spotify.player.model.PlayerState;
import com.spotify.profile.profile.proto.ProfilelistResponse$SmallProfileList;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeEmpty;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.Executor;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public class iaz implements rwf, Function, mzv, Init, Predicate, hwf, yh00, Function3, vja1, yxf {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f100401a;

    /* JADX INFO: renamed from: b */
    public static final iaz f100391b = new iaz(0);

    /* JADX INFO: renamed from: c */
    public static final iaz f100393c = new iaz(1);

    /* JADX INFO: renamed from: d */
    public static final iaz f100394d = new iaz(2);

    /* JADX INFO: renamed from: e */
    public static final iaz f100395e = new iaz(3);

    /* JADX INFO: renamed from: f */
    public static final iaz f100396f = new iaz(4);

    /* JADX INFO: renamed from: g */
    public static final iaz f100397g = new iaz(5);

    /* JADX INFO: renamed from: h */
    public static final iaz f100398h = new iaz(6);

    /* JADX INFO: renamed from: i */
    public static final iaz f100399i = new iaz(7);

    /* JADX INFO: renamed from: t */
    public static final iaz f100400t = new iaz(8);

    /* JADX INFO: renamed from: X */
    public static final iaz f100384X = new iaz(9);

    /* JADX INFO: renamed from: Y */
    public static final iaz f100386Y = new iaz(11);

    /* JADX INFO: renamed from: Z */
    public static final iaz f100388Z = new iaz(12);

    /* JADX INFO: renamed from: L0 */
    public static final iaz f100372L0 = new iaz(13);

    /* JADX INFO: renamed from: M0 */
    public static final iaz f100373M0 = new iaz(14);

    /* JADX INFO: renamed from: N0 */
    public static final iaz f100374N0 = new iaz(15);

    /* JADX INFO: renamed from: O0 */
    public static final iaz f100375O0 = new iaz(16);

    /* JADX INFO: renamed from: P0 */
    public static final iaz f100376P0 = new iaz(17);

    /* JADX INFO: renamed from: Q0 */
    public static final iaz f100377Q0 = new iaz(18);

    /* JADX INFO: renamed from: R0 */
    public static final iaz f100378R0 = new iaz(19);

    /* JADX INFO: renamed from: S0 */
    public static final iaz f100379S0 = new iaz(20);

    /* JADX INFO: renamed from: T0 */
    public static final iaz f100380T0 = new iaz(21);

    /* JADX INFO: renamed from: U0 */
    public static final iaz f100381U0 = new iaz(22);

    /* JADX INFO: renamed from: V0 */
    public static final iaz f100382V0 = new iaz(23);

    /* JADX INFO: renamed from: W0 */
    public static final iaz f100383W0 = new iaz(24);

    /* JADX INFO: renamed from: X0 */
    public static final iaz f100385X0 = new iaz(25);

    /* JADX INFO: renamed from: Y0 */
    public static final iaz f100387Y0 = new iaz(26);

    /* JADX INFO: renamed from: Z0 */
    public static final iaz f100389Z0 = new iaz(27);

    /* JADX INFO: renamed from: a1 */
    public static final iaz f100390a1 = new iaz(28);

    /* JADX INFO: renamed from: b1 */
    public static final iaz f100392b1 = new iaz(29);

    public /* synthetic */ iaz(int i) {
        this.f100401a = i;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: d */
    public static pv91 m50106d(int i, String str, String str2) {
        switch (str.hashCode()) {
            case -489658001:
                if (str.equals("mobile-your-addons:manageAddonEntry")) {
                    return new wjh0(new cbh0(29, (byte) 0), Integer.valueOf(i), str2);
                }
                break;
            case -449535884:
                if (str.equals("mobile-your-addons:availableAddonsCard")) {
                    return new wjh0(new cbh0(29, (byte) 0));
                }
                break;
            case -421627515:
                if (str.equals("mobile-manage-subscription:subscriptionHeading")) {
                    return new hwg0(new xug0(3, (byte) 0), 4);
                }
                break;
            case -398941641:
                if (str.equals("mobile-manage-subscription:consumptionEntry")) {
                    return new hwg0(new xug0(3, (byte) 0), 2);
                }
                break;
            case 122918841:
                if (str.equals("mobile-your-plan:consumptionEntry")) {
                    return new zlh0(Integer.valueOf(i), str2, new pkh0(5));
                }
                break;
            case 386814412:
                if (str.equals("mobile-your-plan:benefitsListCard")) {
                    return new zlh0(new pkh0(5), 0);
                }
                break;
            case 558446441:
                if (str.equals("mobile-manage-subscription:cancelSubscriptionButton")) {
                    return new hwg0(new xug0(3, (byte) 0), 1);
                }
                break;
            case 913691788:
                if (str.equals("mobile-manage-subscription:benefitsCard")) {
                    return new hwg0(new xug0(3, (byte) 0), 0);
                }
                break;
            case 1094769647:
                if (str.equals("mobile-your-plan:subscriptionCard")) {
                    return new zlh0(new pkh0(5), 2);
                }
                break;
            case 1808651670:
                if (str.equals("mobile-manage-subscription:paymentCard")) {
                    return new hwg0(new xug0(3, (byte) 0), 3);
                }
                break;
            case 1954172266:
                if (str.equals("mobile-your-plan:yourAddonsEntry")) {
                    return new zlh0(new pkh0(5), 3);
                }
                break;
        }
        return new orp(4);
    }

    /* JADX INFO: renamed from: k */
    public static av91 m50108k(int i, String str, String str2) {
        switch (str) {
            case "mobile-your-plan:benefitsListCard:exploreBenefits":
                zt91 zt91Var = zt91.f286105i;
                yt91 yt91VarM50626j = ihf1.m50626j();
                yt91VarM50626j.f276054h = "music";
                yt91VarM50626j.f276047a = "mobile-your-plan";
                yt91VarM50626j.f276052f = "1.0.0";
                yt91VarM50626j.f276053g = "20.0.5";
                yt91 yt91VarM42473q = fr0.m42473q(yt91VarM50626j, "your-plan");
                yt91VarM42473q.f276055i.add(new bu91("benefits_list_card", null, null, null, null));
                yt91VarM42473q.f276056j = true;
                yt91 yt91VarM96903c = yt91VarM42473q.m94607a().m96903c();
                yt91VarM96903c.f276055i.add(new bu91("explore_benefits", null, null, null, null));
                yt91VarM96903c.f276056j = false;
                zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
                dv91 dv91Var = new dv91("hit", 1);
                String string = str2.toString();
                return new av91("", "", dv91Var, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string != null ? string : "")), zt91VarM94607a, st91.f213865b, System.currentTimeMillis());
            case "mobile-manage-subscription:paymentCard:editPaymentMethodEntry":
                zt91 zt91Var2 = zt91.f286105i;
                yt91 yt91VarM50626j2 = ihf1.m50626j();
                yt91VarM50626j2.f276054h = "music";
                yt91VarM50626j2.f276047a = "mobile-manage-subscription";
                yt91VarM50626j2.f276052f = "1.0.0";
                yt91VarM50626j2.f276053g = "20.0.5";
                yt91 yt91VarM42473q2 = fr0.m42473q(yt91VarM50626j2, "manage-subscription");
                yt91VarM42473q2.f276055i.add(new bu91("payment_card", null, null, null, null));
                yt91VarM42473q2.f276056j = true;
                yt91 yt91VarM96903c2 = yt91VarM42473q2.m94607a().m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("edit_payment_method_entry", null, null, null, null));
                yt91VarM96903c2.f276056j = false;
                zt91 zt91VarM94607a2 = yt91VarM96903c2.m94607a();
                dv91 dv91Var2 = new dv91("hit", 1);
                String string2 = str2.toString();
                return new av91("", "", dv91Var2, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string2 != null ? string2 : "")), zt91VarM94607a2, st91.f213865b, System.currentTimeMillis());
            case "mobile-your-addons:manageAddonEntry":
                zt91 zt91Var3 = zt91.f286105i;
                yt91 yt91VarM50626j3 = ihf1.m50626j();
                yt91VarM50626j3.f276054h = "music";
                yt91VarM50626j3.f276047a = "mobile-your-addons";
                yt91VarM50626j3.f276052f = "1.0.0";
                yt91VarM50626j3.f276053g = "20.0.5";
                zt91 zt91VarM94607a3 = yt91VarM50626j3.m94607a();
                Collections.singletonList("your-addons");
                Integer numValueOf = Integer.valueOf(i);
                yt91 yt91VarM96903c3 = zt91VarM94607a3.m96903c();
                yt91VarM96903c3.f276055i.add(new bu91("manage_addon_entry", null, numValueOf, str2, null));
                yt91VarM96903c3.f276056j = true;
                zt91 zt91VarM94607a4 = yt91VarM96903c3.m94607a();
                dv91 dv91Var3 = new dv91("hit", 1);
                String string3 = str2.toString();
                return new av91("", "", dv91Var3, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string3 != null ? string3 : "")), zt91VarM94607a4, st91.f213865b, System.currentTimeMillis());
            case "mobile-manage-subscription:consumptionEntry":
                zt91 zt91Var4 = zt91.f286105i;
                yt91 yt91VarM50626j4 = ihf1.m50626j();
                yt91VarM50626j4.f276054h = "music";
                yt91VarM50626j4.f276047a = "mobile-manage-subscription";
                yt91VarM50626j4.f276052f = "1.0.0";
                yt91VarM50626j4.f276053g = "20.0.5";
                yt91 yt91VarM42473q3 = fr0.m42473q(yt91VarM50626j4, "manage-subscription");
                yt91VarM42473q3.f276055i.add(new bu91("consumption_entry", null, null, null, null));
                yt91VarM42473q3.f276056j = true;
                zt91 zt91VarM94607a5 = yt91VarM42473q3.m94607a();
                dv91 dv91Var4 = new dv91("hit", 1);
                String string4 = str2.toString();
                return new av91("", "", dv91Var4, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string4 != null ? string4 : "")), zt91VarM94607a5, st91.f213865b, System.currentTimeMillis());
            case "mobile-manage-subscription:paymentCard:disclaimerLink":
                zt91 zt91Var5 = zt91.f286105i;
                yt91 yt91VarM50626j5 = ihf1.m50626j();
                yt91VarM50626j5.f276054h = "music";
                yt91VarM50626j5.f276047a = "mobile-manage-subscription";
                yt91VarM50626j5.f276052f = "1.0.0";
                yt91VarM50626j5.f276053g = "20.0.5";
                yt91 yt91VarM42473q4 = fr0.m42473q(yt91VarM50626j5, "manage-subscription");
                yt91VarM42473q4.f276055i.add(new bu91("payment_card", null, null, null, null));
                yt91VarM42473q4.f276056j = true;
                yt91 yt91VarM96903c4 = yt91VarM42473q4.m94607a().m96903c();
                yt91VarM96903c4.f276055i.add(new bu91("disclaimer_link", null, null, null, null));
                yt91VarM96903c4.f276056j = false;
                zt91 zt91VarM94607a6 = yt91VarM96903c4.m94607a();
                dv91 dv91Var5 = new dv91("hit", 1);
                String string5 = str2.toString();
                return new av91("", "", dv91Var5, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string5 != null ? string5 : "")), zt91VarM94607a6, st91.f213865b, System.currentTimeMillis());
            case "mobile-your-plan:consumptionEntry":
                zt91 zt91Var6 = zt91.f286105i;
                yt91 yt91VarM50626j6 = ihf1.m50626j();
                yt91VarM50626j6.f276054h = "music";
                yt91VarM50626j6.f276047a = "mobile-your-plan";
                yt91VarM50626j6.f276052f = "1.0.0";
                yt91VarM50626j6.f276053g = "20.0.5";
                zt91 zt91VarM94607a7 = yt91VarM50626j6.m94607a();
                Collections.singletonList("your-plan");
                Integer numValueOf2 = Integer.valueOf(i);
                yt91 yt91VarM96903c5 = zt91VarM94607a7.m96903c();
                yt91VarM96903c5.f276055i.add(new bu91("consumption_entry", null, numValueOf2, str2, null));
                yt91VarM96903c5.f276056j = true;
                zt91 zt91VarM94607a8 = yt91VarM96903c5.m94607a();
                dv91 dv91Var6 = new dv91("hit", 1);
                String string6 = str2.toString();
                return new av91("", "", dv91Var6, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string6 != null ? string6 : "")), zt91VarM94607a8, st91.f213865b, System.currentTimeMillis());
            case "mobile-your-addons:availableAddonsCard:exploreAddonsButton":
                zt91 zt91Var7 = zt91.f286105i;
                yt91 yt91VarM50626j7 = ihf1.m50626j();
                yt91VarM50626j7.f276054h = "music";
                yt91VarM50626j7.f276047a = "mobile-your-addons";
                yt91VarM50626j7.f276052f = "1.0.0";
                yt91VarM50626j7.f276053g = "20.0.5";
                yt91 yt91VarM42473q5 = fr0.m42473q(yt91VarM50626j7, "your-addons");
                yt91VarM42473q5.f276055i.add(new bu91("available_addons_card", null, null, null, null));
                yt91VarM42473q5.f276056j = true;
                yt91 yt91VarM96903c6 = yt91VarM42473q5.m94607a().m96903c();
                yt91VarM96903c6.f276055i.add(new bu91("explore_addons_button", null, null, null, null));
                yt91VarM96903c6.f276056j = false;
                zt91 zt91VarM94607a9 = yt91VarM96903c6.m94607a();
                dv91 dv91Var7 = new dv91("hit", 1);
                String string7 = str2.toString();
                return new av91("", "", dv91Var7, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string7 != null ? string7 : "")), zt91VarM94607a9, st91.f213865b, System.currentTimeMillis());
            case "mobile-manage-subscription:cancelSubscriptionButton":
                zt91 zt91Var8 = zt91.f286105i;
                yt91 yt91VarM50626j8 = ihf1.m50626j();
                yt91VarM50626j8.f276054h = "music";
                yt91VarM50626j8.f276047a = "mobile-manage-subscription";
                yt91VarM50626j8.f276052f = "1.0.0";
                yt91VarM50626j8.f276053g = "20.0.5";
                yt91 yt91VarM42473q6 = fr0.m42473q(yt91VarM50626j8, "manage-subscription");
                yt91VarM42473q6.f276055i.add(new bu91("cancel_subscription_button", null, null, null, null));
                yt91VarM42473q6.f276056j = true;
                zt91 zt91VarM94607a10 = yt91VarM42473q6.m94607a();
                dv91 dv91Var8 = new dv91("hit", 1);
                String string8 = str2.toString();
                return new av91("", "", dv91Var8, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string8 != null ? string8 : "")), zt91VarM94607a10, st91.f213865b, System.currentTimeMillis());
            case "mobile-your-plan:subscriptionCard:manageButton":
                zt91 zt91Var9 = zt91.f286105i;
                yt91 yt91VarM50626j9 = ihf1.m50626j();
                yt91VarM50626j9.f276054h = "music";
                yt91VarM50626j9.f276047a = "mobile-your-plan";
                yt91VarM50626j9.f276052f = "1.0.0";
                yt91VarM50626j9.f276053g = "20.0.5";
                yt91 yt91VarM42473q7 = fr0.m42473q(yt91VarM50626j9, "your-plan");
                yt91VarM42473q7.f276055i.add(new bu91("subscription_card", null, null, null, null));
                yt91VarM42473q7.f276056j = true;
                yt91 yt91VarM96903c7 = yt91VarM42473q7.m94607a().m96903c();
                yt91VarM96903c7.f276055i.add(new bu91("manage_button", null, null, null, null));
                yt91VarM96903c7.f276056j = false;
                zt91 zt91VarM94607a11 = yt91VarM96903c7.m94607a();
                dv91 dv91Var9 = new dv91("hit", 1);
                String string9 = str2.toString();
                return new av91("", "", dv91Var9, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string9 != null ? string9 : "")), zt91VarM94607a11, st91.f213865b, System.currentTimeMillis());
            case "mobile-your-plan:yourAddonsEntry":
                zt91 zt91Var10 = zt91.f286105i;
                yt91 yt91VarM50626j10 = ihf1.m50626j();
                yt91VarM50626j10.f276054h = "music";
                yt91VarM50626j10.f276047a = "mobile-your-plan";
                yt91VarM50626j10.f276052f = "1.0.0";
                yt91VarM50626j10.f276053g = "20.0.5";
                yt91 yt91VarM42473q8 = fr0.m42473q(yt91VarM50626j10, "your-plan");
                yt91VarM42473q8.f276055i.add(new bu91("your_addons_entry", null, null, null, null));
                yt91VarM42473q8.f276056j = true;
                zt91 zt91VarM94607a12 = yt91VarM42473q8.m94607a();
                dv91 dv91Var10 = new dv91("hit", 1);
                String string10 = str2.toString();
                return new av91("", "", dv91Var10, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string10 != null ? string10 : "")), zt91VarM94607a12, st91.f213865b, System.currentTimeMillis());
            default:
                return null;
        }
    }

    @Override // io.reactivex.rxjava3.functions.Function3
    /* JADX INFO: renamed from: J0 */
    public Object mo23408J0(Object obj, Object obj2, Object obj3) {
        switch (this.f100401a) {
            case 19:
                return kkc0.m56700m0(kkc0.m56700m0((Map) obj, (Map) obj2), (Map) obj3);
            default:
                return Boolean.valueOf(((Boolean) obj).booleanValue() && ((Boolean) obj2).booleanValue() && !((Boolean) obj3).booleanValue());
        }
    }

    @Override // p204p.mzv
    /* JADX INFO: renamed from: a */
    public Boolean mo34035a() {
        return Boolean.TRUE;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        switch (this.f100401a) {
            case 1:
                ProfilelistResponse$SmallProfileList profilelistResponse$SmallProfileList = (ProfilelistResponse$SmallProfileList) ((o2x0) obj).f161172b;
                return profilelistResponse$SmallProfileList == null ? ProfilelistResponse$SmallProfileList.m19806n() : profilelistResponse$SmallProfileList;
            case 2:
                int i = yd20.f271624a;
                return xd20.f260364a.m93079p((String) obj, Charset.defaultCharset()).toString();
            case 3:
                e7w e7wVar = (e7w) obj;
                if (e7wVar instanceof d7w) {
                    return ((d7w) e7wVar).f46281a;
                }
                throw new NoSuchElementException("Episode response failed");
            case 5:
                return Boolean.valueOf(((i3a) obj) == i3a.f98075c);
            case 8:
                return new xu80(((ar80) obj).f18975a);
            case 9:
                return ((PlayerError) obj).error();
            case 11:
                return new q7b0(((Boolean) obj).booleanValue());
            case 13:
                return new cae0(f1h1.m40557w((j9e0) obj));
            case 17:
                return ((bbk0) obj).f25616h;
            case 18:
                return dul.m36995E((ContextTrack) ((xul0) obj).mo49283h());
            case 24:
                return (api) ((xul0) obj).mo49278b();
            case 25:
                return new j9a0((ejf) obj);
            case 26:
                return (String) ((xul0) obj).mo49278b();
            default:
                ciq0 ciq0Var = (ciq0) obj;
                if (ciq0Var.equals(aiq0.f16080a)) {
                    return MaybeEmpty.f8264a;
                }
                if (ciq0Var instanceof biq0) {
                    return Maybe.m23363f(ciq0Var);
                }
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: b */
    public int m50109b(String str) {
        return 0;
    }

    @Override // com.spotify.mobius.Init
    /* JADX INFO: renamed from: f0 */
    public First mo15576f0(Object obj) {
        return First.m15574b((r8c0) obj);
    }

    @Override // p204p.rwf
    /* JADX INFO: renamed from: h */
    public Object mo1885h(sef0 sef0Var) {
        return z2h1.m95213t((Executor) sef0Var.mo54440d(new eht0(ld80.class, Executor.class)));
    }

    @Override // p204p.vja1
    /* JADX INFO: renamed from: j */
    public he41 mo24405j(String str, LinkedHashMap linkedHashMap, mec0 mec0Var, String str2) {
        switch (this.f100401a) {
            case 22:
                return new itn0(mec0Var, str2, str);
            default:
                return new xup0(mec0Var, str2, str);
        }
    }

    @Override // p204p.yxf
    /* JADX INFO: renamed from: m */
    public j15 mo36390m(xq00 xq00Var) {
        xq00Var.m91771i0(224448670);
        j15 j15VarM56920r = kmg1.m56920r(k0e1.m54977L(R.string.settings_item_plan_overview_description_offer, xq00Var), k0e1.m54977L(R.string.settings_item_plan_overview_description_active, xq00Var), xq00Var);
        xq00Var.m91788r(false);
        return j15VarM56920r;
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        switch (this.f100401a) {
            case 14:
                return !((iqx) ((gqx) obj)).f104863f;
            case 20:
                return !((PlayerState) obj).isPaused();
            default:
                return ((bla1) obj) instanceof zka1;
        }
    }

    /* JADX INFO: renamed from: n */
    public void mo50111n(View view) {
    }

    /* JADX INFO: renamed from: c */
    public void m50110c(String str, int i) {
    }
}
