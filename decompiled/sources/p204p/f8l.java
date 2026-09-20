package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class f8l {

    /* JADX INFO: renamed from: a */
    public static final f8l f67007a;

    /* JADX INFO: renamed from: b */
    public static final f8l f67008b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ f8l[] f67009c;

    static {
        f8l f8lVar = new f8l("LEADING", 0);
        f67007a = f8lVar;
        f8l f8lVar2 = new f8l("BACKGROUND", 1);
        f67008b = f8lVar2;
        f67009c = new f8l[]{f8lVar, f8lVar2};
    }

    public static f8l valueOf(String str) {
        return (f8l) Enum.valueOf(f8l.class, str);
    }

    public static f8l[] values() {
        return (f8l[]) f67009c.clone();
    }
}
