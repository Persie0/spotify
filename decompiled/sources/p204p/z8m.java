package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class z8m {

    /* JADX INFO: renamed from: a */
    public static final z8m f280494a;

    /* JADX INFO: renamed from: b */
    public static final z8m f280495b;

    /* JADX INFO: renamed from: c */
    public static final z8m f280496c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ z8m[] f280497d;

    static {
        z8m z8mVar = new z8m("ADD", 0);
        f280494a = z8mVar;
        z8m z8mVar2 = new z8m("MOVE", 1);
        f280495b = z8mVar2;
        z8m z8mVar3 = new z8m("REMOVE", 2);
        f280496c = z8mVar3;
        f280497d = new z8m[]{z8mVar, z8mVar2, z8mVar3};
    }

    public static z8m valueOf(String str) {
        return (z8m) Enum.valueOf(z8m.class, str);
    }

    public static z8m[] values() {
        return (z8m[]) f280497d.clone();
    }
}
