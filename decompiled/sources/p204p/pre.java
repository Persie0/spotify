package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class pre {

    /* JADX INFO: renamed from: a */
    public static final pre f180574a;

    /* JADX INFO: renamed from: b */
    public static final pre f180575b;

    /* JADX INFO: renamed from: c */
    public static final pre f180576c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ pre[] f180577d;

    static {
        pre preVar = new pre("Loading", 0);
        f180574a = preVar;
        pre preVar2 = new pre("Loaded", 1);
        f180575b = preVar2;
        pre preVar3 = new pre("Error", 2);
        f180576c = preVar3;
        f180577d = new pre[]{preVar, preVar2, preVar3};
    }

    public static pre valueOf(String str) {
        return (pre) Enum.valueOf(pre.class, str);
    }

    public static pre[] values() {
        return (pre[]) f180577d.clone();
    }
}
