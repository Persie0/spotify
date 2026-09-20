package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class dcp0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f47608a;

    /* JADX INFO: renamed from: b */
    public int f47609b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ pvn0 f47610c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dcp0(pvn0 pvn0Var, fbk fbkVar) {
        super(fbkVar);
        this.f47610c = pvn0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f47608a = obj;
        this.f47609b |= Integer.MIN_VALUE;
        return this.f47610c.emit(null, this);
    }
}
