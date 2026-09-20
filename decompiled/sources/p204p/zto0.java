package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class zto0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f286229a;

    /* JADX INFO: renamed from: b */
    public int f286230b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wk8 f286231c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zto0(wk8 wk8Var, fbk fbkVar) {
        super(fbkVar);
        this.f286231c = wk8Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f286229a = obj;
        this.f286230b |= Integer.MIN_VALUE;
        return this.f286231c.emit(null, this);
    }
}
