package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class q1v0 extends ibk {

    /* JADX INFO: renamed from: a */
    public List f184413a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f184414b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ s1v0 f184415c;

    /* JADX INFO: renamed from: d */
    public int f184416d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1v0(s1v0 s1v0Var, ibk ibkVar) {
        super(ibkVar);
        this.f184415c = s1v0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f184414b = obj;
        this.f184416d |= Integer.MIN_VALUE;
        return this.f184415c.m76993b(this);
    }
}
