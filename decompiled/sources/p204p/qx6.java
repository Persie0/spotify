package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class qx6 {

    /* JADX INFO: renamed from: a */
    public static final qx6 f193523a;

    /* JADX INFO: renamed from: b */
    public static final qx6 f193524b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ qx6[] f193525c;

    static {
        qx6 qx6Var = new qx6("AUDIO_FOCUS_GRANTED", 0);
        f193523a = qx6Var;
        qx6 qx6Var2 = new qx6("AUDIO_FOCUS_NOT_GRANTED", 1);
        f193524b = qx6Var2;
        f193525c = new qx6[]{qx6Var, qx6Var2};
    }

    public static qx6 valueOf(String str) {
        return (qx6) Enum.valueOf(qx6.class, str);
    }

    public static qx6[] values() {
        return (qx6[]) f193525c.clone();
    }
}
