package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class bt71 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f30529a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ uk91 f30530b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bt71(int i, uk91 uk91Var) {
        super(1);
        this.f30529a = i;
        this.f30530b = uk91Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f30529a) {
            case 0:
                return new uk91(((Number) obj).longValue(), this.f30530b.f231265b);
            default:
                return new uk91(this.f30530b.f231264a, ((Number) obj).longValue());
        }
    }
}
