package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class qzo extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f194236a;

    /* JADX INFO: renamed from: b */
    public int f194237b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gxo f194238c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qzo(gxo gxoVar, fbk fbkVar) {
        super(fbkVar);
        this.f194238c = gxoVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f194236a = obj;
        this.f194237b |= Integer.MIN_VALUE;
        return this.f194238c.emit(null, this);
    }
}
