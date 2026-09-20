package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class pp20 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f179871a;

    /* JADX INFO: renamed from: b */
    public int f179872b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ v020 f179873c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pp20(v020 v020Var, fbk fbkVar) {
        super(fbkVar);
        this.f179873c = v020Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f179871a = obj;
        this.f179872b |= Integer.MIN_VALUE;
        return this.f179873c.emit(null, this);
    }
}
