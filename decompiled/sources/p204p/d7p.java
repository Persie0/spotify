package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class d7p extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f46248a;

    /* JADX INFO: renamed from: b */
    public int f46249b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gxo f46250c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d7p(gxo gxoVar, fbk fbkVar) {
        super(fbkVar);
        this.f46250c = gxoVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f46248a = obj;
        this.f46249b |= Integer.MIN_VALUE;
        return this.f46250c.emit(null, this);
    }
}
