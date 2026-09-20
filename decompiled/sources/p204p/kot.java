package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class kot extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f124907a;

    /* JADX INFO: renamed from: b */
    public int f124908b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ rot f124909c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kot(rot rotVar, ibk ibkVar) {
        super(ibkVar);
        this.f124909c = rotVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f124907a = obj;
        this.f124908b |= Integer.MIN_VALUE;
        return this.f124909c.mo15629a(null, null, this);
    }
}
