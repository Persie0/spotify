package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class nh30 extends ibk {

    /* JADX INFO: renamed from: a */
    public Map f153850a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f153851b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ mqr f153852c;

    /* JADX INFO: renamed from: d */
    public int f153853d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nh30(mqr mqrVar, ibk ibkVar) {
        super(ibkVar);
        this.f153852c = mqrVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f153851b = obj;
        this.f153853d |= Integer.MIN_VALUE;
        return this.f153852c.m62583b(null, this);
    }
}
