package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class mcp0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f142222a;

    /* JADX INFO: renamed from: b */
    public int f142223b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ pvn0 f142224c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mcp0(pvn0 pvn0Var, fbk fbkVar) {
        super(fbkVar);
        this.f142224c = pvn0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f142222a = obj;
        this.f142223b |= Integer.MIN_VALUE;
        return this.f142224c.emit(null, this);
    }
}
