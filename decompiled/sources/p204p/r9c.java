package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class r9c extends ibk {

    /* JADX INFO: renamed from: a */
    public w9c f197013a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f197014b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ w9c f197015c;

    /* JADX INFO: renamed from: d */
    public int f197016d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r9c(w9c w9cVar, ibk ibkVar) {
        super(ibkVar);
        this.f197015c = w9cVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f197014b = obj;
        this.f197016d |= Integer.MIN_VALUE;
        return this.f197015c.mo46378b(null, null, false, false, null, null, false, null, this);
    }
}
