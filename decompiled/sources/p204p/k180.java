package p204p;

import android.content.Context;
import com.spotify.music.R;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes9.dex */
public final class k180 implements xq50 {

    /* JADX INFO: renamed from: a */
    public final Context f118243a;

    /* JADX INFO: renamed from: b */
    public final z9j0 f118244b;

    /* JADX INFO: renamed from: c */
    public final qcx0 f118245c;

    /* JADX INFO: renamed from: d */
    public final hc80 f118246d;

    /* JADX INFO: renamed from: e */
    public final q831 f118247e;

    /* JADX INFO: renamed from: f */
    public final yz80 f118248f;

    /* JADX INFO: renamed from: g */
    public final k5k0 f118249g;

    /* JADX INFO: renamed from: h */
    public final jh10 f118250h;

    /* JADX INFO: renamed from: i */
    public final xug0 f118251i;

    public k180(Context context, z9j0 z9j0Var, qcx0 qcx0Var, hc80 hc80Var, q831 q831Var, yz80 yz80Var, k5k0 k5k0Var, jh10 jh10Var, xug0 xug0Var) {
        this.f118243a = context;
        this.f118244b = z9j0Var;
        this.f118245c = qcx0Var;
        this.f118246d = hc80Var;
        this.f118247e = q831Var;
        this.f118248f = yz80Var;
        this.f118249g = k5k0Var;
        this.f118250h = jh10Var;
        this.f118251i = xug0Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: g */
    public static final Object m55050g(k180 k180Var, nnp0 nnp0Var, ibk ibkVar) {
        i180 i180Var;
        if (ibkVar instanceof i180) {
            i180Var = (i180) ibkVar;
            int i = i180Var.f97440c;
            if ((i & Integer.MIN_VALUE) != 0) {
                i180Var.f97440c = i - Integer.MIN_VALUE;
            } else {
                i180Var = new i180(k180Var, ibkVar);
            }
        } else {
            i180Var = new i180(k180Var, ibkVar);
        }
        i180 i180Var2 = i180Var;
        Object objM72573c = i180Var2.f97438a;
        int i2 = i180Var2.f97440c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM72573c);
                List list = nnp0Var.f156470b.f122153f;
                if (list.isEmpty()) {
                    throw new IllegalArgumentException("Missing member in members list.");
                }
                qla1 qla1Var = ((i8e0) list.get(0)).f99764a;
                String str = nnp0Var.f156470b.f122148a;
                j180 j180Var = new j180(k180Var, nnp0Var, qla1Var, str, null);
                qcx0 qcx0Var = k180Var.f118245c;
                x740 x740Var = new x740(k180Var, str, qla1Var, 11);
                i180Var2.f97440c = 1;
                objM72573c = qcx0Var.m72573c(R.string.playlist_participants_try_again_dialog_body_leave, j180Var, x740Var, pwv0.f182118N0, i180Var2);
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
    public static final void m55051h(k180 k180Var, String str) {
        k180Var.f118247e.m72305j(new g631(null, k180Var.f118243a.getString(R.string.playlist_participants_snackbar_left_playlist, str), null, null, null, null, null, null, false));
    }

    @Override // p204p.xq50
    /* JADX INFO: renamed from: a */
    public final void mo43288a(nnp0 nnp0Var, d850 d850Var) {
        int i;
        Context context = this.f118243a;
        String string = context.getString(R.string.playlist_participants_leave_dialog_title);
        kfe0 kfe0Var = nnp0Var.f156470b;
        if (kfe0Var.f122152e == lnn0.f135184c) {
            i = R.string.playlist_participants_leave_dialog_body_private;
        } else {
            i = kfe0Var.f122151d.f156638b ? R.string.playlist_participants_leave_dialog_body_public_when_contributor : R.string.playlist_participants_leave_dialog_body_public;
        }
        ih10 ih10VarM31832a0 = c95.m31832a0(this.f118250h.f112309a, string, context.getString(i));
        String string2 = context.getString(R.string.playlist_participants_leave_dialog_positive);
        ja5 ja5Var = new ja5(13, this, nnp0Var);
        ih10VarM31832a0.f102113a = string2;
        ih10VarM31832a0.f102115c = ja5Var;
        String string3 = context.getString(R.string.playlist_participants_leave_dialog_negative);
        nmb nmbVar = new nmb(this, 17);
        ih10VarM31832a0.f102114b = string3;
        ih10VarM31832a0.f102116d = nmbVar;
        ih10VarM31832a0.m50574b().m58942b();
    }

    @Override // p204p.xq50
    /* JADX INFO: renamed from: b */
    public final int mo55052b(nnp0 nnp0Var) {
        return 1;
    }

    @Override // p204p.xq50
    /* JADX INFO: renamed from: c */
    public final d5k mo43289c(nnp0 nnp0Var) {
        return new d5k(new ne30(22, nnp0Var, this), dm70.f50443R0);
    }

    @Override // p204p.xq50
    public final d3h1 category() {
        return new v4k(3);
    }

    @Override // p204p.xq50
    /* JADX INFO: renamed from: d */
    public final int mo43290d(nnp0 nnp0Var) {
        return R.string.playlist_participants_context_menu_leave_playlist;
    }

    @Override // p204p.xq50
    /* JADX INFO: renamed from: e */
    public final wwu mo43291e(nnp0 nnp0Var) {
        return tnu.f222077c;
    }

    @Override // p204p.xq50
    /* JADX INFO: renamed from: f */
    public final boolean mo43292f(nnp0 nnp0Var) {
        String str = nnp0Var.f156471c;
        kfe0 kfe0Var = nnp0Var.f156470b;
        List list = kfe0Var.f122153f;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Missing member in members list.");
        }
        return wj50.m88271j(str, ((i8e0) list.get(0)).f99764a.f189803b) && kfe0Var.f122151d.f156645i;
    }

    @Override // p204p.xq50
    /* JADX INFO: renamed from: id */
    public final String mo43293id() {
        return "playlist_collaboration_leave_playlist";
    }
}
