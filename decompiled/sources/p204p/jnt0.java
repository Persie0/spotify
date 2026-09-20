package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class jnt0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f114197a;

    /* JADX INFO: renamed from: b */
    public int f114198b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ a4t0 f114199c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jnt0(a4t0 a4t0Var, fbk fbkVar) {
        super(fbkVar);
        this.f114199c = a4t0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f114197a = obj;
        this.f114198b |= Integer.MIN_VALUE;
        return this.f114199c.emit(null, this);
    }
}
