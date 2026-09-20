package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class dq80 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f51893a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ lt5 f51894b;

    /* JADX INFO: renamed from: c */
    public int f51895c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dq80(lt5 lt5Var, ibk ibkVar) {
        super(ibkVar);
        this.f51894b = lt5Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f51893a = obj;
        this.f51895c |= Integer.MIN_VALUE;
        return this.f51894b.m59871c(null, this);
    }
}
