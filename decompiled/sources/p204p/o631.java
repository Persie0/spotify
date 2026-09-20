package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class o631 extends Throwable {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f162197b = 0;

    /* JADX INFO: renamed from: a */
    public final String f162198a;

    public o631(String str, Throwable th, n631 n631Var) {
        super(str, th);
        this.f162198a = str;
        setStackTrace((StackTraceElement[]) n631Var.f150676a.toArray(new StackTraceElement[0]));
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f162198a;
    }

    public /* synthetic */ o631(String str, n631 n631Var) {
        this(str, null, n631Var);
    }
}
