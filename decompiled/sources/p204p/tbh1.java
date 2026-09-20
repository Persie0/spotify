package p204p;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public final class tbh1 extends t7f1 {

    /* JADX INFO: renamed from: d */
    public final kbh1 f218857d;

    /* JADX INFO: renamed from: e */
    public final f9f1 f218858e;

    /* JADX INFO: renamed from: f */
    public final f9f1 f218859f;

    /* JADX INFO: renamed from: g */
    public final Integer f218860g;

    public tbh1(kbh1 kbh1Var, f9f1 f9f1Var, f9f1 f9f1Var2, Integer num) {
        this.f218857d = kbh1Var;
        this.f218858e = f9f1Var;
        this.f218859f = f9f1Var2;
        this.f218860g = num;
    }

    /* JADX INFO: renamed from: u */
    public static tbh1 m80395u(jbh1 jbh1Var, f9f1 f9f1Var, Integer num) throws GeneralSecurityException {
        f9f1 f9f1VarM74854a;
        String str = jbh1Var.f110807b;
        byte[] bArr = f9f1Var.f67266a;
        kbh1 kbh1Var = new kbh1(jbh1Var);
        jbh1 jbh1Var2 = jbh1.f110805f;
        if (!jbh1Var.equals(jbh1Var2) && num == null) {
            throw new GeneralSecurityException(dq60.m36618r(new StringBuilder(str.length() + 62), "For given Variant ", str, " the value of idRequirement must be non-null"));
        }
        if (jbh1Var.equals(jbh1Var2) && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (bArr.length != 32) {
            int length = bArr.length;
            throw new GeneralSecurityException(s571.m77248g(length, "Ed25519 key must be constructed with key of length 32 bytes, not ", new StringBuilder(String.valueOf(length).length() + 65)));
        }
        if (jbh1Var == jbh1Var2) {
            f9f1VarM74854a = r6h1.f196279a;
        } else if (jbh1Var == jbh1.f110803d || jbh1Var == jbh1.f110804e) {
            f9f1VarM74854a = r6h1.m74854a(num.intValue());
        } else {
            if (jbh1Var != jbh1.f110802c) {
                throw new IllegalStateException("Unknown Variant: ".concat(str));
            }
            f9f1VarM74854a = r6h1.m74855b(num.intValue());
        }
        return new tbh1(kbh1Var, f9f1Var, f9f1VarM74854a, num);
    }

    @Override // p204p.kuf1
    /* JADX INFO: renamed from: r */
    public final /* synthetic */ l1h1 mo25352r() {
        return this.f218857d;
    }

    @Override // p204p.kuf1
    /* JADX INFO: renamed from: s */
    public final Integer mo41255s() {
        return this.f218860g;
    }

    @Override // p204p.t7f1
    /* JADX INFO: renamed from: t */
    public final f9f1 mo41256t() {
        return this.f218859f;
    }
}
