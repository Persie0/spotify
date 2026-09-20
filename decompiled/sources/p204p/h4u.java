package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class h4u extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f87646a;

    /* JADX INFO: renamed from: b */
    public int f87647b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ b3t f87648c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4u(b3t b3tVar, fbk fbkVar) {
        super(fbkVar);
        this.f87648c = b3tVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f87646a = obj;
        this.f87647b |= Integer.MIN_VALUE;
        return this.f87648c.emit(null, this);
    }
}
