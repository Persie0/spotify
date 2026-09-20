package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class fsk {

    /* JADX INFO: renamed from: a */
    public static final fsk f72882a;

    /* JADX INFO: renamed from: b */
    public static final fsk f72883b;

    /* JADX INFO: renamed from: c */
    public static final fsk f72884c;

    /* JADX INFO: renamed from: d */
    public static final fsk f72885d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ fsk[] f72886e;

    static {
        fsk fskVar = new fsk("LOCAL_FILE", 0);
        f72882a = fskVar;
        fsk fskVar2 = new fsk("CACHE", 1);
        f72883b = fskVar2;
        fsk fskVar3 = new fsk("NETWORK", 2);
        f72884c = fskVar3;
        fsk fskVar4 = new fsk("UNKNOWN", 3);
        f72885d = fskVar4;
        f72886e = new fsk[]{fskVar, fskVar2, fskVar3, fskVar4};
    }

    public static fsk valueOf(String str) {
        return (fsk) Enum.valueOf(fsk.class, str);
    }

    public static fsk[] values() {
        return (fsk[]) f72886e.clone();
    }
}
