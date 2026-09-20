package p204p;

import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.voiceassistants.playermodels.PlayContextWrapper;
import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: classes11.dex */
public final class iea0 {

    /* JADX INFO: renamed from: d */
    public static final PlayOrigin f101355d;

    /* JADX INFO: renamed from: a */
    public final Flowable f101356a;

    /* JADX INFO: renamed from: b */
    public final qrq0 f101357b;

    /* JADX INFO: renamed from: c */
    public final xzx f101358c;

    static {
        PlayOrigin.Builder builder = PlayOrigin.builder("external-integration-service");
        th50 th50Var = uh50.f230369a;
        f101355d = builder.referrerIdentifier("external-integration-service").build();
    }

    public iea0(Flowable flowable, qrq0 qrq0Var, xzx xzxVar) {
        this.f101356a = flowable;
        this.f101357b = qrq0Var;
        this.f101358c = xzxVar;
    }

    /* JADX INFO: renamed from: a */
    public static LoggingParams m50371a(PlayContextWrapper playContextWrapper, String str) {
        xul0 xul0VarCommandId;
        String str2;
        LoggingParams.Builder builder = LoggingParams.builder();
        LoggingParams loggingParams = playContextWrapper.getLoggingParams();
        String str3 = "";
        if (loggingParams != null && (xul0VarCommandId = loggingParams.commandId()) != null && (str2 = (String) xul0VarCommandId.mo49280e("")) != null) {
            str3 = str2;
        }
        if (str != null) {
            builder.interactionId(str);
        }
        if (str3.length() > 0) {
            builder.commandId(str3);
        }
        return builder.build();
    }
}
