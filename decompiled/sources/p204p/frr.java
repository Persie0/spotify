package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class frr {

    /* JADX INFO: renamed from: a */
    public static final frr f72652a;

    /* JADX INFO: renamed from: b */
    public static final frr f72653b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ frr[] f72654c;

    static {
        frr frrVar = new frr("DISMISS", 0);
        f72652a = frrVar;
        frr frrVar2 = new frr("UNDO", 1);
        f72653b = frrVar2;
        f72654c = new frr[]{frrVar, frrVar2};
    }

    public static frr valueOf(String str) {
        return (frr) Enum.valueOf(frr.class, str);
    }

    public static frr[] values() {
        return (frr[]) f72654c.clone();
    }
}
