package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class uek0 {

    /* JADX INFO: renamed from: a */
    public static final uek0 f229553a;

    /* JADX INFO: renamed from: b */
    public static final uek0 f229554b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ uek0[] f229555c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ nzv f229556d;

    static {
        uek0 uek0Var = new uek0("EXPANDED", 0);
        f229553a = uek0Var;
        uek0 uek0Var2 = new uek0("COLLAPSED", 1);
        f229554b = uek0Var2;
        uek0[] uek0VarArr = {uek0Var, uek0Var2};
        f229555c = uek0VarArr;
        f229556d = new nzv(uek0VarArr);
    }

    public static uek0 valueOf(String str) {
        return (uek0) Enum.valueOf(uek0.class, str);
    }

    public static uek0[] values() {
        return (uek0[]) f229555c.clone();
    }
}
