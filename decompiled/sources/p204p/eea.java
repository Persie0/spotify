package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class eea {

    /* JADX INFO: renamed from: a */
    public static final eea f58722a;

    /* JADX INFO: renamed from: b */
    public static final eea f58723b;

    /* JADX INFO: renamed from: c */
    public static final eea f58724c;

    /* JADX INFO: renamed from: d */
    public static final eea f58725d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ eea[] f58726e;

    static {
        eea eeaVar = new eea("HIDDEN", 0);
        f58722a = eeaVar;
        eea eeaVar2 = new eea("SHOW_PICKER", 1);
        f58723b = eeaVar2;
        eea eeaVar3 = new eea("CREATE_SHOW", 2);
        f58724c = eeaVar3;
        eea eeaVar4 = new eea("CONNECTOR_APPS", 3);
        f58725d = eeaVar4;
        f58726e = new eea[]{eeaVar, eeaVar2, eeaVar3, eeaVar4};
    }

    public static eea valueOf(String str) {
        return (eea) Enum.valueOf(eea.class, str);
    }

    public static eea[] values() {
        return (eea[]) f58726e.clone();
    }
}
