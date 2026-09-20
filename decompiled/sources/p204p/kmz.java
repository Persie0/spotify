package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class kmz extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f124242a;

    /* JADX INFO: renamed from: b */
    public int f124243b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gtt f124244c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kmz(gtt gttVar, fbk fbkVar) {
        super(fbkVar);
        this.f124244c = gttVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f124242a = obj;
        this.f124243b |= Integer.MIN_VALUE;
        return this.f124244c.emit(null, this);
    }
}
