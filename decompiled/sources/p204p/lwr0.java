package p204p;

import com.spotify.mobius.functions.Consumer;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
public final class lwr0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f137624a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ nwr0 f137625b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Consumer f137626c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lwr0(nwr0 nwr0Var, Consumer consumer, int i) {
        super(1);
        this.f137624a = i;
        this.f137625b = nwr0Var;
        this.f137626c = consumer;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f137624a) {
            case 0:
                if (!((ycu) obj).equals(ycu.f271572a)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.f137626c.accept(new yvr0(this.f137625b.f159272b.m54304a()));
                return w2a1.f247311a;
            default:
                jtr0 jtr0Var = this.f137625b.f159272b;
                int iOrdinal = ((ywr0) obj).ordinal();
                nau nauVar = nau.f152117a;
                Consumer consumer = this.f137626c;
                switch (iOrdinal) {
                    case 0:
                        kv91 kv91Var = jtr0Var.f115952a;
                        u6h0 u6h0Var = jtr0Var.f115954c;
                        u6h0Var.getClass();
                        yt91 yt91VarM96903c = u6h0Var.f227350a.m96903c();
                        yt91VarM96903c.f276055i.add(new bu91("toolbar", null, null, null, null));
                        yt91VarM96903c.f276056j = false;
                        yt91 yt91VarM96903c2 = yt91VarM96903c.m94607a().m96903c();
                        yt91VarM96903c2.f276055i.add(new bu91("back_button", null, null, null, null));
                        yt91VarM96903c2.f276056j = false;
                        kv91Var.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nauVar), yt91VarM96903c2.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
                        consumer.accept(gvr0.f84810a);
                        break;
                    case 1:
                        kv91 kv91Var2 = jtr0Var.f115952a;
                        u6h0 u6h0Var2 = jtr0Var.f115954c;
                        u6h0Var2.getClass();
                        yt91 yt91VarM96903c3 = u6h0Var2.f227350a.m96903c();
                        yt91VarM96903c3.f276055i.add(new bu91("header", null, null, null, null));
                        yt91VarM96903c3.f276056j = false;
                        yt91 yt91VarM96903c4 = yt91VarM96903c3.m94607a().m96903c();
                        yt91VarM96903c4.f276055i.add(new bu91("edit_button", null, null, null, null));
                        yt91VarM96903c4.f276056j = false;
                        kv91Var2.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_navigate", 1, Collections.singletonMap("destination", "edit profile")), yt91VarM96903c4.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
                        consumer.accept(mvr0.f147635a);
                        break;
                    case 2:
                        kv91 kv91Var3 = jtr0Var.f115952a;
                        u6h0 u6h0Var3 = jtr0Var.f115954c;
                        u6h0Var3.getClass();
                        yt91 yt91VarM96903c5 = u6h0Var3.f227350a.m96903c();
                        yt91VarM96903c5.f276055i.add(new bu91("header", null, null, null, null));
                        yt91VarM96903c5.f276056j = false;
                        yt91 yt91VarM96903c6 = yt91VarM96903c5.m94607a().m96903c();
                        yt91VarM96903c6.f276055i.add(new bu91("settings_button", null, null, null, null));
                        yt91VarM96903c6.f276056j = false;
                        zt91 zt91VarM94607a = yt91VarM96903c6.m94607a();
                        String str = jtr0Var.f115955d;
                        dv91 dv91Var = new dv91("hit", 1);
                        String string = str != null ? str.toString() : null;
                        consumer.accept(new yvr0(kv91Var3.mo57453r(new av91("", "", dv91Var, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string != null ? string : "")), zt91VarM94607a, st91.f213865b, System.currentTimeMillis()), null)));
                        break;
                    case 3:
                        kv91 kv91Var4 = jtr0Var.f115952a;
                        u6h0 u6h0Var4 = jtr0Var.f115954c;
                        u6h0Var4.getClass();
                        yt91 yt91VarM96903c7 = u6h0Var4.f227350a.m96903c();
                        yt91VarM96903c7.f276055i.add(new bu91("header", null, null, null, null));
                        yt91VarM96903c7.f276056j = false;
                        yt91 yt91VarM96903c8 = yt91VarM96903c7.m94607a().m96903c();
                        yt91VarM96903c8.f276055i.add(new bu91("profile_picture", null, null, null, null));
                        yt91VarM96903c8.f276056j = false;
                        kv91Var4.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nauVar), yt91VarM96903c8.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
                        consumer.accept(awr0.f20665a);
                        break;
                    case 4:
                        kv91 kv91Var5 = jtr0Var.f115952a;
                        u6h0 u6h0Var5 = jtr0Var.f115954c;
                        u6h0Var5.getClass();
                        yt91 yt91VarM96903c9 = u6h0Var5.f227350a.m96903c();
                        yt91VarM96903c9.f276055i.add(new bu91("header", null, null, null, null));
                        yt91VarM96903c9.f276056j = false;
                        yt91 yt91VarM96903c10 = yt91VarM96903c9.m94607a().m96903c();
                        yt91VarM96903c10.f276055i.add(new bu91("profile_name", null, null, null, null));
                        yt91VarM96903c10.f276056j = false;
                        kv91Var5.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_navigate", 1, Collections.singletonMap("destination", "edit profile")), yt91VarM96903c10.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
                        consumer.accept(zvr0.f286762a);
                        break;
                    case 5:
                        kv91 kv91Var6 = jtr0Var.f115952a;
                        u6h0 u6h0Var6 = jtr0Var.f115954c;
                        u6h0Var6.getClass();
                        yt91 yt91VarM96903c11 = u6h0Var6.f227350a.m96903c();
                        yt91VarM96903c11.f276055i.add(new bu91("button_row", null, null, null, null));
                        yt91VarM96903c11.f276056j = false;
                        yt91 yt91VarM96903c12 = yt91VarM96903c11.m94607a().m96903c();
                        yt91VarM96903c12.f276055i.add(new bu91("following_button", null, null, null, null));
                        yt91VarM96903c12.f276056j = false;
                        zt91 zt91VarM94607a2 = yt91VarM96903c12.m94607a();
                        String strM77250i = s571.m77250i(jtr0Var.f115953b, ":following");
                        dv91 dv91Var2 = new dv91("hit", 1);
                        String string2 = strM77250i != null ? strM77250i.toString() : null;
                        kv91Var6.mo57453r(new av91("", "", dv91Var2, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string2 != null ? string2 : "")), zt91VarM94607a2, st91.f213865b, System.currentTimeMillis()), null);
                        consumer.accept(rvr0.f203123a);
                        break;
                    case 6:
                        kv91 kv91Var7 = jtr0Var.f115952a;
                        u6h0 u6h0Var7 = jtr0Var.f115954c;
                        u6h0Var7.getClass();
                        yt91 yt91VarM96903c13 = u6h0Var7.f227350a.m96903c();
                        yt91VarM96903c13.f276055i.add(new bu91("button_row", null, null, null, null));
                        yt91VarM96903c13.f276056j = false;
                        yt91 yt91VarM96903c14 = yt91VarM96903c13.m94607a().m96903c();
                        yt91VarM96903c14.f276055i.add(new bu91("followers_button", null, null, null, null));
                        yt91VarM96903c14.f276056j = false;
                        zt91 zt91VarM94607a3 = yt91VarM96903c14.m94607a();
                        String strM77250i2 = s571.m77250i(jtr0Var.f115953b, ":followers");
                        dv91 dv91Var3 = new dv91("hit", 1);
                        String string3 = strM77250i2 != null ? strM77250i2.toString() : null;
                        kv91Var7.mo57453r(new av91("", "", dv91Var3, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string3 != null ? string3 : "")), zt91VarM94607a3, st91.f213865b, System.currentTimeMillis()), null);
                        consumer.accept(qvr0.f193084a);
                        break;
                    case 7:
                        consumer.accept(new nvr0(null));
                        break;
                    case 8:
                        consumer.accept(wvr0.f255580a);
                        break;
                    case 9:
                        kv91 kv91Var8 = jtr0Var.f115952a;
                        u6h0 u6h0Var8 = jtr0Var.f115954c;
                        u6h0Var8.getClass();
                        yt91 yt91VarM96903c15 = u6h0Var8.f227350a.m96903c();
                        yt91VarM96903c15.f276055i.add(new bu91("header", null, null, null, null));
                        yt91VarM96903c15.f276056j = false;
                        yt91 yt91VarM96903c16 = yt91VarM96903c15.m94607a().m96903c();
                        yt91VarM96903c16.f276055i.add(new bu91("add_friend_button", null, null, null, "not_invited"));
                        yt91VarM96903c16.f276056j = true;
                        kv91Var8.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nauVar), yt91VarM96903c16.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
                        consumer.accept(fvr0.f73847a);
                        break;
                    case 10:
                        kv91 kv91Var9 = jtr0Var.f115952a;
                        u6h0 u6h0Var9 = jtr0Var.f115954c;
                        u6h0Var9.getClass();
                        yt91 yt91VarM96903c17 = u6h0Var9.f227350a.m96903c();
                        yt91VarM96903c17.f276055i.add(new bu91("button_row", null, null, null, null));
                        yt91VarM96903c17.f276056j = false;
                        yt91 yt91VarM96903c18 = yt91VarM96903c17.m94607a().m96903c();
                        yt91VarM96903c18.f276055i.add(new bu91("friends_button", null, null, null, null));
                        yt91VarM96903c18.f276056j = false;
                        zt91 zt91VarM94607a4 = yt91VarM96903c18.m94607a();
                        String strM77250i3 = s571.m77250i(jtr0Var.f115953b, ":friends");
                        dv91 dv91Var4 = new dv91("hit", 1);
                        String string4 = strM77250i3 != null ? strM77250i3.toString() : null;
                        consumer.accept(new vvr0(kv91Var9.mo57453r(new av91("", "", dv91Var4, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string4 != null ? string4 : "")), zt91VarM94607a4, st91.f213865b, System.currentTimeMillis()), null)));
                        break;
                    case 11:
                        consumer.accept(lvr0.f137380a);
                        break;
                    case 12:
                        kv91 kv91Var10 = jtr0Var.f115952a;
                        u6h0 u6h0Var10 = jtr0Var.f115954c;
                        u6h0Var10.getClass();
                        yt91 yt91VarM96903c19 = u6h0Var10.f227350a.m96903c();
                        yt91VarM96903c19.f276055i.add(new bu91("header", null, null, null, null));
                        yt91VarM96903c19.f276056j = false;
                        yt91 yt91VarM96903c20 = yt91VarM96903c19.m94607a().m96903c();
                        yt91VarM96903c20.f276055i.add(new bu91("biography_text", null, null, null, null));
                        yt91VarM96903c20.f276056j = false;
                        zt91 zt91VarM94607a5 = yt91VarM96903c20.m94607a();
                        String strM77250i4 = s571.m77250i(jtr0Var.f115953b, ":edit:bio");
                        dv91 dv91Var5 = new dv91("hit", 1);
                        String string5 = strM77250i4 != null ? strM77250i4.toString() : null;
                        consumer.accept(new evr0(kv91Var10.mo57453r(new av91("", "", dv91Var5, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string5 != null ? string5 : "")), zt91VarM94607a5, st91.f213865b, System.currentTimeMillis()), null)));
                        break;
                    case 13:
                        kv91 kv91Var11 = jtr0Var.f115952a;
                        u6h0 u6h0Var11 = jtr0Var.f115954c;
                        u6h0Var11.getClass();
                        yt91 yt91VarM96903c21 = u6h0Var11.f227350a.m96903c();
                        yt91VarM96903c21.f276055i.add(new bu91("header", null, null, null, null));
                        yt91VarM96903c21.f276056j = false;
                        yt91 yt91VarM96903c22 = yt91VarM96903c21.m94607a().m96903c();
                        yt91VarM96903c22.f276055i.add(new bu91("context_menu_button", null, null, null, null));
                        yt91VarM96903c22.f276056j = false;
                        consumer.accept(new jvr0(kv91Var11.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nauVar), yt91VarM96903c22.m94607a(), st91.f213865b, System.currentTimeMillis()), null)));
                        break;
                    case 14:
                        break;
                    case 15:
                        kv91 kv91Var12 = jtr0Var.f115952a;
                        u6h0 u6h0Var12 = jtr0Var.f115954c;
                        u6h0Var12.getClass();
                        yt91 yt91VarM96903c23 = u6h0Var12.f227350a.m96903c();
                        yt91VarM96903c23.f276055i.add(new bu91("header", null, null, null, null));
                        yt91VarM96903c23.f276056j = false;
                        yt91 yt91VarM96903c24 = yt91VarM96903c23.m94607a().m96903c();
                        yt91VarM96903c24.f276055i.add(new bu91("biography_text", null, null, null, null));
                        yt91VarM96903c24.f276056j = false;
                        kv91Var12.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nauVar), yt91VarM96903c24.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
                        break;
                    case 16:
                        kv91 kv91Var13 = jtr0Var.f115952a;
                        u6h0 u6h0Var13 = jtr0Var.f115954c;
                        u6h0Var13.getClass();
                        yt91 yt91VarM96903c25 = u6h0Var13.f227350a.m96903c();
                        yt91VarM96903c25.f276055i.add(new bu91("header", null, null, null, null));
                        yt91VarM96903c25.f276056j = false;
                        yt91 yt91VarM96903c26 = yt91VarM96903c25.m94607a().m96903c();
                        yt91VarM96903c26.f276055i.add(new bu91("biography_text", null, null, null, null));
                        yt91VarM96903c26.f276056j = false;
                        kv91Var13.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nauVar), yt91VarM96903c26.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                return w2a1.f247311a;
        }
    }
}
