package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class fzj0 extends ibk {

    /* JADX INFO: renamed from: a */
    public boolean f75032a;

    /* JADX INFO: renamed from: b */
    public boolean f75033b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f75034c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ gzj0 f75035d;

    /* JADX INFO: renamed from: e */
    public int f75036e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fzj0(gzj0 gzj0Var, ibk ibkVar) {
        super(ibkVar);
        this.f75035d = gzj0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f75034c = obj;
        this.f75036e |= Integer.MIN_VALUE;
        return this.f75035d.m46216m(this);
    }
}
