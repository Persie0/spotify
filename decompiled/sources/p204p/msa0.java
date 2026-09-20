package p204p;

import com.spotify.player.model.command.options.LoggingParams;

/* JADX INFO: loaded from: classes2.dex */
public final class msa0 {

    /* JADX INFO: renamed from: a */
    public final xre f146741a;

    public msa0(xre xreVar) {
        this.f146741a = xreVar;
    }

    /* JADX INFO: renamed from: a */
    public final LoggingParams m62706a(xul0 xul0Var) {
        xul0 xul0VarMo49284i = xul0Var.mo49284i(new ovx(this, 2));
        LoggingParams.Builder builder = LoggingParams.EMPTY.toBuilder();
        ((wy3) this.f146741a).getClass();
        return (LoggingParams) xul0VarMo49284i.mo49280e(builder.commandInitiatedTime(Long.valueOf(System.currentTimeMillis())).build());
    }
}
