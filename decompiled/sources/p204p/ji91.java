package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class ji91 {

    /* JADX INFO: renamed from: a */
    public static final ji91 f112690a;

    /* JADX INFO: renamed from: b */
    public static final ji91 f112691b;

    /* JADX INFO: renamed from: c */
    public static final ji91 f112692c;

    /* JADX INFO: renamed from: d */
    public static final ji91 f112693d;

    /* JADX INFO: renamed from: e */
    public static final ji91 f112694e;

    /* JADX INFO: renamed from: f */
    public static final ji91 f112695f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ ji91[] f112696g;

    static {
        ji91 ji91Var = new ji91("DOWNLOADS_SNACKBAR", 0);
        f112690a = ji91Var;
        ji91 ji91Var2 = new ji91("OFFLINE_BANNER", 1);
        f112691b = ji91Var2;
        ji91 ji91Var3 = new ji91("AUDIO_QUALITY_BANNER", 2);
        f112692c = ji91Var3;
        ji91 ji91Var4 = new ji91("JAM_BANNER", 3);
        f112693d = ji91Var4;
        ji91 ji91Var5 = new ji91("QUEUE_BANNER", 4);
        f112694e = ji91Var5;
        ji91 ji91Var6 = new ji91("SHUFFLE_SNACKBAR", 5);
        f112695f = ji91Var6;
        f112696g = new ji91[]{ji91Var, ji91Var2, ji91Var3, ji91Var4, ji91Var5, ji91Var6};
    }

    public static ji91 valueOf(String str) {
        return (ji91) Enum.valueOf(ji91.class, str);
    }

    public static ji91[] values() {
        return (ji91[]) f112696g.clone();
    }
}
