package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class pk80 {

    /* JADX INFO: renamed from: a */
    public static final pk80 f178412a;

    /* JADX INFO: renamed from: b */
    public static final pk80 f178413b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ pk80[] f178414c;

    /* JADX INFO: Fake field, exist only in values array */
    pk80 EF0;

    static {
        pk80 pk80Var = new pk80("SELECTABLE", 0);
        pk80 pk80Var2 = new pk80("SELECTED", 1);
        f178412a = pk80Var2;
        pk80 pk80Var3 = new pk80("DESELECTED", 2);
        f178413b = pk80Var3;
        f178414c = new pk80[]{pk80Var, pk80Var2, pk80Var3};
    }

    public static pk80 valueOf(String str) {
        return (pk80) Enum.valueOf(pk80.class, str);
    }

    public static pk80[] values() {
        return (pk80[]) f178414c.clone();
    }
}
