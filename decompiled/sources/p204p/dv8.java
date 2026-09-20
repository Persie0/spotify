package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class dv8 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f53389a;

    /* JADX INFO: renamed from: b */
    public int f53390b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ s98 f53391c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dv8(s98 s98Var, fbk fbkVar) {
        super(fbkVar);
        this.f53391c = s98Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f53389a = obj;
        this.f53390b |= Integer.MIN_VALUE;
        return this.f53391c.emit(null, this);
    }
}
