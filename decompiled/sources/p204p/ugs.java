package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class ugs {

    /* JADX INFO: renamed from: a */
    public static final ugs f230251a;

    /* JADX INFO: renamed from: b */
    public static final ugs f230252b;

    /* JADX INFO: renamed from: c */
    public static final ugs f230253c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ ugs[] f230254d;

    static {
        ugs ugsVar = new ugs("INSTANT", 0);
        f230251a = ugsVar;
        ugs ugsVar2 = new ugs("ANIMATE", 1);
        f230252b = ugsVar2;
        ugs ugsVar3 = new ugs("GONE", 2);
        f230253c = ugsVar3;
        f230254d = new ugs[]{ugsVar, ugsVar2, ugsVar3};
    }

    public static ugs valueOf(String str) {
        return (ugs) Enum.valueOf(ugs.class, str);
    }

    public static ugs[] values() {
        return (ugs[]) f230254d.clone();
    }
}
