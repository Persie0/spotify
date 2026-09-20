package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class llo0 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f134674a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f134675b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ dwt f134676c;

    /* JADX INFO: renamed from: d */
    public int f134677d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public llo0(dwt dwtVar, ibk ibkVar) {
        super(ibkVar);
        this.f134676c = dwtVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f134675b = obj;
        this.f134677d |= Integer.MIN_VALUE;
        return this.f134676c.m37174d(null, this);
    }
}
