package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class aeb {

    /* JADX INFO: renamed from: a */
    public static final aeb f14817a;

    /* JADX INFO: renamed from: b */
    public static final aeb f14818b;

    /* JADX INFO: renamed from: c */
    public static final aeb f14819c;

    /* JADX INFO: renamed from: d */
    public static final aeb f14820d;

    /* JADX INFO: renamed from: e */
    public static final aeb f14821e;

    /* JADX INFO: renamed from: f */
    public static final aeb f14822f;

    /* JADX INFO: renamed from: g */
    public static final aeb f14823g;

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ aeb[] f14824h;

    static {
        aeb aebVar = new aeb("UNKNOWN", 0);
        f14817a = aebVar;
        aeb aebVar2 = new aeb("INACTIVE", 1);
        f14818b = aebVar2;
        aeb aebVar3 = new aeb("SCANNING", 2);
        f14819c = aebVar3;
        aeb aebVar4 = new aeb("PASSIVE_FOCUSED", 3);
        f14820d = aebVar4;
        aeb aebVar5 = new aeb("PASSIVE_NOT_FOCUSED", 4);
        f14821e = aebVar5;
        aeb aebVar6 = new aeb("LOCKED_FOCUSED", 5);
        f14822f = aebVar6;
        aeb aebVar7 = new aeb("LOCKED_NOT_FOCUSED", 6);
        f14823g = aebVar7;
        f14824h = new aeb[]{aebVar, aebVar2, aebVar3, aebVar4, aebVar5, aebVar6, aebVar7};
    }

    public static aeb valueOf(String str) {
        return (aeb) Enum.valueOf(aeb.class, str);
    }

    public static aeb[] values() {
        return (aeb[]) f14824h.clone();
    }
}
