package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class gol extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f82974a;

    /* JADX INFO: renamed from: b */
    public int f82975b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ lxi f82976c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gol(lxi lxiVar, fbk fbkVar) {
        super(fbkVar);
        this.f82976c = lxiVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f82974a = obj;
        this.f82975b |= Integer.MIN_VALUE;
        return this.f82976c.emit(null, this);
    }
}
