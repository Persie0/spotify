package p204p;

import com.ravelin.core.repository.RavelinFingerprintWorker;

/* JADX INFO: loaded from: classes4.dex */
public final class kau0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f120964a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ RavelinFingerprintWorker f120965b;

    /* JADX INFO: renamed from: c */
    public int f120966c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kau0(RavelinFingerprintWorker ravelinFingerprintWorker, ibk ibkVar) {
        super(ibkVar);
        this.f120965b = ravelinFingerprintWorker;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f120964a = obj;
        this.f120966c |= Integer.MIN_VALUE;
        return this.f120965b.mo750f(this);
    }
}
