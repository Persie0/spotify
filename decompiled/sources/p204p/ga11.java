package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ga11 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f77947a;

    /* JADX INFO: renamed from: b */
    public int f77948b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ czz0 f77949c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ga11(czz0 czz0Var, fbk fbkVar) {
        super(fbkVar);
        this.f77949c = czz0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f77947a = obj;
        this.f77948b |= Integer.MIN_VALUE;
        return this.f77949c.emit(null, this);
    }
}
