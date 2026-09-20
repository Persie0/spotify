package p204p;

import com.spotify.music.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public abstract class hl30 implements do30 {

    /* JADX INFO: renamed from: b */
    public static final al30 f92600b;

    /* JADX INFO: renamed from: c */
    public static final dl30 f92601c;

    /* JADX INFO: renamed from: d */
    public static final el30 f92602d;

    /* JADX INFO: renamed from: e */
    public static final fl30 f92603e;

    /* JADX INFO: renamed from: f */
    public static final gl30 f92604f;

    /* JADX INFO: renamed from: g */
    public static final hl30[] f92605g;

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ hl30[] f92606h;

    /* JADX INFO: renamed from: a */
    public final int f92607a;

    static {
        al30 al30Var = new al30("DESCRIPTION_ONLY", 0, R.id.hub_glue2_regular_card_description_only);
        f92600b = al30Var;
        bl30 bl30Var = new bl30("LARGE_DESCRIPTION_ONLY", 1, R.id.hub_glue2_regular_card_large_description_only);
        cl30 cl30Var = new cl30("LARGE_NO_TEXT", 2, R.id.hub_glue2_regular_card_large_no_text);
        dl30 dl30Var = new dl30("SUBTITLE_ONLY", 3, R.id.hub_glue2_regular_card_subtitle_only);
        f92601c = dl30Var;
        el30 el30Var = new el30("TITLE", 4, R.id.hub_glue2_regular_card_title);
        f92602d = el30Var;
        fl30 fl30Var = new fl30("TITLE_METADATA", 5, R.id.hub_glue2_regular_card_title_metadata);
        f92603e = fl30Var;
        gl30 gl30Var = new gl30("TITLE_SUBTITLE", 6, R.id.hub_glue2_regular_card_title_subtitle);
        f92604f = gl30Var;
        f92606h = new hl30[]{al30Var, bl30Var, cl30Var, dl30Var, el30Var, fl30Var, gl30Var};
        f92605g = values();
    }

    public hl30(String str, int i, int i2) {
        super(str, i);
        this.f92607a = i2;
    }

    public static hl30 valueOf(String str) {
        return (hl30) Enum.valueOf(hl30.class, str);
    }

    public static hl30[] values() {
        return (hl30[]) f92606h.clone();
    }

    @Override // p204p.do30
    public final int getId() {
        return this.f92607a;
    }
}
