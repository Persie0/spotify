package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class jmz {

    /* JADX INFO: renamed from: a */
    public static final jmz f113964a;

    /* JADX INFO: renamed from: b */
    public static final jmz f113965b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ jmz[] f113966c;

    static {
        jmz jmzVar = new jmz("PREMIUM", 0);
        f113964a = jmzVar;
        jmz jmzVar2 = new jmz("FREE", 1);
        f113965b = jmzVar2;
        f113966c = new jmz[]{jmzVar, jmzVar2};
    }

    public static jmz valueOf(String str) {
        return (jmz) Enum.valueOf(jmz.class, str);
    }

    public static jmz[] values() {
        return (jmz[]) f113966c.clone();
    }
}
