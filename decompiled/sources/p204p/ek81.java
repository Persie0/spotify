package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ek81 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f60409a;

    /* JADX INFO: renamed from: b */
    public int f60410b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ud71 f60411c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ek81(ud71 ud71Var, fbk fbkVar) {
        super(fbkVar);
        this.f60411c = ud71Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f60409a = obj;
        this.f60410b |= Integer.MIN_VALUE;
        return this.f60411c.emit(null, this);
    }
}
