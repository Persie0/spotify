package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class zn81 {

    /* JADX INFO: renamed from: a */
    public static final zn81 f284435a;

    /* JADX INFO: renamed from: b */
    public static final zn81 f284436b;

    /* JADX INFO: renamed from: c */
    public static final zn81 f284437c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ zn81[] f284438d;

    static {
        zn81 zn81Var = new zn81("RowClicked", 0);
        f284435a = zn81Var;
        zn81 zn81Var2 = new zn81("RowLongClicked", 1);
        f284436b = zn81Var2;
        zn81 zn81Var3 = new zn81("ContextMenuClicked", 2);
        f284437c = zn81Var3;
        f284438d = new zn81[]{zn81Var, zn81Var2, zn81Var3};
    }

    public static zn81 valueOf(String str) {
        return (zn81) Enum.valueOf(zn81.class, str);
    }

    public static zn81[] values() {
        return (zn81[]) f284438d.clone();
    }
}
