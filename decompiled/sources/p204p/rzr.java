package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class rzr extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f204205a;

    /* JADX INFO: renamed from: b */
    public int f204206b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ksq f204207c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rzr(ksq ksqVar, fbk fbkVar) {
        super(fbkVar);
        this.f204207c = ksqVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f204205a = obj;
        this.f204206b |= Integer.MIN_VALUE;
        return this.f204207c.emit(null, this);
    }
}
