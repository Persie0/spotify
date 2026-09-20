package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class nwp extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f159254a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ owp f159255b;

    /* JADX INFO: renamed from: c */
    public int f159256c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nwp(owp owpVar, fbk fbkVar) {
        super(fbkVar);
        this.f159255b = owpVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f159254a = obj;
        this.f159256c |= Integer.MIN_VALUE;
        return this.f159255b.m68180f(null, this);
    }
}
