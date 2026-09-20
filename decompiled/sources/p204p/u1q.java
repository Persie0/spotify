package p204p;

import java.security.GeneralSecurityException;
import java.text.SimpleDateFormat;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes11.dex */
public final class u1q extends ThreadLocal {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f225879a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f225880b;

    public /* synthetic */ u1q(Object obj, int i) {
        this.f225879a = i;
        this.f225880b = obj;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f225879a) {
            case 0:
                return new SimpleDateFormat("MMM yyyy", bga.m29060C(((v1q) this.f225880b).f236437a.getResources().getConfiguration()).m53164b(0));
            case 1:
                t0h1 t0h1Var = (t0h1) this.f225880b;
                try {
                    Mac mac = (Mac) a9v.f13646f.m25166a((String) t0h1Var.f215891d);
                    mac.init((SecretKeySpec) t0h1Var.f215892e);
                    return mac;
                } catch (GeneralSecurityException e) {
                    throw new IllegalStateException(e);
                }
            default:
                return new SimpleDateFormat("MMM yyyy", bga.m29060C(((qvt0) this.f225880b).f193098a.getResources().getConfiguration()).m53164b(0));
        }
    }
}
