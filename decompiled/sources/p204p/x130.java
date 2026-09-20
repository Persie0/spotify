package p204p;

import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class x130 extends yu60 {
    @Override // p204p.yu60
    /* JADX INFO: renamed from: a */
    public final Object mo52247a(AbstractC2205o8 abstractC2205o8) throws GeneralSecurityException {
        v130 v130Var = (v130) abstractC2205o8;
        sd20 sd20VarM24483n = v130Var.m84440s().m24483n();
        SecretKeySpec secretKeySpec = new SecretKeySpec(v130Var.m84439r().m42777i(), "HMAC");
        int iM24484o = v130Var.m84440s().m24484o();
        int iOrdinal = sd20VarM24483n.ordinal();
        if (iOrdinal == 1) {
            return new mdr0(new t0h1("HMACSHA1", secretKeySpec), iM24484o);
        }
        if (iOrdinal == 3) {
            return new mdr0(new t0h1("HMACSHA256", secretKeySpec), iM24484o);
        }
        if (iOrdinal == 4) {
            return new mdr0(new t0h1("HMACSHA512", secretKeySpec), iM24484o);
        }
        throw new GeneralSecurityException("unknown hash");
    }
}
