package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class toa extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f222207a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ uoa f222208b;

    /* JADX INFO: renamed from: c */
    public int f222209c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public toa(uoa uoaVar, ibk ibkVar) {
        super(ibkVar);
        this.f222208b = uoaVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f222207a = obj;
        this.f222209c |= Integer.MIN_VALUE;
        return this.f222208b.mo30074c(null, false, this);
    }
}
