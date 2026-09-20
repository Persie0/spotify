package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class dn90 {

    /* JADX INFO: renamed from: a */
    public static final dn90 f50708a;

    /* JADX INFO: renamed from: b */
    public static final dn90 f50709b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ dn90[] f50710c;

    static {
        dn90 dn90Var = new dn90("OkButtonClicked", 0);
        f50708a = dn90Var;
        dn90 dn90Var2 = new dn90("DismissButtonClicked", 1);
        f50709b = dn90Var2;
        f50710c = new dn90[]{dn90Var, dn90Var2};
    }

    public static dn90 valueOf(String str) {
        return (dn90) Enum.valueOf(dn90.class, str);
    }

    public static dn90[] values() {
        return (dn90[]) f50710c.clone();
    }
}
