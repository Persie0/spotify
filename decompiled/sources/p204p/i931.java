package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class i931 {

    /* JADX INFO: renamed from: a */
    public static final i931 f99895a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ i931[] f99896b;

    static {
        i931 i931Var = new i931("Dismissed", 0);
        f99895a = i931Var;
        f99896b = new i931[]{i931Var, new i931("ActionPerformed", 1)};
    }

    public static i931 valueOf(String str) {
        return (i931) Enum.valueOf(i931.class, str);
    }

    public static i931[] values() {
        return (i931[]) f99896b.clone();
    }
}
