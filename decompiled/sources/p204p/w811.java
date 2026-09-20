package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class w811 implements im20 {

    /* JADX INFO: renamed from: a */
    public static final w811 f248822a;

    /* JADX INFO: renamed from: b */
    public static final w811 f248823b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ w811[] f248824c;

    static {
        w811 w811Var = new w811("Curation", 0);
        f248822a = w811Var;
        w811 w811Var2 = new w811("ContextMenu", 1);
        f248823b = w811Var2;
        f248824c = new w811[]{w811Var, w811Var2};
    }

    public static w811 valueOf(String str) {
        return (w811) Enum.valueOf(w811.class, str);
    }

    public static w811[] values() {
        return (w811[]) f248824c.clone();
    }
}
