package p204p;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class n1a0 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final o9i0 f149378a;

    /* JADX INFO: renamed from: b */
    public final i2v f149379b;

    /* JADX INFO: renamed from: c */
    public final boolean f149380c;

    public n1a0(o9i0 o9i0Var, i2v i2vVar, ezk0 ezk0Var, th4 th4Var) {
        this.f149378a = o9i0Var;
        this.f149379b = i2vVar;
        this.f149380c = th4Var.m80826a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p204p.gh00
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(fbk fbkVar) throws NoSuchAlgorithmException, InvalidKeyException {
        m1a0 m1a0Var;
        if (fbkVar instanceof m1a0) {
            m1a0Var = (m1a0) fbkVar;
            int i = m1a0Var.f138912c;
            if ((i & Integer.MIN_VALUE) != 0) {
                m1a0Var.f138912c = i - Integer.MIN_VALUE;
            } else {
                m1a0Var = new m1a0(this, fbkVar);
            }
        } else {
            m1a0Var = new m1a0(this, fbkVar);
        }
        Object objM66475b = m1a0Var.f138910a;
        int i2 = m1a0Var.f138912c;
        if (i2 == 0) {
            bga.m29073P(objM66475b);
            m1a0Var.f138912c = 1;
            objM66475b = this.f149378a.m66475b(this.f149380c, m1a0Var);
            yuk yukVar = yuk.f276404a;
            if (objM66475b == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM66475b);
        }
        kp41 kp41Var = (kp41) objM66475b;
        jp41 jp41Var = kp41Var.f124978c;
        ArrayList arrayList = kp41Var.f124977b;
        String str = kp41Var.f124976a;
        if (jp41Var == null) {
            return new ibb1(str, arrayList);
        }
        String str2 = jp41Var.f114565b;
        String str3 = jp41Var.f114564a;
        int i3 = jp41Var.f114566c;
        if (i3 <= 0) {
            throw new IllegalArgumentException("Time step must be positive");
        }
        long jCurrentTimeMillis = (System.currentTimeMillis() / 1000) / ((long) i3);
        return new hbb1(str, arrayList, new gbb1(str3, str2, i3), this.f149379b.m49525w(jCurrentTimeMillis, str3, str2), jCurrentTimeMillis);
    }
}
