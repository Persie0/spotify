package p204p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.rru0[], still in use, count: 1, list:
  (r0v1 p.rru0[]) from 0x008f: CONSTRUCTOR (r0v1 p.rru0[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:144) call: p.nzv.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes6.dex */
public final class rru0 {
    /* JADX INFO: Fake field, exist only in values array */
    EF0(rfg1.m75434d(4279374354L), "Paper", true),
    /* JADX INFO: Fake field, exist only in values array */
    EF10(rfg1.m75434d(4284171830L), "Sepia", true),
    /* JADX INFO: Fake field, exist only in values array */
    EF11(rfg1.m75434d(4292134313L), "Ember", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF12(rfg1.m75434d(4291875024L), "Night", false),
    f202114f(rfg1.m75434d(4294967295L), "Spotify", false);


    /* JADX INFO: renamed from: d */
    public static final i97 f202112d = new i97(22);

    /* JADX INFO: renamed from: e */
    public static final rru0 f202113e = new rru0(rfg1.m75434d(4291875024L), "Night", false);

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ nzv f202116h;

    /* JADX INFO: renamed from: a */
    public final long f202117a;

    /* JADX INFO: renamed from: b */
    public final long f202118b;

    /* JADX INFO: renamed from: c */
    public final boolean f202119c;

    static {
        f202116h = new nzv(new rru0[]{r0, r10, r11, r12, r1});
    }

    public rru0(long j, String str, boolean z) {
        super(str, i);
        this.f202117a = j;
        this.f202118b = j;
        this.f202119c = z;
    }

    public static rru0 valueOf(String str) {
        return (rru0) Enum.valueOf(rru0.class, str);
    }

    public static rru0[] values() {
        return (rru0[]) f202115g.clone();
    }

    /* JADX INFO: renamed from: a */
    public final long m76305a() {
        return this.f202118b;
    }
}
