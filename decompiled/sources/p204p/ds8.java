package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class ds8 {

    /* JADX INFO: renamed from: a */
    public static final ds8 f52516a;

    /* JADX INFO: renamed from: b */
    public static final ds8 f52517b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ ds8[] f52518c;

    static {
        ds8 ds8Var = new ds8("OnDislikeClicked", 0);
        f52516a = ds8Var;
        ds8 ds8Var2 = new ds8("OnRemoveDislikeClicked", 1);
        f52517b = ds8Var2;
        f52518c = new ds8[]{ds8Var, ds8Var2};
    }

    public static ds8 valueOf(String str) {
        return (ds8) Enum.valueOf(ds8.class, str);
    }

    public static ds8[] values() {
        return (ds8[]) f52518c.clone();
    }
}
