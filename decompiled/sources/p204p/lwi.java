package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class lwi {

    /* JADX INFO: renamed from: a */
    public static final lwi f137576a;

    /* JADX INFO: renamed from: b */
    public static final lwi f137577b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ lwi[] f137578c;

    static {
        lwi lwiVar = new lwi("IN_APP", 0);
        f137576a = lwiVar;
        lwi lwiVar2 = new lwi("GOOGLE_OUTPUT_SWITCHER", 1);
        f137577b = lwiVar2;
        f137578c = new lwi[]{lwiVar, lwiVar2};
    }

    public static lwi valueOf(String str) {
        return (lwi) Enum.valueOf(lwi.class, str);
    }

    public static lwi[] values() {
        return (lwi[]) f137578c.clone();
    }
}
