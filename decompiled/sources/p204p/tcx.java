package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class tcx {

    /* JADX INFO: renamed from: a */
    public static final tcx f219157a;

    /* JADX INFO: renamed from: b */
    public static final tcx f219158b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ tcx[] f219159c;

    static {
        tcx tcxVar = new tcx("ClickRow", 0);
        f219157a = tcxVar;
        tcx tcxVar2 = new tcx("ClickCta", 1);
        f219158b = tcxVar2;
        f219159c = new tcx[]{tcxVar, tcxVar2};
    }

    public static tcx valueOf(String str) {
        return (tcx) Enum.valueOf(tcx.class, str);
    }

    public static tcx[] values() {
        return (tcx[]) f219159c.clone();
    }
}
