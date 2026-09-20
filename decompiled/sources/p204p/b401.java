package p204p;

import androidx.glance.session.SessionWorker;

/* JADX INFO: loaded from: classes3.dex */
public final class b401 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f23161a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SessionWorker f23162b;

    /* JADX INFO: renamed from: c */
    public int f23163c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b401(SessionWorker sessionWorker, ibk ibkVar) {
        super(ibkVar);
        this.f23162b = sessionWorker;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f23161a = obj;
        this.f23163c |= Integer.MIN_VALUE;
        return this.f23162b.mo750f(this);
    }
}
