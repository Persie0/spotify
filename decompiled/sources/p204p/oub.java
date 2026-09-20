package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class oub {

    /* JADX INFO: renamed from: a */
    public static final oub f170239a;

    /* JADX INFO: renamed from: b */
    public static final oub f170240b;

    /* JADX INFO: renamed from: c */
    public static final oub f170241c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ oub[] f170242d;

    /* JADX INFO: Fake field, exist only in values array */
    oub EF0;

    static {
        oub oubVar = new oub("AUDIOBOOKS", 0);
        oub oubVar2 = new oub("LYRICS", 1);
        oub oubVar3 = new oub("PICK_AND_SHUFFLE", 2);
        oub oubVar4 = new oub("BLUEJAY", 3);
        f170239a = oubVar4;
        oub oubVar5 = new oub("KALLAX", 4);
        oub oubVar6 = new oub("PROMPT_PLAYLIST", 5);
        f170240b = oubVar6;
        oub oubVar7 = new oub("RUNNING_MODE", 6);
        f170241c = oubVar7;
        f170242d = new oub[]{oubVar, oubVar2, oubVar3, oubVar4, oubVar5, oubVar6, oubVar7};
    }

    public static oub valueOf(String str) {
        return (oub) Enum.valueOf(oub.class, str);
    }

    public static oub[] values() {
        return (oub[]) f170242d.clone();
    }
}
