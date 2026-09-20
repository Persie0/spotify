package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class cd01 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f36701a;

    /* JADX INFO: renamed from: b */
    public int f36702b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ czz0 f36703c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cd01(czz0 czz0Var, fbk fbkVar) {
        super(fbkVar);
        this.f36703c = czz0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f36701a = obj;
        this.f36702b |= Integer.MIN_VALUE;
        return this.f36703c.emit(null, this);
    }
}
