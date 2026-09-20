package p204p;

import android.app.Application;
import com.ravelin.core.model.DeviceId;

/* JADX INFO: loaded from: classes3.dex */
public final class hve extends ibk {

    /* JADX INFO: renamed from: a */
    public Application f95690a;

    /* JADX INFO: renamed from: b */
    public DeviceId f95691b;

    /* JADX INFO: renamed from: c */
    public long f95692c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f95693d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ nve f95694e;

    /* JADX INFO: renamed from: f */
    public int f95695f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hve(nve nveVar, ibk ibkVar) {
        super(ibkVar);
        this.f95694e = nveVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f95693d = obj;
        this.f95695f |= Integer.MIN_VALUE;
        return this.f95694e.m65737g(null, null, null, null, null, null, null, this);
    }
}
