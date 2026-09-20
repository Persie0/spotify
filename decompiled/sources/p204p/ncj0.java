package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ncj0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f152526a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ pcj0 f152527b;

    /* JADX INFO: renamed from: c */
    public int f152528c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ncj0(pcj0 pcj0Var, ibk ibkVar) {
        super(ibkVar);
        this.f152527b = pcj0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f152526a = obj;
        this.f152528c |= Integer.MIN_VALUE;
        return this.f152527b.m69589c(this);
    }
}
