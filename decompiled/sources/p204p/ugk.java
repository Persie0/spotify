package p204p;

import android.net.Uri;
import com.spotify.music.R;
import com.spotify.player.model.ContextTrack;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
public final class ugk extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f230196a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zgk f230197b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ugk(zgk zgkVar, int i) {
        super(1);
        this.f230196a = i;
        this.f230197b = zgkVar;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        j4u j4uVarM79824e;
        switch (this.f230196a) {
            case 0:
                return new C1865fm(this.f230197b, 24);
            case 1:
                String str = (String) obj;
                zgk zgkVar = this.f230197b;
                fhk fhkVar = zgkVar.f282661c;
                if (fhkVar instanceof dhk) {
                    dhk dhkVar = (dhk) fhkVar;
                    Uri.Builder builderAppendQueryParameter = new Uri.Builder().encodedPath("spotify:internal:contribution-notes-management:edit").appendQueryParameter(ContextTrack.Metadata.KEY_CONTEXT_URI, dhkVar.f49122b).appendQueryParameter("item_uri", dhkVar.f49123c);
                    String str2 = dhkVar.f49124d;
                    if (str2 != null) {
                        builderAppendQueryParameter.appendQueryParameter("list_item_id", str2);
                    }
                    String string = builderAppendQueryParameter.build().toString();
                    ulg0 ulg0VarM57838t = l0y0.m57838t(fhkVar.mo36050o(), str == null ? "spotify:contribution:" : str);
                    if (str == null) {
                        str = "";
                    }
                    cag0 cag0Var = new cag0(ulg0VarM57838t, str);
                    j4uVarM79824e = t0j.m79824e(R.string.contribution_notes_management_note_added);
                    j4uVarM79824e.m52391p(R.string.contribution_notes_management_snackbar_edit);
                    j4uVarM79824e.f108791t = new ygk(0, zgkVar, cag0Var);
                    j4uVarM79824e.f108789h = new lt7((Object) zgkVar, (Object) cag0Var, string, 2);
                } else {
                    if (!(fhkVar instanceof ehk)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    j4uVarM79824e = t0j.m79824e(R.string.contribution_notes_management_note_updated);
                }
                zgkVar.f282666h.m72307m(j4uVarM79824e.m52392q());
                return w2a1.f247311a;
            default:
                v0y.m84416d(this.f230197b.f282665g, (String) obj, false, 6);
                return w2a1.f247311a;
        }
    }
}
