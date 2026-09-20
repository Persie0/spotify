package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class f1s {

    /* JADX INFO: renamed from: a */
    public static final f1s f64955a;

    /* JADX INFO: renamed from: b */
    public static final f1s f64956b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ f1s[] f64957c;

    static {
        f1s f1sVar = new f1s("DOCKED", 0);
        f64955a = f1sVar;
        f1s f1sVar2 = new f1s("NOT_DOCKED", 1);
        f64956b = f1sVar2;
        f64957c = new f1s[]{f1sVar, f1sVar2};
    }

    public static f1s valueOf(String str) {
        return (f1s) Enum.valueOf(f1s.class, str);
    }

    public static f1s[] values() {
        return (f1s[]) f64957c.clone();
    }
}
