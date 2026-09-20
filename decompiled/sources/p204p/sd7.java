package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class sd7 {

    /* JADX INFO: renamed from: a */
    public static final sd7 f207903a;

    /* JADX INFO: renamed from: b */
    public static final sd7 f207904b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ sd7[] f207905c;

    static {
        sd7 sd7Var = new sd7("RowClicked", 0);
        f207903a = sd7Var;
        sd7 sd7Var2 = new sd7("AddToLibraryClicked", 1);
        f207904b = sd7Var2;
        f207905c = new sd7[]{sd7Var, sd7Var2};
    }

    public static sd7 valueOf(String str) {
        return (sd7) Enum.valueOf(sd7.class, str);
    }

    public static sd7[] values() {
        return (sd7[]) f207905c.clone();
    }
}
