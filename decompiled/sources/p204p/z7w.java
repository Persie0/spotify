package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class z7w {

    /* JADX INFO: renamed from: a */
    public static final z7w f280285a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ z7w[] f280286b;

    /* JADX INFO: Fake field, exist only in values array */
    z7w EF0;

    static {
        z7w z7wVar = new z7w("Music", 0);
        z7w z7wVar2 = new z7w("None", 1);
        f280285a = z7wVar2;
        f280286b = new z7w[]{z7wVar, z7wVar2};
    }

    public static z7w valueOf(String str) {
        return (z7w) Enum.valueOf(z7w.class, str);
    }

    public static z7w[] values() {
        return (z7w[]) f280286b.clone();
    }
}
