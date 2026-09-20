package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class jni0 {

    /* JADX INFO: renamed from: a */
    public static final jni0 f114116a;

    /* JADX INFO: renamed from: b */
    public static final jni0 f114117b;

    /* JADX INFO: renamed from: c */
    public static final jni0 f114118c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ jni0[] f114119d;

    static {
        jni0 jni0Var = new jni0("MV_RELATED_ASSOCIATION_RELATION_TYPE_UNKNOWN", 0);
        f114116a = jni0Var;
        jni0 jni0Var2 = new jni0("MV_RELATED_ASSOCIATION_RELATION_TYPE_UNSPECIFIED", 1);
        f114117b = jni0Var2;
        jni0 jni0Var3 = new jni0("MV_RELATED_ASSOCIATION_RELATION_TYPE_OFFICIAL_MIX", 2);
        f114118c = jni0Var3;
        f114119d = new jni0[]{jni0Var, jni0Var2, jni0Var3};
    }

    public static jni0 valueOf(String str) {
        return (jni0) Enum.valueOf(jni0.class, str);
    }

    public static jni0[] values() {
        return (jni0[]) f114119d.clone();
    }
}
