package p204p;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class u6s0 extends ibk {

    /* JADX INFO: renamed from: a */
    public List f227420a;

    /* JADX INFO: renamed from: b */
    public Iterator f227421b;

    /* JADX INFO: renamed from: c */
    public int f227422c;

    /* JADX INFO: renamed from: d */
    public int f227423d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f227424e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ v6s0 f227425f;

    /* JADX INFO: renamed from: g */
    public int f227426g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u6s0(v6s0 v6s0Var, ibk ibkVar) {
        super(ibkVar);
        this.f227425f = v6s0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f227424e = obj;
        this.f227426g |= Integer.MIN_VALUE;
        return this.f227425f.m84817a(null, null, null, this);
    }
}
