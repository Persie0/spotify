package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class hzk extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f96961a;

    /* JADX INFO: renamed from: b */
    public int f96962b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ lxi f96963c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hzk(lxi lxiVar, fbk fbkVar) {
        super(fbkVar);
        this.f96963c = lxiVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f96961a = obj;
        this.f96962b |= Integer.MIN_VALUE;
        return this.f96963c.emit(null, this);
    }
}
