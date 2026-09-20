package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class zab {

    /* JADX INFO: renamed from: a */
    public static final zab f281016a;

    /* JADX INFO: renamed from: b */
    public static final zab f281017b;

    /* JADX INFO: renamed from: c */
    public static final zab f281018c;

    /* JADX INFO: renamed from: d */
    public static final zab f281019d;

    /* JADX INFO: renamed from: e */
    public static final zab f281020e;

    /* JADX INFO: renamed from: f */
    public static final zab f281021f;

    /* JADX INFO: renamed from: g */
    public static final zab f281022g;

    /* JADX INFO: renamed from: h */
    public static final zab f281023h;

    /* JADX INFO: renamed from: i */
    public static final zab f281024i;

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ zab[] f281025t;

    static {
        zab zabVar = new zab("DEFAULT", 0);
        f281016a = zabVar;
        zab zabVar2 = new zab("CAR", 1);
        f281017b = zabVar2;
        zab zabVar3 = new zab("VOICE_ASSISTANT", 2);
        f281018c = zabVar3;
        zab zabVar4 = new zab("AVRCP", 3);
        f281019d = zabVar4;
        zab zabVar5 = new zab("PME", 4);
        f281020e = zabVar5;
        zab zabVar6 = new zab("AI_PARTNER", 5);
        f281021f = zabVar6;
        zab zabVar7 = new zab("ALARM", 6);
        f281022g = zabVar7;
        zab zabVar8 = new zab("SAMSUNG_CLOCK", 7);
        f281023h = zabVar8;
        zab zabVar9 = new zab("SNAP_SPECS", 8);
        f281024i = zabVar9;
        f281025t = new zab[]{zabVar, zabVar2, zabVar3, zabVar4, zabVar5, zabVar6, zabVar7, zabVar8, zabVar9};
    }

    public static zab valueOf(String str) {
        return (zab) Enum.valueOf(zab.class, str);
    }

    public static zab[] values() {
        return (zab[]) f281025t.clone();
    }
}
