package p204p;

import android.content.Context;
import com.spotify.music.R;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes9.dex */
public final class g0c0 implements xq50 {

    /* JADX INFO: renamed from: a */
    public final Context f75333a;

    /* JADX INFO: renamed from: b */
    public final qcx0 f75334b;

    /* JADX INFO: renamed from: c */
    public final hc80 f75335c;

    /* JADX INFO: renamed from: d */
    public final q831 f75336d;

    /* JADX INFO: renamed from: e */
    public final k5k0 f75337e;

    /* JADX INFO: renamed from: f */
    public final yz80 f75338f;

    /* JADX INFO: renamed from: g */
    public final xug0 f75339g;

    public g0c0(Context context, d67 d67Var, qcx0 qcx0Var, hc80 hc80Var, q831 q831Var, k5k0 k5k0Var, yz80 yz80Var, xug0 xug0Var) {
        this.f75333a = context;
        this.f75334b = qcx0Var;
        this.f75335c = hc80Var;
        this.f75336d = q831Var;
        this.f75337e = k5k0Var;
        this.f75338f = yz80Var;
        this.f75339g = xug0Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: g */
    public static final Object m43284g(g0c0 g0c0Var, nnp0 nnp0Var, boolean z, ibk ibkVar) {
        e0c0 e0c0Var;
        if (ibkVar instanceof e0c0) {
            e0c0Var = (e0c0) ibkVar;
            int i = e0c0Var.f54940c;
            if ((i & Integer.MIN_VALUE) != 0) {
                e0c0Var.f54940c = i - Integer.MIN_VALUE;
            } else {
                e0c0Var = new e0c0(g0c0Var, ibkVar);
            }
        } else {
            e0c0Var = new e0c0(g0c0Var, ibkVar);
        }
        e0c0 e0c0Var2 = e0c0Var;
        Object objM72573c = e0c0Var2.f54938a;
        int i2 = e0c0Var2.f54940c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM72573c);
                List list = nnp0Var.f156470b.f122153f;
                if (list.isEmpty()) {
                    throw new IllegalArgumentException("Missing member in members list.");
                }
                qla1 qla1Var = ((i8e0) list.get(0)).f99764a;
                String str = nnp0Var.f156470b.f122148a;
                f0c0 f0c0Var = new f0c0(g0c0Var, qla1Var, nnp0Var, z, str, z ? lnn0.f135187f : lnn0.f135185d, null);
                int i3 = z ? R.string.playlist_participants_try_again_dialog_body_make_collaborator : R.string.playlist_participants_try_again_dialog_body_remove_collaborator;
                qcx0 qcx0Var = g0c0Var.f75334b;
                rf1 rf1Var = new rf1(z, g0c0Var, str, qla1Var, 17);
                e0c0Var2.f54940c = 1;
                objM72573c = qcx0Var.m72573c(i3, f0c0Var, rf1Var, pwv0.f182118N0, e0c0Var2);
                yuk yukVar = yuk.f276404a;
                if (objM72573c == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM72573c);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
        }
        return w2a1.f247311a;
    }

    /* JADX INFO: renamed from: h */
    public static final void m43285h(g0c0 g0c0Var, qla1 qla1Var, String str, boolean z) {
        g0c0Var.getClass();
        g0c0Var.f75336d.m72305j(new g631(null, g0c0Var.f75333a.getString(z ? R.string.playlist_participants_snackbar_is_now_collaborator : R.string.playlist_participants_snackbar_is_no_longer_a_collaborator, qla1Var.f189809h, str), null, null, null, null, null, null, false));
    }

    /* JADX INFO: renamed from: i */
    public static boolean m43286i(nnp0 nnp0Var) {
        kfe0 kfe0Var = nnp0Var.f156470b;
        List list = kfe0Var.f122151d.f156644h.f116556b;
        lnn0 lnn0Var = lnn0.f135187f;
        if (list.contains(lnn0Var)) {
            List list2 = kfe0Var.f122153f;
            if (list2.isEmpty()) {
                throw new IllegalArgumentException("Missing member in members list.");
            }
            if (((i8e0) list2.get(0)).f99769f != lnn0Var) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m43287j(nnp0 nnp0Var) {
        kfe0 kfe0Var = nnp0Var.f156470b;
        if (kfe0Var.f122151d.f156644h.f116556b.contains(lnn0.f135185d)) {
            List list = kfe0Var.f122153f;
            if (list.isEmpty()) {
                throw new IllegalArgumentException("Missing member in members list.");
            }
            if (((i8e0) list.get(0)).f99769f == lnn0.f135187f) {
                return true;
            }
        }
        return false;
    }

    @Override // p204p.xq50
    /* JADX INFO: renamed from: a */
    public final void mo43288a(nnp0 nnp0Var, d850 d850Var) {
        List list = nnp0Var.f156470b.f122153f;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Missing member in members list.");
        }
        x0h1.m89578u(l5h1.m58232p(this.f75335c.getLifecycle()), null, 0, new hj1(this, nnp0Var, ((i8e0) list.get(0)).f99769f == lnn0.f135187f, (fbk) null, 22), 3);
    }

    @Override // p204p.xq50
    /* JADX INFO: renamed from: c */
    public final d5k mo43289c(nnp0 nnp0Var) {
        kfe0 kfe0Var = nnp0Var.f156470b;
        List list = kfe0Var.f122153f;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Missing member in members list.");
        }
        i8e0 i8e0Var = (i8e0) list.get(0);
        String str = i8e0Var.f99764a.f189802a;
        return new d5k(new x740(this, nnp0Var, str, 27), new d0c0(i8e0Var.f99769f == lnn0.f135187f, kfe0Var.f122148a, str));
    }

    @Override // p204p.xq50
    public final d3h1 category() {
        return new v4k(2);
    }

    @Override // p204p.xq50
    /* JADX INFO: renamed from: d */
    public final int mo43290d(nnp0 nnp0Var) {
        if (m43286i(nnp0Var)) {
            return R.string.playlist_participants_context_menu_make_collaborator;
        }
        if (m43287j(nnp0Var)) {
            return R.string.playlist_participants_context_menu_remove_as_collaborator;
        }
        throw new IllegalArgumentException("Neither possible to make contributor or remove contributor");
    }

    @Override // p204p.xq50
    /* JADX INFO: renamed from: e */
    public final wwu mo43291e(nnp0 nnp0Var) {
        return wmu.f252977c;
    }

    @Override // p204p.xq50
    /* JADX INFO: renamed from: f */
    public final boolean mo43292f(nnp0 nnp0Var) {
        if (chg1.m32787s(nnp0Var)) {
            return m43286i(nnp0Var) || m43287j(nnp0Var);
        }
        return false;
    }

    @Override // p204p.xq50
    /* JADX INFO: renamed from: id */
    public final String mo43293id() {
        return "playlist_collaboration_make_collaborator";
    }
}
