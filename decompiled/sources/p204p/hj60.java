package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class hj60 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f91970a;

    /* JADX INFO: renamed from: b */
    public int f91971b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ x360 f91972c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hj60(x360 x360Var, fbk fbkVar) {
        super(fbkVar);
        this.f91972c = x360Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f91970a = obj;
        this.f91971b |= Integer.MIN_VALUE;
        return this.f91972c.emit(null, this);
    }
}
