package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ubl {

    /* JADX INFO: renamed from: a */
    public static final ubl f228815a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ ubl[] f228816b;

    static {
        ubl ublVar = new ubl("OnClicked", 0);
        f228815a = ublVar;
        f228816b = new ubl[]{ublVar};
    }

    public static ubl valueOf(String str) {
        return (ubl) Enum.valueOf(ubl.class, str);
    }

    public static ubl[] values() {
        return (ubl[]) f228816b.clone();
    }
}
