package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class xxb extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f266932a;

    /* JADX INFO: renamed from: b */
    public int f266933b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c2b f266934c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xxb(c2b c2bVar, fbk fbkVar) {
        super(fbkVar);
        this.f266934c = c2bVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f266932a = obj;
        this.f266933b |= Integer.MIN_VALUE;
        return this.f266934c.emit(null, this);
    }
}
