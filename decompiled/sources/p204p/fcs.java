package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class fcs {

    /* JADX INFO: renamed from: a */
    public static final fcs f68249a;

    /* JADX INFO: renamed from: b */
    public static final fcs f68250b;

    /* JADX INFO: renamed from: c */
    public static final fcs f68251c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ fcs[] f68252d;

    static {
        fcs fcsVar = new fcs("Start", 0);
        f68249a = fcsVar;
        fcs fcsVar2 = new fcs("Center", 1);
        f68250b = fcsVar2;
        fcs fcsVar3 = new fcs("End", 2);
        f68251c = fcsVar3;
        f68252d = new fcs[]{fcsVar, fcsVar2, fcsVar3};
    }

    public static fcs valueOf(String str) {
        return (fcs) Enum.valueOf(fcs.class, str);
    }

    public static fcs[] values() {
        return (fcs[]) f68252d.clone();
    }
}
