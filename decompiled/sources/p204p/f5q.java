package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class f5q {

    /* JADX INFO: renamed from: a */
    public static final f5q f66132a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ f5q[] f66133b;

    static {
        f5q f5qVar = new f5q("REVERT", 0);
        f66132a = f5qVar;
        f66133b = new f5q[]{f5qVar};
    }

    public static f5q valueOf(String str) {
        return (f5q) Enum.valueOf(f5q.class, str);
    }

    public static f5q[] values() {
        return (f5q[]) f66133b.clone();
    }
}
