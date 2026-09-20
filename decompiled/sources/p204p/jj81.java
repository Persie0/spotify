package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class jj81 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f112952a;

    /* JADX INFO: renamed from: b */
    public int f112953b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ud71 f112954c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jj81(ud71 ud71Var, fbk fbkVar) {
        super(fbkVar);
        this.f112954c = ud71Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f112952a = obj;
        this.f112953b |= Integer.MIN_VALUE;
        return this.f112954c.emit(null, this);
    }
}
