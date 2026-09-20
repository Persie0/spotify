package p204p;

import android.app.Activity;
import android.widget.Toast;
import com.spotify.music.R;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public final class ddx0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f47882a;

    /* JADX INFO: renamed from: b */
    public final Object f47883b;

    public /* synthetic */ ddx0(Object obj, int i) {
        this.f47882a = i;
        this.f47883b = obj;
    }

    /* JADX INFO: renamed from: b */
    public final void m35756b(un90 un90Var) {
        ft90 ft90Var;
        switch (this.f47882a) {
            case 0:
                n600 n600Var = (n600) this.f47883b;
                if (un90Var.equals(tn90.f221911a)) {
                    ft90Var = vs90.f244388a;
                } else if (un90Var.equals(tn90.f221912b)) {
                    ft90Var = ws90.f254564a;
                } else if (un90Var.equals(tn90.f221913c)) {
                    ft90Var = xs90.f265544a;
                } else if (un90Var.equals(tn90.f221915e)) {
                    ft90Var = at90.f19620a;
                } else if (un90Var.equals(tn90.f221916f)) {
                    ft90Var = bt90.f30535a;
                } else if (un90Var.equals(tn90.f221917g)) {
                    ft90Var = ct90.f41815a;
                } else if (un90Var.equals(tn90.f221918h)) {
                    ft90Var = dt90.f52752a;
                } else {
                    if (!un90Var.equals(tn90.f221914d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ft90Var = zs90.f285892a;
                }
                n600Var.m63752a(ft90Var, null);
                return;
            default:
                Toast.makeText((Activity) this.f47883b, R.string.greenroom_playback_failed_message, 0).show();
                return;
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m35755a() {
    }
}
