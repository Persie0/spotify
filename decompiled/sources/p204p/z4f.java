package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class z4f {

    /* JADX INFO: renamed from: a */
    public static final z4f f279228a;

    /* JADX INFO: renamed from: b */
    public static final z4f f279229b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ z4f[] f279230c;

    static {
        z4f z4fVar = new z4f("NORMAL", 0);
        f279228a = z4fVar;
        z4f z4fVar2 = new z4f("COMPACT", 1);
        f279229b = z4fVar2;
        f279230c = new z4f[]{z4fVar, z4fVar2};
    }

    public static z4f valueOf(String str) {
        return (z4f) Enum.valueOf(z4f.class, str);
    }

    public static z4f[] values() {
        return (z4f[]) f279230c.clone();
    }
}
