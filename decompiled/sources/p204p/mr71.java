package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class mr71 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f146443a;

    /* JADX INFO: renamed from: b */
    public int f146444b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ud71 f146445c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mr71(ud71 ud71Var, fbk fbkVar) {
        super(fbkVar);
        this.f146445c = ud71Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f146443a = obj;
        this.f146444b |= Integer.MIN_VALUE;
        return this.f146445c.emit(null, this);
    }
}
