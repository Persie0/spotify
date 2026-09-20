package p204p;

import com.spotify.music.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public abstract class co30 implements bk30, lk30 {

    /* JADX INFO: renamed from: X */
    public static final int f40161X;

    /* JADX INFO: renamed from: Y */
    public static final int f40162Y;

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ co30[] f40163Z;

    /* JADX INFO: renamed from: c */
    public static final un30 f40164c;

    /* JADX INFO: renamed from: d */
    public static final vn30 f40165d;

    /* JADX INFO: renamed from: e */
    public static final wn30 f40166e;

    /* JADX INFO: renamed from: f */
    public static final int f40167f;

    /* JADX INFO: renamed from: g */
    public static final int f40168g;

    /* JADX INFO: renamed from: h */
    public static final int f40169h;

    /* JADX INFO: renamed from: i */
    public static final int f40170i;

    /* JADX INFO: renamed from: t */
    public static final int f40171t;

    /* JADX INFO: renamed from: a */
    public final String f40172a;

    /* JADX INFO: renamed from: b */
    public final String f40173b;

    static {
        xj30 xj30Var = xj30.ROW;
        un30 un30Var = new un30("BACKGROUND", 0, "glue:gradient", xj30Var);
        f40164c = un30Var;
        vn30 vn30Var = new vn30("CAROUSEL", 1, "glue:carousel", xj30Var);
        f40165d = vn30Var;
        wn30 wn30Var = new wn30("EMPTY_VIEW", 2, "glue:emptyview", xj30.CARD);
        f40166e = wn30Var;
        xj30 xj30Var2 = xj30.HEADER;
        f40163Z = new co30[]{un30Var, vn30Var, wn30Var, new xn30("HEADER", 3, "glue:header", xj30Var2), new yn30("HEADER_COVER_ART", 4, "glue:header:cover", xj30Var2), new zn30("HEADER_LARGE", 5, "glue:header:large", xj30Var2), new ao30("HEADER_NEW", 6, "glue:header:header", xj30Var2), new bo30("SHUFFLE_BUTTON", 7, "glue:shuffleButton", xj30Var)};
        f40167f = R.id.hub_glue_background;
        f40168g = R.id.hub_glue_carousel;
        f40169h = R.id.hub_glue_empty_view;
        f40170i = R.id.hub_glue_header_cover_art;
        f40171t = R.id.hub_glue_header_large;
        f40161X = R.id.hub_glue_header_header;
        f40162Y = R.id.hub_glue_shuffle_button;
    }

    public co30(String str, int i, String str2, xj30 xj30Var) {
        super(str, i);
        str2.getClass();
        this.f40172a = str2;
        xj30Var.getClass();
        this.f40173b = xj30Var.f262032a;
    }

    public static co30 valueOf(String str) {
        return (co30) Enum.valueOf(co30.class, str);
    }

    public static co30[] values() {
        return (co30[]) f40163Z.clone();
    }

    @Override // p204p.bk30
    public final String category() {
        return this.f40173b;
    }

    @Override // p204p.bk30
    /* JADX INFO: renamed from: id */
    public final String mo29575id() {
        return this.f40172a;
    }
}
