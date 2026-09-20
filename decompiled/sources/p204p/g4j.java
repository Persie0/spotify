package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class g4j {

    /* JADX INFO: renamed from: a */
    public static final g4j f76426a;

    /* JADX INFO: renamed from: b */
    public static final g4j f76427b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ g4j[] f76428c;

    static {
        g4j g4jVar = new g4j("Availability", 0);
        f76426a = g4jVar;
        g4j g4jVar2 = new g4j("Selection", 1);
        f76427b = g4jVar2;
        f76428c = new g4j[]{g4jVar, g4jVar2};
    }

    public static g4j valueOf(String str) {
        return (g4j) Enum.valueOf(g4j.class, str);
    }

    public static g4j[] values() {
        return (g4j[]) f76428c.clone();
    }
}
