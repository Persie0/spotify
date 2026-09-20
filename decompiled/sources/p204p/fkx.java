package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class fkx {

    /* JADX INFO: renamed from: a */
    public static final fkx f70629a;

    /* JADX INFO: renamed from: b */
    public static final fkx f70630b;

    /* JADX INFO: renamed from: c */
    public static final fkx f70631c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ fkx[] f70632d;

    static {
        fkx fkxVar = new fkx("EXPANDABLE", 0);
        f70629a = fkxVar;
        fkx fkxVar2 = new fkx("COLLAPSABLE", 1);
        f70630b = fkxVar2;
        fkx fkxVar3 = new fkx("NONE", 2);
        f70631c = fkxVar3;
        f70632d = new fkx[]{fkxVar, fkxVar2, fkxVar3};
    }

    public static fkx valueOf(String str) {
        return (fkx) Enum.valueOf(fkx.class, str);
    }

    public static fkx[] values() {
        return (fkx[]) f70632d.clone();
    }
}
