package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class m4k extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f139977a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ o4k f139978b;

    /* JADX INFO: renamed from: c */
    public int f139979c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4k(o4k o4kVar, ibk ibkVar) {
        super(ibkVar);
        this.f139978b = o4kVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f139977a = obj;
        this.f139979c |= Integer.MIN_VALUE;
        return this.f139978b.mo33214i(null, this);
    }
}
