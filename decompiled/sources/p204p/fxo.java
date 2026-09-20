package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class fxo extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f74403a;

    /* JADX INFO: renamed from: b */
    public int f74404b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gxo f74405c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fxo(gxo gxoVar, fbk fbkVar) {
        super(fbkVar);
        this.f74405c = gxoVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f74403a = obj;
        this.f74404b |= Integer.MIN_VALUE;
        return this.f74405c.emit(null, this);
    }
}
