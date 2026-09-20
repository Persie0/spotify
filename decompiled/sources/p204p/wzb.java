package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class wzb {

    /* JADX INFO: renamed from: a */
    public static final wzb f256550a;

    /* JADX INFO: renamed from: b */
    public static final wzb f256551b;

    /* JADX INFO: renamed from: c */
    public static final wzb f256552c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ wzb[] f256553d;

    static {
        wzb wzbVar = new wzb("DEFAULT", 0);
        f256550a = wzbVar;
        wzb wzbVar2 = new wzb("DOUBLE_LINE_TITLE", 1);
        f256551b = wzbVar2;
        wzb wzbVar3 = new wzb("DOUBLE_LINE_SUBTITLE", 2);
        f256552c = wzbVar3;
        f256553d = new wzb[]{wzbVar, wzbVar2, wzbVar3};
        values();
    }

    public static wzb valueOf(String str) {
        return (wzb) Enum.valueOf(wzb.class, str);
    }

    public static wzb[] values() {
        return (wzb[]) f256553d.clone();
    }
}
