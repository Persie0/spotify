package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class z0w {

    /* JADX INFO: renamed from: a */
    public static final z0w f278176a;

    /* JADX INFO: renamed from: b */
    public static final z0w f278177b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ z0w[] f278178c;

    static {
        z0w z0wVar = new z0w("CardClicked", 0);
        f278176a = z0wVar;
        z0w z0wVar2 = new z0w("CardLongClicked", 1);
        f278177b = z0wVar2;
        f278178c = new z0w[]{z0wVar, z0wVar2};
    }

    public static z0w valueOf(String str) {
        return (z0w) Enum.valueOf(z0w.class, str);
    }

    public static z0w[] values() {
        return (z0w[]) f278178c.clone();
    }
}
