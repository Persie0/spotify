package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class o0p extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f160434a;

    /* JADX INFO: renamed from: b */
    public int f160435b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gxo f160436c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0p(gxo gxoVar, fbk fbkVar) {
        super(fbkVar);
        this.f160436c = gxoVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f160434a = obj;
        this.f160435b |= Integer.MIN_VALUE;
        return this.f160436c.emit(null, this);
    }
}
