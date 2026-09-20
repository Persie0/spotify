package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class iot extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f104284a;

    /* JADX INFO: renamed from: b */
    public int f104285b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ pot f104286c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iot(pot potVar, ibk ibkVar) {
        super(ibkVar);
        this.f104286c = potVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f104284a = obj;
        this.f104285b |= Integer.MIN_VALUE;
        return this.f104286c.mo15629a(null, null, this);
    }
}
