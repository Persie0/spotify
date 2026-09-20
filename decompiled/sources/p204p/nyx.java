package p204p;

import android.util.Base64;
import com.spotify.externalintegration.http.ExternalIntegrationRequestModel;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes6.dex */
public abstract class nyx {
    /* JADX INFO: renamed from: a */
    public static final String m65912a(ExternalIntegrationRequestModel externalIntegrationRequestModel) {
        return wl51.m88491o1(new String(Base64.encode(new p0i0.C2237b().m68713e().m68703c(ExternalIntegrationRequestModel.class).toJson(externalIntegrationRequestModel).getBytes(StandardCharsets.UTF_8), 10), vuc.f244913a)).toString();
    }
}
