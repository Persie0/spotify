package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class t3l0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f216799a;

    /* JADX INFO: renamed from: b */
    public int f216800b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ evk0 f216801c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3l0(evk0 evk0Var, fbk fbkVar) {
        super(fbkVar);
        this.f216801c = evk0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f216799a = obj;
        this.f216800b |= Integer.MIN_VALUE;
        return this.f216801c.emit(null, this);
    }
}
