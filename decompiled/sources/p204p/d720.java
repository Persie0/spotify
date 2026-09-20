package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class d720 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f45954a;

    /* JADX INFO: renamed from: b */
    public int f45955b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ v020 f45956c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d720(v020 v020Var, fbk fbkVar) {
        super(fbkVar);
        this.f45956c = v020Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f45954a = obj;
        this.f45955b |= Integer.MIN_VALUE;
        return this.f45956c.emit(null, this);
    }
}
