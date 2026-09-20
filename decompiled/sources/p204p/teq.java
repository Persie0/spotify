package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class teq extends ibk {

    /* JADX INFO: renamed from: a */
    public rui f219775a;

    /* JADX INFO: renamed from: b */
    public long f219776b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f219777c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ hfq f219778d;

    /* JADX INFO: renamed from: e */
    public int f219779e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public teq(hfq hfqVar, ibk ibkVar) {
        super(ibkVar);
        this.f219778d = hfqVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f219777c = obj;
        this.f219779e |= Integer.MIN_VALUE;
        return this.f219778d.m47360e(null, this);
    }
}
