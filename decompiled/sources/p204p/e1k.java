package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class e1k {

    /* JADX INFO: renamed from: a */
    public static final e1k f55211a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ e1k[] f55212b;

    static {
        e1k e1kVar = new e1k("NOT_INTERESTED", 0);
        f55211a = e1kVar;
        f55212b = new e1k[]{e1kVar};
    }

    public static e1k valueOf(String str) {
        return (e1k) Enum.valueOf(e1k.class, str);
    }

    public static e1k[] values() {
        return (e1k[]) f55212b.clone();
    }
}
