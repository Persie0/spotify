package p204p;

import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public final class qq91 implements pq91 {

    /* JADX INFO: renamed from: a */
    public final kv91 f191513a;

    /* JADX INFO: renamed from: b */
    public final thm0 f191514b;

    public qq91(kv91 kv91Var, thm0 thm0Var) {
        this.f191513a = kv91Var;
        this.f191514b = thm0Var;
    }

    /* JADX INFO: renamed from: a */
    public final qag0 m73507a(String str) {
        return new qag0(str, this.f191514b.m80861b(j101.f107584a));
    }

    /* JADX INFO: renamed from: b */
    public final void m73508b(String str, boolean z) {
        zt91 zt91Var = m73507a(str).f186874a;
        kv91 kv91Var = this.f191513a;
        if (z) {
            yt91 yt91VarM96903c = zt91Var.m96903c();
            yt91VarM96903c.f276055i.add(new bu91("action_button", null, null, null, null));
            yt91VarM96903c.f276056j = true;
            zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
            nu91 nu91Var = new nu91();
            nu91Var.f248107a = zt91VarM94607a;
            nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
            kv91Var.mo57449i((ou91) nu91Var.m87248a(), null);
            return;
        }
        yt91 yt91VarM96903c2 = zt91Var.m96903c();
        yt91VarM96903c2.f276055i.add(new bu91("secondary_action_button", null, null, null, null));
        yt91VarM96903c2.f276056j = true;
        zt91 zt91VarM94607a2 = yt91VarM96903c2.m94607a();
        nu91 nu91Var2 = new nu91();
        nu91Var2.f248107a = zt91VarM94607a2;
        nu91Var2.f248109c = Long.valueOf(System.currentTimeMillis());
        kv91Var.mo57449i((ou91) nu91Var2.m87248a(), null);
    }

    @Override // p204p.pq91
    /* JADX INFO: renamed from: c */
    public final void mo36101c(String str) {
        yt91 yt91VarM96903c = m73507a(str).f186874a.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("back_button", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f191513a.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nau.f152117a), yt91VarM96903c.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
    }

    @Override // p204p.pq91
    /* JADX INFO: renamed from: d */
    public final void mo36102d(int i, String str, String str2) {
        yt91 yt91VarM96903c = m73507a(str).f186874a.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("filter_chips", null, null, null, null));
        yt91VarM96903c.f276056j = true;
        zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
        Integer numValueOf = Integer.valueOf(i);
        yt91 yt91VarM96903c2 = zt91VarM94607a.m96903c();
        yt91VarM96903c2.f276055i.add(new bu91("filter_chip", null, numValueOf, str2, null));
        yt91VarM96903c2.f276056j = true;
        this.f191513a.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("filter", 1, nau.f152117a), yt91VarM96903c2.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
    }

    @Override // p204p.pq91
    /* JADX INFO: renamed from: e */
    public final void mo36103e(String str) {
        yt91 yt91VarM96903c = m73507a(str).f186874a.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("search_bar", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        yt91 yt91VarM96903c2 = yt91VarM96903c.m94607a().m96903c();
        yt91VarM96903c2.f276055i.add(new bu91("input_field", null, null, null, null));
        yt91VarM96903c2.f276056j = true;
        this.f191513a.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_navigate", 1, Collections.singletonMap("destination", "")), yt91VarM96903c2.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
    }

    @Override // p204p.pq91
    /* JADX INFO: renamed from: f */
    public final void mo36104f(String str, boolean z) {
        zt91 zt91Var = m73507a(str).f186874a;
        kv91 kv91Var = this.f191513a;
        if (z) {
            yt91 yt91VarM96903c = zt91Var.m96903c();
            yt91VarM96903c.f276055i.add(new bu91("action_button", null, null, null, null));
            yt91VarM96903c.f276056j = true;
            kv91Var.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_navigate", 1, Collections.singletonMap("destination", "")), yt91VarM96903c.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
            return;
        }
        yt91 yt91VarM96903c2 = zt91Var.m96903c();
        yt91VarM96903c2.f276055i.add(new bu91("secondary_action_button", null, null, null, null));
        yt91VarM96903c2.f276056j = true;
        kv91Var.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_navigate", 1, Collections.singletonMap("destination", "")), yt91VarM96903c2.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
    }

    @Override // p204p.pq91
    /* JADX INFO: renamed from: g */
    public final void mo36105g(String str, int i, int i2, jyn0 jyn0Var) {
        boolean z = jyn0Var.f117442d;
        zt91 zt91Var = m73507a(str).f186874a;
        b221 b221Var = jyn0Var.f117441c;
        boolean z2 = b221Var instanceof it8;
        kv91 kv91Var = this.f191513a;
        nau nauVar = nau.f152117a;
        if (z2) {
            Integer numValueOf = Integer.valueOf(i);
            yt91 yt91VarM96903c = zt91Var.m96903c();
            yt91VarM96903c.f276055i.add(new bu91("banner_section", null, numValueOf, null, null));
            yt91VarM96903c.f276056j = true;
            zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
            Integer numValueOf2 = Integer.valueOf(i2);
            String str2 = ((it8) b221Var).f105460a;
            yt91 yt91VarM96903c2 = zt91VarM94607a.m96903c();
            yt91VarM96903c2.f276055i.add(new bu91("banner_button", null, numValueOf2, str2, null));
            yt91VarM96903c2.f276056j = true;
            zt91 zt91VarM94607a2 = yt91VarM96903c2.m94607a();
            kv91Var.mo57453r(z ? new av91("", "", new dv91("hit", 1), new bv91("remove_interest", 1, nauVar), zt91VarM94607a2, st91.f213865b, System.currentTimeMillis()) : new av91("", "", new dv91("hit", 1), new bv91("add_interest", 1, nauVar), zt91VarM94607a2, st91.f213865b, System.currentTimeMillis()), null);
            return;
        }
        if (b221Var instanceof bej) {
            Integer numValueOf3 = Integer.valueOf(i);
            yt91 yt91VarM96903c3 = zt91Var.m96903c();
            yt91VarM96903c3.f276055i.add(new bu91("squircle_section", null, numValueOf3, null, null));
            yt91VarM96903c3.f276056j = true;
            zt91 zt91VarM94607a3 = yt91VarM96903c3.m94607a();
            Integer numValueOf4 = Integer.valueOf(i2);
            String str3 = ((bej) b221Var).f26366a;
            yt91 yt91VarM96903c4 = zt91VarM94607a3.m96903c();
            yt91VarM96903c4.f276055i.add(new bu91("squircle_button", null, numValueOf4, str3, null));
            yt91VarM96903c4.f276056j = true;
            zt91 zt91VarM94607a4 = yt91VarM96903c4.m94607a();
            kv91Var.mo57453r(z ? new av91("", "", new dv91("hit", 1), new bv91("remove_interest", 1, nauVar), zt91VarM94607a4, st91.f213865b, System.currentTimeMillis()) : new av91("", "", new dv91("hit", 1), new bv91("add_interest", 1, nauVar), zt91VarM94607a4, st91.f213865b, System.currentTimeMillis()), null);
            return;
        }
        if (b221Var instanceof oyh0) {
            Integer numValueOf5 = Integer.valueOf(i);
            yt91 yt91VarM96903c5 = zt91Var.m96903c();
            yt91VarM96903c5.f276055i.add(new bu91("squircle_section", null, numValueOf5, null, null));
            yt91VarM96903c5.f276056j = true;
            zt91 zt91VarM94607a5 = yt91VarM96903c5.m94607a();
            Integer numValueOf6 = Integer.valueOf(i2);
            String str4 = ((oyh0) b221Var).f171767a;
            yt91 yt91VarM96903c6 = zt91VarM94607a5.m96903c();
            yt91VarM96903c6.f276055i.add(new bu91("squircle_button", null, numValueOf6, str4, null));
            yt91VarM96903c6.f276056j = true;
            kv91Var.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nauVar), yt91VarM96903c6.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m73509h(int i, String str, String str2) {
        yt91 yt91VarM96903c = m73507a(str).f186874a.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("filter_chips", null, null, null, null));
        yt91VarM96903c.f276056j = true;
        zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
        Integer numValueOf = Integer.valueOf(i);
        yt91 yt91VarM96903c2 = zt91VarM94607a.m96903c();
        yt91VarM96903c2.f276055i.add(new bu91("filter_chip", null, numValueOf, str2, null));
        yt91VarM96903c2.f276056j = true;
        zt91 zt91VarM94607a2 = yt91VarM96903c2.m94607a();
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = zt91VarM94607a2;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        this.f191513a.mo57449i((ou91) nu91Var.m87248a(), null);
    }

    /* JADX INFO: renamed from: i */
    public final void m73510i(String str, int i, myn0 myn0Var) {
        zt91 zt91Var = m73507a(str).f186874a;
        if (myn0Var instanceof jyn0) {
            jyn0 jyn0Var = (jyn0) myn0Var;
            int i2 = jyn0Var.f117440b;
            b221 b221Var = jyn0Var.f117441c;
            boolean z = b221Var instanceof it8;
            kv91 kv91Var = this.f191513a;
            if (z) {
                Integer numValueOf = Integer.valueOf(i2);
                yt91 yt91VarM96903c = zt91Var.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("banner_section", null, numValueOf, null, null));
                yt91VarM96903c.f276056j = true;
                zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
                Integer numValueOf2 = Integer.valueOf(i);
                String str2 = ((it8) b221Var).f105460a;
                yt91 yt91VarM96903c2 = zt91VarM94607a.m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("banner_button", null, numValueOf2, str2, null));
                yt91VarM96903c2.f276056j = true;
                zt91 zt91VarM94607a2 = yt91VarM96903c2.m94607a();
                nu91 nu91Var = new nu91();
                nu91Var.f248107a = zt91VarM94607a2;
                nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
                kv91Var.mo57449i((ou91) nu91Var.m87248a(), null);
                return;
            }
            if (b221Var instanceof bej) {
                Integer numValueOf3 = Integer.valueOf(i2);
                yt91 yt91VarM96903c3 = zt91Var.m96903c();
                yt91VarM96903c3.f276055i.add(new bu91("squircle_section", null, numValueOf3, null, null));
                yt91VarM96903c3.f276056j = true;
                zt91 zt91VarM94607a3 = yt91VarM96903c3.m94607a();
                Integer numValueOf4 = Integer.valueOf(i);
                String str3 = ((bej) b221Var).f26366a;
                yt91 yt91VarM96903c4 = zt91VarM94607a3.m96903c();
                yt91VarM96903c4.f276055i.add(new bu91("squircle_button", null, numValueOf4, str3, null));
                yt91VarM96903c4.f276056j = true;
                zt91 zt91VarM94607a4 = yt91VarM96903c4.m94607a();
                nu91 nu91Var2 = new nu91();
                nu91Var2.f248107a = zt91VarM94607a4;
                nu91Var2.f248109c = Long.valueOf(System.currentTimeMillis());
                kv91Var.mo57449i((ou91) nu91Var2.m87248a(), null);
                return;
            }
            if (b221Var instanceof oyh0) {
                Integer numValueOf5 = Integer.valueOf(i2);
                yt91 yt91VarM96903c5 = zt91Var.m96903c();
                yt91VarM96903c5.f276055i.add(new bu91("squircle_section", null, numValueOf5, null, null));
                yt91VarM96903c5.f276056j = true;
                zt91 zt91VarM94607a5 = yt91VarM96903c5.m94607a();
                Integer numValueOf6 = Integer.valueOf(i);
                String str4 = ((oyh0) b221Var).f171767a;
                yt91 yt91VarM96903c6 = zt91VarM94607a5.m96903c();
                yt91VarM96903c6.f276055i.add(new bu91("squircle_button", null, numValueOf6, str4, null));
                yt91VarM96903c6.f276056j = true;
                zt91 zt91VarM94607a6 = yt91VarM96903c6.m94607a();
                nu91 nu91Var3 = new nu91();
                nu91Var3.f248107a = zt91VarM94607a6;
                nu91Var3.f248109c = Long.valueOf(System.currentTimeMillis());
                kv91Var.mo57449i((ou91) nu91Var3.m87248a(), null);
            }
        }
    }
}
