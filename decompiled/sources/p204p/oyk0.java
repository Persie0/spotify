package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class oyk0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f171784a;

    /* JADX INFO: renamed from: b */
    public int f171785b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ pyk0 f171786c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oyk0(pyk0 pyk0Var, fbk fbkVar) {
        super(fbkVar);
        this.f171786c = pyk0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f171784a = obj;
        this.f171785b |= Integer.MIN_VALUE;
        return this.f171786c.emit(null, this);
    }
}
