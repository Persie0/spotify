package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class vsa {

    /* JADX INFO: renamed from: a */
    public static final vsa f244390a;

    /* JADX INFO: renamed from: b */
    public static final vsa f244391b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ vsa[] f244392c;

    static {
        vsa vsaVar = new vsa("DARK", 0);
        f244390a = vsaVar;
        vsa vsaVar2 = new vsa("LIGHT", 1);
        f244391b = vsaVar2;
        f244392c = new vsa[]{vsaVar, vsaVar2};
    }

    public static vsa valueOf(String str) {
        return (vsa) Enum.valueOf(vsa.class, str);
    }

    public static vsa[] values() {
        return (vsa[]) f244392c.clone();
    }
}
