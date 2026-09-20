package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class c010 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f32642a;

    /* JADX INFO: renamed from: b */
    public int f32643b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ d010 f32644c;

    /* JADX INFO: renamed from: d */
    public bqz0 f32645d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c010(d010 d010Var, ibk ibkVar) {
        super(ibkVar);
        this.f32644c = d010Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f32642a = obj;
        this.f32643b |= Integer.MIN_VALUE;
        return this.f32644c.mo15629a(null, null, this);
    }
}
