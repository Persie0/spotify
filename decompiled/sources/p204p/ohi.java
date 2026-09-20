package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class ohi {

    /* JADX INFO: renamed from: a */
    public static final ohi f165462a;

    /* JADX INFO: renamed from: b */
    public static final ohi f165463b;

    /* JADX INFO: renamed from: c */
    public static final ohi f165464c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ ohi[] f165465d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ nzv f165466e;

    static {
        ohi ohiVar = new ohi("VIEW", 0);
        f165462a = ohiVar;
        ohi ohiVar2 = new ohi("NEW", 1);
        f165463b = ohiVar2;
        ohi ohiVar3 = new ohi("EDIT", 2);
        f165464c = ohiVar3;
        ohi[] ohiVarArr = {ohiVar, ohiVar2, ohiVar3};
        f165465d = ohiVarArr;
        f165466e = new nzv(ohiVarArr);
    }

    public static ohi valueOf(String str) {
        return (ohi) Enum.valueOf(ohi.class, str);
    }

    public static ohi[] values() {
        return (ohi[]) f165465d.clone();
    }
}
