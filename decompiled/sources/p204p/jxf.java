package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class jxf {

    /* JADX INFO: renamed from: a */
    public static final jxf f117122a;

    /* JADX INFO: renamed from: b */
    public static final jxf f117123b;

    /* JADX INFO: renamed from: c */
    public static final jxf f117124c;

    /* JADX INFO: renamed from: d */
    public static final jxf f117125d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ jxf[] f117126e;

    static {
        jxf jxfVar = new jxf("DETACHED", 0);
        f117122a = jxfVar;
        jxf jxfVar2 = new jxf("ATTACHED", 1);
        f117123b = jxfVar2;
        jxf jxfVar3 = new jxf("PREWARMED", 2);
        f117124c = jxfVar3;
        jxf jxfVar4 = new jxf("ACTIVE", 3);
        f117125d = jxfVar4;
        f117126e = new jxf[]{jxfVar, jxfVar2, jxfVar3, jxfVar4};
    }

    public static jxf valueOf(String str) {
        return (jxf) Enum.valueOf(jxf.class, str);
    }

    public static jxf[] values() {
        return (jxf[]) f117126e.clone();
    }
}
