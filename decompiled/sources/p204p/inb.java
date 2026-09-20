package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class inb extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f103937a;

    /* JADX INFO: renamed from: b */
    public int f103938b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c2b f103939c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public inb(c2b c2bVar, fbk fbkVar) {
        super(fbkVar);
        this.f103939c = c2bVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f103937a = obj;
        this.f103938b |= Integer.MIN_VALUE;
        return this.f103939c.emit(null, this);
    }
}
