package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class k6b extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f119709a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ l6b f119710b;

    /* JADX INFO: renamed from: c */
    public int f119711c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6b(l6b l6bVar, ibk ibkVar) {
        super(ibkVar);
        this.f119710b = l6bVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f119709a = obj;
        this.f119711c |= Integer.MIN_VALUE;
        return this.f119710b.m58324a(null, this);
    }
}
