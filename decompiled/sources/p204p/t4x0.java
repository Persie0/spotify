package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class t4x0 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ t4x0[] f217143a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ nzv f217144b;

    /* JADX INFO: Fake field, exist only in values array */
    t4x0 EF5;

    static {
        t4x0[] t4x0VarArr = {new t4x0("IsExplicit", 0), new t4x0("Is19AndOverOnly", 1)};
        f217143a = t4x0VarArr;
        f217144b = new nzv(t4x0VarArr);
    }

    public static t4x0 valueOf(String str) {
        return (t4x0) Enum.valueOf(t4x0.class, str);
    }

    public static t4x0[] values() {
        return (t4x0[]) f217143a.clone();
    }
}
