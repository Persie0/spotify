package p204p;

import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class bqc extends ibk {

    /* JADX INFO: renamed from: a */
    public pgo f29777a;

    /* JADX INFO: renamed from: b */
    public String f29778b;

    /* JADX INFO: renamed from: c */
    public Iterator f29779c;

    /* JADX INFO: renamed from: d */
    public boc f29780d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f29781e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ oqc f29782f;

    /* JADX INFO: renamed from: g */
    public int f29783g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bqc(oqc oqcVar, ibk ibkVar) {
        super(ibkVar);
        this.f29782f = oqcVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f29781e = obj;
        this.f29783g |= Integer.MIN_VALUE;
        return this.f29782f.m67625b(null, null, null, this);
    }
}
