package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class mbc extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f141871a;

    /* JADX INFO: renamed from: b */
    public int f141872b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c2b f141873c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mbc(c2b c2bVar, fbk fbkVar) {
        super(fbkVar);
        this.f141873c = c2bVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f141871a = obj;
        this.f141872b |= Integer.MIN_VALUE;
        return this.f141873c.emit(null, this);
    }
}
