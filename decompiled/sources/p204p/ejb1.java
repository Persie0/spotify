package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ejb1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f60182a;

    /* JADX INFO: renamed from: b */
    public int f60183b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ie91 f60184c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ejb1(ie91 ie91Var, fbk fbkVar) {
        super(fbkVar);
        this.f60184c = ie91Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f60182a = obj;
        this.f60183b |= Integer.MIN_VALUE;
        return this.f60184c.emit(null, this);
    }
}
