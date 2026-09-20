package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class oq80 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f168132a;

    /* JADX INFO: renamed from: b */
    public int f168133b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ pq80 f168134c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oq80(pq80 pq80Var, fbk fbkVar) {
        super(fbkVar);
        this.f168134c = pq80Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f168132a = obj;
        this.f168133b |= Integer.MIN_VALUE;
        return this.f168134c.emit(null, this);
    }
}
