package p204p;

import java.util.Collections;

/* JADX INFO: loaded from: classes8.dex */
public final class gtp implements ic81, cg81, dmc {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f84252a;

    /* JADX INFO: renamed from: b */
    public final i4t0 f84253b;

    /* JADX INFO: renamed from: c */
    public final xt91 f84254c;

    /* JADX INFO: renamed from: d */
    public final wg61 f84255d;

    public gtp(e5n e5nVar, ahg0 ahg0Var) {
        this.f84252a = 0;
        this.f84253b = e5nVar;
        this.f84254c = ahg0Var;
        this.f84255d = new wg61(new wep(this, 12));
    }

    @Override // p204p.ic81
    /* JADX INFO: renamed from: a */
    public final av91 mo42676a(fc81 fc81Var, String str, am81 am81Var) {
        av91 av91Var;
        switch (this.f84252a) {
            case 0:
                ahg0 ahg0Var = (ahg0) this.f84254c;
                long j = am81Var.f17061b;
                long j2 = am81Var.f17060a;
                return fc81Var == fc81.f68028a ? new sxg0(ahg0Var, (byte) 0).m79611w(str, Integer.valueOf((int) j2), Integer.valueOf((int) j)) : new sxg0(ahg0Var, (byte) 0).m79612x(str, Integer.valueOf((int) j2), Integer.valueOf((int) j));
            case 1:
                ahg0 ahg0Var2 = (ahg0) this.f84254c;
                long j3 = am81Var.f17061b;
                long j4 = am81Var.f17060a;
                return fc81Var == fc81.f68028a ? new sxg0(ahg0Var2, (byte) 0).m79611w(str, Integer.valueOf((int) j4), Integer.valueOf((int) j3)) : new sxg0(ahg0Var2, (byte) 0).m79612x(str, Integer.valueOf((int) j4), Integer.valueOf((int) j3));
            default:
                zt91 zt91Var = ((ahg0) this.f84254c).f15692b;
                long j5 = am81Var.f17061b;
                long j6 = am81Var.f17060a;
                if (fc81Var == fc81.f68028a) {
                    yt91 yt91VarM96903c = zt91Var.m96903c();
                    yt91VarM96903c.f276055i.add(new bu91("cover_art", null, null, null, null));
                    yt91VarM96903c.f276056j = false;
                    zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
                    int i = (int) j6;
                    int i2 = (int) j5;
                    dv91 dv91Var = new dv91("swipe", 1);
                    String string = str.toString();
                    if (string == null) {
                        string = "";
                    }
                    pqm0 pqm0Var = new pqm0("item_to_be_skipped", string);
                    String strValueOf = String.valueOf(i);
                    if (strValueOf == null) {
                        strValueOf = "";
                    }
                    pqm0 pqm0Var2 = new pqm0("position_ms", strValueOf);
                    String strValueOf2 = String.valueOf(i2);
                    av91Var = new av91("", "", dv91Var, new bv91("skip_to_next", 2, kkc0.m56695h0(pqm0Var, pqm0Var2, new pqm0("total_content_ms", strValueOf2 != null ? strValueOf2 : ""))), zt91VarM94607a, st91.f213865b, System.currentTimeMillis());
                } else {
                    yt91 yt91VarM96903c2 = zt91Var.m96903c();
                    yt91VarM96903c2.f276055i.add(new bu91("cover_art", null, null, null, null));
                    yt91VarM96903c2.f276056j = false;
                    zt91 zt91VarM94607a2 = yt91VarM96903c2.m94607a();
                    int i3 = (int) j6;
                    int i4 = (int) j5;
                    dv91 dv91Var2 = new dv91("swipe", 1);
                    String string2 = str.toString();
                    if (string2 == null) {
                        string2 = "";
                    }
                    pqm0 pqm0Var3 = new pqm0("item_to_be_skipped", string2);
                    String strValueOf3 = String.valueOf(i3);
                    if (strValueOf3 == null) {
                        strValueOf3 = "";
                    }
                    pqm0 pqm0Var4 = new pqm0("position_ms", strValueOf3);
                    String strValueOf4 = String.valueOf(i4);
                    av91Var = new av91("", "", dv91Var2, new bv91("skip_to_previous", 2, kkc0.m56695h0(pqm0Var3, pqm0Var4, new pqm0("total_content_ms", strValueOf4 != null ? strValueOf4 : ""))), zt91VarM94607a2, st91.f213865b, System.currentTimeMillis());
                }
                return av91Var;
        }
    }

