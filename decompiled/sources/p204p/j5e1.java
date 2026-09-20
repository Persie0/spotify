package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class j5e1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f108947a;

    /* JADX INFO: renamed from: b */
    public int f108948b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ k5e1 f108949c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5e1(k5e1 k5e1Var, ibk ibkVar) {
        super(ibkVar);
        this.f108949c = k5e1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f108947a = obj;
        this.f108948b |= Integer.MIN_VALUE;
        return this.f108949c.mo15629a(null, null, this);
    }
}
