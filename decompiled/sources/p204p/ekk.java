package p204p;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class ekk extends ibk {

    /* JADX INFO: renamed from: a */
    public List f60462a;

    /* JADX INFO: renamed from: b */
    public List f60463b;

    /* JADX INFO: renamed from: c */
    public Map f60464c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f60465d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ suj f60466e;

    /* JADX INFO: renamed from: f */
    public int f60467f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ekk(suj sujVar, ibk ibkVar) {
        super(ibkVar);
        this.f60466e = sujVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f60465d = obj;
        this.f60467f |= Integer.MIN_VALUE;
        return this.f60466e.m79395g(null, this);
    }
}
