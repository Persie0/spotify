package p204p;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class z791 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f280137a;

    /* JADX INFO: renamed from: b */
    public b791 f280138b;

    /* JADX INFO: renamed from: c */
    public Iterator f280139c;

    /* JADX INFO: renamed from: d */
    public int f280140d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f280141e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ i8z f280142f;

    /* JADX INFO: renamed from: g */
    public int f280143g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z791(i8z i8zVar, ibk ibkVar) {
        super(ibkVar);
        this.f280142f = i8zVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f280141e = obj;
        this.f280143g |= Integer.MIN_VALUE;
        return this.f280142f.m49964a(null, null, this);
    }
}
