package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class kvd0 extends ibk {

    /* JADX INFO: renamed from: a */
    public List f126833a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f126834b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ svd0 f126835c;

    /* JADX INFO: renamed from: d */
    public int f126836d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kvd0(svd0 svd0Var, ibk ibkVar) {
        super(ibkVar);
        this.f126835c = svd0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f126834b = obj;
        this.f126836d |= Integer.MIN_VALUE;
        return svd0.m79432l(this.f126835c, null, this);
    }
}
