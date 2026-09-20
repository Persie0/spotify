package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class i4u extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f98587a;

    /* JADX INFO: renamed from: b */
    public int f98588b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ b3t f98589c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i4u(b3t b3tVar, fbk fbkVar) {
        super(fbkVar);
        this.f98589c = b3tVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f98587a = obj;
        this.f98588b |= Integer.MIN_VALUE;
        return this.f98589c.emit(null, this);
    }
}
