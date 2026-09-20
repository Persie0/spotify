package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class k2v {

    /* JADX INFO: renamed from: a */
    public static final k2v f118690a;

    /* JADX INFO: renamed from: b */
    public static final k2v f118691b;

    /* JADX INFO: renamed from: c */
    public static final k2v f118692c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ k2v[] f118693d;

    static {
        k2v k2vVar = new k2v("AVAILABLE", 0);
        f118690a = k2vVar;
        k2v k2vVar2 = new k2v("NOT_AVAILABLE", 1);
        f118691b = k2vVar2;
        k2v k2vVar3 = new k2v("UNKNOWN", 2);
        f118692c = k2vVar3;
        f118693d = new k2v[]{k2vVar, k2vVar2, k2vVar3};
    }

    public static k2v valueOf(String str) {
        return (k2v) Enum.valueOf(k2v.class, str);
    }

    public static k2v[] values() {
        return (k2v[]) f118693d.clone();
    }
}
