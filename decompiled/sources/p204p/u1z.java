package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class u1z {

    /* JADX INFO: renamed from: a */
    public static final u1z f225937a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ u1z[] f225938b;

    static {
        u1z u1zVar = new u1z("TagFilterClicked", 0);
        f225937a = u1zVar;
        f225938b = new u1z[]{u1zVar};
    }

    public static u1z valueOf(String str) {
        return (u1z) Enum.valueOf(u1z.class, str);
    }

    public static u1z[] values() {
        return (u1z[]) f225938b.clone();
    }
}
