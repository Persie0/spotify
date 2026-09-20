package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class d30 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f44705a;

    /* JADX INFO: renamed from: b */
    public int f44706b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2438u3 f44707c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d30(C2438u3 c2438u3, fbk fbkVar) {
        super(fbkVar);
        this.f44707c = c2438u3;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f44705a = obj;
        this.f44706b |= Integer.MIN_VALUE;
        return this.f44707c.emit(null, this);
    }
}
