package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class k9k extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f120597a;

    /* JADX INFO: renamed from: b */
    public int f120598b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ lxi f120599c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k9k(lxi lxiVar, fbk fbkVar) {
        super(fbkVar);
        this.f120599c = lxiVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f120597a = obj;
        this.f120598b |= Integer.MIN_VALUE;
        return this.f120599c.emit(null, this);
    }
}
