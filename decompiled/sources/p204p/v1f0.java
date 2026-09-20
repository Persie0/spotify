package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class v1f0 {

    /* JADX INFO: renamed from: a */
    public static final v1f0 f236357a;

    /* JADX INFO: renamed from: b */
    public static final v1f0 f236358b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ v1f0[] f236359c;

    static {
        v1f0 v1f0Var = new v1f0("CancelButtonClicked", 0);
        f236357a = v1f0Var;
        v1f0 v1f0Var2 = new v1f0("ContinueButtonClicked", 1);
        f236358b = v1f0Var2;
        f236359c = new v1f0[]{v1f0Var, v1f0Var2};
    }

    public static v1f0 valueOf(String str) {
        return (v1f0) Enum.valueOf(v1f0.class, str);
    }

    public static v1f0[] values() {
        return (v1f0[]) f236359c.clone();
    }
}
