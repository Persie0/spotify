package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ho6 extends qe70 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f93463a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hiu f93464b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ho6(hiu hiuVar, int i) {
        super(2);
        this.f93463a = i;
        this.f93464b = hiuVar;
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f93463a) {
            case 0:
                return new n6f(this.f93464b.f91879j);
            default:
                return new n6f(this.f93464b.f91882m);
        }
    }
}
