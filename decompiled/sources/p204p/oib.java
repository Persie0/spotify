package p204p;

import android.content.Intent;

/* JADX INFO: loaded from: classes5.dex */
public final class oib extends ibk {

    /* JADX INFO: renamed from: a */
    public Intent f165750a;

    /* JADX INFO: renamed from: b */
    public String f165751b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f165752c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ rib f165753d;

    /* JADX INFO: renamed from: e */
    public int f165754e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oib(rib ribVar, ibk ibkVar) {
        super(ibkVar);
        this.f165753d = ribVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f165752c = obj;
        this.f165754e |= Integer.MIN_VALUE;
        return rib.m75583c(this.f165753d, null, this);
    }
}
