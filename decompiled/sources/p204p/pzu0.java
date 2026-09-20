package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class pzu0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f183816a;

    /* JADX INFO: renamed from: b */
    public int f183817b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jcu0 f183818c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pzu0(jcu0 jcu0Var, fbk fbkVar) {
        super(fbkVar);
        this.f183818c = jcu0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f183816a = obj;
        this.f183817b |= Integer.MIN_VALUE;
        return this.f183818c.emit(null, this);
    }
}
