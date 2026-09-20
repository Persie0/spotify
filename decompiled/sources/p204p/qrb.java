package p204p;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes10.dex */
public final class qrb extends ibk {

    /* JADX INFO: renamed from: a */
    public Bitmap f191791a;

    /* JADX INFO: renamed from: b */
    public Bitmap f191792b;

    /* JADX INFO: renamed from: c */
    public int f191793c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f191794d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ e99 f191795e;

    /* JADX INFO: renamed from: f */
    public int f191796f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qrb(e99 e99Var, ibk ibkVar) {
        super(ibkVar);
        this.f191795e = e99Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f191794d = obj;
        this.f191796f |= Integer.MIN_VALUE;
        return e99.m38223d(this.f191795e, null, 0L, this);
    }
}
