package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class gok extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f82971a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ bpk f82972b;

    /* JADX INFO: renamed from: c */
    public int f82973c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gok(bpk bpkVar, ibk ibkVar) {
        super(ibkVar);
        this.f82972b = bpkVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f82971a = obj;
        this.f82973c |= Integer.MIN_VALUE;
        return this.f82972b.m30150p(this);
    }
}
