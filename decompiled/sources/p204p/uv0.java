package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class uv0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f234306a;

    /* JADX INFO: renamed from: b */
    public int f234307b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2438u3 f234308c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uv0(C2438u3 c2438u3, fbk fbkVar) {
        super(fbkVar);
        this.f234308c = c2438u3;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f234306a = obj;
        this.f234307b |= Integer.MIN_VALUE;
        return this.f234308c.emit(null, this);
    }
}
