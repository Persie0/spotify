package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class jr91 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f115120a;

    /* JADX INFO: renamed from: b */
    public int f115121b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ axr f115122c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jr91(axr axrVar, fbk fbkVar) {
        super(fbkVar);
        this.f115122c = axrVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f115120a = obj;
        this.f115121b |= Integer.MIN_VALUE;
        return this.f115122c.emit(null, this);
    }
}
