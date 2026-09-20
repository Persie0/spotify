package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class bh0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f27038a;

    /* JADX INFO: renamed from: b */
    public int f27039b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2438u3 f27040c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bh0(C2438u3 c2438u3, fbk fbkVar) {
        super(fbkVar);
        this.f27040c = c2438u3;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f27038a = obj;
        this.f27039b |= Integer.MIN_VALUE;
        return this.f27040c.emit(null, this);
    }
}
