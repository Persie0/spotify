package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class esb {

    /* JADX INFO: renamed from: a */
    public static final esb f62323a;

    /* JADX INFO: renamed from: b */
    public static final esb f62324b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ esb[] f62325c;

    static {
        esb esbVar = new esb("DOWNLOADING", 0);
        f62323a = esbVar;
        esb esbVar2 = new esb("DOWNLOADED", 1);
        f62324b = esbVar2;
        f62325c = new esb[]{esbVar, esbVar2};
    }

    public static esb valueOf(String str) {
        return (esb) Enum.valueOf(esb.class, str);
    }

    public static esb[] values() {
        return (esb[]) f62325c.clone();
    }
}
