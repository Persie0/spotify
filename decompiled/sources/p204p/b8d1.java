package p204p;

import com.spotify.music.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.b8d1[], still in use, count: 1, list:
  (r0v1 p.b8d1[]) from 0x004b: CONSTRUCTOR (r0v1 p.b8d1[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:76) call: p.nzv.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes7.dex */
public final class b8d1 {
    f24569c(R.style.ThemeOverlay_Encore_Base, "base"),
    /* JADX INFO: Fake field, exist only in values array */
    EF25(R.style.ThemeOverlay_Encore_Positive, "positive"),
    /* JADX INFO: Fake field, exist only in values array */
    EF38(R.style.ThemeOverlay_Encore_Negative, "negative"),
    /* JADX INFO: Fake field, exist only in values array */
    EF51(R.style.ThemeOverlay_Encore_Warning, "warning"),
    /* JADX INFO: Fake field, exist only in values array */
    EF64(R.style.ThemeOverlay_Encore_Announcement, "announcement");


    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ nzv f24571e;

    /* JADX INFO: renamed from: a */
    public final String f24572a;

    /* JADX INFO: renamed from: b */
    public final int f24573b;

    static {
        f24571e = new nzv(b8d1VarArr);
    }

    public b8d1(int i, String str) {
        super(str, i);
        this.f24572a = str;
        this.f24573b = i;
    }

    public static b8d1 valueOf(String str) {
        return (b8d1) Enum.valueOf(b8d1.class, str);
    }

    public static b8d1[] values() {
        return (b8d1[]) f24570d.clone();
    }
}
