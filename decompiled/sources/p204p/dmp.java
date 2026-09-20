package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class dmp extends ibk {

    /* JADX INFO: renamed from: a */
    public String f50588a;

    /* JADX INFO: renamed from: b */
    public d850 f50589b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f50590c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ fmp f50591d;

    /* JADX INFO: renamed from: e */
    public int f50592e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmp(fmp fmpVar, ibk ibkVar) {
        super(ibkVar);
        this.f50591d = fmpVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f50590c = obj;
        this.f50592e |= Integer.MIN_VALUE;
        return this.f50591d.m42165a(null, null, this);
    }
}
