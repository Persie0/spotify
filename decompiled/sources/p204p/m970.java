package p204p;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Map;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
public final class m970 implements a32 {

    /* JADX INFO: renamed from: c */
    public static final byte[] f141214c = new byte[0];

    /* JADX INFO: renamed from: a */
    public final uu60 f141215a;

    /* JADX INFO: renamed from: b */
    public final y94 f141216b;

    public m970(uu60 uu60Var, y94 y94Var) {
        this.f141215a = uu60Var;
        this.f141216b = y94Var;
    }

    @Override // p204p.a32
    /* JADX INFO: renamed from: a */
    public final byte[] mo24592a(byte[] bArr, byte[] bArr2) {
        AbstractC2205o8 abstractC2205o8;
        uu60 uu60Var = this.f141215a;
        Logger logger = qsv0.f192222a;
        synchronized (qsv0.class) {
            try {
                AbstractC2440u5 abstractC2440u5 = qsv0.m73763b(uu60Var.m83973r()).f180994a;
                Class clsM82374k = abstractC2440u5.m82374k();
                if (!((Map) abstractC2440u5.f226862c).keySet().contains(clsM82374k) && !Void.class.equals(clsM82374k)) {
                    throw new IllegalArgumentException("Given internalKeyMananger " + abstractC2440u5.toString() + " does not support primitive class " + clsM82374k.getName());
                }
                if (!((Boolean) qsv0.f192225d.get(uu60Var.m83973r())).booleanValue()) {
                    throw new GeneralSecurityException("newKey-operation not permitted for key type " + uu60Var.m83973r());
                }
                fva fvaVarM83974s = uu60Var.m83974s();
                try {
                    AbstractC1806e9 abstractC1806e9Mo57979y = abstractC2440u5.mo57979y();
                    AbstractC2205o8 abstractC2205o8Mo38178t1 = abstractC1806e9Mo57979y.mo38178t1(fvaVarM83974s);
                    abstractC1806e9Mo57979y.mo38147E1(abstractC2205o8Mo38178t1);
                    abstractC2205o8 = (AbstractC2205o8) abstractC1806e9Mo57979y.mo38154R0(abstractC2205o8Mo38178t1);
                } catch (InvalidProtocolBufferException e) {
                    throw new GeneralSecurityException("Failures parsing proto of type ".concat(((Class) abstractC2440u5.mo57979y().f57320b).getName()), e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        byte[] bArrM66414c = abstractC2205o8.m66414c();
        byte[] bArrMo24592a = this.f141216b.mo24592a(bArrM66414c, f141214c);
        byte[] bArrMo24592a2 = ((a32) qsv0.m73764c(this.f141215a.m83973r(), bArrM66414c)).mo24592a(bArr, bArr2);
        return ByteBuffer.allocate(bArrMo24592a.length + 4 + bArrMo24592a2.length).putInt(bArrMo24592a.length).put(bArrMo24592a).put(bArrMo24592a2).array();
    }

    @Override // p204p.a32
    /* JADX INFO: renamed from: b */
    public final byte[] mo24593b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            int i = byteBufferWrap.getInt();
            if (i <= 0 || i > bArr.length - 4) {
                throw new GeneralSecurityException("invalid ciphertext");
            }
            byte[] bArr3 = new byte[i];
            byteBufferWrap.get(bArr3, 0, i);
            byte[] bArr4 = new byte[byteBufferWrap.remaining()];
            byteBufferWrap.get(bArr4, 0, byteBufferWrap.remaining());
            return ((a32) qsv0.m73764c(this.f141215a.m83973r(), this.f141216b.mo24593b(bArr3, f141214c))).mo24593b(bArr4, bArr2);
        } catch (IndexOutOfBoundsException e) {
            e = e;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (NegativeArraySizeException e2) {
            e = e2;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (BufferUnderflowException e3) {
            e = e3;
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }
}
