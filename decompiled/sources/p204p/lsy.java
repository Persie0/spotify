package p204p;

import com.spotify.ucs.proto.p168v0.EnumC1312h;
import com.spotify.ucs.proto.p168v0.EnumC1314j;
import com.spotify.ucs.proto.p168v0.UcsResponseWrapper;

/* JADX INFO: loaded from: classes10.dex */
public abstract class lsy {
    /* JADX INFO: renamed from: a */
    public static qsy m59849a(UcsResponseWrapper.UcsResponse ucsResponse) {
        return (ucsResponse.m21888u() == EnumC1314j.RESOLVE_ERROR || ucsResponse.m21884p() == EnumC1312h.ACCOUNT_ATTRIBUTES_ERROR) ? msy.f146877a : osy.f168917a;
    }
}
