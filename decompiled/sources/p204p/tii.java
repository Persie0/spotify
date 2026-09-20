package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class tii extends ibk {

    /* JADX INFO: renamed from: a */
    public List f220687a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f220688b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vii f220689c;

    /* JADX INFO: renamed from: d */
    public int f220690d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tii(vii viiVar, ibk ibkVar) {
        super(ibkVar);
        this.f220689c = viiVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f220688b = obj;
        this.f220690d |= Integer.MIN_VALUE;
        return this.f220689c.m85668b(null, this);
    }
}
