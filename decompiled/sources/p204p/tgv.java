package p204p;

import java.util.Arrays;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public abstract class tgv {

    /* JADX INFO: renamed from: a */
    public static final gn80[] f220263a = {gn80.TRACK, gn80.TRACK_AUTOPLAY};

    /* JADX INFO: renamed from: b */
    public static final gn80[] f220264b = {gn80.ALBUM, gn80.ALBUM_AUTOPLAY, gn80.ALBUM_RADIO};

    /* JADX INFO: renamed from: c */
    public static final gn80[] f220265c = {gn80.SHOW_EPISODE, gn80.SHOW_EPISODE_AUTOPLAY, gn80.SHOW_EPISODE_AUTOPLAY_WITH_TIMESTAMP, gn80.SHOW_EPISODE_SCROLL, gn80.SHOW_EPISODE_TIMESTAMP, gn80.EPISODE_AUTOPLAY, gn80.EPISODE_PREVIEW_PLAYER, gn80.EPISODE_PREVIEW_PLAYLIST};

    /* JADX INFO: renamed from: a */
    public static final boolean m80780a(String str) {
        Set set = dd41.f47702f;
        gn80[] gn80VarArr = f220264b;
        return r46.m74709B(str, (gn80[]) Arrays.copyOf(gn80VarArr, gn80VarArr.length));
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m80781b(String str) {
        Set set = dd41.f47702f;
        return r46.m74708A(str, gn80.KALLAX);
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m80782c(String str) {
        if (str != null) {
            return xoc1.f263878F.m83613a(str);
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m80783d(String str) {
        Set set = dd41.f47702f;
        return r46.m74708A(str, gn80.PODCAST_CHAPTER);
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m80784e(String str) {
        Set set = dd41.f47702f;
        gn80[] gn80VarArr = f220265c;
        return r46.m74709B(str, (gn80[]) Arrays.copyOf(gn80VarArr, gn80VarArr.length));
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m80785f(String str) {
        return m80784e(str) || m80783d(str);
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m80786g(String str) {
        Set set = dd41.f47702f;
        return r46.m74708A(str, gn80.SHOW_SHOW);
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m80787h(String str) {
        Set set = dd41.f47702f;
        return r46.m74708A(str, gn80.RECENTS);
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m80788i(String str) {
        Set set = dd41.f47702f;
        return r46.m74708A(str, gn80.SETTINGS);
    }

    /* JADX INFO: renamed from: j */
    public static final boolean m80789j(String str) {
        Set set = dd41.f47702f;
        gn80[] gn80VarArr = f220263a;
        return r46.m74709B(str, (gn80[]) Arrays.copyOf(gn80VarArr, gn80VarArr.length));
    }
}
