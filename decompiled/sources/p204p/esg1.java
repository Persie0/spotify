package p204p;

import android.util.Base64;
import com.google.android.recaptcha.internal.zzhg;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.GCMParameterSpec;

/* JADX INFO: loaded from: classes.dex */
public abstract class esg1 {

    /* JADX INFO: renamed from: a */
    public final rsg1 f62386a;

    /* JADX INFO: renamed from: b */
    public final cc5 f62387b;

    /* JADX INFO: renamed from: c */
    public final String f62388c;

    /* JADX INFO: renamed from: d */
    public final obf1 f62389d;

    /* JADX INFO: renamed from: e */
    public final lsi0 f62390e = msi0.m62770a();

    /* JADX INFO: renamed from: f */
    public final int f62391f;

    /* JADX INFO: renamed from: g */
    public final int f62392g;

    /* JADX INFO: renamed from: h */
    public final int f62393h;

    /* JADX INFO: renamed from: i */
    public final int f62394i;

    public /* synthetic */ esg1(rsg1 rsg1Var, cc5 cc5Var, String str, int i, int i2, int i3, int i4, obf1 obf1Var) {
        this.f62386a = rsg1Var;
        this.f62387b = cc5Var;
        this.f62388c = str;
        this.f62391f = i;
        this.f62392g = i2;
        this.f62393h = i3;
        this.f62394i = i4;
        this.f62389d = obf1Var;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ cog1 m39907a(esg1 esg1Var) {
        return new cog1(new o8t0(esg1Var, (fbk) null, 11));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008f, code lost:
    
        if (r6.mo31437d(r5, (java.lang.String) r8, r0) == r4) goto L24;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m39908b(esg1 esg1Var, k9f1 k9f1Var, String str, ibk ibkVar) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        nrg1 nrg1Var;
        rsg1 rsg1Var;
        String str2;
        esg1Var.getClass();
        if (ibkVar instanceof nrg1) {
            nrg1Var = (nrg1) ibkVar;
            int i = nrg1Var.f157557d;
            if ((i & Integer.MIN_VALUE) != 0) {
                nrg1Var.f157557d = i - Integer.MIN_VALUE;
            } else {
                nrg1Var = new nrg1(esg1Var, ibkVar);
            }
        } else {
            nrg1Var = new nrg1(esg1Var, ibkVar);
        }
        Object obj = nrg1Var.f157555b;
        int i2 = nrg1Var.f157557d;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                str2 = nrg1Var.f157558e;
                rsg1Var = nrg1Var.f157554a;
                bga.m29073P(obj);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(obj);
        rsg1 rsg1Var2 = esg1Var.f62386a;
        String str3 = esg1Var.f62388c;
        String strValueOf = String.valueOf(str);
        nrg1Var.f157554a = rsg1Var2;
        String strConcat = str3.concat(strValueOf);
        nrg1Var.f157558e = strConcat;
        nrg1Var.f157557d = 1;
        byte[] bArrM55800d = k9f1Var.m55800d();
        cc5 cc5Var = esg1Var.f62387b;
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(1, cc5Var.m32211d());
        byte[] iv = cipher.getIV();
        byte[] bArrDoFinal = cipher.doFinal(bArrM55800d);
        wj50.m88279p(iv);
        wj50.m88279p(bArrDoFinal);
        String strEncodeToString = Base64.encodeToString(bk5.m29596S0(iv, bArrDoFinal), 8);
        if (strEncodeToString != yukVar) {
            rsg1Var = rsg1Var2;
            obj = strEncodeToString;
            str2 = strConcat;
        }
        return yukVar;
        nrg1Var.f157554a = null;
        nrg1Var.f157558e = null;
        nrg1Var.f157557d = 2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static final Object m39909c(esg1 esg1Var, String str, ibk ibkVar) throws zzhg {
        irg1 irg1Var;
        byte[] bArrDoFinal;
        esg1Var.getClass();
        zz11 zz11Var = zz11.f287823d2;
        if (ibkVar instanceof irg1) {
            irg1Var = (irg1) ibkVar;
            int i = irg1Var.f104989c;
            if ((i & Integer.MIN_VALUE) != 0) {
                irg1Var.f104989c = i - Integer.MIN_VALUE;
            } else {
                irg1Var = new irg1(esg1Var, ibkVar);
            }
        } else {
            irg1Var = new irg1(esg1Var, ibkVar);
        }
        Object objMo31436c = irg1Var.f104987a;
        int i2 = irg1Var.f104989c;
        int i3 = 8;
        yuk yukVar = yuk.f276404a;
        try {
            if (i2 == 0) {
                bga.m29073P(objMo31436c);
                rsg1 rsg1Var = esg1Var.f62386a;
                String str2 = esg1Var.f62388c;
                StringBuilder sb = new StringBuilder(str2.length() + String.valueOf(str).length());
                sb.append(str2);
                sb.append(str);
                String string = sb.toString();
                irg1Var.f104989c = 1;
                objMo31436c = rsg1Var.mo31436c(string, irg1Var);
                if (objMo31436c == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(objMo31436c);
                    return objMo31436c;
                }
                bga.m29073P(objMo31436c);
            }
            String str3 = (String) objMo31436c;
            int i4 = 12;
            laf1 laf1VarM55905a = null;
            Object[] objArr = 0;
            if (str3 == null) {
                throw new zzhg(zz11Var, zz11.f287794R1, (String) (objArr == true ? 1 : 0), i4);
            }
            irg1Var.f104989c = 2;
            cc5 cc5Var = esg1Var.f62387b;
            byte[] bArrDecode = Base64.decode(str3, 8);
            try {
                Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                cipher.init(2, cc5Var.m32211d(), new GCMParameterSpec(128, bArrDecode, 0, 12));
                bArrDoFinal = cipher.doFinal(bArrDecode, 12, bArrDecode.length - 12);
            } catch (Exception unused) {
                bArrDoFinal = null;
            }
            if (bArrDoFinal != null) {
                try {
                    laf1VarM55905a = ((kaf1) esg1Var.f62389d).m55905a(bArrDoFinal);
                } catch (Exception e) {
                    throw new zzhg(zz11Var, zz11.f287798T1, e.getMessage(), i3);
                }
            }
            return laf1VarM55905a == yukVar ? yukVar : laf1VarM55905a;
        } catch (Exception e2) {
            throw new zzhg(zz11Var, zz11.f287796S1, e2.getMessage(), i3);
        }
    }
}
