package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class yaj0 {

    /* JADX INFO: renamed from: a */
    public static final yaj0 f270923a;

    /* JADX INFO: renamed from: b */
    public static final yaj0 f270924b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ yaj0[] f270925c;

    static {
        yaj0 yaj0Var = new yaj0("AllowAccessClicked", 0);
        f270923a = yaj0Var;
        yaj0 yaj0Var2 = new yaj0("GoToSettingsClicked", 1);
        f270924b = yaj0Var2;
        f270925c = new yaj0[]{yaj0Var, yaj0Var2};
    }

    public static yaj0 valueOf(String str) {
        return (yaj0) Enum.valueOf(yaj0.class, str);
    }

    public static yaj0[] values() {
        return (yaj0[]) f270925c.clone();
    }
}
