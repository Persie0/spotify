package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class dvi extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f53466a;

    /* JADX INFO: renamed from: b */
    public int f53467b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ i7i f53468c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dvi(i7i i7iVar, fbk fbkVar) {
        super(fbkVar);
        this.f53468c = i7iVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f53466a = obj;
        this.f53467b |= Integer.MIN_VALUE;
        return this.f53468c.emit(null, this);
    }
}
