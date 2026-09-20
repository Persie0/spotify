package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class kas0 {

    /* JADX INFO: renamed from: a */
    public static final kas0 f120955a;

    /* JADX INFO: renamed from: b */
    public static final kas0 f120956b;

    /* JADX INFO: renamed from: c */
    public static final kas0 f120957c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ kas0[] f120958d;

    static {
        kas0 kas0Var = new kas0("RESERVED_ANNOUNCE", 0);
        f120955a = kas0Var;
        kas0 kas0Var2 = new kas0("RESERVED_SALE", 1);
        f120956b = kas0Var2;
        kas0 kas0Var3 = new kas0("OTHER", 2);
        f120957c = kas0Var3;
        f120958d = new kas0[]{kas0Var, kas0Var2, kas0Var3};
    }

    public static kas0 valueOf(String str) {
        return (kas0) Enum.valueOf(kas0.class, str);
    }

    public static kas0[] values() {
        return (kas0[]) f120958d.clone();
    }
}
