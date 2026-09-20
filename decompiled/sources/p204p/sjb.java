package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class sjb {

    /* JADX INFO: renamed from: a */
    public static final sjb f209796a;

    /* JADX INFO: renamed from: b */
    public static final sjb f209797b;

    /* JADX INFO: renamed from: c */
    public static final sjb f209798c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ sjb[] f209799d;

    static {
        sjb sjbVar = new sjb("Requested", 0);
        f209796a = sjbVar;
        sjb sjbVar2 = new sjb("Success", 1);
        f209797b = sjbVar2;
        sjb sjbVar3 = new sjb("Error", 2);
        f209798c = sjbVar3;
        f209799d = new sjb[]{sjbVar, sjbVar2, sjbVar3};
    }

    public static sjb valueOf(String str) {
        return (sjb) Enum.valueOf(sjb.class, str);
    }

    public static sjb[] values() {
        return (sjb[]) f209799d.clone();
    }
}
