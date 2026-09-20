package p204p;

import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class nqc extends ibk {

    /* JADX INFO: renamed from: a */
    public grc f157223a;

    /* JADX INFO: renamed from: b */
    public Iterator f157224b;

    /* JADX INFO: renamed from: c */
    public String f157225c;

    /* JADX INFO: renamed from: d */
    public int f157226d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f157227e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ oqc f157228f;

    /* JADX INFO: renamed from: g */
    public int f157229g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nqc(oqc oqcVar, ibk ibkVar) {
        super(ibkVar);
        this.f157228f = oqcVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f157227e = obj;
        this.f157229g |= Integer.MIN_VALUE;
        return this.f157228f.m67630g(null, null, null, this);
    }
}
