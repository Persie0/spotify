package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class jsb extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f115467a;

    /* JADX INFO: renamed from: b */
    public int f115468b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c2b f115469c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jsb(c2b c2bVar, fbk fbkVar) {
        super(fbkVar);
        this.f115469c = c2bVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f115467a = obj;
        this.f115468b |= Integer.MIN_VALUE;
        return this.f115469c.emit(null, this);
    }
}
