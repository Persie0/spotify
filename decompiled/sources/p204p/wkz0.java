package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class wkz0 {

    /* JADX INFO: renamed from: a */
    public static final wkz0 f252328a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ wkz0[] f252329b;

    static {
        wkz0 wkz0Var = new wkz0("EditableText", 0);
        f252328a = wkz0Var;
        f252329b = new wkz0[]{wkz0Var, new wkz0("StaticText", 1)};
    }

    public static wkz0 valueOf(String str) {
        return (wkz0) Enum.valueOf(wkz0.class, str);
    }

    public static wkz0[] values() {
        return (wkz0[]) f252329b.clone();
    }
}
