package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class qpg1 extends ibk {

    /* JADX INFO: renamed from: a */
    public Map f191301a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f191302b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gqg1 f191303c;

    /* JADX INFO: renamed from: d */
    public int f191304d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qpg1(gqg1 gqg1Var, ibk ibkVar) {
        super(ibkVar);
        this.f191303c = gqg1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f191302b = obj;
        this.f191304d |= Integer.MIN_VALUE;
        return this.f191303c.m45437b(null, null, null, null, this);
    }
}
