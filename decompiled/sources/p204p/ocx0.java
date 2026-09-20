package p204p;

import io.reactivex.rxjava3.subjects.SingleSubject;

/* JADX INFO: loaded from: classes7.dex */
public final class ocx0 extends ibk {

    /* JADX INFO: renamed from: a */
    public int f164007a;

    /* JADX INFO: renamed from: b */
    public gh00 f164008b;

    /* JADX INFO: renamed from: c */
    public gh00 f164009c;

    /* JADX INFO: renamed from: d */
    public eh00 f164010d;

    /* JADX INFO: renamed from: e */
    public SingleSubject f164011e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f164012f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ qcx0 f164013g;

    /* JADX INFO: renamed from: h */
    public int f164014h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ocx0(qcx0 qcx0Var, ibk ibkVar) {
        super(ibkVar);
        this.f164013g = qcx0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f164012f = obj;
        this.f164014h |= Integer.MIN_VALUE;
        return this.f164013g.m72573c(0, null, null, null, this);
    }
}
