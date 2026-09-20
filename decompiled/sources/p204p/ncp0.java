package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class ncp0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f152567a;

    /* JADX INFO: renamed from: b */
    public int f152568b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ t950 f152569c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ncp0(t950 t950Var, fbk fbkVar) {
        super(fbkVar);
        this.f152569c = t950Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f152567a = obj;
        this.f152568b |= Integer.MIN_VALUE;
        return this.f152569c.emit(null, this);
    }
}
