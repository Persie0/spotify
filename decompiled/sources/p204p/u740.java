package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class u740 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f227497a;

    /* JADX INFO: renamed from: b */
    public int f227498b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wc30 f227499c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u740(wc30 wc30Var, fbk fbkVar) {
        super(fbkVar);
        this.f227499c = wc30Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f227497a = obj;
        this.f227498b |= Integer.MIN_VALUE;
        return this.f227499c.emit(null, this);
    }
}
