package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class koo0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f124836a;

    /* JADX INFO: renamed from: b */
    public int f124837b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ pvn0 f124838c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public koo0(pvn0 pvn0Var, fbk fbkVar) {
        super(fbkVar);
        this.f124838c = pvn0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f124836a = obj;
        this.f124837b |= Integer.MIN_VALUE;
        return this.f124838c.emit(null, this);
    }
}
