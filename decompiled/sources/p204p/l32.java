package p204p;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* JADX INFO: loaded from: classes4.dex */
public final class l32 extends AbstractC2440u5 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f129182e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l32(Class cls, yu60[] yu60VarArr, int i) {
        super(cls, yu60VarArr);
        this.f129182e = i;
    }

    /* JADX INFO: renamed from: U */
    public static final i2v m57963U() {
        e42 e42VarM40701o = f42.m40701o();
        e42VarM40701o.m60484d();
        f42.m40700m((f42) e42VarM40701o.f138791b);
        f42 f42Var = (f42) e42VarM40701o.m60482b();
        new l32(3);
        return i2v.m49504u("type.googleapis.com/google.crypto.tink.AesGcmKey", f42Var.m66414c());
    }

    /* JADX INFO: renamed from: V */
    public static final i2v m57964V() {
        n42 n42VarM66226o = o42.m66226o();
        n42VarM66226o.m60484d();
        o42.m66225m((o42) n42VarM66226o.f138791b);
        o42 o42Var = (o42) n42VarM66226o.m60482b();
        new l32(5);
        return i2v.m49504u("type.googleapis.com/google.crypto.tink.AesSivKey", o42Var.m66414c());
    }

    /* JADX INFO: renamed from: W */
    public static void m57965W() {
        int i = 0;
        qsv0.m73767f(new l32(g32.class, new yu60[]{new j32(jrb0.class, i)}, i), true);
    }

    /* JADX INFO: renamed from: X */
    public static void m57966X() {
        int i = 1;
        qsv0.m73767f(new l32(o32.class, new yu60[]{new j32(a32.class, i)}, i), true);
    }

    /* JADX INFO: renamed from: Y */
    public static void m57967Y() {
        qsv0.m73767f(new l32(y32.class, new yu60[]{new j32(a32.class, 3)}, 2), true);
    }

    /* JADX INFO: renamed from: Z */
    public static void m57968Z() {
        qsv0.m73767f(new l32(3), true);
    }

    /* JADX INFO: renamed from: a0 */
    public static void m57969a0() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            qsv0.m73767f(new l32(i42.class, new yu60[]{new j32(a32.class, 5)}, 4), true);
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
        }
    }

    /* JADX INFO: renamed from: b0 */
    public static void m57970b0() {
        qsv0.m73767f(new l32(5), true);
    }

    /* JADX INFO: renamed from: c0 */
    public static void m57971c0() {
        qsv0.m73767f(new l32(xic.class, new yu60[]{new j32(a32.class, 7)}, 6), true);
    }

    /* JADX INFO: renamed from: d0 */
    public static void m57972d0() {
        qsv0.m73767f(new l32(j970.class, new yu60[]{new j32(a32.class, 8)}, 7), true);
    }

    /* JADX INFO: renamed from: e0 */
    public static void m57973e0() {
        qsv0.m73767f(new l32(o970.class, new yu60[]{new j32(a32.class, 9)}, 8), true);
    }

    /* JADX INFO: renamed from: f0 */
    public static void m57974f0() {
        qsv0.m73767f(new l32(ufe1.class, new yu60[]{new j32(a32.class, 10)}, 9), true);
    }

    /* JADX INFO: renamed from: g0 */
    public static void m57975g0(m32 m32Var) throws GeneralSecurityException {
        if (m32Var.m60624n() < 10) {
            throw new GeneralSecurityException("tag size too short");
        }
        if (m32Var.m60624n() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    @Override // p204p.AbstractC2440u5
    /* JADX INFO: renamed from: D */
    public final AbstractC2205o8 mo57976D(fva fvaVar) {
        switch (this.f129182e) {
            case 0:
                return g32.m43426u(fvaVar, ztx.m96955a());
            case 1:
                return o32.m66174u(fvaVar, ztx.m96955a());
            case 2:
                return y32.m92721u(fvaVar, ztx.m96955a());
            case 3:
                return d42.m34902r(fvaVar, ztx.m96955a());
            case 4:
                return i42.m49638s(fvaVar, ztx.m96955a());
            case 5:
                return m42.m60756r(fvaVar, ztx.m96955a());
            case 6:
                return xic.m91113s(fvaVar, ztx.m96955a());
            case 7:
                return j970.m52735s(fvaVar, ztx.m96955a());
            case 8:
                return o970.m66450s(fvaVar, ztx.m96955a());
            default:
                return ufe1.m82992s(fvaVar, ztx.m96955a());
        }
    }

    @Override // p204p.AbstractC2440u5
    /* JADX INFO: renamed from: T */
    public final void mo57977T(AbstractC2205o8 abstractC2205o8) throws GeneralSecurityException {
        switch (this.f129182e) {
            case 0:
                g32 g32Var = (g32) abstractC2205o8;
                g3b1.m43479c(g32Var.m43429s());
                if (g32Var.m43427q().size() != 32) {
                    throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
                }
                m57975g0(g32Var.m43428r());
                return;
            case 1:
                o32 o32Var = (o32) abstractC2205o8;
                g3b1.m43479c(o32Var.m66177s());
                yu60[] yu60VarArr = {new j32(on40.class, 2)};
                HashMap map = new HashMap();
                yu60 yu60Var = yu60VarArr[0];
                Class cls = yu60Var.f276278a;
                if (map.containsKey(cls)) {
                    throw new IllegalArgumentException(dq60.m36611k(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                }
                map.put(cls, yu60Var);
                Class cls2 = yu60VarArr[0].f276278a;
                Collections.unmodifiableMap(map);
                t32 t32VarM66175q = o32Var.m66175q();
                g3b1.m43479c(t32VarM66175q.m79951s());
                g3b1.m43477a(t32VarM66175q.m79949q().size());
                v32 v32VarM79950r = t32VarM66175q.m79950r();
                if (v32VarM79950r.m84530n() < 12 || v32VarM79950r.m84530n() > 16) {
                    throw new GeneralSecurityException("invalid IV size");
                }
                yu60[] yu60VarArr2 = {new x130(jrb0.class)};
                HashMap map2 = new HashMap();
                yu60 yu60Var2 = yu60VarArr2[0];
                Class cls3 = yu60Var2.f276278a;
                if (map2.containsKey(cls3)) {
                    throw new IllegalArgumentException(dq60.m36611k(cls3, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                }
                map2.put(cls3, yu60Var2);
                Class cls4 = yu60VarArr2[0].f276278a;
                Collections.unmodifiableMap(map2);
                v130 v130VarM66176r = o32Var.m66176r();
                g3b1.m43479c(v130VarM66176r.m84441t());
                if (v130VarM66176r.m84439r().size() < 16) {
                    throw new GeneralSecurityException("key too short");
                }
                z130.m95090U(v130VarM66176r.m84440s());
                return;
            case 2:
                y32 y32Var = (y32) abstractC2205o8;
                g3b1.m43479c(y32Var.m92724s());
                g3b1.m43477a(y32Var.m92722q().size());
                if (y32Var.m92723r().m24658n() != 12 && y32Var.m92723r().m24658n() != 16) {
                    throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
                }
                return;
            case 3:
                d42 d42Var = (d42) abstractC2205o8;
                g3b1.m43479c(d42Var.m34904p());
                g3b1.m43477a(d42Var.m34903o().size());
                return;
            case 4:
                i42 i42Var = (i42) abstractC2205o8;
                g3b1.m43479c(i42Var.m49640q());
                g3b1.m43477a(i42Var.m49639p().size());
                return;
            case 5:
                m42 m42Var = (m42) abstractC2205o8;
                g3b1.m43479c(m42Var.m60758p());
                if (m42Var.m60757o().size() == 64) {
                    return;
                }
                throw new InvalidKeyException("invalid key size: " + m42Var.m60757o().size() + ". Valid keys must have 64 bytes.");
            case 6:
                xic xicVar = (xic) abstractC2205o8;
                g3b1.m43479c(xicVar.m91115q());
                if (xicVar.m91114p().size() != 32) {
                    throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
                }
                return;
            case 7:
                g3b1.m43479c(((j970) abstractC2205o8).m52737q());
                return;
            case 8:
                g3b1.m43479c(((o970) abstractC2205o8).m66452q());
                return;
            default:
                ufe1 ufe1Var = (ufe1) abstractC2205o8;
                g3b1.m43479c(ufe1Var.m82994q());
                if (ufe1Var.m82993p().size() != 32) {
                    throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
                }
                return;
        }
    }

    @Override // p204p.AbstractC2440u5
    /* JADX INFO: renamed from: q */
    public final String mo57978q() {
        switch (this.f129182e) {
            case 0:
                return "type.googleapis.com/google.crypto.tink.AesCmacKey";
            case 1:
                return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
            case 2:
                return "type.googleapis.com/google.crypto.tink.AesEaxKey";
            case 3:
                return "type.googleapis.com/google.crypto.tink.AesGcmKey";
            case 4:
                return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
            case 5:
                return "type.googleapis.com/google.crypto.tink.AesSivKey";
            case 6:
                return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
            case 7:
                return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
            case 8:
                return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
            default:
                return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
        }
    }

    @Override // p204p.AbstractC2440u5
    /* JADX INFO: renamed from: y */
    public final AbstractC1806e9 mo57979y() {
        switch (this.f129182e) {
            case 0:
                return new k32(i32.class);
            case 1:
                return new k32(this);
            case 2:
                return new k32(this, (byte) 0);
            case 3:
                return new k32(this, (char) 0);
            case 4:
                return new k32(this, 0);
            case 5:
                return new k32(this, (short) 0);
            case 6:
                return new k32(this, (byte) 0, false);
            case 7:
                return new k32(this, (byte) 0, (byte) 0);
            case 8:
                return new k32(this, (byte) 0, (char) 0);
            default:
                return new k32(this, (byte) 0, 0);
        }
    }

    @Override // p204p.AbstractC2440u5
    /* JADX INFO: renamed from: z */
    public final cu60 mo57980z() {
        switch (this.f129182e) {
            case 0:
                return cu60.SYMMETRIC;
            case 1:
                return cu60.SYMMETRIC;
            case 2:
                return cu60.SYMMETRIC;
            case 3:
                return cu60.SYMMETRIC;
            case 4:
                return cu60.SYMMETRIC;
            case 5:
                return cu60.SYMMETRIC;
            case 6:
                return cu60.SYMMETRIC;
            case 7:
                return cu60.REMOTE;
            case 8:
                return cu60.REMOTE;
            default:
                return cu60.SYMMETRIC;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l32(int i) {
        super(d42.class, new yu60[]{new j32(a32.class, 4)});
        this.f129182e = i;
        switch (i) {
            case 5:
                super(m42.class, new yu60[]{new j32(r4r.class, 6)});
                break;
            default:
                break;
        }
    }
}
