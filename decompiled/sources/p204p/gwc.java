package p204p;

import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class gwc extends ibk {

    /* JADX INFO: renamed from: a */
    public String f84974a;

    /* JADX INFO: renamed from: b */
    public ArrayList f84975b;

    /* JADX INFO: renamed from: c */
    public Set f84976c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f84977d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ hwc f84978e;

    /* JADX INFO: renamed from: f */
    public int f84979f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gwc(hwc hwcVar, ibk ibkVar) {
        super(ibkVar);
        this.f84978e = hwcVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f84977d = obj;
        this.f84979f |= Integer.MIN_VALUE;
        return this.f84978e.m48932d(null, null, this);
    }
}
