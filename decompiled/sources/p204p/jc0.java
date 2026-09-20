package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class jc0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f110927a;

    /* JADX INFO: renamed from: b */
    public int f110928b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2438u3 f110929c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jc0(C2438u3 c2438u3, fbk fbkVar) {
        super(fbkVar);
        this.f110929c = c2438u3;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f110927a = obj;
        this.f110928b |= Integer.MIN_VALUE;
        return this.f110929c.emit(null, this);
    }
}
