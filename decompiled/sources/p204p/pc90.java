package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class pc90 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f175982a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ qc90 f175983b;

    /* JADX INFO: renamed from: c */
    public int f175984c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pc90(qc90 qc90Var, ibk ibkVar) {
        super(ibkVar);
        this.f175983b = qc90Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f175982a = obj;
        this.f175984c |= Integer.MIN_VALUE;
        return qc90.m72525c(this.f175983b, this);
    }
}
