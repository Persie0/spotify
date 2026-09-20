package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class irr {

    /* JADX INFO: renamed from: a */
    public static final irr f105044a;

    /* JADX INFO: renamed from: b */
    public static final irr f105045b;

    /* JADX INFO: renamed from: c */
    public static final irr f105046c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ irr[] f105047d;

    static {
        irr irrVar = new irr("DISMISSIBLE", 0);
        f105044a = irrVar;
        irr irrVar2 = new irr("MINIMIZABLE", 1);
        f105045b = irrVar2;
        irr irrVar3 = new irr("NONE", 2);
        f105046c = irrVar3;
        f105047d = new irr[]{irrVar, irrVar2, irrVar3};
    }

    public static irr valueOf(String str) {
        return (irr) Enum.valueOf(irr.class, str);
    }

    public static irr[] values() {
        return (irr[]) f105047d.clone();
    }
}
