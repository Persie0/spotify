package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class lbc extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f131623a;

    /* JADX INFO: renamed from: b */
    public int f131624b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c2b f131625c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lbc(c2b c2bVar, fbk fbkVar) {
        super(fbkVar);
        this.f131625c = c2bVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f131623a = obj;
        this.f131624b |= Integer.MIN_VALUE;
        return this.f131625c.emit(null, this);
    }
}
