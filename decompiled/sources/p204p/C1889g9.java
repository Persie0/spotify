package p204p;

/* JADX INFO: renamed from: p.g9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1889g9 extends Throwable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f77634a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1889g9(String str, int i) {
        super(str);
        this.f77634a = i;
    }

    @Override // java.lang.Throwable
    public synchronized Throwable fillInStackTrace() {
        switch (this.f77634a) {
            case 0:
                synchronized (this) {
                }
                return this;
            case 2:
                synchronized (this) {
                }
                return this;
            case 7:
                synchronized (this) {
                }
                return this;
            case 8:
                synchronized (this) {
                }
                return this;
            default:
                return super.fillInStackTrace();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1889g9(String str, cin0 cin0Var) {
        super(str + ". Error: " + cin0Var);
        this.f77634a = 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1889g9(int i) {
        super("Failure occurred while trying to finish a future.");
        this.f77634a = i;
        switch (i) {
            case 3:
                break;
            case 4:
                super("In order to provide an accessible experience for our users, it's required to provide the reason on why this\ncomponent is disabled. It's possible to do this by using the XML attribute `app:disabledStateReason` or the\nKotlin property `disabledStateReason`.");
                break;
            case 5:
            default:
                break;
            case 6:
                super("To insert a view inside this component you need to use the attr 'slot' to define where the component will be placed.");
                break;
        }
    }
}
