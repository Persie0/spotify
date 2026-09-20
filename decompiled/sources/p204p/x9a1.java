package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class x9a1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f259308a;

    /* JADX INFO: renamed from: b */
    public int f259309b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ b9s f259310c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x9a1(b9s b9sVar, fbk fbkVar) {
        super(fbkVar);
        this.f259310c = b9sVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f259308a = obj;
        this.f259309b |= Integer.MIN_VALUE;
        return this.f259310c.emit(null, this);
    }
}
