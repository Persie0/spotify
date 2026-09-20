package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class qz90 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f194150a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ei1 f194151b;

    /* JADX INFO: renamed from: c */
    public int f194152c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qz90(ei1 ei1Var, fbk fbkVar) {
        super(fbkVar);
        this.f194151b = ei1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f194150a = obj;
        this.f194152c |= Integer.MIN_VALUE;
        return this.f194151b.m39057g(this);
    }
}
