package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class va30 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f239109a;

    /* JADX INFO: renamed from: b */
    public int f239110b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ v020 f239111c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public va30(v020 v020Var, fbk fbkVar) {
        super(fbkVar);
        this.f239111c = v020Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f239109a = obj;
        this.f239110b |= Integer.MIN_VALUE;
        return this.f239111c.emit(null, this);
    }
}
