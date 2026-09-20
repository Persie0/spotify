package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class u020 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f225351a;

    /* JADX INFO: renamed from: b */
    public int f225352b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ v020 f225353c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u020(v020 v020Var, fbk fbkVar) {
        super(fbkVar);
        this.f225353c = v020Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f225351a = obj;
        this.f225352b |= Integer.MIN_VALUE;
        return this.f225353c.emit(null, this);
    }
}
