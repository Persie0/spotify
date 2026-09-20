package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class vpl {

    /* JADX INFO: renamed from: a */
    public static final vpl f243722a;

    /* JADX INFO: renamed from: b */
    public static final vpl f243723b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ vpl[] f243724c;

    static {
        vpl vplVar = new vpl("CLIENT_PRODUCED", 0);
        f243722a = vplVar;
        vpl vplVar2 = new vpl("INFERRED", 1);
        f243723b = vplVar2;
        f243724c = new vpl[]{vplVar, vplVar2};
    }

    public static vpl valueOf(String str) {
        return (vpl) Enum.valueOf(vpl.class, str);
    }

    public static vpl[] values() {
        return (vpl[]) f243724c.clone();
    }
}
