package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class y8z0 {

    /* JADX INFO: renamed from: a */
    public static final y8z0 f270449a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ y8z0[] f270450b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ nzv f270451c;

    /* JADX INFO: Fake field, exist only in values array */
    y8z0 EF0;

    static {
        y8z0 y8z0Var = new y8z0("GRID", 0);
        y8z0 y8z0Var2 = new y8z0("GRID_COMPACT", 1);
        y8z0 y8z0Var3 = new y8z0("LIST", 2);
        f270449a = y8z0Var3;
        y8z0[] y8z0VarArr = {y8z0Var, y8z0Var2, y8z0Var3, new y8z0("LIST_WITHOUT_TITLE", 3), new y8z0("SIMPLE_ROW", 4), new y8z0("SINGLE_ITEM", 5), new y8z0("SINGLE_ITEM_WITH_TITLE", 6), new y8z0("IMAGE_ROW_WITH_TEXT_LABELS", 7)};
        f270450b = y8z0VarArr;
        f270451c = new nzv(y8z0VarArr);
    }

    public static y8z0 valueOf(String str) {
        return (y8z0) Enum.valueOf(y8z0.class, str);
    }

    public static y8z0[] values() {
        return (y8z0[]) f270450b.clone();
    }
}
