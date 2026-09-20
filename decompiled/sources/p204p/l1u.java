package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class l1u {

    /* JADX INFO: renamed from: a */
    public static final l1u f128800a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ l1u[] f128801b;

    static {
        l1u l1uVar = new l1u("EMAIL", 0);
        f128800a = l1uVar;
        f128801b = new l1u[]{l1uVar};
    }

    public static l1u valueOf(String str) {
        return (l1u) Enum.valueOf(l1u.class, str);
    }

    public static l1u[] values() {
        return (l1u[]) f128801b.clone();
    }
}
