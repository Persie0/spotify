package p204p;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class hbz extends ibk {

    /* JADX INFO: renamed from: a */
    public Map f89632a;

    /* JADX INFO: renamed from: b */
    public Iterator f89633b;

    /* JADX INFO: renamed from: c */
    public m301 f89634c;

    /* JADX INFO: renamed from: d */
    public lsi0 f89635d;

    /* JADX INFO: renamed from: e */
    public Map f89636e;

    /* JADX INFO: renamed from: f */
    public Object f89637f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f89638g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ ibz f89639h;

    /* JADX INFO: renamed from: i */
    public int f89640i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hbz(ibz ibzVar, ibk ibkVar) {
        super(ibkVar);
        this.f89639h = ibzVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f89638g = obj;
        this.f89640i |= Integer.MIN_VALUE;
        return this.f89639h.m50221b(this);
    }
}
