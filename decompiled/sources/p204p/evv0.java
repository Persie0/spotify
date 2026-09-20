package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class evv0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f63357a;

    /* JADX INFO: renamed from: b */
    public int f63358b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bvv0 f63359c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public evv0(bvv0 bvv0Var, fbk fbkVar) {
        super(fbkVar);
        this.f63359c = bvv0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f63357a = obj;
        this.f63358b |= Integer.MIN_VALUE;
        return this.f63359c.emit(null, this);
    }
}
