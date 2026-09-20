package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class dw8 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f53638a;

    /* JADX INFO: renamed from: b */
    public int f53639b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ s98 f53640c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dw8(s98 s98Var, fbk fbkVar) {
        super(fbkVar);
        this.f53640c = s98Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f53638a = obj;
        this.f53639b |= Integer.MIN_VALUE;
        return this.f53640c.emit(null, this);
    }
}
