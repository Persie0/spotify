package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class j720 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f109466a;

    /* JADX INFO: renamed from: b */
    public int f109467b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ v020 f109468c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j720(v020 v020Var, fbk fbkVar) {
        super(fbkVar);
        this.f109468c = v020Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f109466a = obj;
        this.f109467b |= Integer.MIN_VALUE;
        return this.f109468c.emit(null, this);
    }
}
