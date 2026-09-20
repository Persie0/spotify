package p204p;

import android.content.Context;
import com.google.firebase.encoders.EncodingException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class bpg1 implements dog1 {

    /* JADX INFO: renamed from: a */
    public final gr70 f29452a;

    /* JADX INFO: renamed from: b */
    public final yng1 f29453b;

    public bpg1(Context context, yng1 yng1Var) {
        this.f29453b = yng1Var;
        nva nvaVar = nva.f158847e;
        id91.m50309b(context);
        gd91 gd91VarM50310c = id91.m50308a().m50310c(nvaVar);
        if (nva.f158846d.contains(new keu("json"))) {
            new gr70(new xog1(gd91VarM50310c, 0));
        }
        this.f29452a = new gr70(new xog1(gd91VarM50310c, 1));
    }

    @Override // p204p.dog1
    /* JADX INFO: renamed from: a */
    public final void mo30116a(red1 red1Var) {
        yng1 yng1Var = this.f29453b;
        yng1Var.getClass();
        hd91 hd91Var = (hd91) this.f29452a.get();
        yng1Var.getClass();
        alr0 alr0Var = alr0.f16963Z0;
        f7d1 f7d1Var = (f7d1) red1Var.f198348b;
        ((mqw0) red1Var.f198349c).f146375i = false;
        mqw0 mqw0Var = (mqw0) red1Var.f198349c;
        mqw0Var.f146373g = Boolean.FALSE;
        f7d1Var.f66658b = new elg1(mqw0Var);
        try {
            opg1.m67527a();
            qeg1 qeg1Var = new qeg1(f7d1Var);
            f7d1 f7d1Var2 = new f7d1();
            alr0Var.m26366b(f7d1Var2);
            HashMap map = new HashMap((HashMap) f7d1Var2.f66658b);
            HashMap map2 = new HashMap((HashMap) f7d1Var2.f66659c);
            bdf1 bdf1Var = (bdf1) f7d1Var2.f66660d;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                xdf1 xdf1Var = new xdf1(byteArrayOutputStream, map, map2, bdf1Var);
                amk0 amk0Var = (amk0) map.get(qeg1.class);
                if (amk0Var == null) {
                    throw new EncodingException("No encoder for ".concat(String.valueOf(qeg1.class)));
                }
                amk0Var.mo24360a(qeg1Var, xdf1Var);
                hd91Var.m47180b(new s08(null, byteArrayOutputStream.toByteArray(), ler0.f132670b));
            } catch (IOException unused) {
            }
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }
}
