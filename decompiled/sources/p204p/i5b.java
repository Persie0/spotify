package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class i5b extends ibk {

    /* JADX INFO: renamed from: a */
    public List f98878a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f98879b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ j5b f98880c;

    /* JADX INFO: renamed from: d */
    public int f98881d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i5b(j5b j5bVar, ibk ibkVar) {
        super(ibkVar);
        this.f98880c = j5bVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f98879b = obj;
        this.f98881d |= Integer.MIN_VALUE;
        return j5b.m52453b(this.f98880c, null, this);
    }
}
