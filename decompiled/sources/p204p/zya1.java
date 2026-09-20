package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class zya1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f287540a;

    /* JADX INFO: renamed from: b */
    public int f287541b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ie91 f287542c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zya1(ie91 ie91Var, fbk fbkVar) {
        super(fbkVar);
        this.f287542c = ie91Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f287540a = obj;
        this.f287541b |= Integer.MIN_VALUE;
        return this.f287542c.emit(null, this);
    }
}
