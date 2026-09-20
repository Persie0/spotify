package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class n930 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f151693a;

    /* JADX INFO: renamed from: b */
    public int f151694b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ v020 f151695c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n930(v020 v020Var, fbk fbkVar) {
        super(fbkVar);
        this.f151695c = v020Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f151693a = obj;
        this.f151694b |= Integer.MIN_VALUE;
        return this.f151695c.emit(null, this);
    }
}
