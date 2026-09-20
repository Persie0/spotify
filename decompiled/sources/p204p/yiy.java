package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class yiy {

    /* JADX INFO: renamed from: a */
    public static final yiy f273220a;

    /* JADX INFO: renamed from: b */
    public static final yiy f273221b;

    /* JADX INFO: renamed from: c */
    public static final yiy f273222c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ yiy[] f273223d;

    static {
        yiy yiyVar = new yiy("DM", 0);
        f273220a = yiyVar;
        yiy yiyVar2 = new yiy("Group", 1);
        f273221b = yiyVar2;
        yiy yiyVar3 = new yiy("Following", 2);
        f273222c = yiyVar3;
        f273223d = new yiy[]{yiyVar, yiyVar2, yiyVar3};
    }

    public static yiy valueOf(String str) {
        return (yiy) Enum.valueOf(yiy.class, str);
    }

    public static yiy[] values() {
        return (yiy[]) f273223d.clone();
    }
}
