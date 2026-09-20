package p204p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class eag0 implements xt91 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f57665a;

    /* JADX INFO: renamed from: b */
    public final st91 f57666b;

    /* JADX INFO: renamed from: c */
    public final zt91 f57667c;

    /* JADX INFO: renamed from: d */
    public final List f57668d;

    public eag0() {
        this.f57665a = 1;
        this.f57666b = st91.f213865b;
        zt91 zt91Var = zt91.f286105i;
        yt91 yt91VarM50626j = ihf1.m50626j();
        yt91VarM50626j.f276054h = "music";
        yt91VarM50626j.f276047a = "mobile-external-accessory";
        yt91VarM50626j.f276052f = "11.2.0";
        yt91VarM50626j.f276053g = "20.0.5";
        this.f57667c = yt91VarM50626j.m94607a();
        this.f57668d = Collections.singletonList("any");
    }

    /* JADX INFO: renamed from: a */
    public av91 m38285a(String str) {
        dv91 dv91Var = new dv91("hit", 1);
        String string = str != null ? str.toString() : null;
        if (string == null) {
            string = "";
        }
        return new av91("", "", dv91Var, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string)), this.f57667c, this.f57666b, System.currentTimeMillis());
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        int i = this.f57665a;
        st91 st91Var = this.f57666b;
        zt91 zt91Var = this.f57667c;
        switch (i) {
            case 0:
                st91 st91Var2 = st91.f213865b;
                ArrayList arrayList = new ArrayList();
                if (st91Var != null) {
                    arrayList.addAll(st91Var.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
            case 1:
                st91 st91Var3 = st91.f213865b;
                ArrayList arrayList2 = new ArrayList();
                if (st91Var != null) {
                    arrayList2.addAll(st91Var.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList2, zt91Var, arrayList2);
            case 2:
                st91 st91Var4 = st91.f213865b;
                ArrayList arrayList3 = new ArrayList();
                if (st91Var != null) {
                    arrayList3.addAll(st91Var.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList3, zt91Var, arrayList3);
            case 3:
                st91 st91Var5 = st91.f213865b;
                ArrayList arrayList4 = new ArrayList();
                if (st91Var != null) {
                    arrayList4.addAll(st91Var.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList4, zt91Var, arrayList4);
            default:
                st91 st91Var6 = st91.f213865b;
                ArrayList arrayList5 = new ArrayList();
                if (st91Var != null) {
                    arrayList5.addAll(st91Var.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList5, zt91Var, arrayList5);
        }
    }

    /* JADX INFO: renamed from: e */
    public av91 m38286e(String str) {
        dv91 dv91Var = new dv91("hit", 1);
        String string = str != null ? str.toString() : null;
        if (string == null) {
            string = "";
        }
        return new av91("", "", dv91Var, new bv91("add_item_to_queue", 1, Collections.singletonMap("item_to_add_to_queue", string)), this.f57667c, this.f57666b, System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: h */
    public av91 m38287h(String str) {
        dv91 dv91Var = new dv91("hit", 1);
        String string = str != null ? str.toString() : null;
        if (string == null) {
            string = "";
        }
        return new av91("", "", dv91Var, new bv91("create_radio", 1, Collections.singletonMap("based_on_item", string)), this.f57667c, this.f57666b, System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: i */
    public av91 m38288i(String str) {
        dv91 dv91Var = new dv91("hit", 1);
        String string = str.toString();
        if (string == null) {
            string = "";
        }
        return new av91("", "", dv91Var, new bv91("disconnect_from_remote_device", 1, Collections.singletonMap("remote_device_id", string)), this.f57667c, this.f57666b, System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: j */
    public av91 m38289j(String str) {
        dv91 dv91Var = new dv91("hit", 1);
        String string = str != null ? str.toString() : null;
        if (string == null) {
            string = "";
        }
        return new av91("", "", dv91Var, new bv91("play", 1, Collections.singletonMap("item_to_be_played", string)), this.f57667c, this.f57666b, System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: k */
    public av91 m38290k() {
        return new av91("", "", new dv91("hit", 1), new bv91("play_something", 1, nau.f152117a), this.f57667c, this.f57666b, System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: l */
    public av91 m38291l() {
        return new av91("", "", new dv91("hit", 1), new bv91("repeat_disable", 1, nau.f152117a), this.f57667c, this.f57666b, System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: m */
    public av91 m38292m() {
        return new av91("", "", new dv91("hit", 1), new bv91("repeat_enable", 1, nau.f152117a), this.f57667c, this.f57666b, System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: n */
    public av91 m38293n() {
        return new av91("", "", new dv91("hit", 1), new bv91("repeat_one_enable", 1, nau.f152117a), this.f57667c, this.f57666b, System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: o */
    public av91 m38294o() {
        return new av91("", "", new dv91("hit", 1), new bv91("search", 1, nau.f152117a), this.f57667c, this.f57666b, System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: p */
    public av91 m38295p(Integer num) {
        dv91 dv91Var = new dv91("hit", 1);
        String strValueOf = String.valueOf(num.intValue());
        if (strValueOf == null) {
            strValueOf = "";
        }
        return new av91("", "", dv91Var, new bv91("seek_by_time", 1, Collections.singletonMap("ms_seeked_offset", strValueOf)), this.f57667c, this.f57666b, System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: q */
    public av91 m38296q(Integer num) {
        dv91 dv91Var = new dv91("hit", 1);
        String strValueOf = String.valueOf(num.intValue());
        if (strValueOf == null) {
            strValueOf = "";
        }
        return new av91("", "", dv91Var, new bv91("seek_to_time", 1, Collections.singletonMap("ms_to_seek_to", strValueOf)), this.f57667c, this.f57666b, System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: r */
    public av91 m38297r(int i, int i2) {
        String str;
        String str2;
        dv91 dv91Var = new dv91("hit", 1);
        if (i == 1) {
            str = "linear";
        } else if (i == 2) {
            str = "shuffle";
        } else {
            if (i != 3) {
                throw null;
            }
            str = "smart_shuffle";
        }
        pqm0 pqm0Var = new pqm0("previous_mode", str);
        if (i2 == 1) {
            str2 = "linear";
        } else if (i2 == 2) {
            str2 = "shuffle";
        } else {
            if (i2 != 3) {
                throw null;
            }
            str2 = "smart_shuffle";
        }
        return new av91("", "", dv91Var, new bv91("select_shuffle_mode", 1, kkc0.m56695h0(pqm0Var, new pqm0("selected_mode", str2))), this.f57667c, this.f57666b, System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: s */
    public av91 m38298s(String str) {
        dv91 dv91Var = new dv91("speech", 1);
        String string = str != null ? str.toString() : null;
        if (string == null) {
            string = "";
        }
        return new av91("", "", dv91Var, new bv91("play", 1, Collections.singletonMap("item_to_be_played", string)), this.f57667c, this.f57666b, System.currentTimeMillis());
    }

    public eag0(String str, st91 st91Var) {
        this.f57665a = 3;
        this.f57666b = st91Var;
        zt91 zt91Var = zt91.f286105i;
        yt91 yt91VarM50626j = ihf1.m50626j();
        yt91VarM50626j.f276054h = "music";
        yt91VarM50626j.f276047a = "mobile-smart-shuffle-page-recs";
        yt91VarM50626j.f276052f = "2.0.0";
        yt91VarM50626j.f276053g = "20.0.5";
        yt91VarM50626j.f276050d = str;
        this.f57667c = yt91VarM50626j.m94607a();
        this.f57668d = Collections.singletonList("smartshuffle/npvrecommendations/fullscreen");
    }

    public eag0(st91 st91Var, int i) {
        this.f57665a = i;
        switch (i) {
            case 4:
                this.f57666b = st91Var;
                zt91 zt91Var = zt91.f286105i;
                yt91 yt91VarM50626j = ihf1.m50626j();
                yt91VarM50626j.f276054h = "music";
                yt91VarM50626j.f276047a = "mobile-song-dna-blend-header";
                yt91VarM50626j.f276052f = "5.0.0";
                yt91VarM50626j.f276053g = "20.0.5";
                this.f57667c = yt91VarM50626j.m94607a();
                this.f57668d = h6f.m46715L("blend-dna", "artists-dna");
                break;
            default:
                this.f57666b = st91Var;
                zt91 zt91Var2 = zt91.f286105i;
                yt91 yt91VarM50626j2 = ihf1.m50626j();
                yt91VarM50626j2.f276054h = "music";
                yt91VarM50626j2.f276047a = "mobile-album-entity-unlock-card-section";
                yt91VarM50626j2.f276052f = "2.0.0";
                yt91VarM50626j2.f276053g = "20.0.5";
                this.f57667c = yt91VarM50626j2.m94607a();
                this.f57668d = Collections.singletonList("album");
                break;
        }
    }

    public eag0(int i, st91 st91Var) {
        String str;
        this.f57665a = 2;
        this.f57666b = st91Var;
        zt91 zt91Var = zt91.f286105i;
        yt91 yt91VarM50626j = ihf1.m50626j();
        yt91VarM50626j.f276054h = "music";
        yt91VarM50626j.f276047a = "mobile-now-playing-view-action-shift";
        yt91VarM50626j.f276052f = "8.1.0";
        yt91VarM50626j.f276053g = "20.0.5";
        if (i == 1) {
            str = "music_video";
        } else {
            if (i != 2) {
                throw null;
            }
            str = "podcast";
        }
        yt91VarM50626j.f276051e = str;
        this.f57667c = yt91VarM50626j.m94607a();
        this.f57668d = Collections.singletonList("nowplaying");
    }
}
