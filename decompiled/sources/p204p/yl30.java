package p204p;

import com.spotify.music.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public abstract class yl30 implements bk30, lk30 {

    /* JADX INFO: renamed from: c */
    public static final int f273892c;

    /* JADX INFO: renamed from: d */
    public static final int f273893d;

    /* JADX INFO: renamed from: e */
    public static final int f273894e;

    /* JADX INFO: renamed from: f */
    public static final int f273895f;

    /* JADX INFO: renamed from: g */
    public static final int f273896g;

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ yl30[] f273897h;

    /* JADX INFO: renamed from: a */
    public final String f273898a;

    /* JADX INFO: renamed from: b */
    public final String f273899b;

    /* JADX INFO: Fake field, exist only in values array */
    yl30 EF9;

    static {
        xj30 xj30Var = xj30.ROW;
        f273897h = new yl30[]{new tl30("CAROUSEL", 0, "glue2:carousel", xj30Var), new ul30("EMPTY_STATE", 1, "glue2:emptyState", xj30.CARD), new vl30("GRADIENT", 2, "glue2:gradient", xj30Var), new wl30("SIMPLE_HEADER", 3, "glue2:simpleHeader", xj30.HEADER)};
        f273892c = R.id.hub_glue2_carousel;
        f273893d = R.id.hub_glue2_empty_state_error;
        f273894e = R.id.hub_glue2_empty_state_no_result;
        f273895f = R.id.hub_glue2_gradient;
        f273896g = R.id.hub_glue2_simple_header;
    }

    public yl30(String str, int i, String str2, xj30 xj30Var) {
        super(str, i);
        this.f273898a = str2;
        xj30Var.getClass();
        this.f273899b = xj30Var.f262032a;
    }

    public static yl30 valueOf(String str) {
        return (yl30) Enum.valueOf(yl30.class, str);
    }

    public static yl30[] values() {
        return (yl30[]) f273897h.clone();
    }

    @Override // p204p.bk30
    public final String category() {
        return this.f273899b;
    }

    @Override // p204p.bk30
    /* JADX INFO: renamed from: id */
    public final String mo29575id() {
        return this.f273898a;
    }
}
