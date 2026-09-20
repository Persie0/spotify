package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class sq80 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f213036a;

    /* JADX INFO: renamed from: b */
    public int f213037b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ pq80 f213038c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sq80(pq80 pq80Var, fbk fbkVar) {
        super(fbkVar);
        this.f213038c = pq80Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f213036a = obj;
        this.f213037b |= Integer.MIN_VALUE;
        return this.f213038c.emit(null, this);
    }
}
