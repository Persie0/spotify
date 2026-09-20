package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class odt {

    /* JADX INFO: renamed from: a */
    public static final odt f164245a;

    /* JADX INFO: renamed from: b */
    public static final odt f164246b;

    /* JADX INFO: renamed from: c */
    public static final odt f164247c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ odt[] f164248d;

    static {
        odt odtVar = new odt("INTRO", 0);
        f164245a = odtVar;
        odt odtVar2 = new odt("VOICE", 1);
        f164246b = odtVar2;
        odt odtVar3 = new odt("SEE", 2);
        f164247c = odtVar3;
        f164248d = new odt[]{odtVar, odtVar2, odtVar3};
    }

    public static odt valueOf(String str) {
        return (odt) Enum.valueOf(odt.class, str);
    }

    public static odt[] values() {
        return (odt[]) f164248d.clone();
    }
}
