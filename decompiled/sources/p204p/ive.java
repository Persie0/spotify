package p204p;

import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ive extends ibk {

    /* JADX INFO: renamed from: a */
    public Context f106201a;

    /* JADX INFO: renamed from: b */
    public List f106202b;

    /* JADX INFO: renamed from: c */
    public long f106203c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f106204d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ qve f106205e;

    /* JADX INFO: renamed from: f */
    public int f106206f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ive(qve qveVar, ibk ibkVar) {
        super(ibkVar);
        this.f106205e = qveVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f106204d = obj;
        this.f106206f |= Integer.MIN_VALUE;
        return this.f106205e.m73987l(null, null, 0L, this);
    }
}
