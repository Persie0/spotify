package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class lkr {

    /* JADX INFO: renamed from: a */
    public static final lkr f134435a;

    /* JADX INFO: renamed from: b */
    public static final lkr f134436b;

    /* JADX INFO: renamed from: c */
    public static final lkr f134437c;

    /* JADX INFO: renamed from: d */
    public static final lkr f134438d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ lkr[] f134439e;

    static {
        lkr lkrVar = new lkr("LEFT", 0);
        f134435a = lkrVar;
        lkr lkrVar2 = new lkr("RIGHT", 1);
        f134436b = lkrVar2;
        lkr lkrVar3 = new lkr("TOP", 2);
        f134437c = lkrVar3;
        lkr lkrVar4 = new lkr("BOTTOM", 3);
        f134438d = lkrVar4;
        f134439e = new lkr[]{lkrVar, lkrVar2, lkrVar3, lkrVar4};
    }

    public static lkr valueOf(String str) {
        return (lkr) Enum.valueOf(lkr.class, str);
    }

    public static lkr[] values() {
        return (lkr[]) f134439e.clone();
    }
}
