package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class qcp extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f187394a;

    /* JADX INFO: renamed from: b */
    public int f187395b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gxo f187396c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qcp(gxo gxoVar, fbk fbkVar) {
        super(fbkVar);
        this.f187396c = gxoVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f187394a = obj;
        this.f187395b |= Integer.MIN_VALUE;
        return this.f187396c.emit(null, this);
    }
}
