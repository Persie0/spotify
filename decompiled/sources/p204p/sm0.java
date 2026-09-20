package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class sm0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f210533a;

    /* JADX INFO: renamed from: b */
    public int f210534b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2438u3 f210535c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sm0(C2438u3 c2438u3, fbk fbkVar) {
        super(fbkVar);
        this.f210535c = c2438u3;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f210533a = obj;
        this.f210534b |= Integer.MIN_VALUE;
        return this.f210535c.emit(null, this);
    }
}
