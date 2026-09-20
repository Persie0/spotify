package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class h2b {

    /* JADX INFO: renamed from: a */
    public static final h2b f86944a;

    /* JADX INFO: renamed from: b */
    public static final h2b f86945b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ h2b[] f86946c;

    static {
        h2b h2bVar = new h2b("FIRST", 0);
        f86944a = h2bVar;
        h2b h2bVar2 = new h2b("SECOND", 1);
        f86945b = h2bVar2;
        f86946c = new h2b[]{h2bVar, h2bVar2, new h2b("THIRD", 2), new h2b("FOURTH", 3)};
    }

    public static h2b valueOf(String str) {
        return (h2b) Enum.valueOf(h2b.class, str);
    }

    public static h2b[] values() {
        return (h2b[]) f86946c.clone();
    }
}
