package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class vta {

    /* JADX INFO: renamed from: a */
    public static final vta f244590a;

    /* JADX INFO: renamed from: b */
    public static final vta f244591b;

    /* JADX INFO: renamed from: c */
    public static final vta f244592c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ vta[] f244593d;

    static {
        vta vtaVar = new vta("PRIMARY", 0);
        f244590a = vtaVar;
        vta vtaVar2 = new vta("SECONDARY", 1);
        f244591b = vtaVar2;
        vta vtaVar3 = new vta("TERTIARY", 2);
        f244592c = vtaVar3;
        f244593d = new vta[]{vtaVar, vtaVar2, vtaVar3};
    }

    public static vta valueOf(String str) {
        return (vta) Enum.valueOf(vta.class, str);
    }

    public static vta[] values() {
        return (vta[]) f244593d.clone();
    }
}
