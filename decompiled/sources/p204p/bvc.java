package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class bvc {

    /* JADX INFO: renamed from: a */
    public static final bvc f31323a;

    /* JADX INFO: renamed from: b */
    public static final bvc f31324b;

    /* JADX INFO: renamed from: c */
    public static final bvc f31325c;

    /* JADX INFO: renamed from: d */
    public static final bvc f31326d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ bvc[] f31327e;

    static {
        bvc bvcVar = new bvc("UNKNOWN", 0);
        f31323a = bvcVar;
        bvc bvcVar2 = new bvc("UP", 1);
        f31324b = bvcVar2;
        bvc bvcVar3 = new bvc("DOWN", 2);
        f31325c = bvcVar3;
        bvc bvcVar4 = new bvc("NEW", 3);
        f31326d = bvcVar4;
        f31327e = new bvc[]{bvcVar, bvcVar2, bvcVar3, bvcVar4, new bvc("EQUAL", 4)};
    }

    public static bvc valueOf(String str) {
        return (bvc) Enum.valueOf(bvc.class, str);
    }

    public static bvc[] values() {
        return (bvc[]) f31327e.clone();
    }
}
