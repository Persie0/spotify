package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class qpl extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f191343a;

    /* JADX INFO: renamed from: b */
    public int f191344b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ lxi f191345c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qpl(lxi lxiVar, fbk fbkVar) {
        super(fbkVar);
        this.f191345c = lxiVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f191343a = obj;
        this.f191344b |= Integer.MIN_VALUE;
        return this.f191345c.emit(null, this);
    }
}
