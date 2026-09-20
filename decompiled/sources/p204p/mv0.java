package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class mv0 {

    /* JADX INFO: renamed from: b */
    public static final mv0 f147461b;

    /* JADX INFO: renamed from: c */
    public static final mv0 f147462c;

    /* JADX INFO: renamed from: d */
    public static final mv0 f147463d;

    /* JADX INFO: renamed from: e */
    public static final mv0 f147464e;

    /* JADX INFO: renamed from: f */
    public static final mv0 f147465f;

    /* JADX INFO: renamed from: g */
    public static final mv0 f147466g;

    /* JADX INFO: renamed from: h */
    public static final mv0 f147467h;

    /* JADX INFO: renamed from: i */
    public static final mv0 f147468i;

    /* JADX INFO: renamed from: j */
    public static final mv0 f147469j;

    /* JADX INFO: renamed from: k */
    public static final mv0 f147470k;

    /* JADX INFO: renamed from: l */
    public static final List f147471l;

    /* JADX INFO: renamed from: a */
    public final String f147472a;

    static {
        mv0 mv0Var = new mv0("preroll");
        f147461b = mv0Var;
        mv0 mv0Var2 = new mv0("stream");
        f147462c = mv0Var2;
        mv0 mv0Var3 = new mv0("marquee");
        f147463d = mv0Var3;
        mv0 mv0Var4 = new mv0("sponsored-playlist");
        f147464e = mv0Var4;
        mv0 mv0Var5 = new mv0("active-play-limit");
        mv0 mv0Var6 = new mv0("repeat-play");
        mv0 mv0Var7 = new mv0("podcast-midroll-1");
        mv0 mv0Var8 = new mv0("embedded-npv");
        f147465f = mv0Var8;
        mv0 mv0Var9 = new mv0("now-playing-bar");
        f147466g = mv0Var9;
        mv0 mv0Var10 = new mv0("embedded-playlist");
        f147467h = mv0Var10;
        mv0 mv0Var11 = new mv0("app-open");
        f147468i = mv0Var11;
        mv0 mv0Var12 = new mv0("home-above-the-fold");
        mv0 mv0Var13 = new mv0("on-demand-cap-reached");
        mv0 mv0Var14 = new mv0("podcast-show-page");
        f147469j = mv0Var14;
        mv0 mv0Var15 = new mv0("podcast-episode-page");
        f147470k = mv0Var15;
        f147471l = h6f.m46715L(mv0Var, mv0Var2, mv0Var3, mv0Var4, mv0Var5, mv0Var6, mv0Var7, mv0Var8, mv0Var9, mv0Var10, mv0Var11, mv0Var12, mv0Var13, mv0Var14, mv0Var15, new mv0("music-see-all"), new mv0("podcast-see-all"));
    }

    public mv0(String str) {
        this.f147472a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mv0) && wj50.m88271j(this.f147472a, ((mv0) obj).f147472a);
    }

    public final int hashCode() {
        return this.f147472a.hashCode();
    }
}
