package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class erc {

    /* JADX INFO: renamed from: a */
    public static final erc f62076a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ erc[] f62077b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ nzv f62078c;

    static {
        erc ercVar = new erc("MARK_AS_FINISHED", 0);
        f62076a = ercVar;
        erc[] ercVarArr = {ercVar, new erc("MARK_AS_NOT_STARTED", 1), new erc("MARK_AS_FINISHED_UP_TO_HERE", 2), new erc("MARK_AS_NOT_STARTED_FROM_HERE", 3)};
        f62077b = ercVarArr;
        f62078c = new nzv(ercVarArr);
    }

    public static erc valueOf(String str) {
        return (erc) Enum.valueOf(erc.class, str);
    }

    public static erc[] values() {
        return (erc[]) f62077b.clone();
    }
}
