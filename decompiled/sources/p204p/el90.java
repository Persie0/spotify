package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class el90 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f60660a;

    /* JADX INFO: renamed from: b */
    public int f60661b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ sn2 f60662c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public el90(sn2 sn2Var, fbk fbkVar) {
        super(fbkVar);
        this.f60662c = sn2Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f60660a = obj;
        this.f60661b |= Integer.MIN_VALUE;
        return this.f60662c.emit(null, this);
    }
}
