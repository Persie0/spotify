package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class laf extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f131336a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ maf f131337b;

    /* JADX INFO: renamed from: c */
    public int f131338c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public laf(maf mafVar, fbk fbkVar) {
        super(fbkVar);
        this.f131337b = mafVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f131336a = obj;
        this.f131338c |= Integer.MIN_VALUE;
        return this.f131337b.emit(null, this);
    }
}
