package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class hlr {

    /* JADX INFO: renamed from: a */
    public static final hlr f92728a;

    /* JADX INFO: renamed from: b */
    public static final hlr f92729b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ hlr[] f92730c;

    static {
        hlr hlrVar = new hlr("POSITIVE_BUTTON_CLICKED", 0);
        f92728a = hlrVar;
        hlr hlrVar2 = new hlr("NEGATIVE_BUTTON_CLICKED", 1);
        f92729b = hlrVar2;
        f92730c = new hlr[]{hlrVar, hlrVar2};
    }

    public static hlr valueOf(String str) {
        return (hlr) Enum.valueOf(hlr.class, str);
    }

    public static hlr[] values() {
        return (hlr[]) f92730c.clone();
    }
}
