package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class hlj extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f92701a;

    /* JADX INFO: renamed from: b */
    public int f92702b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ lxi f92703c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hlj(lxi lxiVar, fbk fbkVar) {
        super(fbkVar);
        this.f92703c = lxiVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f92701a = obj;
        this.f92702b |= Integer.MIN_VALUE;
        return this.f92703c.emit(null, this);
    }
}
