package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class sha1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f209153a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ yha1 f209154b;

    /* JADX INFO: renamed from: c */
    public int f209155c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sha1(yha1 yha1Var, ibk ibkVar) {
        super(ibkVar);
        this.f209154b = yha1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f209153a = obj;
        this.f209155c |= Integer.MIN_VALUE;
        return this.f209154b.m93626a(this);
    }
}
