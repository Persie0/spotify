package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class iqa0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f104705a;

    /* JADX INFO: renamed from: b */
    public int f104706b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ i2a0 f104707c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iqa0(i2a0 i2a0Var, fbk fbkVar) {
        super(fbkVar);
        this.f104707c = i2a0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f104705a = obj;
        this.f104706b |= Integer.MIN_VALUE;
        return this.f104707c.emit(null, this);
    }
}
