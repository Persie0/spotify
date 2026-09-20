package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class toc0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f222225a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ uoc0 f222226b;

    /* JADX INFO: renamed from: c */
    public int f222227c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public toc0(uoc0 uoc0Var, ibk ibkVar) {
        super(ibkVar);
        this.f222226b = uoc0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f222225a = obj;
        this.f222227c |= Integer.MIN_VALUE;
        return this.f222226b.m83612d(this);
    }
}
