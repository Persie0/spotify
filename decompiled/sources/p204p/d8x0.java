package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class d8x0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f46547a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ e8x0 f46548b;

    /* JADX INFO: renamed from: c */
    public int f46549c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d8x0(e8x0 e8x0Var, ibk ibkVar) {
        super(ibkVar);
        this.f46548b = e8x0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f46547a = obj;
        this.f46549c |= Integer.MIN_VALUE;
        Object objM38131a = this.f46548b.m38131a(null, this);
        return objM38131a == yuk.f276404a ? objM38131a : new s6x0(objM38131a);
    }
}
