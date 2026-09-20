package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class utl {

    /* JADX INFO: renamed from: a */
    public static final utl f233936a;

    /* JADX INFO: renamed from: b */
    public static final utl f233937b;

    /* JADX INFO: renamed from: c */
    public static final utl f233938c;

    /* JADX INFO: renamed from: d */
    public static final utl f233939d;

    /* JADX INFO: renamed from: e */
    public static final utl f233940e;

    /* JADX INFO: renamed from: f */
    public static final utl f233941f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ utl[] f233942g;

    static {
        utl utlVar = new utl("IDLE", 0);
        f233936a = utlVar;
        utl utlVar2 = new utl("ACTIVE", 1);
        f233937b = utlVar2;
        utl utlVar3 = new utl("RECEIVING", 2);
        f233938c = utlVar3;
        utl utlVar4 = new utl("ABORTING", 3);
        f233939d = utlVar4;
        utl utlVar5 = new utl("TIMED_OUT", 4);
        f233940e = utlVar5;
        utl utlVar6 = new utl("DONE", 5);
        f233941f = utlVar6;
        f233942g = new utl[]{utlVar, utlVar2, utlVar3, utlVar4, utlVar5, utlVar6};
    }

    public static utl valueOf(String str) {
        return (utl) Enum.valueOf(utl.class, str);
    }

    public static utl[] values() {
        return (utl[]) f233942g.clone();
    }
}
