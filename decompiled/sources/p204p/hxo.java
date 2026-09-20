package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class hxo extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f96250a;

    /* JADX INFO: renamed from: b */
    public int f96251b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gxo f96252c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hxo(gxo gxoVar, fbk fbkVar) {
        super(fbkVar);
        this.f96252c = gxoVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f96250a = obj;
        this.f96251b |= Integer.MIN_VALUE;
        return this.f96252c.emit(null, this);
    }
}
