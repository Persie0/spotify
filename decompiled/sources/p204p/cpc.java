package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class cpc extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f40532a;

    /* JADX INFO: renamed from: b */
    public int f40533b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c2b f40534c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cpc(c2b c2bVar, fbk fbkVar) {
        super(fbkVar);
        this.f40534c = c2bVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f40532a = obj;
        this.f40533b |= Integer.MIN_VALUE;
        return this.f40534c.emit(null, this);
    }
}
