package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class fve extends ibk {

    /* JADX INFO: renamed from: a */
    public List f73765a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f73766b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ nve f73767c;

    /* JADX INFO: renamed from: d */
    public int f73768d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fve(nve nveVar, ibk ibkVar) {
        super(ibkVar);
        this.f73767c = nveVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f73766b = obj;
        this.f73768d |= Integer.MIN_VALUE;
        return this.f73767c.m65738h(null, null, null, null, null, this);
    }
}
