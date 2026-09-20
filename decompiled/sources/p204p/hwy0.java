package p204p;

import com.spotify.allboarding.allboardingimpl.search.SearchFragment;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class hwy0 extends qe70 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f96074a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SearchFragment f96075b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hwy0(SearchFragment searchFragment, int i) {
        super(2);
        this.f96074a = i;
        this.f96075b = searchFragment;
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        uxi0 uxi0VarM84259l;
        x8y0 x8y0Var;
        uxi0 uxi0VarM84259l2;
        x8y0 x8y0Var2;
        switch (this.f96074a) {
            case 0:
                n0z0 n0z0Var = (n0z0) obj;
                String str = (String) obj2;
                SearchFragment searchFragment = this.f96075b;
                if (searchFragment.m49727z0()) {
                    b221 b221Var = n0z0Var.f149207b;
                    if ((b221Var instanceof bej) && (uxi0VarM84259l = rfg1.m75453w(searchFragment).m84259l()) != null && (x8y0Var = (x8y0) uxi0VarM84259l.f234932X.getValue()) != null) {
                        x8y0Var.m90234d(new kph0(str, (bej) b221Var), "searchResult_mobius");
                    }
                    rfg1.m75453w(searchFragment).m84266t();
                }
                return w2a1.f247311a;
            case 1:
                int iIntValue = ((Number) obj).intValue();
                n0z0 n0z0Var2 = (n0z0) obj2;
                int iM38547C = edb.m38547C(n0z0Var2.f149206a);
                nau nauVar = nau.f152117a;
                SearchFragment searchFragment2 = this.f96075b;
                if (iM38547C == 0) {
                    sr31 sr31VarM3107i1 = searchFragment2.m3107i1();
                    Integer numValueOf = Integer.valueOf(iIntValue);
                    String str2 = n0z0Var2.f149208c;
                    kv91 kv91Var = (kv91) sr31VarM3107i1.f213224b;
                    yt91 yt91VarM96903c = ((i8g0) sr31VarM3107i1.f213225c).f99785b.m96903c();
                    yt91VarM96903c.f276055i.add(new bu91("content", null, null, null, null));
                    yt91VarM96903c.f276056j = true;
                    yt91 yt91VarM96903c2 = yt91VarM96903c.m94607a().m96903c();
                    yt91VarM96903c2.f276055i.add(new bu91("results", null, null, null, null));
                    yt91VarM96903c2.f276056j = true;
                    yt91 yt91VarM96903c3 = yt91VarM96903c2.m94607a().m96903c();
                    yt91VarM96903c3.f276055i.add(new bu91("default_item", null, numValueOf, str2, null));
                    yt91VarM96903c3.f276056j = true;
                    kv91Var.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nauVar), yt91VarM96903c3.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
                } else if (iM38547C == 1) {
                    sr31 sr31VarM3107i2 = searchFragment2.m3107i1();
                    String str3 = n0z0Var2.f149208c;
                    kv91 kv91Var2 = (kv91) sr31VarM3107i2.f213224b;
                    yt91 yt91VarM96903c4 = ((i8g0) sr31VarM3107i2.f213225c).f99785b.m96903c();
                    yt91VarM96903c4.f276055i.add(new bu91("content", null, null, null, null));
                    yt91VarM96903c4.f276056j = true;
                    yt91 yt91VarM96903c5 = yt91VarM96903c4.m94607a().m96903c();
                    yt91VarM96903c5.f276055i.add(new bu91("results", null, null, null, null));
                    yt91VarM96903c5.f276056j = true;
                    zt91 zt91VarM94607a = yt91VarM96903c5.m94607a();
                    Integer numValueOf2 = Integer.valueOf(iIntValue);
                    yt91 yt91VarM96903c6 = zt91VarM94607a.m96903c();
                    yt91VarM96903c6.f276055i.add(new bu91("artist_item", null, numValueOf2, str3, null));
                    yt91VarM96903c6.f276056j = true;
                    kv91Var2.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nauVar), yt91VarM96903c6.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
                } else {
                    if (iM38547C != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    sr31 sr31VarM3107i3 = searchFragment2.m3107i1();
                    String str4 = n0z0Var2.f149208c;
                    kv91 kv91Var3 = (kv91) sr31VarM3107i3.f213224b;
                    yt91 yt91VarM96903c7 = ((i8g0) sr31VarM3107i3.f213225c).f99785b.m96903c();
                    yt91VarM96903c7.f276055i.add(new bu91("content", null, null, null, null));
                    yt91VarM96903c7.f276056j = true;
                    yt91 yt91VarM96903c8 = yt91VarM96903c7.m94607a().m96903c();
                    yt91VarM96903c8.f276055i.add(new bu91("results", null, null, null, null));
                    yt91VarM96903c8.f276056j = true;
                    zt91 zt91VarM94607a2 = yt91VarM96903c8.m94607a();
                    Integer numValueOf3 = Integer.valueOf(iIntValue);
                    yt91 yt91VarM96903c9 = zt91VarM94607a2.m96903c();
                    yt91VarM96903c9.f276055i.add(new bu91("show_item", null, numValueOf3, str4, null));
                    yt91VarM96903c9.f276056j = true;
                    kv91Var3.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nauVar), yt91VarM96903c9.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
                }
                b221 b221Var2 = n0z0Var2.f149207b;
                if ((b221Var2 instanceof bej) && (uxi0VarM84259l2 = rfg1.m75453w(searchFragment2).m84259l()) != null && (x8y0Var2 = (x8y0) uxi0VarM84259l2.f234932X.getValue()) != null) {
                    x8y0Var2.m90234d(new kph0(n0z0Var2.f149212g, (bej) b221Var2), "searchResult_mobius");
                }
                rfg1.m75453w(searchFragment2).m84266t();
                return w2a1.f247311a;
            default:
                int iIntValue2 = ((Number) obj).intValue();
                n0z0 n0z0Var3 = (n0z0) obj2;
                int iM38547C2 = edb.m38547C(n0z0Var3.f149206a);
                SearchFragment searchFragment3 = this.f96075b;
                if (iM38547C2 == 0) {
                    sr31 sr31VarM3107i4 = searchFragment3.m3107i1();
                    Integer numValueOf4 = Integer.valueOf(iIntValue2);
                    String str5 = n0z0Var3.f149208c;
                    kv91 kv91Var4 = (kv91) sr31VarM3107i4.f213224b;
                    yt91 yt91VarM96903c10 = ((i8g0) sr31VarM3107i4.f213225c).f99785b.m96903c();
                    yt91VarM96903c10.f276055i.add(new bu91("content", null, null, null, null));
                    yt91VarM96903c10.f276056j = true;
                    yt91 yt91VarM96903c11 = yt91VarM96903c10.m94607a().m96903c();
                    yt91VarM96903c11.f276055i.add(new bu91("results", null, null, null, null));
                    yt91VarM96903c11.f276056j = true;
                    yt91 yt91VarM96903c12 = yt91VarM96903c11.m94607a().m96903c();
                    yt91VarM96903c12.f276055i.add(new bu91("default_item", null, numValueOf4, str5, null));
                    yt91VarM96903c12.f276056j = true;
                    zt91 zt91VarM94607a3 = yt91VarM96903c12.m94607a();
                    nu91 nu91Var = new nu91();
                    nu91Var.f248107a = zt91VarM94607a3;
                    nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
                    kv91Var4.mo57449i((ou91) nu91Var.m87248a(), null);
                } else if (iM38547C2 == 1) {
                    sr31 sr31VarM3107i5 = searchFragment3.m3107i1();
                    String str6 = n0z0Var3.f149208c;
                    kv91 kv91Var5 = (kv91) sr31VarM3107i5.f213224b;
                    yt91 yt91VarM96903c13 = ((i8g0) sr31VarM3107i5.f213225c).f99785b.m96903c();
                    yt91VarM96903c13.f276055i.add(new bu91("content", null, null, null, null));
                    yt91VarM96903c13.f276056j = true;
                    yt91 yt91VarM96903c14 = yt91VarM96903c13.m94607a().m96903c();
                    yt91VarM96903c14.f276055i.add(new bu91("results", null, null, null, null));
                    yt91VarM96903c14.f276056j = true;
                    zt91 zt91VarM94607a4 = yt91VarM96903c14.m94607a();
                    Integer numValueOf5 = Integer.valueOf(iIntValue2);
                    yt91 yt91VarM96903c15 = zt91VarM94607a4.m96903c();
                    yt91VarM96903c15.f276055i.add(new bu91("artist_item", null, numValueOf5, str6, null));
                    yt91VarM96903c15.f276056j = true;
                    zt91 zt91VarM94607a5 = yt91VarM96903c15.m94607a();
                    nu91 nu91Var2 = new nu91();
                    nu91Var2.f248107a = zt91VarM94607a5;
                    nu91Var2.f248109c = Long.valueOf(System.currentTimeMillis());
                    kv91Var5.mo57449i((ou91) nu91Var2.m87248a(), null);
                } else {
                    if (iM38547C2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    sr31 sr31VarM3107i6 = searchFragment3.m3107i1();
                    String str7 = n0z0Var3.f149208c;
                    kv91 kv91Var6 = (kv91) sr31VarM3107i6.f213224b;
                    yt91 yt91VarM96903c16 = ((i8g0) sr31VarM3107i6.f213225c).f99785b.m96903c();
                    yt91VarM96903c16.f276055i.add(new bu91("content", null, null, null, null));
                    yt91VarM96903c16.f276056j = true;
                    yt91 yt91VarM96903c17 = yt91VarM96903c16.m94607a().m96903c();
                    yt91VarM96903c17.f276055i.add(new bu91("results", null, null, null, null));
                    yt91VarM96903c17.f276056j = true;
                    zt91 zt91VarM94607a6 = yt91VarM96903c17.m94607a();
                    Integer numValueOf6 = Integer.valueOf(iIntValue2);
                    yt91 yt91VarM96903c18 = zt91VarM94607a6.m96903c();
                    yt91VarM96903c18.f276055i.add(new bu91("show_item", null, numValueOf6, str7, null));
                    yt91VarM96903c18.f276056j = true;
                    zt91 zt91VarM94607a7 = yt91VarM96903c18.m94607a();
                    nu91 nu91Var3 = new nu91();
                    nu91Var3.f248107a = zt91VarM94607a7;
                    nu91Var3.f248109c = Long.valueOf(System.currentTimeMillis());
                    kv91Var6.mo57449i((ou91) nu91Var3.m87248a(), null);
                }
                return w2a1.f247311a;
        }
    }
}
