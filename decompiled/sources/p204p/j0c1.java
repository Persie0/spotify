package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class j0c1 {

    /* JADX INFO: renamed from: a */
    public static final j0c1 f107416a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ j0c1[] f107417b;

    /* JADX INFO: Fake field, exist only in values array */
    j0c1 EF0;

    static {
        j0c1 j0c1Var = new j0c1("SUBSCRIBED", 0);
        j0c1 j0c1Var2 = new j0c1("START", 1);
        j0c1 j0c1Var3 = new j0c1("STOP", 2);
        j0c1 j0c1Var4 = new j0c1("PAUSE", 3);
        j0c1 j0c1Var5 = new j0c1("RESUME", 4);
        j0c1 j0c1Var6 = new j0c1("SEEK_TO", 5);
        j0c1 j0c1Var7 = new j0c1("SET_STOP_POSITION", 6);
        j0c1 j0c1Var8 = new j0c1("SET_MARKERS", 7);
        j0c1 j0c1Var9 = new j0c1("PREFETCH_TRACKS", 8);
        j0c1 j0c1Var10 = new j0c1("CONFIG", 9);
        j0c1 j0c1Var11 = new j0c1("UNKNOWN", 10);
        f107416a = j0c1Var11;
        f107417b = new j0c1[]{j0c1Var, j0c1Var2, j0c1Var3, j0c1Var4, j0c1Var5, j0c1Var6, j0c1Var7, j0c1Var8, j0c1Var9, j0c1Var10, j0c1Var11};
    }

    public static j0c1 valueOf(String str) {
        return (j0c1) Enum.valueOf(j0c1.class, str);
    }

    public static j0c1[] values() {
        return (j0c1[]) f107417b.clone();
    }
}
