package p204p;

import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class ly40 extends qe70 implements xh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f137956a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ bmh f137957b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ly40(bmh bmhVar, int i) {
        super(4);
        this.f137956a = i;
        this.f137957b = bmhVar;
    }

    @Override // p204p.xh00
    /* JADX INFO: renamed from: M */
    public final Object mo24818M(Object obj, Object obj2, Object obj3, Object obj4) {
        av91 av91Var;
        String string;
        switch (this.f137956a) {
            case 0:
                ((Number) obj3).intValue();
                slh0 slh0Var = (slh0) this.f137957b.f28532h;
                int iOrdinal = ((jy40) obj).f117288a.ordinal();
                if (iOrdinal == 0) {
                    return new glh0(slh0Var, 1);
                }
                if (iOrdinal == 1) {
                    return new glh0(slh0Var, 0);
                }
                throw new NoWhenBranchMatchedException();
            default:
                fy40 fy40Var = (fy40) obj4;
                ky40 ky40Var = ((jy40) obj2).f117288a;
                zt91 zt91Var = ((slh0) this.f137957b.f28532h).f210419a;
                if (fy40Var instanceof dy40) {
                    int iOrdinal2 = ky40Var.ordinal();
                    nau nauVar = nau.f152117a;
                    if (iOrdinal2 == 0) {
                        yt91 yt91VarM96903c = zt91Var.m96903c();
                        yt91VarM96903c.f276055i.add(new bu91("tracks_tempo_graph", null, null, null, null));
                        yt91VarM96903c.f276056j = true;
                        yt91 yt91VarM96903c2 = yt91VarM96903c.m94607a().m96903c();
                        yt91VarM96903c2.f276055i.add(new bu91("help_button", null, null, null, null));
                        yt91VarM96903c2.f276056j = false;
                        return new av91("", "", new dv91("hit", 1), new bv91("show_tooltip", 1, nauVar), yt91VarM96903c2.m94607a(), st91.f213865b, System.currentTimeMillis());
                    }
                    if (iOrdinal2 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    yt91 yt91VarM96903c3 = zt91Var.m96903c();
                    yt91VarM96903c3.f276055i.add(new bu91("artists_popularity_graph", null, null, null, null));
                    yt91VarM96903c3.f276056j = true;
                    yt91 yt91VarM96903c4 = yt91VarM96903c3.m94607a().m96903c();
                    yt91VarM96903c4.f276055i.add(new bu91("help_button", null, null, null, null));
                    yt91VarM96903c4.f276056j = false;
                    return new av91("", "", new dv91("hit", 1), new bv91("show_tooltip", 1, nauVar), yt91VarM96903c4.m94607a(), st91.f213865b, System.currentTimeMillis());
                }
                if (!(fy40Var instanceof ey40)) {
                    throw new NoWhenBranchMatchedException();
                }
                ey40 ey40Var = (ey40) fy40Var;
                String str = ey40Var.f63939a;
                int i = ey40Var.f63940b;
                ky40 ky40Var2 = ky40.f127649b;
                if (i == 1 && ky40Var == ky40Var2) {
                    yt91 yt91VarM96903c5 = zt91Var.m96903c();
                    yt91VarM96903c5.f276055i.add(new bu91("artists_popularity_graph", null, null, null, null));
                    yt91VarM96903c5.f276056j = true;
                    yt91 yt91VarM96903c6 = yt91VarM96903c5.m94607a().m96903c();
                    yt91VarM96903c6.f276055i.add(new bu91("highlighted_artists", null, null, null, null));
                    yt91VarM96903c6.f276056j = false;
                    zt91 zt91VarM94607a = yt91VarM96903c6.m94607a();
                    String str2 = ey40Var.f63939a;
                    yt91 yt91VarM96903c7 = zt91VarM94607a.m96903c();
                    yt91VarM96903c7.f276055i.add(new bu91("least_popular_artist", null, null, str2, null));
                    yt91VarM96903c7.f276056j = false;
                    zt91 zt91VarM94607a2 = yt91VarM96903c7.m94607a();
                    dv91 dv91Var = new dv91("hit", 1);
                    string = str != null ? str.toString() : null;
                    av91Var = new av91("", "", dv91Var, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string != null ? string : "")), zt91VarM94607a2, st91.f213865b, System.currentTimeMillis());
                } else if (i == 2 && ky40Var == ky40Var2) {
                    yt91 yt91VarM96903c8 = zt91Var.m96903c();
                    yt91VarM96903c8.f276055i.add(new bu91("artists_popularity_graph", null, null, null, null));
                    yt91VarM96903c8.f276056j = true;
                    yt91 yt91VarM96903c9 = yt91VarM96903c8.m94607a().m96903c();
                    yt91VarM96903c9.f276055i.add(new bu91("highlighted_artists", null, null, null, null));
                    yt91VarM96903c9.f276056j = false;
                    zt91 zt91VarM94607a3 = yt91VarM96903c9.m94607a();
                    String str3 = ey40Var.f63939a;
                    yt91 yt91VarM96903c10 = zt91VarM94607a3.m96903c();
                    yt91VarM96903c10.f276055i.add(new bu91("most_popular_artist", null, null, str3, null));
                    yt91VarM96903c10.f276056j = false;
                    zt91 zt91VarM94607a4 = yt91VarM96903c10.m94607a();
                    dv91 dv91Var2 = new dv91("hit", 1);
                    string = str != null ? str.toString() : null;
                    av91Var = new av91("", "", dv91Var2, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string != null ? string : "")), zt91VarM94607a4, st91.f213865b, System.currentTimeMillis());
                } else {
                    ky40 ky40Var3 = ky40.f127648a;
                    if (i == 1 && ky40Var == ky40Var3) {
                        yt91 yt91VarM96903c11 = zt91Var.m96903c();
                        yt91VarM96903c11.f276055i.add(new bu91("tracks_tempo_graph", null, null, null, null));
                        yt91VarM96903c11.f276056j = true;
                        yt91 yt91VarM96903c12 = yt91VarM96903c11.m94607a().m96903c();
                        yt91VarM96903c12.f276055i.add(new bu91("highlighted_tracks", null, null, null, null));
                        yt91VarM96903c12.f276056j = false;
                        zt91 zt91VarM94607a5 = yt91VarM96903c12.m94607a();
                        String str4 = ey40Var.f63939a;
                        yt91 yt91VarM96903c13 = zt91VarM94607a5.m96903c();
                        yt91VarM96903c13.f276055i.add(new bu91("lowest_tempo_track", null, null, str4, null));
                        yt91VarM96903c13.f276056j = false;
                        zt91 zt91VarM94607a6 = yt91VarM96903c13.m94607a();
                        dv91 dv91Var3 = new dv91("hit", 1);
                        string = str != null ? str.toString() : null;
                        av91Var = new av91("", "", dv91Var3, new bv91("play", 1, Collections.singletonMap("item_to_be_played", string != null ? string : "")), zt91VarM94607a6, st91.f213865b, System.currentTimeMillis());
                    } else {
                        if (i != 2 || ky40Var != ky40Var3) {
                            return null;
                        }
                        yt91 yt91VarM96903c14 = zt91Var.m96903c();
                        yt91VarM96903c14.f276055i.add(new bu91("tracks_tempo_graph", null, null, null, null));
                        yt91VarM96903c14.f276056j = true;
                        yt91 yt91VarM96903c15 = yt91VarM96903c14.m94607a().m96903c();
                        yt91VarM96903c15.f276055i.add(new bu91("highlighted_tracks", null, null, null, null));
                        yt91VarM96903c15.f276056j = false;
                        zt91 zt91VarM94607a7 = yt91VarM96903c15.m94607a();
                        String str5 = ey40Var.f63939a;
                        yt91 yt91VarM96903c16 = zt91VarM94607a7.m96903c();
                        yt91VarM96903c16.f276055i.add(new bu91("highest_tempo_track", null, null, str5, null));
                        yt91VarM96903c16.f276056j = false;
                        zt91 zt91VarM94607a8 = yt91VarM96903c16.m94607a();
                        dv91 dv91Var4 = new dv91("hit", 1);
                        string = str != null ? str.toString() : null;
                        av91Var = new av91("", "", dv91Var4, new bv91("play", 1, Collections.singletonMap("item_to_be_played", string != null ? string : "")), zt91VarM94607a8, st91.f213865b, System.currentTimeMillis());
                    }
                }
                return av91Var;
        }
    }
}
