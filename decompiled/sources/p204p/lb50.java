package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class lb50 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f131565a;

    /* JADX INFO: renamed from: b */
    public int f131566b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ o8x f131567c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lb50(o8x o8xVar, fbk fbkVar) {
        super(fbkVar);
        this.f131567c = o8xVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f131565a = obj;
        this.f131566b |= Integer.MIN_VALUE;
        return this.f131567c.emit(null, this);
    }
}
