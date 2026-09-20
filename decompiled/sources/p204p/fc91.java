package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class fc91 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f68038a;

    /* JADX INFO: renamed from: b */
    public int f68039b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ud71 f68040c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fc91(ud71 ud71Var, fbk fbkVar) {
        super(fbkVar);
        this.f68040c = ud71Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f68038a = obj;
        this.f68039b |= Integer.MIN_VALUE;
        return this.f68040c.emit(null, this);
    }
}
