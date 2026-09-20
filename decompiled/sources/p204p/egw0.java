package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class egw0 {

    /* JADX INFO: renamed from: a */
    public static final egw0 f59411a;

    /* JADX INFO: renamed from: b */
    public static final egw0 f59412b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ egw0[] f59413c;

    static {
        egw0 egw0Var = new egw0("Approved", 0);
        f59411a = egw0Var;
        egw0 egw0Var2 = new egw0("Cancelled", 1);
        f59412b = egw0Var2;
        f59413c = new egw0[]{egw0Var, egw0Var2};
    }

    public static egw0 valueOf(String str) {
        return (egw0) Enum.valueOf(egw0.class, str);
    }

    public static egw0[] values() {
        return (egw0[]) f59413c.clone();
    }
}
