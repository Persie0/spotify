package p204p;

import com.spotify.search.recentslistimpl.events.proto.RecentSearchesError;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class n1v0 implements k1v0 {

    /* JADX INFO: renamed from: e */
    public static final gn80[] f149514e = {gn80.BROWSE_GENRES, gn80.BROWSE_HUBS, gn80.COLLECTION_TRACKS, gn80.CULTURALMOMENTHUB, gn80.CREATE_AI_PLAYLIST, gn80.PROMPTED_PLAYLIST, gn80.SETTINGS, gn80.JAM, gn80.JAM_AUTOPLAY, gn80.HOME_ROOT};

    /* JADX INFO: renamed from: a */
    public final wt80 f149515a;

    /* JADX INFO: renamed from: b */
    public final yz80 f149516b;

    /* JADX INFO: renamed from: c */
    public final z2z0 f149517c;

    /* JADX INFO: renamed from: d */
    public final qre0 f149518d;

    public n1v0(wt80 wt80Var, yz80 yz80Var, z2z0 z2z0Var, qre0 qre0Var) {
        this.f149515a = wt80Var;
        this.f149516b = yz80Var;
        this.f149517c = z2z0Var;
        this.f149518d = qre0Var;
    }

    /* JADX INFO: renamed from: a */
    public static final void m63527a(n1v0 n1v0Var, int i, String str, String str2) {
        String str3;
        qre0 qre0Var = n1v0Var.f149518d;
        o1v0 o1v0VarM20725q = RecentSearchesError.m20725q();
        o1v0VarM20725q.m66085r(o7t0.m66389c(i));
        o1v0VarM20725q.m66084q(str2);
        if (str != null) {
            List listM88477a1 = wl51.m88477a1(str, new String[]{":"}, 0, 6);
            if (!wj50.m88271j(g6f.m43745s0(listM88477a1), "spotify") || listM88477a1.size() <= 1) {
                str3 = (String) g6f.m43745s0(listM88477a1);
                if (str3 == null) {
                    str3 = "unknown";
                }
            } else {
                str3 = (String) listM88477a1.get(1);
            }
            o1v0VarM20725q.m66083m(str3);
        }
        qre0Var.m73616a(o1v0VarM20725q.build());
    }
}
