package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class apb {

    /* JADX INFO: renamed from: a */
    public static final apb f17900a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ apb[] f17901b;

    static {
        apb apbVar = new apb("CancelRequestClicked", 0);
        f17900a = apbVar;
        f17901b = new apb[]{apbVar};
    }

    public static apb valueOf(String str) {
        return (apb) Enum.valueOf(apb.class, str);
    }

    public static apb[] values() {
        return (apb[]) f17901b.clone();
    }
}
