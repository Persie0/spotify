package p204p;

import android.content.Context;
import android.os.Build;
import com.spotify.music.R;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public final class pcj0 implements ssi {

    /* JADX INFO: renamed from: a */
    public final zcp f176138a;

    /* JADX INFO: renamed from: b */
    public final iej0 f176139b;

    /* JADX INFO: renamed from: c */
    public final wcp f176140c;

    /* JADX INFO: renamed from: d */
    public final luk f176141d;

    /* JADX INFO: renamed from: e */
    public final Context f176142e;

    /* JADX INFO: renamed from: f */
    public xuk f176143f;

    /* JADX INFO: renamed from: g */
    public String f176144g;

    public pcj0(zcp zcpVar, iej0 iej0Var, wcp wcpVar, Context context, luk lukVar) {
        this.f176138a = zcpVar;
        this.f176139b = iej0Var;
        this.f176140c = wcpVar;
        this.f176141d = lukVar;
        this.f176142e = context.getApplicationContext();
        this.f176143f = dq60.m36621u(lukVar);
    }

    @Override // p204p.ssi
    /* JADX INFO: renamed from: a */
    public final void mo24869a() {
        kk40.m56680v(this.f176143f, null);
        String str = this.f176144g;
        if (str != null) {
            this.f176140c.m87750a(str);
            this.f176144g = null;
        }
    }

    @Override // p204p.ssi
    /* JADX INFO: renamed from: b */
    public final void mo24870b() {
        if (Build.VERSION.SDK_INT > 36) {
            xuk xukVarM37073v = dv9.m37073v(this.f176143f, new ccj0(this, 1));
            this.f176143f = xukVarM37073v;
            wxf1.m89255l(xukVarM37073v, b0g1.m27776L(this.f176138a.f281556b, new go3(this, null, 10)));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m69589c(ibk ibkVar) {
        ncj0 ncj0Var;
        mcj0 mcj0Var;
        if (ibkVar instanceof ncj0) {
            ncj0Var = (ncj0) ibkVar;
            int i = ncj0Var.f152528c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ncj0Var.f152528c = i - Integer.MIN_VALUE;
            } else {
                ncj0Var = new ncj0(this, ibkVar);
            }
        } else {
            ncj0Var = new ncj0(this, ibkVar);
        }
        Object objM86755t = ncj0Var.f152526a;
        int i2 = ncj0Var.f152528c;
        w2a1 w2a1Var = w2a1.f247311a;
        if (i2 == 0) {
            bga.m29073P(objM86755t);
            if (this.f176144g == null) {
                fiz fizVar = this.f176139b.f101428g;
                ncj0Var.f152528c = 1;
                objM86755t = vyf1.m86755t(fizVar, ncj0Var);
                yuk yukVar = yuk.f276404a;
                if (objM86755t == yukVar) {
                    return yukVar;
                }
            }
            return w2a1Var;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        bga.m29073P(objM86755t);
        aej0 aej0Var = (aej0) objM86755t;
        if (aej0Var instanceof ydj0) {
            ydj0 ydj0Var = (ydj0) aej0Var;
            boolean z = ydj0Var instanceof wdj0;
            Context context = this.f176142e;
            if (z) {
                mcj0Var = new mcj0(R.string.bluetooth_permission_device_picker_message_box_body, new oke0(context.getString(R.string.bluetooth_permission_device_picker_message_box_action), new ocj0(this, 1)));
            } else {
                if (!(ydj0Var instanceof xdj0)) {
                    throw new NoWhenBranchMatchedException();
                }
                mcj0Var = new mcj0(R.string.bluetooth_permission_device_picker_message_box_alert_body, new nke0(context.getString(R.string.f5861xb3e44626), new ocj0(this, 2)));
            }
            this.f176144g = this.f176140c.m87751b(new zke0(qle0.f189854e, context.getString(R.string.bluetooth_permission_device_picker_message_box_title), context.getString(mcj0Var.m61464a()), mcj0Var.m61465b(), 16), new ocj0(this, 0));
            return w2a1Var;
        }
        return w2a1Var;
    }
}
