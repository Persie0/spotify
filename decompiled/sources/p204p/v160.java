package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class v160 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f236263a;

    /* JADX INFO: renamed from: b */
    public int f236264b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wc30 f236265c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v160(wc30 wc30Var, fbk fbkVar) {
        super(fbkVar);
        this.f236265c = wc30Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f236263a = obj;
        this.f236264b |= Integer.MIN_VALUE;
        return this.f236265c.emit(null, this);
    }
}
