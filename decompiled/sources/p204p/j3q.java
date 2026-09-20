package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class j3q extends ibk {

    /* JADX INFO: renamed from: a */
    public List f108454a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f108455b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ k3q f108456c;

    /* JADX INFO: renamed from: d */
    public int f108457d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3q(k3q k3qVar, ibk ibkVar) {
        super(ibkVar);
        this.f108456c = k3qVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f108455b = obj;
        this.f108457d |= Integer.MIN_VALUE;
        return k3q.m55278a(this.f108456c, null, this);
    }
}
