package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class w1a extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f247035a;

    /* JADX INFO: renamed from: b */
    public int f247036b;

    /* JADX INFO: renamed from: c */
    public Object f247037c;

    /* JADX INFO: renamed from: d */
    public niz f247038d;

    /* JADX INFO: renamed from: e */
    public int f247039e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ q1a f247040f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1a(q1a q1aVar, fbk fbkVar) {
        super(fbkVar);
        this.f247040f = q1aVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f247035a = obj;
        this.f247036b |= Integer.MIN_VALUE;
        return this.f247040f.emit(null, this);
    }
}
