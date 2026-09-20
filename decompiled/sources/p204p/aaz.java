package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class aaz extends ibk {

    /* JADX INFO: renamed from: a */
    public long f13951a;

    /* JADX INFO: renamed from: b */
    public baz f13952b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f13953c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ baz f13954d;

    /* JADX INFO: renamed from: e */
    public int f13955e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aaz(baz bazVar, ibk ibkVar) {
        super(ibkVar);
        this.f13954d = bazVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f13953c = obj;
        this.f13955e |= Integer.MIN_VALUE;
        return this.f13954d.m28602c(0L, this);
    }
}
