package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class gwh extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f85008a;

    /* JADX INFO: renamed from: b */
    public int f85009b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hwh f85010c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gwh(hwh hwhVar, ibk ibkVar) {
        super(ibkVar);
        this.f85010c = hwhVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f85008a = obj;
        this.f85009b |= Integer.MIN_VALUE;
        return this.f85010c.mo15629a(null, null, this);
    }
}
