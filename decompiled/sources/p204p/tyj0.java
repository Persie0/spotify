package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class tyj0 extends ibk {

    /* JADX INFO: renamed from: a */
    public gzj0 f224985a;

    /* JADX INFO: renamed from: b */
    public int f224986b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f224987c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ gzj0 f224988d;

    /* JADX INFO: renamed from: e */
    public int f224989e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tyj0(gzj0 gzj0Var, ibk ibkVar) {
        super(ibkVar);
        this.f224988d = gzj0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f224987c = obj;
        this.f224989e |= Integer.MIN_VALUE;
        return gzj0.m46205b(this.f224988d, this);
    }
}
