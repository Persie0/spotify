package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class yn51 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f274397a;

    /* JADX INFO: renamed from: b */
    public int f274398b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ b941 f274399c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yn51(b941 b941Var, fbk fbkVar) {
        super(fbkVar);
        this.f274399c = b941Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f274397a = obj;
        this.f274398b |= Integer.MIN_VALUE;
        return this.f274399c.emit(null, this);
    }
}
