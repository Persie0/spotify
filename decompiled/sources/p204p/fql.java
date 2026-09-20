package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class fql extends ibk {

    /* JADX INFO: renamed from: a */
    public List f72228a;

    /* JADX INFO: renamed from: b */
    public List f72229b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f72230c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ d5f f72231d;

    /* JADX INFO: renamed from: e */
    public int f72232e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fql(d5f d5fVar, ibk ibkVar) {
        super(ibkVar);
        this.f72231d = d5fVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f72230c = obj;
        this.f72232e |= Integer.MIN_VALUE;
        return d5f.m34984f(this.f72231d, null, null, this);
    }
}
