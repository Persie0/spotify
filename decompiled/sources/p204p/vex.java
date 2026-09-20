package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class vex extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f240833a;

    /* JADX INFO: renamed from: b */
    public int f240834b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wex f240835c;

    /* JADX INFO: renamed from: d */
    public bqz0 f240836d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vex(wex wexVar, ibk ibkVar) {
        super(ibkVar);
        this.f240835c = wexVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f240833a = obj;
        this.f240834b |= Integer.MIN_VALUE;
        return this.f240835c.mo15629a(null, null, this);
    }
}
