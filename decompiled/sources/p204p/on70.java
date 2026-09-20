package p204p;

import android.content.Context;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public final class on70 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ xuk f167173a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kqi0 f167174b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kqi0 f167175c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Context f167176d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ long f167177e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ kqi0 f167178f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ egm0 f167179g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ xre f167180h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public on70(xuk xukVar, kqi0 kqi0Var, kqi0 kqi0Var2, Context context, long j, kqi0 kqi0Var3, egm0 egm0Var, xre xreVar) {
        super(1);
        this.f167173a = xukVar;
        this.f167174b = kqi0Var;
        this.f167175c = kqi0Var2;
        this.f167176d = context;
        this.f167177e = j;
        this.f167178f = kqi0Var3;
        this.f167179g = egm0Var;
        this.f167180h = xreVar;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        hwb hwbVar = (hwb) obj;
        if (hwbVar instanceof gwb) {
            x0h1.m89578u(this.f167173a, null, 0, new q43(this.f167176d, hwbVar, this.f167177e, this.f167178f, this.f167179g, this.f167180h, null, 4), 3);
        } else if (hwbVar.equals(ewb.f63490a)) {
            this.f167174b.setValue(Boolean.TRUE);
        } else if (hwbVar.equals(fwb.f74038a)) {
            this.f167175c.setValue(Boolean.TRUE);
        } else if (!hwbVar.equals(dwb.f53662a)) {
            throw new NoWhenBranchMatchedException();
        }
        return w2a1.f247311a;
    }
}
