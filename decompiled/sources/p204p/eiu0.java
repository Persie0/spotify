package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class eiu0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f60014a;

    /* JADX INFO: renamed from: b */
    public int f60015b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jcu0 f60016c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eiu0(jcu0 jcu0Var, fbk fbkVar) {
        super(fbkVar);
        this.f60016c = jcu0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f60014a = obj;
        this.f60015b |= Integer.MIN_VALUE;
        return this.f60016c.emit(null, this);
    }
}
