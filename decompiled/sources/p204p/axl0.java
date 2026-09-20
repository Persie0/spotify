package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class axl0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f20925a;

    /* JADX INFO: renamed from: b */
    public int f20926b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ evk0 f20927c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axl0(evk0 evk0Var, fbk fbkVar) {
        super(fbkVar);
        this.f20927c = evk0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f20925a = obj;
        this.f20926b |= Integer.MIN_VALUE;
        return this.f20927c.emit(null, this);
    }
}
