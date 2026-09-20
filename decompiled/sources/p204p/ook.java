package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ook extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f167646a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ bpk f167647b;

    /* JADX INFO: renamed from: c */
    public int f167648c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ook(bpk bpkVar, ibk ibkVar) {
        super(ibkVar);
        this.f167647b = bpkVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f167646a = obj;
        this.f167648c |= Integer.MIN_VALUE;
        return this.f167647b.m30158x(this);
    }
}
