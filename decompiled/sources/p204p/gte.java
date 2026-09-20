package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class gte {

    /* JADX INFO: renamed from: a */
    public static final gte f84155a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ gte[] f84156b;

    static {
        gte gteVar = new gte("OnClicked", 0);
        f84155a = gteVar;
        f84156b = new gte[]{gteVar};
    }

    public static gte valueOf(String str) {
        return (gte) Enum.valueOf(gte.class, str);
    }

    public static gte[] values() {
        return (gte[]) f84156b.clone();
    }
}
