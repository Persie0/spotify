package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class h391 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f87187a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ i391 f87188b;

    /* JADX INFO: renamed from: c */
    public int f87189c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h391(i391 i391Var, ibk ibkVar) {
        super(ibkVar);
        this.f87188b = i391Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f87187a = obj;
        this.f87189c |= Integer.MIN_VALUE;
        return this.f87188b.m49583d(null, this);
    }
}
