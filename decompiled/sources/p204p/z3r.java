package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class z3r extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f279012a;

    /* JADX INFO: renamed from: b */
    public int f279013b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ qkj f279014c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3r(qkj qkjVar, fbk fbkVar) {
        super(fbkVar);
        this.f279014c = qkjVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f279012a = obj;
        this.f279013b |= Integer.MIN_VALUE;
        return this.f279014c.emit(null, this);
    }
}
