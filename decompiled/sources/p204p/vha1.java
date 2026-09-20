package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class vha1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f241452a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ yha1 f241453b;

    /* JADX INFO: renamed from: c */
    public int f241454c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vha1(yha1 yha1Var, ibk ibkVar) {
        super(ibkVar);
        this.f241453b = yha1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f241452a = obj;
        this.f241454c |= Integer.MIN_VALUE;
        return this.f241453b.m93629d(this);
    }
}
