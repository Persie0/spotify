package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class quz {

    /* JADX INFO: renamed from: a */
    public static final quz f192837a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ quz[] f192838b;

    static {
        quz quzVar = new quz("CLICKED", 0);
        f192837a = quzVar;
        f192838b = new quz[]{quzVar};
    }

    public static quz valueOf(String str) {
        return (quz) Enum.valueOf(quz.class, str);
    }

    public static quz[] values() {
        return (quz[]) f192838b.clone();
    }
}
