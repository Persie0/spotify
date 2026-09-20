package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class smp extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f210694a;

    /* JADX INFO: renamed from: b */
    public int f210695b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gxo f210696c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public smp(gxo gxoVar, fbk fbkVar) {
        super(fbkVar);
        this.f210696c = gxoVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f210694a = obj;
        this.f210695b |= Integer.MIN_VALUE;
        return this.f210696c.emit(null, this);
    }
}
