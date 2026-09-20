package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class dqa1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f51938a;

    /* JADX INFO: renamed from: b */
    public int f51939b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ie91 f51940c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqa1(ie91 ie91Var, fbk fbkVar) {
        super(fbkVar);
        this.f51940c = ie91Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f51938a = obj;
        this.f51939b |= Integer.MIN_VALUE;
        return this.f51940c.emit(null, this);
    }
}
