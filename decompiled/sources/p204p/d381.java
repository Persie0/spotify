package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class d381 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f44809a;

    /* JADX INFO: renamed from: b */
    public int f44810b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ud71 f44811c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d381(ud71 ud71Var, fbk fbkVar) {
        super(fbkVar);
        this.f44811c = ud71Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f44809a = obj;
        this.f44810b |= Integer.MIN_VALUE;
        return this.f44811c.emit(null, this);
    }
}
