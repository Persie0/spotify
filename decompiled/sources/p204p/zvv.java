package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class zvv {

    /* JADX INFO: renamed from: a */
    public static final zvv f286807a;

    /* JADX INFO: renamed from: b */
    public static final zvv f286808b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ zvv[] f286809c;

    /* JADX INFO: Fake field, exist only in values array */
    zvv EF0;

    static {
        zvv zvvVar = new zvv("NONE", 0);
        zvv zvvVar2 = new zvv("DEFAULT", 1);
        f286807a = zvvVar2;
        zvv zvvVar3 = new zvv("THEMED", 2);
        f286808b = zvvVar3;
        f286809c = new zvv[]{zvvVar, zvvVar2, zvvVar3};
    }

    public static zvv valueOf(String str) {
        return (zvv) Enum.valueOf(zvv.class, str);
    }

    public static zvv[] values() {
        return (zvv[]) f286809c.clone();
    }
}
