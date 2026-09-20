package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class knt0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f124470a;

    /* JADX INFO: renamed from: b */
    public int f124471b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ a4t0 f124472c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public knt0(a4t0 a4t0Var, fbk fbkVar) {
        super(fbkVar);
        this.f124472c = a4t0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f124470a = obj;
        this.f124471b |= Integer.MIN_VALUE;
        return this.f124472c.emit(null, this);
    }
}
