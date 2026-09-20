package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class jpc extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f114607a;

    /* JADX INFO: renamed from: b */
    public int f114608b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c2b f114609c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jpc(c2b c2bVar, fbk fbkVar) {
        super(fbkVar);
        this.f114609c = c2bVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f114607a = obj;
        this.f114608b |= Integer.MIN_VALUE;
        return this.f114609c.emit(null, this);
    }
}
