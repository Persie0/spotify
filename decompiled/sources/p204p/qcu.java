package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class qcu {

    /* JADX INFO: renamed from: a */
    public static final qcu f187405a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ qcu[] f187406b;

    static {
        qcu qcuVar = new qcu("ADD_EPISODES_CLICKED", 0);
        f187405a = qcuVar;
        f187406b = new qcu[]{qcuVar};
    }

    public static qcu valueOf(String str) {
        return (qcu) Enum.valueOf(qcu.class, str);
    }

    public static qcu[] values() {
        return (qcu[]) f187406b.clone();
    }
}
