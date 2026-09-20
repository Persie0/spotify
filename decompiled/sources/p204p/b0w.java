package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class b0w {

    /* JADX INFO: renamed from: a */
    public static final b0w f22113a;

    /* JADX INFO: renamed from: b */
    public static final b0w f22114b;

    /* JADX INFO: renamed from: c */
    public static final b0w f22115c;

    /* JADX INFO: renamed from: d */
    public static final b0w f22116d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ b0w[] f22117e;

    static {
        b0w b0wVar = new b0w("FULL", 0);
        f22113a = b0wVar;
        b0w b0wVar2 = new b0w("TRAILER", 1);
        f22114b = b0wVar2;
        b0w b0wVar3 = new b0w("BONUS", 2);
        f22115c = b0wVar3;
        b0w b0wVar4 = new b0w("UNKNOWN", 3);
        f22116d = b0wVar4;
        f22117e = new b0w[]{b0wVar, b0wVar2, b0wVar3, b0wVar4};
        values();
    }

    public static b0w valueOf(String str) {
        return (b0w) Enum.valueOf(b0w.class, str);
    }

    public static b0w[] values() {
        return (b0w[]) f22117e.clone();
    }
}
