package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class hcu0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f89911a;

    /* JADX INFO: renamed from: b */
    public int f89912b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ a4t0 f89913c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hcu0(a4t0 a4t0Var, fbk fbkVar) {
        super(fbkVar);
        this.f89913c = a4t0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f89911a = obj;
        this.f89912b |= Integer.MIN_VALUE;
        return this.f89913c.emit(null, this);
    }
}
