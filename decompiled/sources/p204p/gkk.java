package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class gkk {

    /* JADX INFO: renamed from: a */
    public static final gkk f80819a;

    /* JADX INFO: renamed from: b */
    public static final gkk f80820b;

    /* JADX INFO: renamed from: c */
    public static final gkk f80821c;

    /* JADX INFO: renamed from: d */
    public static final gkk f80822d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ gkk[] f80823e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ nzv f80824f;

    static {
        gkk gkkVar = new gkk("COLLABORATOR", 0);
        f80819a = gkkVar;
        gkk gkkVar2 = new gkk("BAND_MEMBER", 1);
        f80820b = gkkVar2;
        gkk gkkVar3 = new gkk("MEMBER_OF", 2);
        f80821c = gkkVar3;
        gkk gkkVar4 = new gkk("ALIAS", 3);
        f80822d = gkkVar4;
        gkk[] gkkVarArr = {gkkVar, gkkVar2, gkkVar3, gkkVar4};
        f80823e = gkkVarArr;
        f80824f = new nzv(gkkVarArr);
    }

    public static gkk valueOf(String str) {
        return (gkk) Enum.valueOf(gkk.class, str);
    }

    public static gkk[] values() {
        return (gkk[]) f80823e.clone();
    }
}
