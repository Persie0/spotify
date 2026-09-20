package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class vq40 extends ibk {

    /* JADX INFO: renamed from: a */
    public Object f243870a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f243871b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ p98 f243872c;

    /* JADX INFO: renamed from: d */
    public int f243873d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vq40(p98 p98Var, fbk fbkVar) {
        super(fbkVar);
        this.f243872c = p98Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f243871b = obj;
        this.f243873d |= Integer.MIN_VALUE;
        return this.f243872c.emit(null, this);
    }
}
