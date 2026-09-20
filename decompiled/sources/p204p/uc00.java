package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class uc00 {

    /* JADX INFO: renamed from: a */
    public static final uc00 f228912a;

    /* JADX INFO: renamed from: b */
    public static final uc00 f228913b;

    /* JADX INFO: renamed from: c */
    public static final uc00 f228914c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ uc00[] f228915d;

    static {
        uc00 uc00Var = new uc00("ExplorePremiumClicked", 0);
        f228912a = uc00Var;
        uc00 uc00Var2 = new uc00("DismissClicked", 1);
        f228913b = uc00Var2;
        uc00 uc00Var3 = new uc00("SystemDismissed", 2);
        f228914c = uc00Var3;
        f228915d = new uc00[]{uc00Var, uc00Var2, uc00Var3};
    }

    public static uc00 valueOf(String str) {
        return (uc00) Enum.valueOf(uc00.class, str);
    }

    public static uc00[] values() {
        return (uc00[]) f228915d.clone();
    }
}
