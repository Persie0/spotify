package p204p;

import java.io.File;

/* JADX INFO: loaded from: classes8.dex */
public final class get0 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f79189a;

    /* JADX INFO: renamed from: b */
    public File f79190b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f79191c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ wvy f79192d;

    /* JADX INFO: renamed from: e */
    public int f79193e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public get0(wvy wvyVar, ibk ibkVar) {
        super(ibkVar);
        this.f79192d = wvyVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f79191c = obj;
        this.f79193e |= Integer.MIN_VALUE;
        return this.f79192d.m89166c(null, null, this);
    }
}
