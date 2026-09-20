package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class wfc {

    /* JADX INFO: renamed from: a */
    public static final wfc f250794a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ wfc[] f250795b;

    static {
        wfc wfcVar = new wfc("Click", 0);
        f250794a = wfcVar;
        f250795b = new wfc[]{wfcVar};
    }

    public static wfc valueOf(String str) {
        return (wfc) Enum.valueOf(wfc.class, str);
    }

    public static wfc[] values() {
        return (wfc[]) f250795b.clone();
    }
}
