package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class pkj0 {

    /* JADX INFO: renamed from: a */
    public static final pkj0 f178474a;

    /* JADX INFO: renamed from: b */
    public static final pkj0 f178475b;

    /* JADX INFO: renamed from: c */
    public static final pkj0 f178476c;

    /* JADX INFO: renamed from: d */
    public static final pkj0 f178477d;

    /* JADX INFO: renamed from: e */
    public static final pkj0 f178478e;

    /* JADX INFO: renamed from: f */
    public static final pkj0 f178479f;

    /* JADX INFO: renamed from: g */
    public static final pkj0 f178480g;

    /* JADX INFO: renamed from: h */
    public static final pkj0 f178481h;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ pkj0[] f178482i;

    /* JADX INFO: Fake field, exist only in values array */
    pkj0 EF1;

    static {
        pkj0 pkj0Var = new pkj0("FROM_IDE", 0);
        pkj0 pkj0Var2 = new pkj0("FROM_BACKEND", 1);
        pkj0 pkj0Var3 = new pkj0("FROM_TEST", 2);
        pkj0 pkj0Var4 = new pkj0("FROM_BUILTINS", 3);
        f178474a = pkj0Var4;
        pkj0 pkj0Var5 = new pkj0("WHEN_CHECK_DECLARATION_CONFLICTS", 4);
        pkj0 pkj0Var6 = new pkj0("WHEN_CHECK_OVERRIDES", 5);
        pkj0 pkj0Var7 = new pkj0("FOR_SCRIPT", 6);
        pkj0 pkj0Var8 = new pkj0("FROM_REFLECTION", 7);
        f178475b = pkj0Var8;
        pkj0 pkj0Var9 = new pkj0("WHEN_RESOLVE_DECLARATION", 8);
        pkj0 pkj0Var10 = new pkj0("WHEN_GET_DECLARATION_SCOPE", 9);
        pkj0 pkj0Var11 = new pkj0("WHEN_RESOLVING_DEFAULT_TYPE_ARGUMENTS", 10);
        pkj0 pkj0Var12 = new pkj0("FOR_ALREADY_TRACKED", 11);
        f178476c = pkj0Var12;
        pkj0 pkj0Var13 = new pkj0("WHEN_GET_ALL_DESCRIPTORS", 12);
        f178477d = pkj0Var13;
        pkj0 pkj0Var14 = new pkj0("WHEN_TYPING", 13);
        pkj0 pkj0Var15 = new pkj0("WHEN_GET_SUPER_MEMBERS", 14);
        f178478e = pkj0Var15;
        pkj0 pkj0Var16 = new pkj0("FOR_NON_TRACKED_SCOPE", 15);
        f178479f = pkj0Var16;
        pkj0 pkj0Var17 = new pkj0("FROM_SYNTHETIC_SCOPE", 16);
        pkj0 pkj0Var18 = new pkj0("FROM_DESERIALIZATION", 17);
        f178480g = pkj0Var18;
        pkj0 pkj0Var19 = new pkj0("FROM_JAVA_LOADER", 18);
        f178481h = pkj0Var19;
        f178482i = new pkj0[]{pkj0Var, pkj0Var2, pkj0Var3, pkj0Var4, pkj0Var5, pkj0Var6, pkj0Var7, pkj0Var8, pkj0Var9, pkj0Var10, pkj0Var11, pkj0Var12, pkj0Var13, pkj0Var14, pkj0Var15, pkj0Var16, pkj0Var17, pkj0Var18, pkj0Var19, new pkj0("WHEN_GET_LOCAL_VARIABLE", 19), new pkj0("WHEN_FIND_BY_FQNAME", 20), new pkj0("WHEN_GET_COMPANION_OBJECT", 21), new pkj0("FOR_DEFAULT_IMPORTS", 22)};
    }

    public static pkj0 valueOf(String str) {
        return (pkj0) Enum.valueOf(pkj0.class, str);
    }

    public static pkj0[] values() {
        return (pkj0[]) f178482i.clone();
    }
}
