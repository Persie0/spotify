package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class rgs {

    /* JADX INFO: renamed from: a */
    public static final rgs f199006a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ rgs[] f199007b;

    static {
        rgs rgsVar = new rgs("Closed", 0);
        f199006a = rgsVar;
        f199007b = new rgs[]{rgsVar, new rgs("Open", 1)};
    }

    public static rgs valueOf(String str) {
        return (rgs) Enum.valueOf(rgs.class, str);
    }

    public static rgs[] values() {
        return (rgs[]) f199007b.clone();
    }
}
