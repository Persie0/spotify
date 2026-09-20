package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class l1i extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f128722a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ o1i f128723b;

    /* JADX INFO: renamed from: c */
    public int f128724c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1i(o1i o1iVar, ibk ibkVar) {
        super(ibkVar);
        this.f128723b = o1iVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f128722a = obj;
        this.f128724c |= Integer.MIN_VALUE;
        return o1i.m66071f(this.f128723b, null, null, null, this);
    }
}
