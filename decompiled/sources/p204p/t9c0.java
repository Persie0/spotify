package p204p;

import android.content.res.Resources;
import com.comscore.streaming.ContentType;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes7.dex */
public final class t9c0 {

    /* JADX INFO: renamed from: a */
    public final k770 f218243a;

    /* JADX INFO: renamed from: b */
    public final z9j0 f218244b;

    /* JADX INFO: renamed from: c */
    public final q831 f218245c;

    /* JADX INFO: renamed from: d */
    public final Resources f218246d;

    /* JADX INFO: renamed from: e */
    public final luk f218247e;

    /* JADX INFO: renamed from: f */
    public final luk f218248f;

    public t9c0(Resources resources, luk lukVar, luk lukVar2, k770 k770Var, z9j0 z9j0Var, q831 q831Var) {
        this.f218243a = k770Var;
        this.f218244b = z9j0Var;
        this.f218245c = q831Var;
        this.f218246d = resources;
        this.f218247e = lukVar;
        this.f218248f = lukVar2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: a */
    public static final Object m80276a(t9c0 t9c0Var, String str, z5c0 z5c0Var, lcc1 lcc1Var, eh00 eh00Var, ibk ibkVar) {
        s9c0 s9c0Var;
        lcc1 lcc1Var2;
        lcc1 lcc1Var3;
        if (ibkVar instanceof s9c0) {
            s9c0Var = (s9c0) ibkVar;
            int i = s9c0Var.f206925d;
            if ((i & Integer.MIN_VALUE) != 0) {
                s9c0Var.f206925d = i - Integer.MIN_VALUE;
            } else {
                s9c0Var = new s9c0(t9c0Var, ibkVar);
            }
        } else {
            s9c0Var = new s9c0(t9c0Var, ibkVar);
        }
        Object obj = s9c0Var.f206923b;
        int i2 = s9c0Var.f206925d;
        try {
            if (i2 == 0) {
                bga.m29073P(obj);
                try {
                    k770 k770Var = t9c0Var.f218243a;
                    C1940hk c1940hk = new C1940hk(null, null, (msb1) eh00Var.invoke(), null, null, null, null, ContentType.USER_GENERATED_LIVE);
                    lcc1Var2 = lcc1Var;
                    try {
                        s9c0Var.f206922a = lcc1Var2;
                        s9c0Var.f206925d = 1;
                        Object objM55635b = k770Var.m55635b(str, z5c0Var, c1940hk, s9c0Var);
                        yuk yukVar = yuk.f276404a;
                        if (objM55635b == yukVar) {
                            return yukVar;
                        }
                        lcc1Var3 = lcc1Var2;
                    } catch (Exception unused) {
                        return new v9c0(lcc1Var2, false);
                    }
                } catch (Exception unused2) {
                    lcc1Var2 = lcc1Var;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                lcc1Var3 = s9c0Var.f206922a;
                try {
                    bga.m29073P(obj);
                } catch (Exception unused3) {
                    lcc1Var2 = lcc1Var3;
                    return new v9c0(lcc1Var2, false);
                }
            }
            return new v9c0(lcc1Var3, true);
        } catch (CancellationException e) {
            throw e;
        }
    }
}
