package p204p;

import android.app.Activity;
import com.spotify.music.R;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes9.dex */
public final class owz implements xq50 {

    /* JADX INFO: renamed from: a */
    public final Activity f170804a;

    /* JADX INFO: renamed from: b */
    public final qcx0 f170805b;

    /* JADX INFO: renamed from: c */
    public final ivz f170806c;

    /* JADX INFO: renamed from: d */
    public final hc80 f170807d;

    /* JADX INFO: renamed from: e */
    public final q831 f170808e;

    /* JADX INFO: renamed from: f */
    public final k5k0 f170809f;

    /* JADX INFO: renamed from: g */
    public final xug0 f170810g;

    public owz(Activity activity, qcx0 qcx0Var, ivz ivzVar, lwz lwzVar, hc80 hc80Var, q831 q831Var, k5k0 k5k0Var, xug0 xug0Var) {
        this.f170804a = activity;
        this.f170805b = qcx0Var;
        this.f170806c = ivzVar;
        this.f170807d = hc80Var;
        this.f170808e = q831Var;
        this.f170809f = k5k0Var;
        this.f170810g = xug0Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: g */
    public static final Object m68190g(owz owzVar, nnp0 nnp0Var, boolean z, ibk ibkVar) {
        mwz mwzVar;
        if (ibkVar instanceof mwz) {
            mwzVar = (mwz) ibkVar;
            int i = mwzVar.f147903c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mwzVar.f147903c = i - Integer.MIN_VALUE;
            } else {
                mwzVar = new mwz(owzVar, ibkVar);
            }
        } else {
            mwzVar = new mwz(owzVar, ibkVar);
        }
        mwz mwzVar2 = mwzVar;
        Object objM72573c = mwzVar2.f147901a;
        int i2 = mwzVar2.f147903c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM72573c);
                List list = nnp0Var.f156470b.f122153f;
                if (list.isEmpty()) {
                    throw new IllegalArgumentException("Missing member in members list.");
                }
                qla1 qla1Var = ((i8e0) list.get(0)).f99764a;
                String str = nnp0Var.f156470b.f122148a;
                nwz nwzVar = new nwz(owzVar, qla1Var, z, str, null);
                int i3 = z ? R.string.playlist_participants_try_again_dialog_body_follow_user : R.string.playlist_participants_try_again_dialog_body_unfollow_user;
                qcx0 qcx0Var = owzVar.f170805b;
                rf1 rf1Var = new rf1(z, owzVar, str, qla1Var, 11);
                mwzVar2.f147903c = 1;
                objM72573c = qcx0Var.m72573c(i3, nwzVar, rf1Var, pwv0.f182118N0, mwzVar2);
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
    public static final void m68191h(owz owzVar, qla1 qla1Var, boolean z) {
        owzVar.getClass();
        owzVar.f170808e.m72305j(new g631(null, owzVar.f170804a.getString(z ? R.string.playlist_participants_snackbar_is_now_following_user : R.string.playlist_participants_snackbar_is_no_longer_following_user, qla1Var.f189809h), null, null, null, null, null, null, false));
    }

    @Override // p204p.xq50
    /* JADX INFO: renamed from: a */
    public final void mo43288a(nnp0 nnp0Var, d850 d850Var) {
        List list = nnp0Var.f156470b.f122153f;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Missing member in members list.");
        }
        x0h1.m89578u(l5h1.m58232p(this.f170807d.getLifecycle()), null, 0, new hj1(this, nnp0Var, ((i8e0) list.get(0)).f99768e == f8e0.f66964c, (fbk) null, 17), 3);
    }

    @Override // p204p.xq50
    /* JADX INFO: renamed from: b */
    public final int mo55052b(nnp0 nnp0Var) {
        List list = nnp0Var.f156470b.f122153f;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Missing member in members list.");
        }
        int iOrdinal = ((i8e0) list.get(0)).f99768e.ordinal();
        if (iOrdinal == 1) {
            return 1;
        }
        if (iOrdinal == 2) {
            return 2;
        }
        throw new IllegalArgumentException("Neither followable or unfollowable");
    }

    @Override // p204p.xq50
    /* JADX INFO: renamed from: c */
    public final d5k mo43289c(nnp0 nnp0Var) {
        List list = nnp0Var.f156470b.f122153f;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Missing member in members list.");
        }
        i8e0 i8e0Var = (i8e0) list.get(0);
        boolean z = i8e0Var.f99768e == f8e0.f66964c;
        String str = i8e0Var.f99764a.f189802a;
        u4h0 u4h0Var = new u4h0(new sxg0(new sxg0(Integer.valueOf(nnp0Var.f156469a), str, this.f170810g), (char) 0));
        return new d5k(new wpz(u4h0Var, 6), new u20(z, u4h0Var, str, 13));
    }

    @Override // p204p.xq50
    public final d3h1 category() {
        return new v4k(2);
    }

    @Override // p204p.xq50
    /* JADX INFO: renamed from: d */
    public final int mo43290d(nnp0 nnp0Var) {
        List list = nnp0Var.f156470b.f122153f;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Missing member in members list.");
        }
        int iOrdinal = ((i8e0) list.get(0)).f99768e.ordinal();
        if (iOrdinal == 1) {
            return R.string.playlist_participants_context_menu_follow_user;
        }
        if (iOrdinal == 2) {
            return R.string.playlist_participants_context_menu_unfollow_user;
        }
        throw new IllegalArgumentException("Neither followable or unfollowable");
    }

    @Override // p204p.xq50
    /* JADX INFO: renamed from: e */
    public final wwu mo43291e(nnp0 nnp0Var) {
        List list = nnp0Var.f156470b.f122153f;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Missing member in members list.");
        }
        int iOrdinal = ((i8e0) list.get(0)).f99768e.ordinal();
        if (iOrdinal == 1) {
            return gqu.f83531c;
        }
        if (iOrdinal == 2) {
            return gqu.f83531c;
        }
        throw new IllegalArgumentException("Neither followable or unfollowable");
    }

    @Override // p204p.xq50
    /* JADX INFO: renamed from: f */
    public final boolean mo43292f(nnp0 nnp0Var) {
        List list = nnp0Var.f156470b.f122153f;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Missing member in members list.");
        }
        return ((i8e0) list.get(0)).f99768e != f8e0.f66962a;
    }

    @Override // p204p.xq50
    /* JADX INFO: renamed from: id */
    public final String mo43293id() {
        return "playlist_collaboration_follow_user";
    }
}
