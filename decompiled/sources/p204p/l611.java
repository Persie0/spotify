package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class l611 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f130140a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ t1w f130141b;

    /* JADX INFO: renamed from: c */
    public int f130142c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l611(t1w t1wVar, ibk ibkVar) {
        super(ibkVar);
        this.f130141b = t1wVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f130140a = obj;
        this.f130142c |= Integer.MIN_VALUE;
        return this.f130141b.m79884a(null, this);
    }
}
