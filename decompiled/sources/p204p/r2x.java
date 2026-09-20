package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class r2x {

    /* JADX INFO: renamed from: a */
    public static final r2x f195243a;

    /* JADX INFO: renamed from: b */
    public static final r2x f195244b;

    /* JADX INFO: renamed from: c */
    public static final r2x f195245c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ r2x[] f195246d;

    static {
        r2x r2xVar = new r2x("RowClicked", 0);
        f195243a = r2xVar;
        r2x r2xVar2 = new r2x("RowLongClicked", 1);
        f195244b = r2xVar2;
        r2x r2xVar3 = new r2x("AddToQueueSwiped", 2);
        f195245c = r2xVar3;
        f195246d = new r2x[]{r2xVar, r2xVar2, r2xVar3};
    }

    public static r2x valueOf(String str) {
        return (r2x) Enum.valueOf(r2x.class, str);
    }

    public static r2x[] values() {
        return (r2x[]) f195246d.clone();
    }
}
