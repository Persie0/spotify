package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class gbc extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f78261a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ nbc f78262b;

    /* JADX INFO: renamed from: c */
    public int f78263c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gbc(nbc nbcVar, ibk ibkVar) {
        super(ibkVar);
        this.f78262b = nbcVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f78261a = obj;
        this.f78263c |= Integer.MIN_VALUE;
        return this.f78262b.m64069b(null, this);
    }
}
