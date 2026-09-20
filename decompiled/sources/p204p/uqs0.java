package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class uqs0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f233103a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ wqs0 f233104b;

    /* JADX INFO: renamed from: c */
    public int f233105c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uqs0(wqs0 wqs0Var, ibk ibkVar) {
        super(ibkVar);
        this.f233104b = wqs0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f233103a = obj;
        this.f233105c |= Integer.MIN_VALUE;
        return this.f233104b.m88789b(this);
    }
}
