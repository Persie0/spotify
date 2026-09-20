package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class nzv0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f160176a;

    /* JADX INFO: renamed from: b */
    public int f160177b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bvv0 f160178c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nzv0(bvv0 bvv0Var, fbk fbkVar) {
        super(fbkVar);
        this.f160178c = bvv0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f160176a = obj;
        this.f160177b |= Integer.MIN_VALUE;
        return this.f160178c.emit(null, this);
    }
}
