package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class omm0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f167060a;

    /* JADX INFO: renamed from: b */
    public int f167061b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ cgm0 f167062c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public omm0(cgm0 cgm0Var, fbk fbkVar) {
        super(fbkVar);
        this.f167062c = cgm0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f167060a = obj;
        this.f167061b |= Integer.MIN_VALUE;
        return this.f167062c.emit(null, this);
    }
}
