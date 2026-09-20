package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class kvk0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f126871a;

    /* JADX INFO: renamed from: b */
    public int f126872b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ evk0 f126873c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kvk0(evk0 evk0Var, fbk fbkVar) {
        super(fbkVar);
        this.f126873c = evk0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f126871a = obj;
        this.f126872b |= Integer.MIN_VALUE;
        return this.f126873c.emit(null, this);
    }
}
