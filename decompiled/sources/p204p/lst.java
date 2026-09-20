package p204p;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class lst extends ibk {

    /* JADX INFO: renamed from: a */
    public Collection f136599a;

    /* JADX INFO: renamed from: b */
    public Iterator f136600b;

    /* JADX INFO: renamed from: c */
    public axx f136601c;

    /* JADX INFO: renamed from: d */
    public int f136602d;

    /* JADX INFO: renamed from: e */
    public int f136603e;

    /* JADX INFO: renamed from: f */
    public int f136604f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f136605g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ mst f136606h;

    /* JADX INFO: renamed from: i */
    public int f136607i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lst(mst mstVar, ibk ibkVar) {
        super(ibkVar);
        this.f136606h = mstVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f136605g = obj;
        this.f136607i |= Integer.MIN_VALUE;
        return this.f136606h.m62778b(null, this);
    }
}
