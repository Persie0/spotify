package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class soi extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f211196a;

    /* JADX INFO: renamed from: b */
    public int f211197b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ i7i f211198c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public soi(i7i i7iVar, fbk fbkVar) {
        super(fbkVar);
        this.f211198c = i7iVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f211196a = obj;
        this.f211197b |= Integer.MIN_VALUE;
        return this.f211198c.emit(null, this);
    }
}
