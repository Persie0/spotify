package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class pv8 implements im20 {

    /* JADX INFO: renamed from: a */
    public static final pv8 f181637a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ pv8[] f181638b;

    static {
        pv8 pv8Var = new pv8("ArtistHeadline", 0);
        f181637a = pv8Var;
        f181638b = new pv8[]{pv8Var};
    }

    public static pv8 valueOf(String str) {
        return (pv8) Enum.valueOf(pv8.class, str);
    }

    public static pv8[] values() {
        return (pv8[]) f181638b.clone();
    }
}
