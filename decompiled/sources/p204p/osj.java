package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class osj {

    /* JADX INFO: renamed from: a */
    public static final osj f168825a;

    /* JADX INFO: renamed from: b */
    public static final osj f168826b;

    /* JADX INFO: renamed from: c */
    public static final osj f168827c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ osj[] f168828d;

    static {
        osj osjVar = new osj("Over19Only", 0);
        f168825a = osjVar;
        osj osjVar2 = new osj("Explicit", 1);
        f168826b = osjVar2;
        osj osjVar3 = new osj("None", 2);
        f168827c = osjVar3;
        f168828d = new osj[]{osjVar, osjVar2, osjVar3};
    }

    public static osj valueOf(String str) {
        return (osj) Enum.valueOf(osj.class, str);
    }

    public static osj[] values() {
        return (osj[]) f168828d.clone();
    }
}
