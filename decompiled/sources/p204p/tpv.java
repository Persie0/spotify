package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class tpv extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f222604a;

    /* JADX INFO: renamed from: b */
    public int f222605b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ umv f222606c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tpv(umv umvVar, fbk fbkVar) {
        super(fbkVar);
        this.f222606c = umvVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f222604a = obj;
        this.f222605b |= Integer.MIN_VALUE;
        return this.f222606c.emit(null, this);
    }
}
