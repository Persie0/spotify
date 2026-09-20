package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ewc extends ibk {

    /* JADX INFO: renamed from: a */
    public hwc f63496a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f63497b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hwc f63498c;

    /* JADX INFO: renamed from: d */
    public int f63499d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ewc(hwc hwcVar, ibk ibkVar) {
        super(ibkVar);
        this.f63498c = hwcVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f63497b = obj;
        this.f63499d |= Integer.MIN_VALUE;
        return this.f63498c.m48930b(this);
    }
}
