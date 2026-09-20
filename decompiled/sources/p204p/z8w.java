package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class z8w {

    /* JADX INFO: renamed from: a */
    public static final z8w f280578a;

    /* JADX INFO: renamed from: b */
    public static final z8w f280579b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ z8w[] f280580c;

    static {
        z8w z8wVar = new z8w("RowClicked", 0);
        f280578a = z8wVar;
        z8w z8wVar2 = new z8w("AddToLibraryClicked", 1);
        f280579b = z8wVar2;
        f280580c = new z8w[]{z8wVar, z8wVar2};
    }

    public static z8w valueOf(String str) {
        return (z8w) Enum.valueOf(z8w.class, str);
    }

    public static z8w[] values() {
        return (z8w[]) f280580c.clone();
    }
}
