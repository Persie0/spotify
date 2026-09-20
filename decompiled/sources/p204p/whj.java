package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class whj {

    /* JADX INFO: renamed from: a */
    public static final whj f251359a;

    /* JADX INFO: renamed from: b */
    public static final whj f251360b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ whj[] f251361c;

    static {
        whj whjVar = new whj("LONG", 0);
        f251359a = whjVar;
        whj whjVar2 = new whj("SHORT", 1);
        f251360b = whjVar2;
        f251361c = new whj[]{whjVar, whjVar2};
    }

    public static whj valueOf(String str) {
        return (whj) Enum.valueOf(whj.class, str);
    }

    public static whj[] values() {
        return (whj[]) f251361c.clone();
    }
}
