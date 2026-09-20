package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class fsw0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f72998a;

    /* JADX INFO: renamed from: b */
    public int f72999b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bvv0 f73000c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fsw0(bvv0 bvv0Var, fbk fbkVar) {
        super(fbkVar);
        this.f73000c = bvv0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f72998a = obj;
        this.f72999b |= Integer.MIN_VALUE;
        return this.f73000c.emit(null, this);
    }
}
