package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class di50 implements i4t0 {

    /* JADX INFO: renamed from: b */
    public static final di50 f49249b = new di50(0);

    /* JADX INFO: renamed from: c */
    public static final di50 f49250c = new di50(1);

    /* JADX INFO: renamed from: d */
    public static final di50 f49251d = new di50(2);

    /* JADX INFO: renamed from: e */
    public static final di50 f49252e = new di50(3);

    /* JADX INFO: renamed from: f */
    public static final di50 f49253f = new di50(4);

    /* JADX INFO: renamed from: g */
    public static final di50 f49254g = new di50(5);

    /* JADX INFO: renamed from: h */
    public static final di50 f49255h = new di50(6);

    /* JADX INFO: renamed from: i */
    public static final di50 f49256i = new di50(7);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f49257a;

    public /* synthetic */ di50(int i) {
        this.f49257a = i;
    }

    @Override // p204p.i4t0
    public final Object get() {
        switch (this.f49257a) {
            case 0:
                return Boolean.FALSE;
            case 1:
                return Boolean.FALSE;
            case 2:
                throw new IllegalStateException("Footnote element cannot be presented in main settings item");
            case 3:
                return Boolean.FALSE;
            case 4:
                throw new IllegalStateException("Footnote element cannot be presented in search");
            case 5:
                throw new IllegalStateException("Footnote element cannot be presented in visibility check");
            case 6:
                return w0e1.f246718g;
            default:
                return Boolean.FALSE;
        }
    }
}
