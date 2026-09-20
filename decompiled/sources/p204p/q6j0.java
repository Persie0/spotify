package p204p;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.spotify.player.model.ContextTrack;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public final class q6j0 {

    /* JADX INFO: renamed from: a */
    public final String f185835a;

    /* JADX INFO: renamed from: b */
    public final Context f185836b;

    public q6j0(Context context, String str) {
        this.f185835a = str;
        this.f185836b = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: a */
    public final Intent m72242a(p6j0 p6j0Var) {
        o6j0 o6j0Var = p6j0Var.f174419j;
        String str = p6j0Var.f174411b;
        String str2 = p6j0Var.f174410a;
        if (str2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Uri uriBuild = Uri.parse(str2);
        wj50.m88279p(uriBuild);
        if (("open.spotify.com".equals(uriBuild.getHost()) || "play.spotify.com".equals(uriBuild.getHost())) && uriBuild.getQueryParameter("nd") == null) {
            uriBuild = uriBuild.buildUpon().appendQueryParameter("nd", "1").build();
        }
        Intent intent = new Intent("android.intent.action.VIEW", uriBuild);
        Set set = dd41.f47702f;
        if (r46.m74726U(str2).f47709c != gn80.DUMMY) {
            intent.setFlags(67108864);
            intent.setClassName(this.f185836b, this.f185835a);
        }
        if (str.length() > 0) {
            intent.putExtra(ContextTrack.Metadata.KEY_TITLE, str);
        }
        if (p6j0Var.f174412c) {
            intent.putExtra("extra_clear_backstack", true);
        }
        if (p6j0Var.f174413d) {
            intent.putExtra("extra_crossfade", true);
        }
        int i = p6j0Var.f174414e;
        if (i != 0) {
            intent.putExtra("extra_animation_in", i);
        }
        int i2 = p6j0Var.f174415f;
        if (i2 != 0) {
            intent.putExtra("extra_animation_out", i2);
        }
        if (p6j0Var.f174416g) {
            intent.putExtra("extra_pop_current_fragment", true);
        }
        if (o6j0Var != null) {
            if (o6j0Var instanceof n6j0) {
                AbstractC2254pf.m69748E(intent, ((n6j0) o6j0Var).f150897a);
            } else if (o6j0Var instanceof m6j0) {
                AbstractC2254pf.m69747D(intent, ((m6j0) o6j0Var).f140534a);
            } else if (o6j0Var instanceof i6j0) {
                AbstractC2254pf.m69749F(intent, new n2j0(((i6j0) o6j0Var).f99258a));
            } else if (o6j0Var.equals(l6j0.f130398a)) {
                AbstractC2254pf.m69749F(intent, v2j0.f236676a);
            } else if (!o6j0Var.equals(k6j0.f119765a)) {
                if (!(o6j0Var instanceof j6j0)) {
                    throw new NoWhenBranchMatchedException();
                }
                AbstractC2254pf.m69749F(intent, new r2j0(((j6j0) o6j0Var).f109329a));
            }
        }
        Bundle bundle = p6j0Var.f174418i;
        if (bundle != null) {
            intent.putExtra("fragment_arguments", bundle);
        }
        th50 th50Var = p6j0Var.f174417h;
        if (th50Var != null) {
            ig31.m50477G(intent, th50Var);
        }
        return intent;
    }
}
