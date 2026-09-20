package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class m2p0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f139439a;

    /* JADX INFO: renamed from: b */
    public int f139440b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ pvn0 f139441c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2p0(pvn0 pvn0Var, fbk fbkVar) {
        super(fbkVar);
        this.f139441c = pvn0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f139439a = obj;
        this.f139440b |= Integer.MIN_VALUE;
        return this.f139441c.emit(null, this);
    }
}
