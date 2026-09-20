package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class quf implements fbk {

    /* JADX INFO: renamed from: b */
    public static final quf f192696b = new quf(0);

    /* JADX INFO: renamed from: c */
    public static final quf f192697c = new quf(1);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f192698a;

    public /* synthetic */ quf(int i) {
        this.f192698a = i;
    }

    @Override // p204p.fbk
    public final juk getContext() {
        switch (this.f192698a) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            default:
                return dau.f47107a;
        }
    }

    @Override // p204p.fbk
    public final void resumeWith(Object obj) {
        switch (this.f192698a) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            default:
                return;
        }
    }

    public String toString() {
        switch (this.f192698a) {
            case 0:
                return "This continuation is already complete";
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m73908a(Object obj) {
    }
}
