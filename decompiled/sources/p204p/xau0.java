package p204p;

import com.ravelin.core.repository.RavelinWorker;

/* JADX INFO: loaded from: classes4.dex */
public final class xau0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f259768a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ RavelinWorker f259769b;

    /* JADX INFO: renamed from: c */
    public int f259770c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xau0(RavelinWorker ravelinWorker, ibk ibkVar) {
        super(ibkVar);
        this.f259769b = ravelinWorker;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f259768a = obj;
        this.f259770c |= Integer.MIN_VALUE;
        return RavelinWorker.m2226j(this.f259769b, this);
    }
}
