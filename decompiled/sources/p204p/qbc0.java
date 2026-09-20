package p204p;

import android.net.Uri;
import java.io.ByteArrayInputStream;

/* JADX INFO: loaded from: classes5.dex */
public final class qbc0 {

    /* JADX INFO: renamed from: a */
    public final bsa f187061a;

    /* JADX INFO: renamed from: b */
    public final phj0 f187062b;

    /* JADX INFO: renamed from: c */
    public final o89 f187063c;

    public qbc0(bsa bsaVar, phj0 phj0Var, o89 o89Var) {
        this.f187061a = bsaVar;
        this.f187062b = phj0Var;
        this.f187063c = o89Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m72491a(String str, ibk ibkVar) throws Throwable {
        pbc0 pbc0Var;
        String str2;
        if (ibkVar instanceof pbc0) {
            pbc0Var = (pbc0) ibkVar;
            int i = pbc0Var.f175773d;
            if ((i & Integer.MIN_VALUE) != 0) {
                pbc0Var.f175773d = i - Integer.MIN_VALUE;
            } else {
                pbc0Var = new pbc0(this, ibkVar);
            }
        } else {
            pbc0Var = new pbc0(this, ibkVar);
        }
        Object obj = pbc0Var.f175771b;
        int i2 = pbc0Var.f175773d;
        fbk fbkVar = null;
        if (i2 == 0) {
            bga.m29073P(obj);
            String strM29801l0 = bm51.m29801l0(bm51.m29801l0(this.f187063c.m66420a().f151438a.f14315b, "{type}", "json"), "{source_id}", str);
            pbc0Var.f175770a = strM29801l0;
            pbc0Var.f175773d = 1;
            phj0 phj0Var = this.f187062b;
            Object objM89557A = x0h1.m89557A(phj0Var.f177672a, new qff0(phj0Var, str, fbkVar, 14), pbc0Var);
            yuk yukVar = yuk.f276404a;
            if (objM89557A == yukVar) {
                return yukVar;
            }
            obj = objM89557A;
            str2 = strM29801l0;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = pbc0Var.f175770a;
            bga.m29073P(obj);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr == null) {
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            bsa bsaVar = this.f187061a;
            Uri.parse(str2);
            nd41 nd41VarM30402f0 = bsaVar.m30402f0(byteArrayInputStream);
            byteArrayInputStream.close();
            return nd41VarM30402f0;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                n0e1.m63430g(byteArrayInputStream, th);
                throw th2;
            }
        }
    }
}
