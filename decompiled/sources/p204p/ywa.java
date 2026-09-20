package p204p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DiscardReason;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.LoggingData;
import com.spotify.mobius.MobiusLoop;

/* JADX INFO: loaded from: classes2.dex */
public final class ywa implements xwa {

    /* JADX INFO: renamed from: a */
    public final MobiusLoop.Builder f276929a;

    /* JADX INFO: renamed from: b */
    public final ee5 f276930b;

    /* JADX INFO: renamed from: c */
    public final ele f276931c;

    /* JADX INFO: renamed from: d */
    public final xre f276932d;

    /* JADX INFO: renamed from: e */
    public final swa f276933e;

    /* JADX INFO: renamed from: f */
    public final gza f276934f;

    /* JADX INFO: renamed from: g */
    public final hwa f276935g;

    /* JADX INFO: renamed from: h */
    public MobiusLoop f276936h;

    public ywa(MobiusLoop.Builder builder, ee5 ee5Var, ele eleVar, xre xreVar, swa swaVar, gza gzaVar, hwa hwaVar) {
        this.f276929a = builder;
        this.f276930b = ee5Var;
        this.f276931c = eleVar;
        this.f276932d = xreVar;
        this.f276933e = swaVar;
        this.f276934f = gzaVar;
        this.f276935g = hwaVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m94787a(rza rzaVar, LoggingData loggingData) {
        swa swaVar = this.f276933e;
        if (loggingData == null) {
            swaVar.m79534b(mwh0.m63060q(rzaVar), DiscardReason.ServiceStopped.INSTANCE);
        } else {
            swaVar.m79533a(mwh0.m63060q(rzaVar), loggingData, DiscardReason.ServiceStopped.INSTANCE);
        }
    }
}
