package p204p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.b1x0[], still in use, count: 1, list:
  (r0v1 p.b1x0[]) from 0x0020: CONSTRUCTOR (r0v1 p.b1x0[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:33) call: p.nzv.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class b1x0 {
    MBS("com.spotify.mediabrowserservice.mediabrowserservice.SpotifyMediaBrowserService"),
    MEDIA_PROVIDER("com.spotify.externalintegration.service.provider.MediaProvider");


    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ nzv f22435e;

    /* JADX INFO: renamed from: a */
    public final String f22436a;

    static {
        f22435e = new nzv(b1x0VarArr);
    }

    public b1x0(String str) {
        super(str, i);
        this.f22436a = str;
    }

    public static b1x0 valueOf(String str) {
        return (b1x0) Enum.valueOf(b1x0.class, str);
    }

    public static b1x0[] values() {
        return (b1x0[]) f22434d.clone();
    }
}
