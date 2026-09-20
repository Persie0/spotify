package p204p;

import java.util.Collections;
import java.util.Set;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'e' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes11.dex */
public final class zxv {

    /* JADX INFO: renamed from: L0 */
    public static final zxv f287398L0;

    /* JADX INFO: renamed from: M0 */
    public static final zxv f287399M0;

    /* JADX INFO: renamed from: N0 */
    public static final zxv f287400N0;

    /* JADX INFO: renamed from: O0 */
    public static final zxv f287401O0;

    /* JADX INFO: renamed from: P0 */
    public static final zxv f287402P0;

    /* JADX INFO: renamed from: Q0 */
    public static final /* synthetic */ zxv[] f287403Q0;

    /* JADX INFO: renamed from: X */
    public static final zxv f287404X;

    /* JADX INFO: renamed from: Y */
    public static final zxv f287405Y;

    /* JADX INFO: renamed from: Z */
    public static final zxv f287406Z;

    /* JADX INFO: renamed from: c */
    public static final ti5 f287407c;

    /* JADX INFO: renamed from: d */
    public static final zxv[] f287408d;

    /* JADX INFO: renamed from: e */
    public static final zxv f287409e;

    /* JADX INFO: renamed from: f */
    public static final zxv f287410f;

    /* JADX INFO: renamed from: g */
    public static final zxv f287411g;

    /* JADX INFO: renamed from: h */
    public static final zxv f287412h;

    /* JADX INFO: renamed from: i */
    public static final zxv f287413i;

    /* JADX INFO: renamed from: t */
    public static final zxv f287414t;

    /* JADX INFO: renamed from: a */
    public final hxv f287415a;

    /* JADX INFO: renamed from: b */
    public final Set f287416b;

    static {
        hxv hxvVar = hxv.CARD;
        zxv zxvVar = new zxv("CARD_CIRCULAR_PLACEHOLDER", 0, hxvVar);
        f287409e = zxvVar;
        zxv zxvVar2 = new zxv("CARD_ENTITY", 1, hxvVar);
        f287410f = zxvVar2;
        hxv hxvVar2 = hxv.BIG_CARD;
        zxv zxvVar3 = new zxv("CARD_HINT", 2, hxvVar2);
        f287411g = zxvVar3;
        zxv zxvVar4 = new zxv("CARD_MESSAGE_HINT", 3, hxvVar2);
        f287412h = zxvVar4;
        zxv zxvVar5 = new zxv("CARD_ONBOARDING", 4, hxvVar);
        f287413i = zxvVar5;
        zxv zxvVar6 = new zxv("CARD_PLACEHOLDER", 5, hxvVar);
        f287414t = zxvVar6;
        hxv hxvVar3 = hxv.ROW;
        zxv zxvVar7 = new zxv("ROW_CIRCULAR_PLACEHOLDER", 6, hxvVar3);
        f287404X = zxvVar7;
        hxv hxvVar4 = hxv.BANNER;
        zxv zxvVar8 = new zxv("ROW_DSA_BANNER", 7, hxvVar4);
        f287405Y = zxvVar8;
        zxv zxvVar9 = new zxv("ROW_ENTITY", 8, hxvVar3);
        f287406Z = zxvVar9;
        zxv zxvVar10 = new zxv("ROW_LIBRARY_IMPORT_MATCH_RESULT_BANNER", 9, hxvVar4);
        f287398L0 = zxvVar10;
        zxv zxvVar11 = new zxv("ROW_ONBOARDING", 10, hxvVar3);
        f287399M0 = zxvVar11;
        zxv zxvVar12 = new zxv("ROW_PLACEHOLDER", 11, hxvVar3);
        f287400N0 = zxvVar12;
        zxv zxvVar13 = new zxv("ROW_SECTION_HEADER", 12, hxv.HEADING);
        f287401O0 = zxvVar13;
        zxv zxvVar14 = new zxv("ROW_SORT_OPTIONS", 13, hxv.SORT_OPTION);
        f287402P0 = zxvVar14;
        zxv[] zxvVarArr = {zxvVar, zxvVar2, zxvVar3, zxvVar4, zxvVar5, zxvVar6, zxvVar7, zxvVar8, zxvVar9, zxvVar10, zxvVar11, zxvVar12, zxvVar13, zxvVar14};
        f287403Q0 = zxvVarArr;
        nzv nzvVar = new nzv(zxvVarArr);
        f287407c = new ti5(10);
        f287408d = (zxv[]) wj50.m88264f0(nzvVar, new zxv[0]);
    }

    public zxv(String str, int i, hxv hxvVar) {
        super(str, i);
        this.f287415a = hxvVar;
        this.f287416b = Collections.singleton(hxvVar);
    }

    public static zxv valueOf(String str) {
        return (zxv) Enum.valueOf(zxv.class, str);
    }

    public static zxv[] values() {
        return (zxv[]) f287403Q0.clone();
    }

    /* JADX INFO: renamed from: a */
    public final Set m97216a() {
        return this.f287416b;
    }
}
