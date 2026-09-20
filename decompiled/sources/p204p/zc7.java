package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class zc7 {

    /* JADX INFO: renamed from: a */
    public static final zc7 f281469a;

    /* JADX INFO: renamed from: b */
    public static final zc7 f281470b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ zc7[] f281471c;

    static {
        zc7 zc7Var = new zc7("RowClicked", 0);
        f281469a = zc7Var;
        zc7 zc7Var2 = new zc7("AddClicked", 1);
        f281470b = zc7Var2;
        f281471c = new zc7[]{zc7Var, zc7Var2};
    }

    public static zc7 valueOf(String str) {
        return (zc7) Enum.valueOf(zc7.class, str);
    }

    public static zc7[] values() {
        return (zc7[]) f281471c.clone();
    }
}
