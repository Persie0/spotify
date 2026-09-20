package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class beb {

    /* JADX INFO: renamed from: a */
    public static final beb f26315a;

    /* JADX INFO: renamed from: b */
    public static final beb f26316b;

    /* JADX INFO: renamed from: c */
    public static final beb f26317c;

    /* JADX INFO: renamed from: d */
    public static final beb f26318d;

    /* JADX INFO: renamed from: e */
    public static final beb f26319e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ beb[] f26320f;

    static {
        beb bebVar = new beb("UNKNOWN", 0);
        f26315a = bebVar;
        beb bebVar2 = new beb("INACTIVE", 1);
        f26316b = bebVar2;
        beb bebVar3 = new beb("METERING", 2);
        f26317c = bebVar3;
        beb bebVar4 = new beb("CONVERGED", 3);
        f26318d = bebVar4;
        beb bebVar5 = new beb("LOCKED", 4);
        f26319e = bebVar5;
        f26320f = new beb[]{bebVar, bebVar2, bebVar3, bebVar4, bebVar5};
    }

    public static beb valueOf(String str) {
        return (beb) Enum.valueOf(beb.class, str);
    }

    public static beb[] values() {
        return (beb[]) f26320f.clone();
    }
}
