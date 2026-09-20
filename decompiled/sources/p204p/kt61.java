package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class kt61 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f126166a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ lt61 f126167b;

    /* JADX INFO: renamed from: c */
    public int f126168c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kt61(lt61 lt61Var, fbk fbkVar) {
        super(fbkVar);
        this.f126167b = lt61Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f126166a = obj;
        this.f126168c |= Integer.MIN_VALUE;
        return lt61.m59872a(this.f126167b, null, this);
    }
}
