package p204p;

import com.spotify.music.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.b3q[], still in use, count: 1, list:
  (r0v1 p.b3q[]) from 0x007e: CONSTRUCTOR (r0v1 p.b3q[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:127) call: p.nzv.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes11.dex */
public final class b3q {
    LOCKED(R.id.locked_badge),
    PIN(R.id.pin_badge),
    TICKET(R.id.ticket_badge),
    MIX(R.id.mix_badge),
    PRE_RELEASE(R.id.pre_release_badge),
    NEW_RELEASE(R.id.new_release_badge),
    GENERATING(R.id.generating_badge),
    DOWNLOAD(R.id.download_badge),
    VIDEO_DOWNLOADED(R.id.video_downloaded_badge);


    /* JADX INFO: renamed from: Y */
    public static final /* synthetic */ nzv f23096Y;

    /* JADX INFO: renamed from: a */
    public final int f23106a;

    static {
        f23096Y = new nzv(b3qVarArr);
    }

    public b3q(int i) {
        super(str, i);
        this.f23106a = i;
    }

    public static b3q valueOf(String str) {
        return (b3q) Enum.valueOf(b3q.class, str);
    }

    public static b3q[] values() {
        return (b3q[]) f23095X.clone();
    }
}
