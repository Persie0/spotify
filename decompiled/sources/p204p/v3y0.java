package p204p;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public final class v3y0 extends ibk {

    /* JADX INFO: renamed from: a */
    public Collection f236975a;

    /* JADX INFO: renamed from: b */
    public Iterator f236976b;

    /* JADX INFO: renamed from: c */
    public Collection f236977c;

    /* JADX INFO: renamed from: d */
    public int f236978d;

    /* JADX INFO: renamed from: e */
    public int f236979e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f236980f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ ezw0 f236981g;

    /* JADX INFO: renamed from: h */
    public int f236982h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3y0(ezw0 ezw0Var, ibk ibkVar) {
        super(ibkVar);
        this.f236981g = ezw0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f236980f = obj;
        this.f236982h |= Integer.MIN_VALUE;
        return this.f236981g.m40424t(null, this);
    }
}
