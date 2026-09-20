package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class kwk {

    /* JADX INFO: renamed from: a */
    public static final kwk f127102a;

    /* JADX INFO: renamed from: b */
    public static final kwk f127103b;

    /* JADX INFO: renamed from: c */
    public static final kwk f127104c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ kwk[] f127105d;

    static {
        kwk kwkVar = new kwk("SUBDUED", 0);
        f127102a = kwkVar;
        kwk kwkVar2 = new kwk("WARNING", 1);
        f127103b = kwkVar2;
        kwk kwkVar3 = new kwk("NEGATIVE", 2);
        f127104c = kwkVar3;
        f127105d = new kwk[]{kwkVar, kwkVar2, kwkVar3};
    }

    public static kwk valueOf(String str) {
        return (kwk) Enum.valueOf(kwk.class, str);
    }

    public static kwk[] values() {
        return (kwk[]) f127105d.clone();
    }
}
