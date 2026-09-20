package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class vx2 {

    /* JADX INFO: renamed from: a */
    public static final vx2 f245603a;

    /* JADX INFO: renamed from: b */
    public static final vx2 f245604b;

    /* JADX INFO: renamed from: c */
    public static final vx2 f245605c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ vx2[] f245606d;

    static {
        vx2 vx2Var = new vx2("RowClicked", 0);
        f245603a = vx2Var;
        vx2 vx2Var2 = new vx2("AddToLibraryClicked", 1);
        f245604b = vx2Var2;
        vx2 vx2Var3 = new vx2("ContextMenuClicked", 2);
        f245605c = vx2Var3;
        f245606d = new vx2[]{vx2Var, vx2Var2, vx2Var3};
    }

    public static vx2 valueOf(String str) {
        return (vx2) Enum.valueOf(vx2.class, str);
    }

    public static vx2[] values() {
        return (vx2[]) f245606d.clone();
    }
}
