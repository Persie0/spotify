package p204p;

import java.io.Serializable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class sg21 extends ibk {

    /* JADX INFO: renamed from: a */
    public bh21 f208688a;

    /* JADX INFO: renamed from: b */
    public Object f208689b;

    /* JADX INFO: renamed from: c */
    public Serializable f208690c;

    /* JADX INFO: renamed from: d */
    public Object f208691d;

    /* JADX INFO: renamed from: e */
    public ug21 f208692e;

    /* JADX INFO: renamed from: f */
    public Iterator f208693f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f208694g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ bh21 f208695h;

    /* JADX INFO: renamed from: i */
    public int f208696i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sg21(bh21 bh21Var, ibk ibkVar) {
        super(ibkVar);
        this.f208695h = bh21Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f208694g = obj;
        this.f208696i |= Integer.MIN_VALUE;
        return this.f208695h.m29192d(this);
    }
}
