package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zv0 extends ibk {

    /* JADX INFO: renamed from: a */
    public hs21 f286570a;

    /* JADX INFO: renamed from: b */
    public Map f286571b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f286572c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ cw0 f286573d;

    /* JADX INFO: renamed from: e */
    public int f286574e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zv0(cw0 cw0Var, ibk ibkVar) {
        super(ibkVar);
        this.f286573d = cw0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f286572c = obj;
        this.f286574e |= Integer.MIN_VALUE;
        return this.f286573d.m34077d(null, null, this);
    }
}
