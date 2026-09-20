package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class boh0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f29179a;

    /* JADX INFO: renamed from: b */
    public int f29180b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ nif0 f29181c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public boh0(nif0 nif0Var, fbk fbkVar) {
        super(fbkVar);
        this.f29181c = nif0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f29179a = obj;
        this.f29180b |= Integer.MIN_VALUE;
        return this.f29181c.emit(null, this);
    }
}
