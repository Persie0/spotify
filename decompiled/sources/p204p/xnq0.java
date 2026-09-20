package p204p;

import com.spotify.premiumdestination.destination.mobius.domain.JsonException;
import com.spotify.premiumdestination.destination.mobius.domain.MappingException;
import com.spotify.premiumdestination.destination.mobius.domain.TransformerException;
import com.squareup.moshi.JsonDataException;

/* JADX INFO: loaded from: classes9.dex */
public final class xnq0 {
    /* JADX INFO: renamed from: a */
    public static final znq0 m91513a(Throwable th) {
        if ((th instanceof JsonException) || (th instanceof JsonDataException)) {
            return new znq0(5);
        }
        if (th instanceof MappingException) {
            return new znq0(6);
        }
        return th instanceof TransformerException ? new znq0(7) : new znq0(2);
    }

    /* JADX INFO: renamed from: b */
    public static final nt30 m91514b(hk60 hk60Var, String str) throws JsonException {
        try {
            nt30 nt30Var = (nt30) hk60Var.fromJson(str);
            if (nt30Var != null) {
                return nt30Var;
            }
            throw new JsonDataException("Couldn't serialize HubsViewModel from json = " + str);
        } catch (Exception e) {
            throw new JsonException(e);
        }
    }
}
