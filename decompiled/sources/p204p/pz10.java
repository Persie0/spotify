package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class pz10 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f183570a;

    /* JADX INFO: renamed from: b */
    public int f183571b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ flz f183572c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pz10(flz flzVar, fbk fbkVar) {
        super(fbkVar);
        this.f183572c = flzVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f183570a = obj;
        this.f183571b |= Integer.MIN_VALUE;
        return this.f183572c.emit(null, this);
    }
}
