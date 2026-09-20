package p204p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.pw3[], still in use, count: 1, list:
  (r0v1 p.pw3[]) from 0x001c: CONSTRUCTOR (r0v1 p.pw3[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:29) call: p.nzv.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes5.dex */
public final class pw3 {
    /* JADX INFO: Fake field, exist only in values array */
    OfflineLibraryUri("spotify:android-auto:offline-library"),
    /* JADX INFO: Fake field, exist only in values array */
    NonPlayableItem("non-playable-item");


    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ nzv f181893c;

    /* JADX INFO: renamed from: a */
    public final String f181894a;

    static {
        f181893c = new nzv(pw3VarArr);
    }

    public pw3(String str) {
        super(str, i);
        this.f181894a = str;
    }

    public static pw3 valueOf(String str) {
        return (pw3) Enum.valueOf(pw3.class, str);
    }

    public static pw3[] values() {
        return (pw3[]) f181892b.clone();
    }
}
