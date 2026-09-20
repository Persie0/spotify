package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class jfp extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f111949a;

    /* JADX INFO: renamed from: b */
    public int f111950b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gxo f111951c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jfp(gxo gxoVar, fbk fbkVar) {
        super(fbkVar);
        this.f111951c = gxoVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f111949a = obj;
        this.f111950b |= Integer.MIN_VALUE;
        return this.f111951c.emit(null, this);
    }
}
