package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class ztl {

    /* JADX INFO: renamed from: a */
    public static final ztl f286215a;

    /* JADX INFO: renamed from: b */
    public static final ztl f286216b;

    /* JADX INFO: renamed from: c */
    public static final ztl f286217c;

    /* JADX INFO: renamed from: d */
    public static final ztl f286218d;

    /* JADX INFO: renamed from: e */
    public static final ztl f286219e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ ztl[] f286220f;

    static {
        ztl ztlVar = new ztl("CRONET_SOURCE_UNSPECIFIED", 0);
        f286215a = ztlVar;
        ztl ztlVar2 = new ztl("CRONET_SOURCE_STATICALLY_LINKED", 1);
        f286216b = ztlVar2;
        ztl ztlVar3 = new ztl("CRONET_SOURCE_PLAY_SERVICES", 2);
        f286217c = ztlVar3;
        ztl ztlVar4 = new ztl("CRONET_SOURCE_FALLBACK", 3);
        f286218d = ztlVar4;
        ztl ztlVar5 = new ztl("CRONET_SOURCE_PLATFORM", 4);
        f286219e = ztlVar5;
        f286220f = new ztl[]{ztlVar, ztlVar2, ztlVar3, ztlVar4, ztlVar5, new ztl("CRONET_SOURCE_FAKE", 5)};
    }

    public static ztl valueOf(String str) {
        return (ztl) Enum.valueOf(ztl.class, str);
    }

    public static ztl[] values() {
        return (ztl[]) f286220f.clone();
    }
}
