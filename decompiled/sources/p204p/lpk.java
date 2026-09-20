package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class lpk extends ibk {

    /* JADX INFO: renamed from: a */
    public List f135786a;

    /* JADX INFO: renamed from: b */
    public List f135787b;

    /* JADX INFO: renamed from: c */
    public int f135788c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f135789d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ n6i f135790e;

    /* JADX INFO: renamed from: f */
    public int f135791f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lpk(n6i n6iVar, ibk ibkVar) {
        super(ibkVar);
        this.f135790e = n6iVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f135789d = obj;
        this.f135791f |= Integer.MIN_VALUE;
        return this.f135790e.m63778h(this);
    }
}
