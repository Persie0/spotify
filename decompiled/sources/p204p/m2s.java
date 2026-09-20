package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class m2s extends ibk {

    /* JADX INFO: renamed from: a */
    public iq01 f139452a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f139453b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ o2s f139454c;

    /* JADX INFO: renamed from: d */
    public int f139455d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2s(o2s o2sVar, ibk ibkVar) {
        super(ibkVar);
        this.f139454c = o2sVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f139453b = obj;
        this.f139455d |= Integer.MIN_VALUE;
        return this.f139454c.mo26627f(null, this);
    }
}
