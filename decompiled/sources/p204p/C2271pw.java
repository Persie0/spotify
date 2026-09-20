package p204p;

import java.io.IOException;
import kotlinx.serialization.SerializationException;

/* JADX INFO: renamed from: p.pw */
/* JADX INFO: loaded from: classes18.dex */
public final class C2271pw {

    /* JADX INFO: renamed from: a */
    public final fk60 f181870a;

    public C2271pw(fk60 fk60Var) {
        this.f181870a = fk60Var;
    }

    /* JADX INFO: renamed from: a */
    public final C1993iw m71207a(String str) throws IOException {
        try {
            return C2315qv.m73956a((C2230ow) this.f181870a.m41880a(str, C2230ow.Companion.serializer()));
        } catch (SerializationException e) {
            throw new IOException("Failed to deserialize AccountSwitchingUserInfo", e);
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m71208b(C1993iw c1993iw) {
        try {
            C2230ow c2230owM73957b = C2315qv.m73957b(c1993iw);
            if (c2230owM73957b != null) {
                return this.f181870a.m41881b(C2230ow.Companion.serializer(), c2230owM73957b);
            }
            return null;
        } catch (SerializationException e) {
            throw new IOException("Failed to serialize AccountSwitchingUserInfo", e);
        }
    }
}
