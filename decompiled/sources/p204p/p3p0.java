package p204p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v33 p.p3p0[], still in use, count: 1, list:
  (r0v33 p.p3p0[]) from 0x01bf: CONSTRUCTOR (r0v33 p.p3p0[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:448) call: p.nzv.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes9.dex */
public final class p3p0 {
    /* JADX INFO: Fake field, exist only in values array */
    PLAYBACK_SPEED_50(50),
    /* JADX INFO: Fake field, exist only in values array */
    PLAYBACK_SPEED_60(60),
    /* JADX INFO: Fake field, exist only in values array */
    PLAYBACK_SPEED_70(70),
    /* JADX INFO: Fake field, exist only in values array */
    PLAYBACK_SPEED_80(80),
    /* JADX INFO: Fake field, exist only in values array */
    PLAYBACK_SPEED_90(90),
    PLAYBACK_SPEED_100(100),
    /* JADX INFO: Fake field, exist only in values array */
    PLAYBACK_SPEED_110(110),
    /* JADX INFO: Fake field, exist only in values array */
    PLAYBACK_SPEED_120(120),
    /* JADX INFO: Fake field, exist only in values array */
    PLAYBACK_SPEED_125(125),
    /* JADX INFO: Fake field, exist only in values array */
    PLAYBACK_SPEED_130(130),
    /* JADX INFO: Fake field, exist only in values array */
    PLAYBACK_SPEED_140(140),
    /* JADX INFO: Fake field, exist only in values array */
    PLAYBACK_SPEED_150(150),
    /* JADX INFO: Fake field, exist only in values array */
    PLAYBACK_SPEED_160(160),
    /* JADX INFO: Fake field, exist only in values array */
    PLAYBACK_SPEED_170(170),
    /* JADX INFO: Fake field, exist only in values array */
    PLAYBACK_SPEED_175(175),
    /* JADX INFO: Fake field, exist only in values array */
    PLAYBACK_SPEED_180(180),
    /* JADX INFO: Fake field, exist only in values array */
    PLAYBACK_SPEED_190(190),
    /* JADX INFO: Fake field, exist only in values array */
    PLAYBACK_SPEED_200(200),
    /* JADX INFO: Fake field, exist only in values array */
    PLAYBACK_SPEED_210(210),
    /* JADX INFO: Fake field, exist only in values array */
    PLAYBACK_SPEED_220(220),
    /* JADX INFO: Fake field, exist only in values array */
    PLAYBACK_SPEED_230(230),
    /* JADX INFO: Fake field, exist only in values array */
    PLAYBACK_SPEED_240(240),
    /* JADX INFO: Fake field, exist only in values array */
    PLAYBACK_SPEED_250(250),
    /* JADX INFO: Fake field, exist only in values array */
    PLAYBACK_SPEED_260(260),
    /* JADX INFO: Fake field, exist only in values array */
    PLAYBACK_SPEED_270(270),
    /* JADX INFO: Fake field, exist only in values array */
    PLAYBACK_SPEED_280(280),
    /* JADX INFO: Fake field, exist only in values array */
    PLAYBACK_SPEED_290(290),
    /* JADX INFO: Fake field, exist only in values array */
    PLAYBACK_SPEED_300(300),
    /* JADX INFO: Fake field, exist only in values array */
    PLAYBACK_SPEED_310(310),
    /* JADX INFO: Fake field, exist only in values array */
    PLAYBACK_SPEED_320(320),
    /* JADX INFO: Fake field, exist only in values array */
    PLAYBACK_SPEED_330(330),
    /* JADX INFO: Fake field, exist only in values array */
    PLAYBACK_SPEED_340(340),
    /* JADX INFO: Fake field, exist only in values array */
    PLAYBACK_SPEED_350(350);


    /* JADX INFO: renamed from: b */
    public static final p3p0 f173681b;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ nzv f173684e;

    /* JADX INFO: renamed from: a */
    public final int f173685a;

    static {
        p3p0 p3p0Var = PLAYBACK_SPEED_100;
        f173684e = new nzv(p3p0VarArr);
        f173681b = p3p0Var;
    }

    public p3p0(int i) {
        super(str, i);
        this.f173685a = i;
    }

    public static p3p0 valueOf(String str) {
        return (p3p0) Enum.valueOf(p3p0.class, str);
    }

    public static p3p0[] values() {
        return (p3p0[]) f173683d.clone();
    }

    /* JADX INFO: renamed from: a */
    public final int m69080a() {
        return this.f173685a;
    }
}
