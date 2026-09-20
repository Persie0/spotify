package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class aew {

    /* JADX INFO: renamed from: a */
    public static final aew f14970a;

    /* JADX INFO: renamed from: b */
    public static final aew f14971b;

    /* JADX INFO: renamed from: c */
    public static final aew f14972c;

    /* JADX INFO: renamed from: d */
    public static final aew f14973d;

    /* JADX INFO: renamed from: e */
    public static final aew f14974e;

    /* JADX INFO: renamed from: f */
    public static final aew f14975f;

    /* JADX INFO: renamed from: g */
    public static final aew f14976g;

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ aew[] f14977h;

    static {
        aew aewVar = new aew("UNKNOWN_ERROR", 0);
        f14970a = aewVar;
        aew aewVar2 = new aew("APP_ERROR", 1);
        f14971b = aewVar2;
        aew aewVar3 = new aew("NOT_SUPPORTED", 2);
        aew aewVar4 = new aew("AUTHENTICATION_EXPIRED", 3);
        f14972c = aewVar4;
        aew aewVar5 = new aew("PREMIUM_ACCOUNT_REQUIRED", 4);
        f14973d = aewVar5;
        aew aewVar6 = new aew("CONCURRENT_STREAM_LIMIT", 5);
        aew aewVar7 = new aew("PARENTAL_CONTROL_RESTRICTED", 6);
        f14974e = aewVar7;
        aew aewVar8 = new aew("NOT_AVAILABLE_IN_REGION", 7);
        f14975f = aewVar8;
        aew aewVar9 = new aew("CONTENT_ALREADY_PLAYING", 8);
        aew aewVar10 = new aew("SKIP_LIMIT_REACHED", 9);
        f14976g = aewVar10;
        f14977h = new aew[]{aewVar, aewVar2, aewVar3, aewVar4, aewVar5, aewVar6, aewVar7, aewVar8, aewVar9, aewVar10, new aew("ACTION_ABORTED", 10), new aew("END_OF_QUEUE", 11)};
    }

    public static aew valueOf(String str) {
        return (aew) Enum.valueOf(aew.class, str);
    }

    public static aew[] values() {
        return (aew[]) f14977h.clone();
    }
}
