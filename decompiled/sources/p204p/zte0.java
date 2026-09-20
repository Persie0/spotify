package p204p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.LoggingData;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.Message;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zte0 {
    /* JADX INFO: renamed from: a */
    public abstract v2a1 mo79239a();

    /* JADX INFO: renamed from: b */
    public final LoggingData m96906b() {
        if (this instanceof tte0) {
            return null;
        }
        if (this instanceof ste0) {
            return mwh0.m63052i(((ste0) this).f213897b);
        }
        if (this instanceof xte0) {
            return mwh0.m63052i(((xte0) this).f265856b);
        }
        if (this instanceof wte0) {
            return mwh0.m63052i(((wte0) this).m88916d());
        }
        if (this instanceof ute0) {
            Message message = ((ute0) this).f233903b;
            if (message != null) {
                return mwh0.m63052i(message);
            }
            return null;
        }
        if (this instanceof vte0) {
            return mwh0.m63052i(((vte0) this).f244624b);
        }
        if (this instanceof yte0) {
            return mwh0.m63052i(((yte0) this).f276109b);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: c */
    public final Message m96907c() {
        if (this instanceof tte0) {
            return null;
        }
        if (this instanceof ste0) {
            return ((ste0) this).f213897b;
        }
        if (this instanceof xte0) {
            return ((xte0) this).f265856b;
        }
        if (this instanceof wte0) {
            return ((wte0) this).m88916d();
        }
        if (this instanceof ute0) {
            return ((ute0) this).f233903b;
        }
        if (this instanceof vte0) {
            return ((vte0) this).f244624b;
        }
        if (this instanceof yte0) {
            return ((yte0) this).f276109b;
        }
        throw new NoWhenBranchMatchedException();
    }
}
