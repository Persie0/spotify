package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class e480 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f56026a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ f480 f56027b;

    /* JADX INFO: renamed from: c */
    public int f56028c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e480(f480 f480Var, fbk fbkVar) {
        super(fbkVar);
        this.f56027b = f480Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f56026a = obj;
        this.f56028c |= Integer.MIN_VALUE;
        return f480.m40720g(this.f56027b, null, this);
    }
}
