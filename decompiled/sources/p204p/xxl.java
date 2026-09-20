package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class xxl extends ibk {

    /* JADX INFO: renamed from: a */
    public String f267016a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f267017b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ yxl f267018c;

    /* JADX INFO: renamed from: d */
    public int f267019d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xxl(yxl yxlVar, ibk ibkVar) {
        super(ibkVar);
        this.f267018c = yxlVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f267017b = obj;
        this.f267019d |= Integer.MIN_VALUE;
        return yxl.m94845a(this.f267018c, null, this);
    }
}
