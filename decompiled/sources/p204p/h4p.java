package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class h4p extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f87576a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ k4p f87577b;

    /* JADX INFO: renamed from: c */
    public int f87578c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4p(k4p k4pVar, ibk ibkVar) {
        super(ibkVar);
        this.f87577b = k4pVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f87576a = obj;
        this.f87578c |= Integer.MIN_VALUE;
        return k4p.m55403a(this.f87577b, this);
    }
}
