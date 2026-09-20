package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class miu0 {

    /* JADX INFO: renamed from: a */
    public static final miu0 f144104a;

    /* JADX INFO: renamed from: b */
    public static final miu0 f144105b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ miu0[] f144106c;

    static {
        miu0 miu0Var = new miu0("ADD_REACTION", 0);
        f144104a = miu0Var;
        miu0 miu0Var2 = new miu0("SHOW_REACTIONS", 1);
        f144105b = miu0Var2;
        f144106c = new miu0[]{miu0Var, miu0Var2};
    }

    public static miu0 valueOf(String str) {
        return (miu0) Enum.valueOf(miu0.class, str);
    }

    public static miu0[] values() {
        return (miu0[]) f144106c.clone();
    }
}
