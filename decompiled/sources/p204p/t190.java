package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class t190 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f216195a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f216196b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ u190 f216197c;

    /* JADX INFO: renamed from: d */
    public int f216198d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t190(u190 u190Var, ibk ibkVar) {
        super(ibkVar);
        this.f216197c = u190Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f216196b = obj;
        this.f216198d |= Integer.MIN_VALUE;
        return this.f216197c.m82199e(null, this);
    }
}
