package p204p;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class z130 extends AbstractC2440u5 {
    public z130() {
        super(v130.class, new yu60[]{new x130(jrb0.class)});
    }

    /* JADX INFO: renamed from: U */
    public static void m95090U(a230 a230Var) {
        if (a230Var.m24484o() < 10) {
            throw new GeneralSecurityException("tag size too small");
        }
        int iOrdinal = a230Var.m24483n().ordinal();
        if (iOrdinal == 1) {
            if (a230Var.m24484o() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (iOrdinal == 3) {
            if (a230Var.m24484o() > 32) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("unknown hash type");
            }
            if (a230Var.m24484o() > 64) {
                throw new GeneralSecurityException("tag size too big");
            }
        }
    }

    @Override // p204p.AbstractC2440u5
    /* JADX INFO: renamed from: D */
    public final AbstractC2205o8 mo57976D(fva fvaVar) {
        return v130.m84438v(fvaVar, ztx.m96955a());
    }

    @Override // p204p.AbstractC2440u5
    /* JADX INFO: renamed from: T */
    public final void mo57977T(AbstractC2205o8 abstractC2205o8) throws GeneralSecurityException {
        v130 v130Var = (v130) abstractC2205o8;
        g3b1.m43479c(v130Var.m84441t());
        if (v130Var.m84439r().size() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        m95090U(v130Var.m84440s());
    }

    @Override // p204p.AbstractC2440u5
    /* JADX INFO: renamed from: q */
    public final String mo57978q() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    @Override // p204p.AbstractC2440u5
    /* JADX INFO: renamed from: y */
    public final AbstractC1806e9 mo57979y() {
        return new y130(w130.class, 10);
    }

    @Override // p204p.AbstractC2440u5
    /* JADX INFO: renamed from: z */
    public final cu60 mo57980z() {
        return cu60.SYMMETRIC;
    }
}
