package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class z640 {

    /* JADX INFO: renamed from: a */
    public static final z640 f279700a;

    /* JADX INFO: renamed from: b */
    public static final z640 f279701b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ z640[] f279702c;

    static {
        z640 z640Var = new z640("CardClicked", 0);
        f279700a = z640Var;
        z640 z640Var2 = new z640("CardLongClicked", 1);
        f279701b = z640Var2;
        f279702c = new z640[]{z640Var, z640Var2};
    }

    public static z640 valueOf(String str) {
        return (z640) Enum.valueOf(z640.class, str);
    }

    public static z640[] values() {
        return (z640[]) f279702c.clone();
    }
}
