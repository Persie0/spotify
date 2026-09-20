package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class zuf0 {

    /* JADX INFO: renamed from: a */
    public static final zuf0 f286432a;

    /* JADX INFO: renamed from: b */
    public static final zuf0 f286433b;

    /* JADX INFO: renamed from: c */
    public static final zuf0 f286434c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ zuf0[] f286435d;

    static {
        zuf0 zuf0Var = new zuf0("OnAddToPlaylistClicked", 0);
        f286432a = zuf0Var;
        zuf0 zuf0Var2 = new zuf0("OnShareClicked", 1);
        f286433b = zuf0Var2;
        zuf0 zuf0Var3 = new zuf0("OnDismissRequest", 2);
        f286434c = zuf0Var3;
        f286435d = new zuf0[]{zuf0Var, zuf0Var2, zuf0Var3};
    }

    public static zuf0 valueOf(String str) {
        return (zuf0) Enum.valueOf(zuf0.class, str);
    }

    public static zuf0[] values() {
        return (zuf0[]) f286435d.clone();
    }
}
