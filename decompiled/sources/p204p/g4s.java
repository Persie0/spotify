package p204p;

import android.content.Context;
import com.spotify.music.R;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes9.dex */
public final class g4s implements gc80 {

    /* JADX INFO: renamed from: a */
    public final c07 f76514a;

    /* JADX INFO: renamed from: b */
    public final Scheduler f76515b;

    /* JADX INFO: renamed from: c */
    public final b4s f76516c;

    /* JADX INFO: renamed from: d */
    public final z9j0 f76517d;

    /* JADX INFO: renamed from: e */
    public final at91 f76518e;

    /* JADX INFO: renamed from: f */
    public final iwr f76519f = new iwr();

    public g4s(c07 c07Var, Scheduler scheduler, b4s b4sVar, z9j0 z9j0Var, at91 at91Var) {
        this.f76514a = c07Var;
        this.f76515b = scheduler;
        this.f76516c = b4sVar;
        this.f76517d = z9j0Var;
        this.f76518e = at91Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m43556a(c4s c4sVar, das dasVar, d4s d4sVar, e4s e4sVar) {
        b4s b4sVar = this.f76516c;
        Context context = b4sVar.f23406a;
        int iOrdinal = c4sVar.ordinal();
        if (iOrdinal == 0) {
            if (dasVar.f47098a) {
                b4sVar.m28101a(context.getString(R.string.download_over_cellular_title), context.getString(R.string.download_over_cellular_body), context.getString(R.string.download_over_cellular_positive_settings_text), context.getString(R.string.download_over_cellular_negative_cancel_text), new f4s(this, 1), nq9.f157202e).m58942b();
                return;
            } else if (!dasVar.f47099b) {
                d4sVar.mo28952a();
                return;
            } else {
                b4sVar.m28102b(new f4s(this, 0), new ja5(8, this, d4sVar), new xyo(this, 2)).m58942b();
                this.f76518e.m27127a(zz6.f287894e);
                return;
            }
        }
        if (iOrdinal == 1) {
            e4sVar.mo28953e(lau.f131415a);
            return;
        }
        if (iOrdinal != 2) {
            throw new NoWhenBranchMatchedException();
        }
        List list = dasVar.f47100c;
        if (list.isEmpty()) {
            b4sVar.m28101a(context.getString(R.string.download_confirmation_title), context.getString(R.string.download_confirmation_body), context.getString(R.string.download_confirmation_positive_remove_text), context.getString(R.string.download_confirmation_negative_cancel_text), new nmb(e4sVar, 14), nq9.f157203f).m58942b();
            return;
        }
        b4sVar.m28101a(context.getString(list.size() > 1 ? R.string.download_confirmation_episode_in_playlist_multiple_title : R.string.download_confirmation_episode_in_playlist_one_title), context.getString(list.size() > 1 ? R.string.download_confirmation_episode_in_playlist_multiple_body : R.string.download_confirmation_episode_in_playlist_one_body, g6f.m43753y0(list, ", ", null, null, rxr.f203681c1, 30)), context.getString(list.size() > 1 ? R.string.f5881xe4287c07 : R.string.f5882xdfb5bec5), context.getString(R.string.download_confirmation_episode_in_playlist_negative_cancel_text), new ja5(9, e4sVar, list), nq9.f157204g).m58942b();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000d  */
    /* JADX INFO: renamed from: b */
    public final void m43557b(z2l0 z2l0Var, das dasVar, d4s d4sVar, e4s e4sVar) {
        c4s c4sVar;
        if (z2l0Var instanceof t2l0) {
            c4sVar = c4s.f33999a;
        } else {
            boolean z = z2l0Var instanceof x2l0;
            c4s c4sVar2 = c4s.f34000b;
            if (z || (z2l0Var instanceof l2l0)) {
                c4sVar = c4sVar2;
            } else {
                boolean z2 = z2l0Var instanceof j2l0;
                c4s c4sVar3 = c4s.f34001c;
                if (!z2) {
                    if ((z2l0Var instanceof n2l0) || (z2l0Var instanceof r2l0) || (z2l0Var instanceof p2l0)) {
                        c4sVar = c4sVar2;
                    } else if (!(z2l0Var instanceof v2l0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                c4sVar = c4sVar3;
            }
        }
        m43556a(c4sVar, dasVar, d4sVar, e4sVar);
    }
}
