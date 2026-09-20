package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class cnc {

    /* JADX INFO: renamed from: a */
    public static final cnc f39941a;

    /* JADX INFO: renamed from: b */
    public static final cnc f39942b;

    /* JADX INFO: renamed from: c */
    public static final cnc f39943c;

    /* JADX INFO: renamed from: d */
    public static final cnc f39944d;

    /* JADX INFO: renamed from: e */
    public static final cnc f39945e;

    /* JADX INFO: renamed from: f */
    public static final cnc f39946f;

    /* JADX INFO: renamed from: g */
    public static final cnc f39947g;

    /* JADX INFO: renamed from: h */
    public static final cnc f39948h;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ cnc[] f39949i;

    static {
        cnc cncVar = new cnc("initialized", 0);
        f39941a = cncVar;
        cnc cncVar2 = new cnc("attaching", 1);
        f39942b = cncVar2;
        cnc cncVar3 = new cnc("attached", 2);
        f39943c = cncVar3;
        cnc cncVar4 = new cnc("detaching", 3);
        f39944d = cncVar4;
        cnc cncVar5 = new cnc("detached", 4);
        f39945e = cncVar5;
        cnc cncVar6 = new cnc("failed", 5);
        f39946f = cncVar6;
        cnc cncVar7 = new cnc("suspended", 6);
        f39947g = cncVar7;
        cnc cncVar8 = new cnc("update", 7);
        f39948h = cncVar8;
        f39949i = new cnc[]{cncVar, cncVar2, cncVar3, cncVar4, cncVar5, cncVar6, cncVar7, cncVar8};
    }

    public static cnc valueOf(String str) {
        return (cnc) Enum.valueOf(cnc.class, str);
    }

    public static cnc[] values() {
        return (cnc[]) f39949i.clone();
    }
}
