package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class uw01 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f234541a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kfq f234542b;

    /* JADX INFO: renamed from: c */
    public int f234543c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uw01(kfq kfqVar, ibk ibkVar) {
        super(ibkVar);
        this.f234542b = kfqVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f234541a = obj;
        this.f234543c |= Integer.MIN_VALUE;
        return this.f234542b.m56303a(null, this);
    }
}
