package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class v181 {

    /* JADX INFO: renamed from: a */
    public static final v181 f236293a;

    /* JADX INFO: renamed from: b */
    public static final v181 f236294b;

    /* JADX INFO: renamed from: c */
    public static final v181 f236295c;

    /* JADX INFO: renamed from: d */
    public static final v181 f236296d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ v181[] f236297e;

    static {
        v181 v181Var = new v181("STYLE_1", 0);
        f236293a = v181Var;
        v181 v181Var2 = new v181("STYLE_2", 1);
        f236294b = v181Var2;
        v181 v181Var3 = new v181("STYLE_3", 2);
        f236295c = v181Var3;
        v181 v181Var4 = new v181("STYLE_4", 3);
        f236296d = v181Var4;
        f236297e = new v181[]{v181Var, v181Var2, v181Var3, v181Var4};
    }

    public static v181 valueOf(String str) {
        return (v181) Enum.valueOf(v181.class, str);
    }

    public static v181[] values() {
        return (v181[]) f236297e.clone();
    }
}
