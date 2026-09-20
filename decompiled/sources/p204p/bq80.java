package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class bq80 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f29725a;

    /* JADX INFO: renamed from: b */
    public int f29726b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c780 f29727c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bq80(c780 c780Var, fbk fbkVar) {
        super(fbkVar);
        this.f29727c = c780Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f29725a = obj;
        this.f29726b |= Integer.MIN_VALUE;
        return this.f29727c.emit(null, this);
    }
}
