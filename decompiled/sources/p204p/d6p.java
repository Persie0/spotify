package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class d6p extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f45848a;

    /* JADX INFO: renamed from: b */
    public int f45849b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gxo f45850c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6p(gxo gxoVar, fbk fbkVar) {
        super(fbkVar);
        this.f45850c = gxoVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f45848a = obj;
        this.f45849b |= Integer.MIN_VALUE;
        return this.f45850c.emit(null, this);
    }
}
