package p204p;

import java.util.Set;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class k590 {

    /* JADX INFO: renamed from: a */
    public static final Set f119450a;

    /* JADX INFO: renamed from: b */
    public static final k590 f119451b;

    /* JADX INFO: renamed from: c */
    public static final k590 f119452c;

    /* JADX INFO: renamed from: d */
    public static final k590 f119453d;

    /* JADX INFO: renamed from: e */
    public static final k590 f119454e;

    /* JADX INFO: renamed from: f */
    public static final k590 f119455f;

    /* JADX INFO: renamed from: g */
    public static final k590 f119456g;

    /* JADX INFO: renamed from: h */
    public static final k590 f119457h;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ k590[] f119458i;

    static {
        k590 k590Var = new k590("MESSAGE_STATUS_UNKNOWN", 0);
        f119451b = k590Var;
        k590 k590Var2 = new k590("MESSAGE_STATUS_SUCCESS", 1);
        f119452c = k590Var2;
        k590 k590Var3 = new k590("MESSAGE_STATUS_QUEUED", 2);
        f119453d = k590Var3;
        k590 k590Var4 = new k590("MESSAGE_STATUS_PROCESSING", 3);
        f119454e = k590Var4;
        k590 k590Var5 = new k590("MESSAGE_STATUS_ERROR", 4);
        f119455f = k590Var5;
        k590 k590Var6 = new k590("UNGENERATED", 5);
        f119456g = k590Var6;
        k590 k590Var7 = new k590("NO_CONTENT", 6);
        f119457h = k590Var7;
        f119458i = new k590[]{k590Var, k590Var2, k590Var3, k590Var4, k590Var5, k590Var6, k590Var7};
        f119450a = bk5.m29624m1(new k590[]{k590Var3, k590Var4});
    }

    public static k590 valueOf(String str) {
        return (k590) Enum.valueOf(k590.class, str);
    }

    public static k590[] values() {
        return (k590[]) f119458i.clone();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m55431a() {
        return this == f119456g;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m55432b() {
        return this == f119452c;
    }
}
