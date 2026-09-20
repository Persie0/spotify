package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class zw91 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f286950a;

    /* JADX INFO: renamed from: b */
    public int f286951b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ie91 f286952c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zw91(ie91 ie91Var, fbk fbkVar) {
        super(fbkVar);
        this.f286952c = ie91Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f286950a = obj;
        this.f286951b |= Integer.MIN_VALUE;
        return this.f286952c.emit(null, this);
    }
}
