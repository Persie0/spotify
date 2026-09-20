package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class fgz {

    /* JADX INFO: renamed from: a */
    public static final fgz f69479a;

    /* JADX INFO: renamed from: b */
    public static final fgz f69480b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ fgz[] f69481c;

    static {
        fgz fgzVar = new fgz("EMP", 0);
        f69479a = fgzVar;
        fgz fgzVar2 = new fgz("GM", 1);
        f69480b = fgzVar2;
        f69481c = new fgz[]{fgzVar, fgzVar2};
    }

    public static fgz valueOf(String str) {
        return (fgz) Enum.valueOf(fgz.class, str);
    }

    public static fgz[] values() {
        return (fgz[]) f69481c.clone();
    }
}
