package p204p;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class q3p extends ibk {

    /* JADX INFO: renamed from: a */
    public Set f184908a;

    /* JADX INFO: renamed from: b */
    public List f184909b;

    /* JADX INFO: renamed from: c */
    public Iterator f184910c;

    /* JADX INFO: renamed from: d */
    public int f184911d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f184912e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ t3p f184913f;

    /* JADX INFO: renamed from: g */
    public int f184914g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3p(t3p t3pVar, ibk ibkVar) {
        super(ibkVar);
        this.f184913f = t3pVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f184912e = obj;
        this.f184914g |= Integer.MIN_VALUE;
        return this.f184913f.m80016d(null, this);
    }
}
