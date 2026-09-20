package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class s0a0 extends ibk {

    /* JADX INFO: renamed from: a */
    public List f204333a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f204334b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wpx f204335c;

    /* JADX INFO: renamed from: d */
    public int f204336d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0a0(wpx wpxVar, ibk ibkVar) {
        super(ibkVar);
        this.f204335c = wpxVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f204334b = obj;
        this.f204336d |= Integer.MIN_VALUE;
        return wpx.m88725a(this.f204335c, null, this);
    }
}
