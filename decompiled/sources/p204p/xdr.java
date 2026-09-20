package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class xdr extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f260524a;

    /* JADX INFO: renamed from: b */
    public int f260525b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ksq f260526c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xdr(ksq ksqVar, fbk fbkVar) {
        super(fbkVar);
        this.f260526c = ksqVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f260524a = obj;
        this.f260525b |= Integer.MIN_VALUE;
        return this.f260526c.emit(null, this);
    }
}
