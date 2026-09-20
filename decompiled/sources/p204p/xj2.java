package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class xj2 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f262019a;

    /* JADX INFO: renamed from: b */
    public int f262020b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gd1 f262021c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xj2(gd1 gd1Var, fbk fbkVar) {
        super(fbkVar);
        this.f262021c = gd1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f262019a = obj;
        this.f262020b |= Integer.MIN_VALUE;
        return this.f262021c.emit(null, this);
    }
}
