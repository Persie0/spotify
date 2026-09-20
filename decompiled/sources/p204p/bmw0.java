package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class bmw0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f28640a;

    /* JADX INFO: renamed from: b */
    public int f28641b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bvv0 f28642c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bmw0(bvv0 bvv0Var, fbk fbkVar) {
        super(fbkVar);
        this.f28642c = bvv0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f28640a = obj;
        this.f28641b |= Integer.MIN_VALUE;
        return this.f28642c.emit(null, this);
    }
}
