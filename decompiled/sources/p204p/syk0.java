package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class syk0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f215272a;

    /* JADX INFO: renamed from: b */
    public int f215273b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ pyk0 f215274c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public syk0(pyk0 pyk0Var, fbk fbkVar) {
        super(fbkVar);
        this.f215274c = pyk0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f215272a = obj;
        this.f215273b |= Integer.MIN_VALUE;
        return this.f215274c.emit(null, this);
    }
}
