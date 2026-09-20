package p204p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.m7x[], still in use, count: 1, list:
  (r0v1 p.m7x[]) from 0x0079: CONSTRUCTOR (r0v1 p.m7x[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:122) call: p.nzv.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes.dex */
public final class m7x {
    TOO_MANY_CLONED_EVENTS("TOO_MANY_CLONED_EVENTS"),
    EVENTS_QUEUE_RESTARTED("EVENTS_QUEUE_RESTARTED"),
    EVENTS_QUEUE_PERMANENTLY_STOPPED("EVENTS_QUEUE_PERMANENTLY_STOPPED"),
    DISK_OP_READ_FAILED("DISK_OP_READ_FAILED"),
    DISK_OP_WRITE_FAILED("DISK_OP_WRITE_FAILED"),
    DISK_OP_QUEUE_PERMANENTLY_STOPPED("DISK_OP_QUEUE_PERMANENTLY_STOPPED"),
    EVENTS_SYNC_EXC_THROWN("EVENTS_SYNC_EXC_THROWN"),
    EVENTS_SYNC_REQUEST_FAILED("EVENTS_SYNC_REQUEST_FAILED"),
    EVENTS_SYNC_MISSING_TRANSPORT("EVENTS_SYNC_MISSING_TRANSPORT"),
    MESSAGE_EXCEEDS_BATCH_BYTES("MESSAGE_EXCEEDS_BATCH_BYTES"),
    COUNTERS_PARSE_FROM_PROTO("COUNTERS_PARSE_FROM_PROTO");


    /* JADX INFO: renamed from: L0 */
    public static final /* synthetic */ nzv f140855L0;

    /* JADX INFO: renamed from: a */
    public final String f140868a;

    static {
        f140855L0 = new nzv(m7xVarArr);
    }

    public m7x(String str) {
        super(str, i);
        this.f140868a = str;
    }

    public static m7x valueOf(String str) {
        return (m7x) Enum.valueOf(m7x.class, str);
    }

    public static m7x[] values() {
        return (m7x[]) f140858Z.clone();
    }
}
