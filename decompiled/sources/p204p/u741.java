package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class u741 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f227500a;

    /* JADX INFO: renamed from: b */
    public int f227501b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ aq21 f227502c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u741(aq21 aq21Var, fbk fbkVar) {
        super(fbkVar);
        this.f227502c = aq21Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f227500a = obj;
        this.f227501b |= Integer.MIN_VALUE;
        return this.f227502c.emit(null, this);
    }
}
