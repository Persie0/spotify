package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class c281 {

    /* JADX INFO: renamed from: a */
    public static final c281 f33320a;

    /* JADX INFO: renamed from: b */
    public static final c281 f33321b;

    /* JADX INFO: renamed from: c */
    public static final c281 f33322c;

    /* JADX INFO: renamed from: d */
    public static final c281 f33323d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ c281[] f33324e;

    static {
        c281 c281Var = new c281("Refresh", 0);
        f33320a = c281Var;
        c281 c281Var2 = new c281("OpenInBrowser", 1);
        f33321b = c281Var2;
        c281 c281Var3 = new c281("CopyLink", 2);
        f33322c = c281Var3;
        c281 c281Var4 = new c281("Share", 3);
        f33323d = c281Var4;
        f33324e = new c281[]{c281Var, c281Var2, c281Var3, c281Var4};
    }

    public static c281 valueOf(String str) {
        return (c281) Enum.valueOf(c281.class, str);
    }

    public static c281[] values() {
        return (c281[]) f33324e.clone();
    }
}
