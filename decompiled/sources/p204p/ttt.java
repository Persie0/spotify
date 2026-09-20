package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ttt extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f223673a;

    /* JADX INFO: renamed from: b */
    public int f223674b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ b3t f223675c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ttt(b3t b3tVar, fbk fbkVar) {
        super(fbkVar);
        this.f223675c = b3tVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f223673a = obj;
        this.f223674b |= Integer.MIN_VALUE;
        return this.f223675c.emit(null, this);
    }
}
