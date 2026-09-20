package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class wv0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f255306a;

    /* JADX INFO: renamed from: b */
    public int f255307b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2438u3 f255308c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wv0(C2438u3 c2438u3, fbk fbkVar) {
        super(fbkVar);
        this.f255308c = c2438u3;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f255306a = obj;
        this.f255307b |= Integer.MIN_VALUE;
        return this.f255308c.emit(null, this);
    }
}
