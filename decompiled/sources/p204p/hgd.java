package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class hgd extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f91131a;

    /* JADX INFO: renamed from: b */
    public int f91132b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kqc f91133c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hgd(kqc kqcVar, fbk fbkVar) {
        super(fbkVar);
        this.f91133c = kqcVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f91131a = obj;
        this.f91132b |= Integer.MIN_VALUE;
        return this.f91133c.emit(null, this);
    }
}
