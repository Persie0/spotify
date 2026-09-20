package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class hff0 {

    /* JADX INFO: renamed from: a */
    public static final hff0 f90728a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ hff0[] f90729b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ nzv f90730c;

    /* JADX INFO: Fake field, exist only in values array */
    hff0 EF0;

    static {
        hff0 hff0Var = new hff0("SUPERSEDE", 0);
        hff0 hff0Var2 = new hff0("DROP", 1);
        f90728a = hff0Var2;
        hff0[] hff0VarArr = {hff0Var, hff0Var2};
        f90729b = hff0VarArr;
        f90730c = new nzv(hff0VarArr);
    }

    public static hff0 valueOf(String str) {
        return (hff0) Enum.valueOf(hff0.class, str);
    }

    public static hff0[] values() {
        return (hff0[]) f90729b.clone();
    }
}
