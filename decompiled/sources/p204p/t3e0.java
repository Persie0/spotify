package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class t3e0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f216755a;

    /* JADX INFO: renamed from: b */
    public int f216756b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ yqd0 f216757c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3e0(yqd0 yqd0Var, fbk fbkVar) {
        super(fbkVar);
        this.f216757c = yqd0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f216755a = obj;
        this.f216756b |= Integer.MIN_VALUE;
        return this.f216757c.emit(null, this);
    }
}
