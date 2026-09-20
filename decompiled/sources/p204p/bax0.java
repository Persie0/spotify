package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class bax0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f25357a;

    /* JADX INFO: renamed from: b */
    public int f25358b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bvv0 f25359c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bax0(bvv0 bvv0Var, fbk fbkVar) {
        super(fbkVar);
        this.f25359c = bvv0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f25357a = obj;
        this.f25358b |= Integer.MIN_VALUE;
        return this.f25359c.emit(null, this);
    }
}
