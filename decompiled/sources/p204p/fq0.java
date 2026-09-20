package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class fq0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f72026a;

    /* JADX INFO: renamed from: b */
    public int f72027b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2438u3 f72028c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fq0(C2438u3 c2438u3, fbk fbkVar) {
        super(fbkVar);
        this.f72028c = c2438u3;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f72026a = obj;
        this.f72027b |= Integer.MIN_VALUE;
        return this.f72028c.emit(null, this);
    }
}
