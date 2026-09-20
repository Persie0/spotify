package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class dok extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f51055a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ bpk f51056b;

    /* JADX INFO: renamed from: c */
    public int f51057c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dok(bpk bpkVar, ibk ibkVar) {
        super(ibkVar);
        this.f51056b = bpkVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f51055a = obj;
        this.f51057c |= Integer.MIN_VALUE;
        return this.f51056b.m30147m(this);
    }
}
