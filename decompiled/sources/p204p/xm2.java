package p204p;

import java.util.TimeZone;

/* JADX INFO: loaded from: classes8.dex */
public final class xm2 extends ibk {

    /* JADX INFO: renamed from: a */
    public long f263272a;

    /* JADX INFO: renamed from: b */
    public TimeZone f263273b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f263274c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ym2 f263275d;

    /* JADX INFO: renamed from: e */
    public int f263276e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xm2(ym2 ym2Var, ibk ibkVar) {
        super(ibkVar);
        this.f263275d = ym2Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f263274c = obj;
        this.f263276e |= Integer.MIN_VALUE;
        return this.f263275d.m94180a(this);
    }
}
