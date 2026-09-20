package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class lt90 {

    /* JADX INFO: renamed from: a */
    public static final lt90 f136728a;

    /* JADX INFO: renamed from: b */
    public static final lt90 f136729b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ lt90[] f136730c;

    static {
        lt90 lt90Var = new lt90("BackButtonClicked", 0);
        f136728a = lt90Var;
        lt90 lt90Var2 = new lt90("CreatorRowClicked", 1);
        f136729b = lt90Var2;
        f136730c = new lt90[]{lt90Var, lt90Var2};
    }

    public static lt90 valueOf(String str) {
        return (lt90) Enum.valueOf(lt90.class, str);
    }

    public static lt90[] values() {
        return (lt90[]) f136730c.clone();
    }
}
