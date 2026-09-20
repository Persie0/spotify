package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class x4w extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f258201a;

    /* JADX INFO: renamed from: b */
    public int f258202b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hhq f258203c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4w(hhq hhqVar, fbk fbkVar) {
        super(fbkVar);
        this.f258203c = hhqVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f258201a = obj;
        this.f258202b |= Integer.MIN_VALUE;
        return this.f258203c.emit(null, this);
    }
}
