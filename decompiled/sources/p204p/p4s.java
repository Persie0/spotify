package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class p4s {

    /* JADX INFO: renamed from: a */
    public static final p4s f174002a;

    /* JADX INFO: renamed from: b */
    public static final p4s f174003b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ p4s[] f174004c;

    static {
        p4s p4sVar = new p4s("OnDownloadClicked", 0);
        f174002a = p4sVar;
        p4s p4sVar2 = new p4s("OnRemoveDownloadClicked", 1);
        f174003b = p4sVar2;
        f174004c = new p4s[]{p4sVar, p4sVar2};
    }

    public static p4s valueOf(String str) {
        return (p4s) Enum.valueOf(p4s.class, str);
    }

    public static p4s[] values() {
        return (p4s[]) f174004c.clone();
    }
}
