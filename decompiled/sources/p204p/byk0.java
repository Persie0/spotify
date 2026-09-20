package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class byk0 {

    /* JADX INFO: renamed from: a */
    public static final byk0 f32251a;

    /* JADX INFO: renamed from: b */
    public static final byk0 f32252b;

    /* JADX INFO: renamed from: c */
    public static final byk0 f32253c;

    /* JADX INFO: renamed from: d */
    public static final byk0 f32254d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ byk0[] f32255e;

    static {
        byk0 byk0Var = new byk0("GoToYourLibraryClicked", 0);
        f32251a = byk0Var;
        byk0 byk0Var2 = new byk0("GoToOfflineBackupClicked", 1);
        f32252b = byk0Var2;
        byk0 byk0Var3 = new byk0("GoToAutoDownloadsClicked", 2);
        f32253c = byk0Var3;
        byk0 byk0Var4 = new byk0("RetryLoadClicked", 3);
        f32254d = byk0Var4;
        f32255e = new byk0[]{byk0Var, byk0Var2, byk0Var3, byk0Var4};
    }

    public static byk0 valueOf(String str) {
        return (byk0) Enum.valueOf(byk0.class, str);
    }

    public static byk0[] values() {
        return (byk0[]) f32255e.clone();
    }
}
