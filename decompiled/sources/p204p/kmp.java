package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class kmp extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f124190a;

    /* JADX INFO: renamed from: b */
    public int f124191b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gxo f124192c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kmp(gxo gxoVar, fbk fbkVar) {
        super(fbkVar);
        this.f124192c = gxoVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f124190a = obj;
        this.f124191b |= Integer.MIN_VALUE;
        return this.f124192c.emit(null, this);
    }
}
