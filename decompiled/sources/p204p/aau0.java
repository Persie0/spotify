package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class aau0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f13927a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ bau0 f13928b;

    /* JADX INFO: renamed from: c */
    public int f13929c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aau0(bau0 bau0Var, ibk ibkVar) {
        super(ibkVar);
        this.f13928b = bau0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f13927a = obj;
        this.f13929c |= Integer.MIN_VALUE;
        return this.f13928b.m28595c(null, this);
    }
}
