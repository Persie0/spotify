package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class ukz extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f231392a;

    /* JADX INFO: renamed from: b */
    public int f231393b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ v1a f231394c;

    /* JADX INFO: renamed from: d */
    public Object f231395d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ukz(v1a v1aVar, fbk fbkVar) {
        super(fbkVar);
        this.f231394c = v1aVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f231392a = obj;
        this.f231393b |= Integer.MIN_VALUE;
        return this.f231394c.emit(null, this);
    }
}
