package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class ydu {

    /* JADX INFO: renamed from: X */
    public static final ydu f271828X;

    /* JADX INFO: renamed from: Y */
    public static final ydu f271829Y;

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ ydu[] f271830Z;

    /* JADX INFO: renamed from: a */
    public static final ydu f271831a;

    /* JADX INFO: renamed from: b */
    public static final ydu f271832b;

    /* JADX INFO: renamed from: c */
    public static final ydu f271833c;

    /* JADX INFO: renamed from: d */
    public static final ydu f271834d;

    /* JADX INFO: renamed from: e */
    public static final ydu f271835e;

    /* JADX INFO: renamed from: f */
    public static final ydu f271836f;

    /* JADX INFO: renamed from: g */
    public static final ydu f271837g;

    /* JADX INFO: renamed from: h */
    public static final ydu f271838h;

    /* JADX INFO: renamed from: i */
    public static final ydu f271839i;

    /* JADX INFO: renamed from: t */
    public static final ydu f271840t;

    static {
        ydu yduVar = new ydu("ERROR_CORRECTION", 0);
        f271831a = yduVar;
        ydu yduVar2 = new ydu("CHARACTER_SET", 1);
        f271832b = yduVar2;
        ydu yduVar3 = new ydu("DATA_MATRIX_SHAPE", 2);
        f271833c = yduVar3;
        ydu yduVar4 = new ydu("MIN_SIZE", 3);
        f271834d = yduVar4;
        ydu yduVar5 = new ydu("MAX_SIZE", 4);
        f271835e = yduVar5;
        ydu yduVar6 = new ydu("MARGIN", 5);
        f271836f = yduVar6;
        ydu yduVar7 = new ydu("PDF417_COMPACT", 6);
        f271837g = yduVar7;
        ydu yduVar8 = new ydu("PDF417_COMPACTION", 7);
        f271838h = yduVar8;
        ydu yduVar9 = new ydu("PDF417_DIMENSIONS", 8);
        f271839i = yduVar9;
        ydu yduVar10 = new ydu("AZTEC_LAYERS", 9);
        f271840t = yduVar10;
        ydu yduVar11 = new ydu("QR_VERSION", 10);
        f271828X = yduVar11;
        ydu yduVar12 = new ydu("GS1_FORMAT", 11);
        f271829Y = yduVar12;
        f271830Z = new ydu[]{yduVar, yduVar2, yduVar3, yduVar4, yduVar5, yduVar6, yduVar7, yduVar8, yduVar9, yduVar10, yduVar11, yduVar12};
    }

    public static ydu valueOf(String str) {
        return (ydu) Enum.valueOf(ydu.class, str);
    }

    public static ydu[] values() {
        return (ydu[]) f271830Z.clone();
    }
}
