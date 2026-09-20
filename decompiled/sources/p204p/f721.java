package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class f721 {

    /* JADX INFO: renamed from: a */
    public static final f721 f66543a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ f721[] f66544b;

    static {
        f721 f721Var = new f721("NOTIFICATION_REMOVAL", 0);
        f66543a = f721Var;
        f66544b = new f721[]{f721Var};
    }

    public static f721 valueOf(String str) {
        return (f721) Enum.valueOf(f721.class, str);
    }

    public static f721[] values() {
        return (f721[]) f66544b.clone();
    }
}
