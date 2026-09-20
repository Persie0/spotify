package p204p;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes9.dex */
public final class wqr0 extends ibk {

    /* JADX INFO: renamed from: a */
    public ArrayList f254156a;

    /* JADX INFO: renamed from: b */
    public LinkedHashMap f254157b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f254158c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ i7k f254159d;

    /* JADX INFO: renamed from: e */
    public int f254160e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wqr0(i7k i7kVar, ibk ibkVar) {
        super(ibkVar);
        this.f254159d = i7kVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f254158c = obj;
        this.f254160e |= Integer.MIN_VALUE;
        return this.f254159d.m49869a(null, this);
    }
}
