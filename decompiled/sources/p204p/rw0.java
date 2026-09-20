package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class rw0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f203168a;

    /* JADX INFO: renamed from: b */
    public int f203169b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2438u3 f203170c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rw0(C2438u3 c2438u3, fbk fbkVar) {
        super(fbkVar);
        this.f203170c = c2438u3;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f203168a = obj;
        this.f203169b |= Integer.MIN_VALUE;
        return this.f203170c.emit(null, this);
    }
}
