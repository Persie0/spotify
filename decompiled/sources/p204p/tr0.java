package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class tr0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f222933a;

    /* JADX INFO: renamed from: b */
    public int f222934b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2438u3 f222935c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tr0(C2438u3 c2438u3, fbk fbkVar) {
        super(fbkVar);
        this.f222935c = c2438u3;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f222933a = obj;
        this.f222934b |= Integer.MIN_VALUE;
        return this.f222935c.emit(null, this);
    }
}
