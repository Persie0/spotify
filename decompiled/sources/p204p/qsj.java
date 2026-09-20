package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class qsj {

    /* JADX INFO: renamed from: a */
    public static final qsj f192127a;

    /* JADX INFO: renamed from: b */
    public static final qsj f192128b;

    /* JADX INFO: renamed from: c */
    public static final qsj f192129c;

    /* JADX INFO: renamed from: d */
    public static final qsj f192130d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ qsj[] f192131e;

    static {
        qsj qsjVar = new qsj("Over19Only", 0);
        f192127a = qsjVar;
        qsj qsjVar2 = new qsj("Explicit", 1);
        f192128b = qsjVar2;
        qsj qsjVar3 = new qsj("ExplicitLong", 2);
        f192129c = qsjVar3;
        qsj qsjVar4 = new qsj("None", 3);
        f192130d = qsjVar4;
        f192131e = new qsj[]{qsjVar, qsjVar2, qsjVar3, qsjVar4};
    }

    public static qsj valueOf(String str) {
        return (qsj) Enum.valueOf(qsj.class, str);
    }

    public static qsj[] values() {
        return (qsj[]) f192131e.clone();
    }
}
