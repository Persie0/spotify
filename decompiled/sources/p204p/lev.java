package p204p;

import com.spotify.music.R;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class lev implements uev {

    /* JADX INFO: renamed from: a */
    public final dse1 f132723a;

    /* JADX INFO: renamed from: b */
    public final Map f132724b;

    public lev(gle1 gle1Var, dse1 dse1Var, xf40 xf40Var) {
        this.f132723a = dse1Var;
        this.f132724b = xf40Var;
    }

    @Override // p204p.uev
    /* JADX INFO: renamed from: a */
    public final String mo56242a(bpe1 bpe1Var, tev tevVar) {
        if (bpe1Var.f29424a.equals("spotify:playlist:37i9dQZF1EYkqdzj48dyYq")) {
            return this.f132723a.f52556b.getString(R.string.item_description_dj);
        }
        uev uevVar = (uev) this.f132724b.get(bpe1Var.f29428e);
        if (uevVar != null) {
            return uevVar.mo56242a(bpe1Var, tevVar);
        }
        return null;
    }
}
