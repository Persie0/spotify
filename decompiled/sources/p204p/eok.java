package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class eok extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f61431a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ bpk f61432b;

    /* JADX INFO: renamed from: c */
    public int f61433c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eok(bpk bpkVar, ibk ibkVar) {
        super(ibkVar);
        this.f61432b = bpkVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f61431a = obj;
        this.f61433c |= Integer.MIN_VALUE;
        return this.f61432b.m30149o(this);
    }
}
