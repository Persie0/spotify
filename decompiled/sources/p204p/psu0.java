package p204p;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class psu0 extends ibk {

    /* JADX INFO: renamed from: a */
    public Iterator f180963a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f180964b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ qsu0 f180965c;

    /* JADX INFO: renamed from: d */
    public int f180966d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public psu0(qsu0 qsu0Var, ibk ibkVar) {
        super(ibkVar);
        this.f180965c = qsu0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f180964b = obj;
        this.f180966d |= Integer.MIN_VALUE;
        return this.f180965c.m73760a(this);
    }
}
