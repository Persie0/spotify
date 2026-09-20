package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class fyu0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f74856a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gyu0 f74857b;

    /* JADX INFO: renamed from: c */
    public int f74858c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fyu0(gyu0 gyu0Var, ibk ibkVar) {
        super(ibkVar);
        this.f74857b = gyu0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f74856a = obj;
        this.f74858c |= Integer.MIN_VALUE;
        return gyu0.m46175c(this.f74857b, this);
    }
}
