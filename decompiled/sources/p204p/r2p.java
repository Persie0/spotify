package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class r2p extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f195175a;

    /* JADX INFO: renamed from: b */
    public int f195176b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ s2p f195177c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2p(s2p s2pVar, fbk fbkVar) {
        super(fbkVar);
        this.f195177c = s2pVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f195175a = obj;
        this.f195176b |= Integer.MIN_VALUE;
        return this.f195177c.emit(null, this);
    }
}
