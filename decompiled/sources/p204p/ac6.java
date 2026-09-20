package p204p;

import com.spotify.base.java.logging.Logger;
import com.spotify.voiceassistants.errorhandler.NotAuthenticatedException;
import com.spotify.voiceassistants.playermodels.ExplicitContentForbiddenException;
import com.spotify.voiceassistants.playermodels.MetadataItem;
import com.spotify.voiceassistants.playermodels.MetadataItemKt;
import com.spotify.voiceassistants.playermodels.NoContentException;
import com.spotify.voiceassistants.playermodels.VoiceAssistantLoggingContext;
import java.util.concurrent.TimeoutException;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes2.dex */
public final class ac6 {

    /* JADX INFO: renamed from: a */
    public final qzx f14268a;

    /* JADX INFO: renamed from: b */
    public final z1a f14269b;

    public ac6(qzx qzxVar, z1a z1aVar) {
        this.f14268a = qzxVar;
        this.f14269b = z1aVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m25438a(VoiceAssistantLoggingContext voiceAssistantLoggingContext, Throwable th, String str) {
        String string;
        hps hpsVar;
        if (th != null) {
            Logger.m3967c(th, "Exception thrown during player operation", new Object[0]);
        }
        String packageId = voiceAssistantLoggingContext.getPackageId();
        String requestedUri = voiceAssistantLoggingContext.getRequestedUri();
        if (th == null || (string = th.getMessage()) == null) {
            string = th != null ? th.toString() : "Playback failed";
        }
        this.f14269b.m95097c(new dc6(packageId, requestedUri, string, voiceAssistantLoggingContext.getInteractionId(), 2, str, voiceAssistantLoggingContext.getUserId()));
        if (th instanceof ExplicitContentForbiddenException) {
            hpsVar = hps.f93837d;
        } else if (th instanceof NoContentException) {
            hpsVar = hps.f93839f;
        } else {
            hpsVar = (th != null && (th instanceof HttpException) && ((HttpException) th).f288164a == 503) ? hps.f93843j : hps.f93844k;
        }
        this.f14268a.m74357a(hpsVar);
    }

    /* JADX INFO: renamed from: b */
    public final void m25439b(MetadataItem metadataItem, VoiceAssistantLoggingContext voiceAssistantLoggingContext, String str) {
        String error;
        String error2;
        hps hpsVar = hps.f93840g;
        boolean z = metadataItem instanceof MetadataItem.Error;
        if (z && (error2 = ((MetadataItem.Error) metadataItem).getError()) != null) {
            if (error2.equals(MetadataItemKt.ERROR_EXPLICIT_CONTENT)) {
                hpsVar = hps.f93837d;
            } else if (error2.equals(MetadataItemKt.ERROR_NO_CONTENT)) {
                hpsVar = hps.f93839f;
            }
        }
        String packageId = voiceAssistantLoggingContext.getPackageId();
        String requestedUri = voiceAssistantLoggingContext.getRequestedUri();
        MetadataItem.Error error3 = z ? (MetadataItem.Error) metadataItem : null;
        if (error3 == null || (error = error3.getError()) == null) {
            error = "Search failed with metadata";
        }
        this.f14269b.m95097c(new dc6(packageId, requestedUri, error, voiceAssistantLoggingContext.getInteractionId(), 1, str, voiceAssistantLoggingContext.getUserId()));
        this.f14268a.m74357a(hpsVar);
    }

    /* JADX INFO: renamed from: c */
    public final void m25440c(VoiceAssistantLoggingContext voiceAssistantLoggingContext) {
        this.f14269b.m95097c(new dc6(voiceAssistantLoggingContext.getPackageId(), voiceAssistantLoggingContext.getRequestedUri(), "Search failed", voiceAssistantLoggingContext.getInteractionId(), 1, null, voiceAssistantLoggingContext.getUserId()));
        this.f14268a.m74357a(hps.f93840g);
    }

    /* JADX INFO: renamed from: d */
    public final void m25441d(Throwable th, VoiceAssistantLoggingContext voiceAssistantLoggingContext) {
        int i;
        hps hpsVar;
        Logger.m3967c(th, "Exception thrown during search", new Object[0]);
        boolean z = th instanceof NotAuthenticatedException;
        if (z) {
            i = 3;
        } else if (th instanceof TimeoutException) {
            i = 4;
        } else {
            i = ((th instanceof ExplicitContentForbiddenException) || (th instanceof NoContentException)) ? 1 : 6;
        }
        int i2 = i;
        String packageId = voiceAssistantLoggingContext.getPackageId();
        String requestedUri = voiceAssistantLoggingContext.getRequestedUri();
        String message = th.getMessage();
        if (message == null) {
            message = th.toString();
        }
        this.f14269b.m95097c(new dc6(packageId, requestedUri, message, voiceAssistantLoggingContext.getInteractionId(), i2, null, voiceAssistantLoggingContext.getUserId()));
        if (z) {
            hpsVar = hps.f93838e;
        } else if (th instanceof ExplicitContentForbiddenException) {
            hpsVar = hps.f93837d;
        } else if (th instanceof NoContentException) {
            hpsVar = hps.f93839f;
        } else {
            hpsVar = ((th instanceof HttpException) && ((HttpException) th).f288164a == 503) ? hps.f93843j : hps.f93840g;
        }
        this.f14268a.m74357a(hpsVar);
    }
}
