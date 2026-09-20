package p204p;

import com.spotify.music.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.wqd1[], still in use, count: 1, list:
  (r0v1 p.wqd1[]) from 0x0034: CONSTRUCTOR (r0v1 p.wqd1[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:53) call: p.nzv.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class wqd1 {
    f254020c(R.dimen.control_wheel_element_marker_height, "MAJOR"),
    f254021d(R.dimen.control_wheel_element_marker_height_minor, "MINOR"),
    f254022e(R.dimen.control_wheel_element_marker_height_micro, "MICRO");


    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ nzv f254024g;

    /* JADX INFO: renamed from: a */
    public final int f254025a;

    /* JADX INFO: renamed from: b */
    public final float f254026b;

    static {
        f254024g = new nzv(wqd1VarArr);
    }

    public wqd1(int i, String str) {
        super(str, i);
        this.f254025a = i;
        this.f254026b = f;
    }

    public static wqd1 valueOf(String str) {
        return (wqd1) Enum.valueOf(wqd1.class, str);
    }

    public static wqd1[] values() {
        return (wqd1[]) f254023f.clone();
    }
}
