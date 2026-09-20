package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class o181 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f160647a;

    /* JADX INFO: renamed from: b */
    public int f160648b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ud71 f160649c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o181(ud71 ud71Var, fbk fbkVar) {
        super(fbkVar);
        this.f160649c = ud71Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f160647a = obj;
        this.f160648b |= Integer.MIN_VALUE;
        return this.f160649c.emit(null, this);
    }
}
