package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class aiy0 {

    /* JADX INFO: renamed from: a */
    public static final aiy0 f16106a;

    /* JADX INFO: renamed from: b */
    public static final aiy0 f16107b;

    /* JADX INFO: renamed from: c */
    public static final aiy0 f16108c;

    /* JADX INFO: renamed from: d */
    public static final aiy0 f16109d;

    /* JADX INFO: renamed from: e */
    public static final aiy0 f16110e;

    /* JADX INFO: renamed from: f */
    public static final aiy0 f16111f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ aiy0[] f16112g;

    static {
        aiy0 aiy0Var = new aiy0("NO_ANSWER", 0);
        f16106a = aiy0Var;
        aiy0 aiy0Var2 = new aiy0("INCORRECT", 1);
        f16107b = aiy0Var2;
        aiy0 aiy0Var3 = new aiy0("LOW", 2);
        f16108c = aiy0Var3;
        aiy0 aiy0Var4 = new aiy0("MEDIUM", 3);
        f16109d = aiy0Var4;
        aiy0 aiy0Var5 = new aiy0("HIGH", 4);
        f16110e = aiy0Var5;
        aiy0 aiy0Var6 = new aiy0("PERFECT", 5);
        f16111f = aiy0Var6;
        f16112g = new aiy0[]{aiy0Var, aiy0Var2, aiy0Var3, aiy0Var4, aiy0Var5, aiy0Var6};
    }

    public static aiy0 valueOf(String str) {
        return (aiy0) Enum.valueOf(aiy0.class, str);
    }

    public static aiy0[] values() {
        return (aiy0[]) f16112g.clone();
    }

    /* JADX INFO: renamed from: a */
    public final long m26118a() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            return p9f.m69373c();
        }
        if (iOrdinal == 3) {
            return p9f.m69374d();
        }
        if (iOrdinal == 4) {
            return p9f.m69372b();
        }
        if (iOrdinal == 5) {
            return p9f.m69371a();
        }
        throw new NoWhenBranchMatchedException();
    }
}
