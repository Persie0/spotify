package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class c9m {

    /* JADX INFO: renamed from: L0 */
    public static final c9m f35588L0;

    /* JADX INFO: renamed from: M0 */
    public static final /* synthetic */ c9m[] f35589M0;

    /* JADX INFO: renamed from: X */
    public static final c9m f35590X;

    /* JADX INFO: renamed from: Y */
    public static final c9m f35591Y;

    /* JADX INFO: renamed from: Z */
    public static final c9m f35592Z;

    /* JADX INFO: renamed from: a */
    public static final c9m f35593a;

    /* JADX INFO: renamed from: b */
    public static final c9m f35594b;

    /* JADX INFO: renamed from: c */
    public static final c9m f35595c;

    /* JADX INFO: renamed from: d */
    public static final c9m f35596d;

    /* JADX INFO: renamed from: e */
    public static final c9m f35597e;

    /* JADX INFO: renamed from: f */
    public static final c9m f35598f;

    /* JADX INFO: renamed from: g */
    public static final c9m f35599g;

    /* JADX INFO: renamed from: h */
    public static final c9m f35600h;

    /* JADX INFO: renamed from: i */
    public static final c9m f35601i;

    /* JADX INFO: renamed from: t */
    public static final c9m f35602t;

    static {
        c9m c9mVar = new c9m("IN_VOLUME", 0);
        f35593a = c9mVar;
        c9m c9mVar2 = new c9m("OUT_VOLUME", 1);
        f35594b = c9mVar2;
        c9m c9mVar3 = new c9m("IN_LOW_EQ", 2);
        f35595c = c9mVar3;
        c9m c9mVar4 = new c9m("OUT_LOW_EQ", 3);
        f35596d = c9mVar4;
        c9m c9mVar5 = new c9m("IN_FILTER_CUTOFF", 4);
        f35597e = c9mVar5;
        c9m c9mVar6 = new c9m("OUT_FILTER_CUTOFF", 5);
        f35598f = c9mVar6;
        c9m c9mVar7 = new c9m("IN_ECHO_DRY_WET", 6);
        f35599g = c9mVar7;
        c9m c9mVar8 = new c9m("OUT_ECHO_DRY_WET", 7);
        f35600h = c9mVar8;
        c9m c9mVar9 = new c9m("IN_REVERB_DRY_WET", 8);
        f35601i = c9mVar9;
        c9m c9mVar10 = new c9m("OUT_REVERB_DRY_WET", 9);
        f35602t = c9mVar10;
        c9m c9mVar11 = new c9m("IN_DELAY_DRY_WET", 10);
        f35590X = c9mVar11;
        c9m c9mVar12 = new c9m("OUT_DELAY_DRY_WET", 11);
        f35591Y = c9mVar12;
        c9m c9mVar13 = new c9m("IN_NOISE_COLOR", 12);
        f35592Z = c9mVar13;
        c9m c9mVar14 = new c9m("OUT_NOISE_COLOR", 13);
        f35588L0 = c9mVar14;
        f35589M0 = new c9m[]{c9mVar, c9mVar2, c9mVar3, c9mVar4, c9mVar5, c9mVar6, c9mVar7, c9mVar8, c9mVar9, c9mVar10, c9mVar11, c9mVar12, c9mVar13, c9mVar14};
    }

    public static c9m valueOf(String str) {
        return (c9m) Enum.valueOf(c9m.class, str);
    }

    public static c9m[] values() {
        return (c9m[]) f35589M0.clone();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m31961a() {
        return this == f35595c || this == f35596d || this == f35597e || this == f35598f || this == f35592Z || this == f35588L0;
    }
}
