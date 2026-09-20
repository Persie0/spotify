package p204p;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class p3p extends ibk {

    /* JADX INFO: renamed from: a */
    public Iterator f173676a;

    /* JADX INFO: renamed from: b */
    public int f173677b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f173678c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ t3p f173679d;

    /* JADX INFO: renamed from: e */
    public int f173680e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3p(t3p t3pVar, ibk ibkVar) {
        super(ibkVar);
        this.f173679d = t3pVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f173678c = obj;
        this.f173680e |= Integer.MIN_VALUE;
        return t3p.m80015c(this.f173679d, this);
    }
}
