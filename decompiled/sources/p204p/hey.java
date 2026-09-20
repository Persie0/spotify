package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class hey {

    /* JADX INFO: renamed from: a */
    public static final hey f90541a;

    /* JADX INFO: renamed from: b */
    public static final hey f90542b;

    /* JADX INFO: renamed from: c */
    public static final hey f90543c;

    /* JADX INFO: renamed from: d */
    public static final hey f90544d;

    /* JADX INFO: renamed from: e */
    public static final hey f90545e;

    /* JADX INFO: renamed from: f */
    public static final hey f90546f;

    /* JADX INFO: renamed from: g */
    public static final hey f90547g;

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ hey[] f90548h;

    static {
        hey heyVar = new hey("PICK_AND_SHUFFLE", 0);
        f90541a = heyVar;
        hey heyVar2 = new hey("AUDIOBOOKS", 1);
        f90542b = heyVar2;
        hey heyVar3 = new hey("LYRICS", 2);
        f90543c = heyVar3;
        hey heyVar4 = new hey("BLUEJAY", 3);
        f90544d = heyVar4;
        hey heyVar5 = new hey("KALLAX", 4);
        f90545e = heyVar5;
        hey heyVar6 = new hey("PROMPT_PLAYLIST", 5);
        f90546f = heyVar6;
        hey heyVar7 = new hey("RUNNING_MODE", 6);
        f90547g = heyVar7;
        f90548h = new hey[]{heyVar, heyVar2, heyVar3, heyVar4, heyVar5, heyVar6, heyVar7};
    }

    public static hey valueOf(String str) {
        return (hey) Enum.valueOf(hey.class, str);
    }

    public static hey[] values() {
        return (hey[]) f90548h.clone();
    }
}
