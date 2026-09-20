package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class tpl extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f222561a;

    /* JADX INFO: renamed from: b */
    public int f222562b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ lxi f222563c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tpl(lxi lxiVar, fbk fbkVar) {
        super(fbkVar);
        this.f222563c = lxiVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f222561a = obj;
        this.f222562b |= Integer.MIN_VALUE;
        return this.f222563c.emit(null, this);
    }
}
