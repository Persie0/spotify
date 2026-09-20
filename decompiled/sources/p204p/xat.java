package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class xat extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f259758a;

    /* JADX INFO: renamed from: b */
    public int f259759b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ axr f259760c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xat(axr axrVar, fbk fbkVar) {
        super(fbkVar);
        this.f259760c = axrVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f259758a = obj;
        this.f259759b |= Integer.MIN_VALUE;
        return this.f259760c.emit(null, this);
    }
}
