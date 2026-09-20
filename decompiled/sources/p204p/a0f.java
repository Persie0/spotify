package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class a0f {

    /* JADX INFO: renamed from: a */
    public static final a0f f11069a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ a0f[] f11070b;

    static {
        a0f a0fVar = new a0f("CardClicked", 0);
        f11069a = a0fVar;
        f11070b = new a0f[]{a0fVar};
    }

    public static a0f valueOf(String str) {
        return (a0f) Enum.valueOf(a0f.class, str);
    }

    public static a0f[] values() {
        return (a0f[]) f11070b.clone();
    }
}
