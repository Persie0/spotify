package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class yiq extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f273187a;

    /* JADX INFO: renamed from: b */
    public int f273188b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hhq f273189c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yiq(hhq hhqVar, fbk fbkVar) {
        super(fbkVar);
        this.f273189c = hhqVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f273187a = obj;
        this.f273188b |= Integer.MIN_VALUE;
        return this.f273189c.emit(null, this);
    }
}
