package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class hf10 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f90578a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ncp f90579b;

    /* JADX INFO: renamed from: c */
    public int f90580c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hf10(ncp ncpVar, fbk fbkVar) {
        super(fbkVar);
        this.f90579b = ncpVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f90578a = obj;
        this.f90580c |= Integer.MIN_VALUE;
        return this.f90579b.m64164b(this);
    }
}
