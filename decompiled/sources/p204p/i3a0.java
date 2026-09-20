package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class i3a0 {

    /* JADX INFO: renamed from: a */
    public static final i3a0 f98079a;

    /* JADX INFO: renamed from: b */
    public static final i3a0 f98080b;

    /* JADX INFO: renamed from: c */
    public static final i3a0 f98081c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ i3a0[] f98082d;

    static {
        i3a0 i3a0Var = new i3a0("NETWORK", 0);
        f98079a = i3a0Var;
        i3a0 i3a0Var2 = new i3a0("CACHE", 1);
        f98080b = i3a0Var2;
        i3a0 i3a0Var3 = new i3a0("FALLBACK", 2);
        f98081c = i3a0Var3;
        f98082d = new i3a0[]{i3a0Var, i3a0Var2, i3a0Var3, new i3a0("OFFLINE", 3)};
    }

    public static i3a0 valueOf(String str) {
        return (i3a0) Enum.valueOf(i3a0.class, str);
    }

    public static i3a0[] values() {
        return (i3a0[]) f98082d.clone();
    }
}
