package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class jwo0 {

    /* JADX INFO: renamed from: a */
    public static final jwo0 f116665a;

    /* JADX INFO: renamed from: b */
    public static final jwo0 f116666b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ jwo0[] f116667c;

    static {
        jwo0 jwo0Var = new jwo0("PlayIfItemIsNotCurrentItem", 0);
        f116665a = jwo0Var;
        jwo0 jwo0Var2 = new jwo0("Never", 1);
        f116666b = jwo0Var2;
        f116667c = new jwo0[]{jwo0Var, jwo0Var2};
    }

    public static jwo0 valueOf(String str) {
        return (jwo0) Enum.valueOf(jwo0.class, str);
    }

    public static jwo0[] values() {
        return (jwo0[]) f116667c.clone();
    }
}
