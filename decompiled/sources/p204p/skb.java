package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class skb extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f210071a;

    /* JADX INFO: renamed from: b */
    public int f210072b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c2b f210073c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public skb(c2b c2bVar, fbk fbkVar) {
        super(fbkVar);
        this.f210073c = c2bVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f210071a = obj;
        this.f210072b |= Integer.MIN_VALUE;
        return this.f210073c.emit(null, this);
    }
}
