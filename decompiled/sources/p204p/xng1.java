package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class xng1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f263611a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ aog1 f263612b;

    /* JADX INFO: renamed from: c */
    public int f263613c;

    /* JADX INFO: renamed from: d */
    public smg1 f263614d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xng1(aog1 aog1Var, fbk fbkVar) {
        super(fbkVar);
        this.f263612b = aog1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f263611a = obj;
        this.f263613c |= Integer.MIN_VALUE;
        return this.f263612b.m26589a(null, this);
    }
}
