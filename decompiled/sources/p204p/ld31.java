package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class ld31 extends ibk {

    /* JADX INFO: renamed from: a */
    public List f132041a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f132042b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ md31 f132043c;

    /* JADX INFO: renamed from: d */
    public int f132044d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ld31(md31 md31Var, ibk ibkVar) {
        super(ibkVar);
        this.f132043c = md31Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f132042b = obj;
        this.f132044d |= Integer.MIN_VALUE;
        return this.f132043c.m61506c(null, this);
    }
}
