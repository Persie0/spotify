package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class nwn0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f159241a;

    /* JADX INFO: renamed from: b */
    public int f159242b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ pvn0 f159243c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nwn0(pvn0 pvn0Var, fbk fbkVar) {
        super(fbkVar);
        this.f159243c = pvn0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f159241a = obj;
        this.f159242b |= Integer.MIN_VALUE;
        return this.f159243c.emit(null, this);
    }
}
