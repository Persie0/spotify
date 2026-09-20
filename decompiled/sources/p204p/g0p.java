package p204p;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class g0p extends ibk {

    /* JADX INFO: renamed from: a */
    public String f75403a;

    /* JADX INFO: renamed from: b */
    public Set f75404b;

    /* JADX INFO: renamed from: c */
    public Set f75405c;

    /* JADX INFO: renamed from: d */
    public Iterator f75406d;

    /* JADX INFO: renamed from: e */
    public String f75407e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f75408f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ h0p f75409g;

    /* JADX INFO: renamed from: h */
    public int f75410h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0p(h0p h0pVar, ibk ibkVar) {
        super(ibkVar);
        this.f75409g = h0pVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f75408f = obj;
        this.f75410h |= Integer.MIN_VALUE;
        return this.f75409g.m46369g(null, null, this);
    }
}
