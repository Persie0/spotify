package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class e3s {

    /* JADX INFO: renamed from: a */
    public static final e3s f55875a;

    /* JADX INFO: renamed from: b */
    public static final e3s f55876b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ e3s[] f55877c;

    static {
        e3s e3sVar = new e3s("Header", 0);
        f55875a = e3sVar;
        e3s e3sVar2 = new e3s("ContextMenu", 1);
        f55876b = e3sVar2;
        f55877c = new e3s[]{e3sVar, e3sVar2};
    }

    public static e3s valueOf(String str) {
        return (e3s) Enum.valueOf(e3s.class, str);
    }

    public static e3s[] values() {
        return (e3s[]) f55877c.clone();
    }
}
