package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class zay {

    /* JADX INFO: renamed from: a */
    public static final zay f281178a;

    /* JADX INFO: renamed from: b */
    public static final zay f281179b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ zay[] f281180c;

    static {
        zay zayVar = new zay("CardClicked", 0);
        f281178a = zayVar;
        zay zayVar2 = new zay("PrimaryButtonClicked", 1);
        f281179b = zayVar2;
        f281180c = new zay[]{zayVar, zayVar2};
    }

    public static zay valueOf(String str) {
        return (zay) Enum.valueOf(zay.class, str);
    }

    public static zay[] values() {
        return (zay[]) f281180c.clone();
    }
}
