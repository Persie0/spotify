package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class mb50 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f141800a;

    /* JADX INFO: renamed from: b */
    public int f141801b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wc30 f141802c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mb50(wc30 wc30Var, fbk fbkVar) {
        super(fbkVar);
        this.f141802c = wc30Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f141800a = obj;
        this.f141801b |= Integer.MIN_VALUE;
        return this.f141802c.emit(null, this);
    }
}
