package p204p;

import android.content.Context;
import com.spotify.music.R;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes2.dex */
public final class mjw0 implements xq50 {

    /* JADX INFO: renamed from: a */
    public final Context f144403a;

    /* JADX INFO: renamed from: b */
    public final hc80 f144404b;

    /* JADX INFO: renamed from: c */
    public final qcx0 f144405c;

    /* JADX INFO: renamed from: d */
    public final q831 f144406d;

    /* JADX INFO: renamed from: e */
    public final k5k0 f144407e;

    /* JADX INFO: renamed from: f */
    public final yz80 f144408f;

    /* JADX INFO: renamed from: g */
    public final xug0 f144409g;

    public mjw0(Context context, hc80 hc80Var, qcx0 qcx0Var, q831 q831Var, k5k0 k5k0Var, yz80 yz80Var, xug0 xug0Var) {
        this.f144403a = context;
        this.f144404b = hc80Var;
        this.f144405c = qcx0Var;
        this.f144406d = q831Var;
        this.f144407e = k5k0Var;
        this.f144408f = yz80Var;
        this.f144409g = xug0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    public static final Object m61995g(mjw0 mjw0Var, nnp0 nnp0Var, ibk ibkVar) {
        ljw0 ljw0Var;
        if (ibkVar instanceof ljw0) {
            ljw0Var = (ljw0) ibkVar;
            int i = ljw0Var.f134159c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ljw0Var.f134159c = i - Integer.MIN_VALUE;
            } else {
                ljw0Var = new ljw0(mjw0Var, ibkVar);
            }
        } else {
            ljw0Var = new ljw0(mjw0Var, ibkVar);
        }
        Object objM72572b = ljw0Var.f134157a;
        int i2 = ljw0Var.f134159c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM72572b);
                qla1 qla1VarM49945a = chg1.m32784p(nnp0Var).m49945a();
                String str = nnp0Var.f156470b.f122148a;
                vpc vpcVar = new vpc(mjw0Var, qla1VarM49945a, nnp0Var, str, null);
                qcx0 qcx0Var = mjw0Var.f144405c;
                dcq0 dcq0Var = new dcq0(mjw0Var, str, qla1VarM49945a, 29);
                ljw0Var.f134159c = 1;
                objM72572b = qcx0Var.m72572b(vpcVar, dcq0Var, ljw0Var);
                yuk yukVar = yuk.f276404a;
                if (objM72572b == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM72572b);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
        }
        return w2a1.f247311a;
    }

    /* JADX INFO: renamed from: h */
    public static final void m61996h(mjw0 mjw0Var, qla1 qla1Var, String str) {
        mjw0Var.f144406d.m72305j(t0j.m79825f(mjw0Var.f144403a.getString(R.string.playlist_participants_snackbar_removed_user, qla1Var.f189809h, str)).m52392q());
    }

    @Override // p204p.xq50
    /* JADX INFO: renamed from: a */
    public final void mo43288a(nnp0 nnp0Var, d850 d850Var) {
        x0h1.m89578u(n5h1.m63737m(this.f144404b), null, 0, new blv0(this, nnp0Var, null, 12), 3);
    }

    @Override // p204p.xq50
    /* JADX INFO: renamed from: c */
    public final d5k mo43289c(nnp0 nnp0Var) {
        String str = chg1.m32784p(nnp0Var).m49945a().f189802a;
        return new d5k(new dcq0(this, nnp0Var, str, 28), new C2026js(nnp0Var.f156470b.f122148a, str, 21));
    }

    @Override // p204p.xq50
    public final d3h1 category() {
        return new v4k(3);
    }

    @Override // p204p.xq50
    /* JADX INFO: renamed from: d */
    public final int mo43290d(nnp0 nnp0Var) {
        return R.string.playlist_participants_context_menu_remove_user;
    }

    @Override // p204p.xq50
    /* JADX INFO: renamed from: e */
    public final wwu mo43291e(nnp0 nnp0Var) {
        return tnu.f222077c;
    }

    @Override // p204p.xq50
    /* JADX INFO: renamed from: f */
    public final boolean mo43292f(nnp0 nnp0Var) {
        return chg1.m32787s(nnp0Var) && nnp0Var.f156470b.f122151d.f156646t;
    }

    @Override // p204p.xq50
    /* JADX INFO: renamed from: id */
    public final String mo43293id() {
        return "playlist_collaboration_remove_user";
    }
}
