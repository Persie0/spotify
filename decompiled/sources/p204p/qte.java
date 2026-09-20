package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class qte {

    /* JADX INFO: renamed from: a */
    public static final qte f192367a;

    /* JADX INFO: renamed from: b */
    public static final qte f192368b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ qte[] f192369c;

    static {
        qte qteVar = new qte("RECOMMENDATION", 0);
        f192367a = qteVar;
        qte qteVar2 = new qte("CONTINUATION", 1);
        f192368b = qteVar2;
        f192369c = new qte[]{qteVar, qteVar2};
    }

    public static qte valueOf(String str) {
        return (qte) Enum.valueOf(qte.class, str);
    }

    public static qte[] values() {
        return (qte[]) f192369c.clone();
    }
}
