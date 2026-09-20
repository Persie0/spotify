package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class hdk extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f90155a;

    /* JADX INFO: renamed from: b */
    public int f90156b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wk8 f90157c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hdk(wk8 wk8Var, fbk fbkVar) {
        super(fbkVar);
        this.f90157c = wk8Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f90155a = obj;
        this.f90156b |= Integer.MIN_VALUE;
        return this.f90157c.emit(null, this);
    }
}
