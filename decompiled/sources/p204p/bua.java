package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class bua {

    /* JADX INFO: renamed from: a */
    public static final bua f31069a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ bua[] f31070b;

    static {
        bua buaVar = new bua("ButtonClicked", 0);
        f31069a = buaVar;
        f31070b = new bua[]{buaVar};
    }

    public static bua valueOf(String str) {
        return (bua) Enum.valueOf(bua.class, str);
    }

    public static bua[] values() {
        return (bua[]) f31070b.clone();
    }
}
