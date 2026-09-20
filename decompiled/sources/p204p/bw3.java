package p204p;

import com.spotify.player.model.command.options.LoggingParams;

/* JADX INFO: loaded from: classes5.dex */
public final class bw3 extends ibk {

    /* JADX INFO: renamed from: a */
    public long f31514a;

    /* JADX INFO: renamed from: b */
    public LoggingParams f31515b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f31516c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ dw3 f31517d;

    /* JADX INFO: renamed from: e */
    public int f31518e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bw3(dw3 dw3Var, ibk ibkVar) {
        super(ibkVar);
        this.f31517d = dw3Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f31516c = obj;
        this.f31518e |= Integer.MIN_VALUE;
        return this.f31517d.m37132a(0L, null, this);
    }
}
