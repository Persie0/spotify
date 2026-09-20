package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class hal0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f89238a;

    /* JADX INFO: renamed from: b */
    public int f89239b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ evk0 f89240c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hal0(evk0 evk0Var, fbk fbkVar) {
        super(fbkVar);
        this.f89240c = evk0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f89238a = obj;
        this.f89239b |= Integer.MIN_VALUE;
        return this.f89240c.emit(null, this);
    }
}