    @Override // p204p.cg81
    /* JADX INFO: renamed from: b */
    public final d850 mo32684b(yf81 yf81Var, String str) {
        av91 av91Var;
        av91 av91Var2;
        av91 av91Var3;
        switch (this.f84252a) {
            case 0:
                zt91 zt91Var = ((ahg0) this.f84254c).f15692b;
                kv91 kv91Var = (kv91) this.f84255d.getValue();
                if (yf81Var == yf81.f272179a) {
                    yt91 yt91VarM96903c = zt91Var.m96903c();
                    yt91VarM96903c.f276055i.add(new bu91("track_information", null, null, null, null));
                    yt91VarM96903c.f276056j = false;
                    yt91 yt91VarM96903c2 = yt91VarM96903c.m94607a().m96903c();
                    yt91VarM96903c2.f276055i.add(new bu91("labels", null, null, null, null));
                    yt91VarM96903c2.f276056j = false;
                    yt91 yt91VarM96903c3 = yt91VarM96903c2.m94607a().m96903c();
                    yt91VarM96903c3.f276055i.add(new bu91("title_label", null, null, null, null));
                    yt91VarM96903c3.f276056j = false;
                    zt91 zt91VarM94607a = yt91VarM96903c3.m94607a();
                    dv91 dv91Var = new dv91("hit", 1);
                    String string = str.toString();
                    av91Var = new av91("", "", dv91Var, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string != null ? string : "")), zt91VarM94607a, st91.f213865b, System.currentTimeMillis());
                } else {
                    yt91 yt91VarM96903c4 = zt91Var.m96903c();
                    yt91VarM96903c4.f276055i.add(new bu91("track_information", null, null, null, null));
                    yt91VarM96903c4.f276056j = false;
                    yt91 yt91VarM96903c5 = yt91VarM96903c4.m94607a().m96903c();
                    yt91VarM96903c5.f276055i.add(new bu91("labels", null, null, null, null));
                    yt91VarM96903c5.f276056j = false;
                    yt91 yt91VarM96903c6 = yt91VarM96903c5.m94607a().m96903c();
                    yt91VarM96903c6.f276055i.add(new bu91("artist_label", null, null, null, null));
                    yt91VarM96903c6.f276056j = false;
                    zt91 zt91VarM94607a2 = yt91VarM96903c6.m94607a();
                    dv91 dv91Var2 = new dv91("hit", 1);
                    String string2 = str.toString();
                    av91Var = new av91("", "", dv91Var2, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string2 != null ? string2 : "")), zt91VarM94607a2, st91.f213865b, System.currentTimeMillis());
                }
                return kv91Var.mo57453r(av91Var, null);
            case 1:
                zt91 zt91Var2 = ((ahg0) this.f84254c).f15692b;
                kv91 kv91Var2 = (kv91) this.f84255d.getValue();
                if (yf81Var == yf81.f272179a) {
                    yt91 yt91VarM96903c7 = zt91Var2.m96903c();
                    yt91VarM96903c7.f276055i.add(new bu91("track_information", null, null, null, null));
                    yt91VarM96903c7.f276056j = false;
                    yt91 yt91VarM96903c8 = yt91VarM96903c7.m94607a().m96903c();
                    yt91VarM96903c8.f276055i.add(new bu91("labels", null, null, null, null));
                    yt91VarM96903c8.f276056j = false;
                    yt91 yt91VarM96903c9 = yt91VarM96903c8.m94607a().m96903c();
                    yt91VarM96903c9.f276055i.add(new bu91("title_label", null, null, null, null));
                    yt91VarM96903c9.f276056j = false;
                    zt91 zt91VarM94607a3 = yt91VarM96903c9.m94607a();
                    dv91 dv91Var3 = new dv91("hit", 1);
                    String string3 = str.toString();
                    av91Var2 = new av91("", "", dv91Var3, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string3 != null ? string3 : "")), zt91VarM94607a3, st91.f213865b, System.currentTimeMillis());
                } else {
                    yt91 yt91VarM96903c10 = zt91Var2.m96903c();
                    yt91VarM96903c10.f276055i.add(new bu91("track_information", null, null, null, null));
                    yt91VarM96903c10.f276056j = false;
                    yt91 yt91VarM96903c11 = yt91VarM96903c10.m94607a().m96903c();
                    yt91VarM96903c11.f276055i.add(new bu91("labels", null, null, null, null));
                    yt91VarM96903c11.f276056j = false;
                    yt91 yt91VarM96903c12 = yt91VarM96903c11.m94607a().m96903c();
                    yt91VarM96903c12.f276055i.add(new bu91("artist_label", null, null, null, null));
                    yt91VarM96903c12.f276056j = false;
                    zt91 zt91VarM94607a4 = yt91VarM96903c12.m94607a();
                    dv91 dv91Var4 = new dv91("hit", 1);
                    String string4 = str.toString();
                    av91Var2 = new av91("", "", dv91Var4, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string4 != null ? string4 : "")), zt91VarM94607a4, st91.f213865b, System.currentTimeMillis());
                }
                return kv91Var2.mo57453r(av91Var2, null);
            default:
                zt91 zt91Var3 = ((ahg0) this.f84254c).f15692b;
                kv91 kv91Var3 = (kv91) this.f84255d.getValue();
                if (yf81Var == yf81.f272179a) {
                    yt91 yt91VarM96903c13 = zt91Var3.m96903c();
                    yt91VarM96903c13.f276055i.add(new bu91("track_information", null, null, null, null));
                    yt91VarM96903c13.f276056j = false;
                    yt91 yt91VarM96903c14 = yt91VarM96903c13.m94607a().m96903c();
                    yt91VarM96903c14.f276055i.add(new bu91("labels", null, null, null, null));
                    yt91VarM96903c14.f276056j = false;
                    yt91 yt91VarM96903c15 = yt91VarM96903c14.m94607a().m96903c();
                    yt91VarM96903c15.f276055i.add(new bu91("title_label", null, null, null, null));
                    yt91VarM96903c15.f276056j = false;
                    zt91 zt91VarM94607a5 = yt91VarM96903c15.m94607a();
                    dv91 dv91Var5 = new dv91("hit", 1);
                    String string5 = str.toString();
                    av91Var3 = new av91("", "", dv91Var5, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string5 != null ? string5 : "")), zt91VarM94607a5, st91.f213865b, System.currentTimeMillis());
                } else {
                    yt91 yt91VarM96903c16 = zt91Var3.m96903c();
                    yt91VarM96903c16.f276055i.add(new bu91("track_information", null, null, null, null));
                    yt91VarM96903c16.f276056j = false;
                    yt91 yt91VarM96903c17 = yt91VarM96903c16.m94607a().m96903c();
                    yt91VarM96903c17.f276055i.add(new bu91("labels", null, null, null, null));
                    yt91VarM96903c17.f276056j = false;
                    yt91 yt91VarM96903c18 = yt91VarM96903c17.m94607a().m96903c();
                    yt91VarM96903c18.f276055i.add(new bu91("artist_label", null, null, null, null));
                    yt91VarM96903c18.f276056j = false;
                    zt91 zt91VarM94607a6 = yt91VarM96903c18.m94607a();
                    dv91 dv91Var6 = new dv91("hit", 1);
                    String string6 = str.toString();
                    av91Var3 = new av91("", "", dv91Var6, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string6 != null ? string6 : "")), zt91VarM94607a6, st91.f213865b, System.currentTimeMillis());
                }
                return kv91Var3.mo57453r(av91Var3, null);
        }
    }

    @Override // p204p.dmc
    /* JADX INFO: renamed from: c */
    public av91 mo36405c(String str, String str2) {
        yt91 yt91VarM96903c = ((ahg0) this.f84254c).f15692b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("track_information", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        yt91 yt91VarM96903c2 = yt91VarM96903c.m94607a().m96903c();
        yt91VarM96903c2.f276055i.add(new bu91("labels", null, null, null, null));
        yt91VarM96903c2.f276056j = false;
        yt91 yt91VarM96903c3 = yt91VarM96903c2.m94607a().m96903c();
        yt91VarM96903c3.f276055i.add(new bu91("neffle_button", null, null, str, null));
        yt91VarM96903c3.f276056j = false;
        zt91 zt91VarM94607a = yt91VarM96903c3.m94607a();
        if (str2 == null) {
            return new av91("", "", new dv91("hit", 1), new bv91("refresh_content", 1, nau.f152117a), zt91VarM94607a, st91.f213865b, System.currentTimeMillis());
        }
        dv91 dv91Var = new dv91("hit", 1);
        String string = str2.toString();
        if (string == null) {
            string = "";
        }
        return new av91("", "", dv91Var, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string)), zt91VarM94607a, st91.f213865b, System.currentTimeMillis());
    }

    @Override // p204p.dmc
    /* JADX INFO: renamed from: d */
    public av91 mo36406d(String str, String str2) {
        yt91 yt91VarM96903c = ((ahg0) this.f84254c).f15692b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("track_information", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        yt91 yt91VarM96903c2 = yt91VarM96903c.m94607a().m96903c();
        yt91VarM96903c2.f276055i.add(new bu91("labels", null, null, null, null));
        yt91VarM96903c2.f276056j = false;
        yt91 yt91VarM96903c3 = yt91VarM96903c2.m94607a().m96903c();
        yt91VarM96903c3.f276055i.add(new bu91("neffle_button", null, null, str, null));
        yt91VarM96903c3.f276056j = false;
        zt91 zt91VarM94607a = yt91VarM96903c3.m94607a();
        if (str2 == null) {
            return new av91("", "", new dv91("long_hit", 1), new bv91("ui_reveal", 1, nau.f152117a), zt91VarM94607a, st91.f213865b, System.currentTimeMillis());
        }
        dv91 dv91Var = new dv91("long_hit", 1);
        String string = str2.toString();
        if (string == null) {
            string = "";
        }
        return new av91("", "", dv91Var, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string)), zt91VarM94607a, st91.f213865b, System.currentTimeMillis());
    }

    public gtp(a7n a7nVar, ahg0 ahg0Var) {
        this.f84252a = 1;
        this.f84253b = a7nVar;
        this.f84254c = ahg0Var;
        this.f84255d = new wg61(new gst0(this, 26));
    }

    public gtp(e5n e5nVar, ahg0 ahg0Var, byte b) {
        this.f84252a = 2;
        this.f84253b = e5nVar;
        this.f84254c = ahg0Var;
        this.f84255d = new wg61(new fts(this, 15));
    }
}
