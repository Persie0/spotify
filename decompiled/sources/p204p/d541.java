package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class d541 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f45336a;

    /* JADX INFO: renamed from: b */
    public int f45337b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ aq21 f45338c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d541(aq21 aq21Var, fbk fbkVar) {
        super(fbkVar);
        this.f45338c = aq21Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f45336a = obj;
        this.f45337b |= Integer.MIN_VALUE;
        return this.f45338c.emit(null, this);
    }
}
