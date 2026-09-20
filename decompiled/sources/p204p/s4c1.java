package p204p;

import com.spotify.music.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.s4c1[], still in use, count: 1, list:
  (r0v1 p.s4c1[]) from 0x0050: CONSTRUCTOR (r0v1 p.s4c1[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:81) call: p.nzv.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes8.dex */
public final class s4c1 {
    /* JADX INFO: Fake field, exist only in values array */
    VeryHigh(R.string.very_high_video_quality_name, R.string.very_high_video_quality_resolution_standard_name, 1920, 1080),
    /* JADX INFO: Fake field, exist only in values array */
    High(R.string.high_video_quality_name, R.string.high_video_quality_resolution_standard_name, 1280, 720),
    /* JADX INFO: Fake field, exist only in values array */
    Normal(R.string.normal_video_quality_name, R.string.normal_video_quality_resolution_standard_name, 720, 480),
    Low(R.string.low_video_quality_name, R.string.low_video_quality_resolution_standard_name, 352, 240);


    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ nzv f205566g;

    /* JADX INFO: renamed from: a */
    public final int f205567a;

    /* JADX INFO: renamed from: b */
    public final int f205568b;

    /* JADX INFO: renamed from: c */
    public final int f205569c;

    /* JADX INFO: renamed from: d */
    public final int f205570d;

    static {
        f205566g = new nzv(s4c1VarArr);
    }

    public s4c1(int i, int i2, int i3, int i4) {
        super(str, i);
        this.f205567a = i;
        this.f205568b = i2;
        this.f205569c = i3;
        this.f205570d = i4;
    }

    public static s4c1 valueOf(String str) {
        return (s4c1) Enum.valueOf(s4c1.class, str);
    }

    public static s4c1[] values() {
        return (s4c1[]) f205565f.clone();
    }
}
