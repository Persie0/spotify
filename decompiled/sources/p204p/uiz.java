package p204p;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class uiz extends ibk {

    /* JADX INFO: renamed from: a */
    public List f230838a;

    /* JADX INFO: renamed from: b */
    public Map f230839b;

    /* JADX INFO: renamed from: c */
    public xmz f230840c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f230841d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ viz f230842e;

    /* JADX INFO: renamed from: f */
    public int f230843f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uiz(viz vizVar, ibk ibkVar) {
        super(ibkVar);
        this.f230842e = vizVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f230841d = obj;
        this.f230843f |= Integer.MIN_VALUE;
        return viz.m85672b(this.f230842e, null, null, null, this);
    }
}
