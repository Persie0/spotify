package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class cie extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f38294a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ iie f38295b;

    /* JADX INFO: renamed from: c */
    public int f38296c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cie(iie iieVar, ibk ibkVar) {
        super(ibkVar);
        this.f38295b = iieVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f38294a = obj;
        this.f38296c |= Integer.MIN_VALUE;
        return this.f38295b.m50706d(this);
    }
}
