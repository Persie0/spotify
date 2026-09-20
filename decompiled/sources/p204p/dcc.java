package p204p;

import java.util.Collections;

/* JADX INFO: loaded from: classes8.dex */
public abstract class dcc {
    /* JADX INFO: renamed from: a */
    public static final av91 m35639a(String str, ahg0 ahg0Var, String str2, boolean z) {
        String string;
        zt91 zt91Var = ahg0Var.f15692b;
        if (str.equals("notify-music-and-artist-recommendations")) {
            yt91 yt91VarM96903c = zt91Var.m96903c();
            yt91VarM96903c.f276055i.add(new bu91("music_and_artist_recommendations_section", null, null, null, null));
            yt91VarM96903c.f276056j = false;
            zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
            dv91 dv91Var = new dv91("hit", 1);
            string = str2 != null ? str2.toString() : null;
            return new av91("", "", dv91Var, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string != null ? string : "")), zt91VarM94607a, st91.f213865b, System.currentTimeMillis());
        }
        if (str.equals("notify-in-person-concerts-and-events")) {
            yt91 yt91VarM96903c2 = zt91Var.m96903c();
            yt91VarM96903c2.f276055i.add(new bu91("in_person_concert_and_events_section", null, null, null, null));
            yt91VarM96903c2.f276056j = false;
            zt91 zt91VarM94607a2 = yt91VarM96903c2.m94607a();
            dv91 dv91Var2 = new dv91("hit", 1);
            string = str2 != null ? str2.toString() : null;
            return new av91("", "", dv91Var2, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string != null ? string : "")), zt91VarM94607a2, st91.f213865b, System.currentTimeMillis());
        }
        if (str.equals("notify-spotify-offers-and-bundles")) {
            yt91 yt91VarM96903c3 = zt91Var.m96903c();
            yt91VarM96903c3.f276055i.add(new bu91("spotify_offers_and_bundles_section", null, null, null, null));
            yt91VarM96903c3.f276056j = false;
            zt91 zt91VarM94607a3 = yt91VarM96903c3.m94607a();
            dv91 dv91Var3 = new dv91("hit", 1);
            string = str2 != null ? str2.toString() : null;
            return new av91("", "", dv91Var3, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string != null ? string : "")), zt91VarM94607a3, st91.f213865b, System.currentTimeMillis());
        }
        if (str.equals("notify-spotify-experiences-made-for-you")) {
            yt91 yt91VarM96903c4 = zt91Var.m96903c();
            yt91VarM96903c4.f276055i.add(new bu91("spotify_experiences_made_for_you_section", null, null, null, null));
            yt91VarM96903c4.f276056j = false;
            zt91 zt91VarM94607a4 = yt91VarM96903c4.m94607a();
            dv91 dv91Var4 = new dv91("hit", 1);
            string = str2 != null ? str2.toString() : null;
            return new av91("", "", dv91Var4, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string != null ? string : "")), zt91VarM94607a4, st91.f213865b, System.currentTimeMillis());
        }
        if (str.equals("notify-podcast-and-show-recommendations")) {
            yt91 yt91VarM96903c5 = zt91Var.m96903c();
            yt91VarM96903c5.f276055i.add(new bu91("podcast_and_show_recommendations_section", null, null, null, null));
            yt91VarM96903c5.f276056j = false;
            zt91 zt91VarM94607a5 = yt91VarM96903c5.m94607a();
            dv91 dv91Var5 = new dv91("hit", 1);
            string = str2 != null ? str2.toString() : null;
            return new av91("", "", dv91Var5, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string != null ? string : "")), zt91VarM94607a5, st91.f213865b, System.currentTimeMillis());
        }
        if (str.equals("notify-livestream-and-virtual-events")) {
            yt91 yt91VarM96903c6 = zt91Var.m96903c();
            yt91VarM96903c6.f276055i.add(new bu91("livestreams_and_virtual_events_section", null, null, null, null));
            yt91VarM96903c6.f276056j = false;
            zt91 zt91VarM94607a6 = yt91VarM96903c6.m94607a();
            dv91 dv91Var6 = new dv91("hit", 1);
            string = str2 != null ? str2.toString() : null;
            return new av91("", "", dv91Var6, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string != null ? string : "")), zt91VarM94607a6, st91.f213865b, System.currentTimeMillis());
        }
        if (str.equals("notify-spotify-features-and-tips")) {
            yt91 yt91VarM96903c7 = zt91Var.m96903c();
            yt91VarM96903c7.f276055i.add(new bu91("spotify_features_and_tips_section", null, null, null, null));
            yt91VarM96903c7.f276056j = false;
            zt91 zt91VarM94607a7 = yt91VarM96903c7.m94607a();
            dv91 dv91Var7 = new dv91("hit", 1);
            string = str2 != null ? str2.toString() : null;
            return new av91("", "", dv91Var7, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string != null ? string : "")), zt91VarM94607a7, st91.f213865b, System.currentTimeMillis());
        }
        if (str.equals("notify-surveys")) {
            yt91 yt91VarM96903c8 = zt91Var.m96903c();
            yt91VarM96903c8.f276055i.add(new bu91("surveys_section", null, null, null, null));
            yt91VarM96903c8.f276056j = false;
            zt91 zt91VarM94607a8 = yt91VarM96903c8.m94607a();
            dv91 dv91Var8 = new dv91("hit", 1);
            string = str2 != null ? str2.toString() : null;
            return new av91("", "", dv91Var8, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string != null ? string : "")), zt91VarM94607a8, st91.f213865b, System.currentTimeMillis());
        }
        if (str.equals("notify-news-and-cultural-moments")) {
            yt91 yt91VarM96903c9 = zt91Var.m96903c();
            yt91VarM96903c9.f276055i.add(new bu91("news_and_cultural_moments_section", null, null, null, null));
            yt91VarM96903c9.f276056j = false;
            zt91 zt91VarM94607a9 = yt91VarM96903c9.m94607a();
            dv91 dv91Var9 = new dv91("hit", 1);
            string = str2 != null ? str2.toString() : null;
            return new av91("", "", dv91Var9, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string != null ? string : "")), zt91VarM94607a9, st91.f213865b, System.currentTimeMillis());
        }
        if (str.equals("notify-artist-and-creator-merchandise")) {
            yt91 yt91VarM96903c10 = zt91Var.m96903c();
            yt91VarM96903c10.f276055i.add(new bu91("artist_and_creator_merchandis_section", null, null, null, null));
            yt91VarM96903c10.f276056j = false;
            zt91 zt91VarM94607a10 = yt91VarM96903c10.m94607a();
            dv91 dv91Var10 = new dv91("hit", 1);
            string = str2 != null ? str2.toString() : null;
            return new av91("", "", dv91Var10, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string != null ? string : "")), zt91VarM94607a10, st91.f213865b, System.currentTimeMillis());
        }
        if (str.equals("notify-audiobooks")) {
            yt91 yt91VarM96903c11 = zt91Var.m96903c();
            yt91VarM96903c11.f276055i.add(new bu91("audiobooks_section", null, null, null, null));
            yt91VarM96903c11.f276056j = false;
            zt91 zt91VarM94607a11 = yt91VarM96903c11.m94607a();
            dv91 dv91Var11 = new dv91("hit", 1);
            string = str2 != null ? str2.toString() : null;
            return new av91("", "", dv91Var11, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string != null ? string : "")), zt91VarM94607a11, st91.f213865b, System.currentTimeMillis());
        }
        if (str.equals("notify-prompted-experiences")) {
            yt91 yt91VarM96903c12 = zt91Var.m96903c();
            yt91VarM96903c12.f276055i.add(new bu91("prompted_experience_section", null, null, null, null));
            yt91VarM96903c12.f276056j = false;
            zt91 zt91VarM94607a12 = yt91VarM96903c12.m94607a();
            dv91 dv91Var12 = new dv91("hit", 1);
            string = str2 != null ? str2.toString() : null;
            return new av91("", "", dv91Var12, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string != null ? string : "")), zt91VarM94607a12, st91.f213865b, System.currentTimeMillis());
        }
        if (str.equals("notify-comments-reactions")) {
            yt91 yt91VarM96903c13 = zt91Var.m96903c();
            yt91VarM96903c13.f276055i.add(new bu91("comments_reactions_section", null, null, null, null));
            yt91VarM96903c13.f276056j = false;
            zt91 zt91VarM94607a13 = yt91VarM96903c13.m94607a();
            dv91 dv91Var13 = new dv91("hit", 1);
            string = str2 != null ? str2.toString() : null;
            return new av91("", "", dv91Var13, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string != null ? string : "")), zt91VarM94607a13, st91.f213865b, System.currentTimeMillis());
        }
        if (str.equals("notify-comments-replies")) {
            yt91 yt91VarM96903c14 = zt91Var.m96903c();
            yt91VarM96903c14.f276055i.add(new bu91("comments_replies_section", null, null, null, null));
            yt91VarM96903c14.f276056j = false;
            zt91 zt91VarM94607a14 = yt91VarM96903c14.m94607a();
            dv91 dv91Var14 = new dv91("hit", 1);
            string = str2 != null ? str2.toString() : null;
            return new av91("", "", dv91Var14, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string != null ? string : "")), zt91VarM94607a14, st91.f213865b, System.currentTimeMillis());
        }
        if (str.equals("notify-comments")) {
            yt91 yt91VarM96903c15 = zt91Var.m96903c();
            yt91VarM96903c15.f276055i.add(new bu91("social_section", null, null, null, null));
            yt91VarM96903c15.f276056j = false;
            yt91 yt91VarM96903c16 = yt91VarM96903c15.m94607a().m96903c();
            yt91VarM96903c16.f276055i.add(new bu91("comments_section", null, null, null, null));
            yt91VarM96903c16.f276056j = false;
            zt91 zt91VarM94607a15 = yt91VarM96903c16.m94607a();
            dv91 dv91Var15 = new dv91("hit", 1);
            string = str2 != null ? str2.toString() : null;
            return new av91("", "", dv91Var15, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string != null ? string : "")), zt91VarM94607a15, st91.f213865b, System.currentTimeMillis());
        }
        if (str.equals("notify-jam")) {
            if (z) {
                yt91 yt91VarM96903c17 = zt91Var.m96903c();
                yt91VarM96903c17.f276055i.add(new bu91("jam_section", null, null, null, null));
                yt91VarM96903c17.f276056j = false;
                zt91 zt91VarM94607a16 = yt91VarM96903c17.m94607a();
                dv91 dv91Var16 = new dv91("hit", 1);
                string = str2 != null ? str2.toString() : null;
                return new av91("", "", dv91Var16, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string != null ? string : "")), zt91VarM94607a16, st91.f213865b, System.currentTimeMillis());
            }
            yt91 yt91VarM96903c18 = zt91Var.m96903c();
            yt91VarM96903c18.f276055i.add(new bu91("social_section", null, null, null, null));
            yt91VarM96903c18.f276056j = false;
            yt91 yt91VarM96903c19 = yt91VarM96903c18.m94607a().m96903c();
            yt91VarM96903c19.f276055i.add(new bu91("jam_section", null, null, null, null));
            yt91VarM96903c19.f276056j = false;
            zt91 zt91VarM94607a17 = yt91VarM96903c19.m94607a();
            dv91 dv91Var17 = new dv91("hit", 1);
            string = str2 != null ? str2.toString() : null;
            return new av91("", "", dv91Var17, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string != null ? string : "")), zt91VarM94607a17, st91.f213865b, System.currentTimeMillis());
        }
        if (!str.equals("notify-messages")) {
            if (!str.equals("notify-social")) {
                na6.m63971s("Unknown category key ".concat(str));
                return null;
            }
            yt91 yt91VarM96903c20 = zt91Var.m96903c();
            yt91VarM96903c20.f276055i.add(new bu91("social_section", null, null, null, null));
            yt91VarM96903c20.f276056j = false;
            zt91 zt91VarM94607a18 = yt91VarM96903c20.m94607a();
            dv91 dv91Var18 = new dv91("hit", 1);
            string = str2 != null ? str2.toString() : null;
            return new av91("", "", dv91Var18, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string != null ? string : "")), zt91VarM94607a18, st91.f213865b, System.currentTimeMillis());
        }
        if (z) {
            yt91 yt91VarM96903c21 = zt91Var.m96903c();
            yt91VarM96903c21.f276055i.add(new bu91("messages_section", null, null, null, null));
            yt91VarM96903c21.f276056j = false;
            zt91 zt91VarM94607a19 = yt91VarM96903c21.m94607a();
            dv91 dv91Var19 = new dv91("hit", 1);
            string = str2 != null ? str2.toString() : null;
            return new av91("", "", dv91Var19, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string != null ? string : "")), zt91VarM94607a19, st91.f213865b, System.currentTimeMillis());
        }
        yt91 yt91VarM96903c22 = zt91Var.m96903c();
        yt91VarM96903c22.f276055i.add(new bu91("social_section", null, null, null, null));
        yt91VarM96903c22.f276056j = false;
        yt91 yt91VarM96903c23 = yt91VarM96903c22.m94607a().m96903c();
        yt91VarM96903c23.f276055i.add(new bu91("messages_section", null, null, null, null));
        yt91VarM96903c23.f276056j = false;
        zt91 zt91VarM94607a20 = yt91VarM96903c23.m94607a();
        dv91 dv91Var20 = new dv91("hit", 1);
        string = str2 != null ? str2.toString() : null;
        return new av91("", "", dv91Var20, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string != null ? string : "")), zt91VarM94607a20, st91.f213865b, System.currentTimeMillis());
    }
}
