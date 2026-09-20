package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class c4s {

    /* JADX INFO: renamed from: a */
    public static final c4s f33999a;

    /* JADX INFO: renamed from: b */
    public static final c4s f34000b;

    /* JADX INFO: renamed from: c */
    public static final c4s f34001c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ c4s[] f34002d;

    static {
        c4s c4sVar = new c4s("HANDLE_DOWNLOAD", 0);
        f33999a = c4sVar;
        c4s c4sVar2 = new c4s("REMOVE_DOWNLOAD", 1);
        f34000b = c4sVar2;
        c4s c4sVar3 = new c4s("HANDLE_REMOVE_DOWNLOAD", 2);
        f34001c = c4sVar3;
        f34002d = new c4s[]{c4sVar, c4sVar2, c4sVar3};
    }

    public static c4s valueOf(String str) {
        return (c4s) Enum.valueOf(c4s.class, str);
    }

    public static c4s[] values() {
        return (c4s[]) f34002d.clone();
    }
}
