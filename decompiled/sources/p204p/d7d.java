package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class d7d extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f46070a;

    /* JADX INFO: renamed from: b */
    public int f46071b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ e7d f46072c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d7d(e7d e7dVar, ibk ibkVar) {
        super(ibkVar);
        this.f46072c = e7dVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f46070a = obj;
        this.f46071b |= Integer.MIN_VALUE;
        return this.f46072c.mo15629a(null, null, this);
    }
}
