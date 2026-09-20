package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class dtt extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f52901a;

    /* JADX INFO: renamed from: b */
    public int f52902b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hhq f52903c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dtt(hhq hhqVar, fbk fbkVar) {
        super(fbkVar);
        this.f52903c = hhqVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f52901a = obj;
        this.f52902b |= Integer.MIN_VALUE;
        return this.f52903c.emit(null, this);
    }
}
