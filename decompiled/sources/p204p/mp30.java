package p204p;

import com.spotify.music.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public abstract class mp30 implements do30 {

    /* JADX INFO: renamed from: L0 */
    public static final /* synthetic */ mp30[] f145840L0;

    /* JADX INFO: renamed from: X */
    public static final bp30 f145841X;

    /* JADX INFO: renamed from: Y */
    public static final cp30 f145842Y;

    /* JADX INFO: renamed from: Z */
    public static final mp30[] f145843Z;

    /* JADX INFO: renamed from: b */
    public static final dp30 f145844b;

    /* JADX INFO: renamed from: c */
    public static final fp30 f145845c;

    /* JADX INFO: renamed from: d */
    public static final gp30 f145846d;

    /* JADX INFO: renamed from: e */
    public static final hp30 f145847e;

    /* JADX INFO: renamed from: f */
    public static final ip30 f145848f;

    /* JADX INFO: renamed from: g */
    public static final jp30 f145849g;

    /* JADX INFO: renamed from: h */
    public static final kp30 f145850h;

    /* JADX INFO: renamed from: i */
    public static final lp30 f145851i;

    /* JADX INFO: renamed from: t */
    public static final ap30 f145852t;

    /* JADX INFO: renamed from: a */
    public final int f145853a;

    static {
        dp30 dp30Var = new dp30("MULTILINE", 0, R.id.hub_glue_row_multiline);
        f145844b = dp30Var;
        ep30 ep30Var = new ep30("MULTILINE_CAPPED", 1, R.id.hub_glue_row_multiline_capped);
        fp30 fp30Var = new fp30("SINGLE_LINE", 2, R.id.hub_glue_row_single_line);
        f145845c = fp30Var;
        gp30 gp30Var = new gp30("SINGLE_LINE_IMAGE", 3, R.id.hub_glue_row_single_line_image);
        f145846d = gp30Var;
        hp30 hp30Var = new hp30("SINGLE_LINE_IMAGE_SMALL", 4, R.id.hub_glue_row_single_line_image_small);
        f145847e = hp30Var;
        ip30 ip30Var = new ip30("SINGLE_LINE_SMALL", 5, R.id.hub_glue_row_single_line_small);
        f145848f = ip30Var;
        jp30 jp30Var = new jp30("TWO_LINE", 6, R.id.hub_glue_row_two_line);
        f145849g = jp30Var;
        kp30 kp30Var = new kp30("TWO_LINE_IMAGE", 7, R.id.hub_glue_row_two_line_image);
        f145850h = kp30Var;
        lp30 lp30Var = new lp30("TWO_LINE_IMAGE_MUTED", 8, R.id.hub_glue_row_two_line_image_muted);
        f145851i = lp30Var;
        zo30 zo30Var = new zo30("TWO_LINE_LANDSCAPE_IMAGE", 9, R.id.hub_glue_row_two_line_landscape_image);
        ap30 ap30Var = new ap30("TWO_LINE_MUTED", 10, R.id.hub_glue_row_two_line_muted);
        f145852t = ap30Var;
        bp30 bp30Var = new bp30("TWO_LINE_NUMBER", 11, R.id.hub_glue_row_two_line_number);
        f145841X = bp30Var;
        cp30 cp30Var = new cp30("TWO_LINE_NUMBER_MUTED", 12, R.id.hub_glue_row_two_line_number_muted);
        f145842Y = cp30Var;
        f145840L0 = new mp30[]{dp30Var, ep30Var, fp30Var, gp30Var, hp30Var, ip30Var, jp30Var, kp30Var, lp30Var, zo30Var, ap30Var, bp30Var, cp30Var};
        f145843Z = values();
    }

    public mp30(String str, int i, int i2) {
        super(str, i);
        this.f145853a = i2;
    }

    public static mp30 valueOf(String str) {
        return (mp30) Enum.valueOf(mp30.class, str);
    }

    public static mp30[] values() {
        return (mp30[]) f145840L0.clone();
    }

    @Override // p204p.do30
    public final int getId() {
        return this.f145853a;
    }
}
