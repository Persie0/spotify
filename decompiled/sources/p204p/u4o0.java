package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class u4o0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f226779a;

    /* JADX INFO: renamed from: b */
    public int f226780b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ pvn0 f226781c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4o0(pvn0 pvn0Var, fbk fbkVar) {
        super(fbkVar);
        this.f226781c = pvn0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f226779a = obj;
        this.f226780b |= Integer.MIN_VALUE;
        return this.f226781c.emit(null, this);
    }
}
