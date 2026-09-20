package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class zeq extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f282094a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hfq f282095b;

    /* JADX INFO: renamed from: c */
    public int f282096c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zeq(hfq hfqVar, ibk ibkVar) {
        super(ibkVar);
        this.f282095b = hfqVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f282094a = obj;
        this.f282096c |= Integer.MIN_VALUE;
        return this.f282095b.m47361f(this);
    }
}
