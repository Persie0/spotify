package p204p;

import android.content.Context;
import android.os.Build;
import com.spotify.base.java.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class s9s0 {

    /* JADX INFO: renamed from: a */
    public final Context f207060a;

    public s9s0(Context context) {
        this.f207060a = context;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Enum m77591a(ibk ibkVar) {
        r9s0 r9s0Var;
        if (ibkVar instanceof r9s0) {
            r9s0Var = (r9s0) ibkVar;
            int i = r9s0Var.f197119c;
            if ((i & Integer.MIN_VALUE) != 0) {
                r9s0Var.f197119c = i - Integer.MIN_VALUE;
            } else {
                r9s0Var = new r9s0(this, ibkVar);
            }
        } else {
            r9s0Var = new r9s0(this, ibkVar);
        }
        Object objM30749h = r9s0Var.f197117a;
        int i2 = r9s0Var.f197119c;
        jie1 jie1Var = jie1.f112743a;
        try {
            if (i2 == 0) {
                bga.m29073P(objM30749h);
                if (Build.VERSION.SDK_INT < 34) {
                    return jie1Var;
                }
                bx3 bx3Var = q9s0.f186660d;
                Context context = this.f207060a;
                r9s0Var.f197119c = 1;
                objM30749h = bx3Var.m30749h(context, r9s0Var);
                yuk yukVar = yuk.f276404a;
                if (objM30749h == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM30749h);
            }
            return ((q9s0) objM30749h).m72408a().contains(o9s0.f163129a) ? jie1.f112744b : jie1.f112745c;
        } catch (Exception e) {
            Logger.m3966b("ProjectedDeviceControllerProvider", "Error creating ProjectedDeviceController", e);
            return jie1Var;
        }
    }
}
