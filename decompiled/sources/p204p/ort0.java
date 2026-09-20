package p204p;

import java.util.Set;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class ort0 {

    /* JADX INFO: renamed from: a */
    public static final Set f168651a;

    /* JADX INFO: renamed from: b */
    public static final gbu f168652b;

    /* JADX INFO: renamed from: c */
    public static final ort0 f168653c;

    /* JADX INFO: renamed from: d */
    public static final ort0 f168654d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ ort0[] f168655e;

    static {
        ort0 ort0Var = new ort0("Music", 0);
        f168653c = ort0Var;
        ort0 ort0Var2 = new ort0("Talk", 1);
        f168654d = ort0Var2;
        ort0[] ort0VarArr = {ort0Var, ort0Var2};
        f168655e = ort0VarArr;
        f168651a = g6f.m43736n1(new nzv(ort0VarArr));
        f168652b = gbu.f78413a;
    }

    public static ort0 valueOf(String str) {
        return (ort0) Enum.valueOf(ort0.class, str);
    }

    public static ort0[] values() {
        return (ort0[]) f168655e.clone();
    }
}
