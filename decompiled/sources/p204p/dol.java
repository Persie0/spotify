package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class dol extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f51065a;

    /* JADX INFO: renamed from: b */
    public int f51066b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ lxi f51067c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dol(lxi lxiVar, fbk fbkVar) {
        super(fbkVar);
        this.f51067c = lxiVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f51065a = obj;
        this.f51066b |= Integer.MIN_VALUE;
        return this.f51067c.emit(null, this);
    }
}
