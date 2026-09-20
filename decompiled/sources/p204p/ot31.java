package p204p;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes8.dex */
public final class ot31 extends ibk {

    /* JADX INFO: renamed from: a */
    public Iterator f168962a;

    /* JADX INFO: renamed from: b */
    public ConcurrentHashMap f168963b;

    /* JADX INFO: renamed from: c */
    public String f168964c;

    /* JADX INFO: renamed from: d */
    public int f168965d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f168966e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ qt31 f168967f;

    /* JADX INFO: renamed from: g */
    public int f168968g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ot31(qt31 qt31Var, ibk ibkVar) {
        super(ibkVar);
        this.f168967f = qt31Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f168966e = obj;
        this.f168968g |= Integer.MIN_VALUE;
        return qt31.m73790b(this.f168967f, null, this);
    }
}
