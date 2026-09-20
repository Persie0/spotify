package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class o4u extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f161753a;

    /* JADX INFO: renamed from: b */
    public int f161754b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ b3t f161755c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4u(b3t b3tVar, fbk fbkVar) {
        super(fbkVar);
        this.f161755c = b3tVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f161753a = obj;
        this.f161754b |= Integer.MIN_VALUE;
        return this.f161755c.emit(null, this);
    }
}
