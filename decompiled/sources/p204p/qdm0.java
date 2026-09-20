package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class qdm0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f187721a;

    /* JADX INFO: renamed from: b */
    public int f187722b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ evk0 f187723c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qdm0(evk0 evk0Var, fbk fbkVar) {
        super(fbkVar);
        this.f187723c = evk0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f187721a = obj;
        this.f187722b |= Integer.MIN_VALUE;
        return this.f187723c.emit(null, this);
    }
}
