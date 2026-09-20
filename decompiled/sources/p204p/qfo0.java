package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class qfo0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f188267a;

    /* JADX INFO: renamed from: b */
    public int f188268b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ pvn0 f188269c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qfo0(pvn0 pvn0Var, fbk fbkVar) {
        super(fbkVar);
        this.f188269c = pvn0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f188267a = obj;
        this.f188268b |= Integer.MIN_VALUE;
        return this.f188269c.emit(null, this);
    }
}
