package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class fhp extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f69687a;

    /* JADX INFO: renamed from: b */
    public int f69688b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gxo f69689c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhp(gxo gxoVar, fbk fbkVar) {
        super(fbkVar);
        this.f69689c = gxoVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f69687a = obj;
        this.f69688b |= Integer.MIN_VALUE;
        return this.f69689c.emit(null, this);
    }
}
