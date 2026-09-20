package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class wef0 {

    /* JADX INFO: renamed from: a */
    public static final wef0 f250523a;

    /* JADX INFO: renamed from: b */
    public static final wef0 f250524b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ wef0[] f250525c;

    static {
        wef0 wef0Var = new wef0("TAP", 0);
        f250523a = wef0Var;
        wef0 wef0Var2 = new wef0("DRAG", 1);
        f250524b = wef0Var2;
        f250525c = new wef0[]{wef0Var, wef0Var2};
    }

    public static wef0 valueOf(String str) {
        return (wef0) Enum.valueOf(wef0.class, str);
    }

    public static wef0[] values() {
        return (wef0[]) f250525c.clone();
    }
}
