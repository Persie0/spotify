package p204p;

import com.ravelin.core.repository.MobileReportWorker;

/* JADX INFO: loaded from: classes4.dex */
public final class hbh0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f89537a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MobileReportWorker f89538b;

    /* JADX INFO: renamed from: c */
    public int f89539c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hbh0(MobileReportWorker mobileReportWorker, ibk ibkVar) {
        super(ibkVar);
        this.f89538b = mobileReportWorker;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f89537a = obj;
        this.f89539c |= Integer.MIN_VALUE;
        return this.f89538b.mo750f(this);
    }
}
