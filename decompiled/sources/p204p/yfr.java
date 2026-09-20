package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class yfr {

    /* JADX INFO: renamed from: a */
    public static final yfr f272314a;

    /* JADX INFO: renamed from: b */
    public static final yfr f272315b;

    /* JADX INFO: renamed from: c */
    public static final yfr f272316c;

    /* JADX INFO: renamed from: d */
    public static final yfr f272317d;

    /* JADX INFO: renamed from: e */
    public static final yfr f272318e;

    /* JADX INFO: renamed from: f */
    public static final yfr f272319f;

    /* JADX INFO: renamed from: g */
    public static final yfr f272320g;

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ yfr[] f272321h;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ nzv f272322i;

    static {
        yfr yfrVar = new yfr("UNKNOWN", 0);
        f272314a = yfrVar;
        yfr yfrVar2 = new yfr("COMPUTER", 1);
        yfr yfrVar3 = new yfr("TABLET", 2);
        f272315b = yfrVar3;
        yfr yfrVar4 = new yfr("SMARTPHONE", 3);
        f272316c = yfrVar4;
        yfr yfrVar5 = new yfr("SPEAKER", 4);
        f272317d = yfrVar5;
        yfr yfrVar6 = new yfr("TV", 5);
        yfr yfrVar7 = new yfr("AVR", 6);
        yfr yfrVar8 = new yfr("STB", 7);
        yfr yfrVar9 = new yfr("AUDIO_DONGLE", 8);
        yfr yfrVar10 = new yfr("GAME_CONSOLE", 9);
        yfr yfrVar11 = new yfr("CAST_VIDEO", 10);
        f272318e = yfrVar11;
        yfr yfrVar12 = new yfr("CAST_AUDIO", 11);
        f272319f = yfrVar12;
        yfr yfrVar13 = new yfr("AUTOMOBILE", 12);
        yfr yfrVar14 = new yfr("SMARTWATCH", 13);
        yfr yfrVar15 = new yfr("CHROMEBOOK", 14);
        f272320g = yfrVar15;
        yfr[] yfrVarArr = {yfrVar, yfrVar2, yfrVar3, yfrVar4, yfrVar5, yfrVar6, yfrVar7, yfrVar8, yfrVar9, yfrVar10, yfrVar11, yfrVar12, yfrVar13, yfrVar14, yfrVar15, new yfr("UNKNOWN_SPOTIFY_HW", 15), new yfr("HOMETHING", 16), new yfr("BLUETOOTH_SPEAKER", 17), new yfr("BLUETOOTH_HEADPHONES", 18), new yfr("AIRPLAY_SPEAKER", 19), new yfr("BLUETOOTH_UNKNOWN", 20), new yfr("BLUETOOTH_CAR", 21)};
        f272321h = yfrVarArr;
        f272322i = new nzv(yfrVarArr);
    }

    public static yfr valueOf(String str) {
        return (yfr) Enum.valueOf(yfr.class, str);
    }

    public static yfr[] values() {
        return (yfr[]) f272321h.clone();
    }
}
