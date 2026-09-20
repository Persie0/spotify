package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class bda {

    /* JADX INFO: renamed from: a */
    public static final bda f26061a;

    /* JADX INFO: renamed from: b */
    public static final bda f26062b;

    /* JADX INFO: renamed from: c */
    public static final bda f26063c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ bda[] f26064d;

    static {
        bda bdaVar = new bda("Collapsed", 0);
        f26061a = bdaVar;
        bda bdaVar2 = new bda("Expanded", 1);
        f26062b = bdaVar2;
        bda bdaVar3 = new bda("Hidden", 2);
        f26063c = bdaVar3;
        f26064d = new bda[]{bdaVar, bdaVar2, bdaVar3};
    }

    public static bda valueOf(String str) {
        return (bda) Enum.valueOf(bda.class, str);
    }

    public static bda[] values() {
        return (bda[]) f26064d.clone();
    }
}
