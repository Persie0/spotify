package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class he91 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f90386a;

    /* JADX INFO: renamed from: b */
    public int f90387b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ie91 f90388c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public he91(ie91 ie91Var, fbk fbkVar) {
        super(fbkVar);
        this.f90388c = ie91Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f90386a = obj;
        this.f90387b |= Integer.MIN_VALUE;
        return this.f90388c.emit(null, this);
    }
}
