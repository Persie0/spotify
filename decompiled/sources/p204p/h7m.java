package p204p;

import android.view.inputmethod.InputMethodManager;
import com.spotify.music.SpotifyMainActivity;
import com.spotify.tome.pageactivity.PageActivity;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class h7m implements x7l0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f88488a;

    /* JADX INFO: renamed from: b */
    public final Object f88489b;

    public /* synthetic */ h7m(Object obj, int i) {
        this.f88488a = i;
        this.f88489b = obj;
    }

    @Override // p204p.x7l0
    /* JADX INFO: renamed from: b */
    public final void mo24810b(String str, i500 i500Var) {
        Integer num;
        switch (this.f88488a) {
            case 0:
                i7m i7mVar = (i7m) this.f88489b;
                i7mVar.f99587f.mo33104m(new yfk(i7mVar, 26));
                return;
            case 1:
                dcp dcpVar = (dcp) this.f88489b;
                if (dcpVar.f47598f) {
                    Set set = ecp.f58370a;
                    Set set2 = dd41.f47702f;
                    boolean zContains = set.contains(r46.m74726U(str).f47709c);
                    if (!zContains || !wj50.m88271j(dcpVar.f47603k, Boolean.FALSE)) {
                        str = null;
                    }
                    dcpVar.f47604l = str;
                    dcpVar.f47603k = Boolean.valueOf(zContains);
                    if (zContains) {
                        di41 di41Var = dcpVar.f47601i;
                        if (di41Var != null) {
                            di41Var.mo26601e(null);
                        }
                        dcpVar.f47601i = null;
                        return;
                    }
                    di41 di41Var2 = dcpVar.f47601i;
                    if (di41Var2 != null) {
                        di41Var2.mo26601e(null);
                    }
                    dcpVar.f47601i = null;
                    dcpVar.f47601i = x0h1.m89578u(dcpVar.f47597e, null, 0, new nm8(dcpVar.f47596d.m57859d(), dcpVar, (fbk) null), 3);
                    return;
                }
                return;
            case 2:
                for (fza fzaVar : (Set) this.f88489b) {
                    fzaVar.getClass();
                    i500Var.f98716q1.mo31986a(new dza(fzaVar, str, i500Var));
                }
                return;
            case 3:
                u0d0 u0d0Var = (u0d0) this.f88489b;
                if (u0d0Var.f225451L0) {
                    return;
                }
                if (str.equals(u0d0Var.f225458d)) {
                    u0d0Var.f225462h = u0d0Var.f225461g;
                    Integer num2 = u0d0Var.f225464t;
                    u0d0Var.f225463i = num2 != null ? num2.intValue() : 0;
                    return;
                }
                u0d0Var.f225461g = str;
                if (u0d0Var.f225452X && wj50.m88271j(u0d0Var.f225462h, str) && (num = u0d0Var.f225464t) != null && u0d0Var.f225463i == num.intValue() - 1) {
                    u0d0Var.f225452X = false;
                    u0d0Var.f225457c.mo47346g(u0d0Var.f225458d);
                    return;
                }
                return;
            case 4:
                ((sir0) this.f88489b).mo30231j(i500Var);
                return;
            case 5:
                PageActivity pageActivity = (PageActivity) this.f88489b;
                h480 h480Var = pageActivity.f6880h1;
                if (h480Var == null) {
                    wj50.m88260d0("legacyPropertyResolver");
                    throw null;
                }
                h480Var.mo24810b(str, i500Var);
                pageActivity.f6881i1.mo24810b(str, i500Var);
                return;
            case 6:
                vfm vfmVar = ((nun0) this.f88489b).f158675c;
                if ((vfmVar.f241000a != null ? !bm51.m29803n0(str, "spotify:settings", false) ? 1 : 0 : 0) != 0) {
                    vfmVar.f241000a = null;
                    return;
                }
                return;
            default:
                SpotifyMainActivity spotifyMainActivity = (SpotifyMainActivity) this.f88489b;
                ((InputMethodManager) spotifyMainActivity.getSystemService("input_method")).hideSoftInputFromWindow(spotifyMainActivity.getWindow().getDecorView().getWindowToken(), 0);
                return;
        }
    }

    public h7m(fza fzaVar) {
        this.f88488a = 2;
        this.f88489b = Collections.singleton(fzaVar);
    }
}
