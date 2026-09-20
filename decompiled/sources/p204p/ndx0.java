package p204p;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class ndx0 extends ibk {

    /* JADX INFO: renamed from: a */
    public an1 f152857a;

    /* JADX INFO: renamed from: b */
    public rlv0 f152858b;

    /* JADX INFO: renamed from: c */
    public Iterator f152859c;

    /* JADX INFO: renamed from: d */
    public int f152860d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f152861e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ g4b f152862f;

    /* JADX INFO: renamed from: g */
    public int f152863g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ndx0(g4b g4bVar, ibk ibkVar) {
        super(ibkVar);
        this.f152862f = g4bVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f152861e = obj;
        this.f152863g |= Integer.MIN_VALUE;
        return this.f152862f.m43523a(null, this);
    }
}
