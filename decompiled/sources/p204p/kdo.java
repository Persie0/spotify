package p204p;

import io.reactivex.rxjava3.core.Single;
import java.util.Collections;

/* JADX INFO: loaded from: classes10.dex */
public final class kdo implements v5m {

    /* JADX INFO: renamed from: a */
    public final lqi0 f121703a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ as5 f121704b;

    public kdo(lqi0 lqi0Var, as5 as5Var) {
        this.f121704b = as5Var;
        this.f121703a = lqi0Var;
    }

    @Override // p204p.v5m
    /* JADX INFO: renamed from: a */
    public final xv41 mo38766a() {
        return this.f121703a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // p204p.v5m
    /* JADX INFO: renamed from: b */
    public final Object mo38767b(String str, ibk ibkVar) {
        jdo jdoVar;
        if (ibkVar instanceof jdo) {
            jdoVar = (jdo) ibkVar;
            int i = jdoVar.f111377c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jdoVar.f111377c = i - Integer.MIN_VALUE;
            } else {
                jdoVar = new jdo(this, ibkVar);
            }
        } else {
            jdoVar = new jdo(this, ibkVar);
        }
        Object objM96567o = jdoVar.f111375a;
        int i2 = jdoVar.f111377c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM96567o);
                Single singleM63880c = ((n93) this.f121704b.f19303f).m63880c(Collections.singletonList(str), "", "", ((z4m) ((zv41) this.f121703a).getValue()).f279296a.contains(str), new f93(31, null));
                jdoVar.f111377c = 1;
                objM96567o = zn91.m96567o(singleM63880c, jdoVar);
                yuk yukVar = yuk.f276404a;
                if (objM96567o == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM96567o);
            }
        } catch (Throwable unused) {
        }
        return w2a1.f247311a;
    }
}
