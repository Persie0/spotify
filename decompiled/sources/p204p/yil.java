package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class yil {

    /* JADX INFO: renamed from: a */
    public static final yil f273160a;

    /* JADX INFO: renamed from: b */
    public static final yil f273161b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ yil[] f273162c;

    static {
        yil yilVar = new yil("AI_PERSONA", 0);
        f273160a = yilVar;
        yil yilVar2 = new yil("AI_PERSONA_LIKELY", 1);
        f273161b = yilVar2;
        f273162c = new yil[]{yilVar, yilVar2};
    }

    public static yil valueOf(String str) {
        return (yil) Enum.valueOf(yil.class, str);
    }

    public static yil[] values() {
        return (yil[]) f273162c.clone();
    }
}
