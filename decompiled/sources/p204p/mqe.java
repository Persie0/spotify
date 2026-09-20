package p204p;

import android.content.res.Resources;
import com.spotify.music.R;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class mqe implements uev {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f146260a;

    /* JADX INFO: renamed from: b */
    public final dse1 f146261b;

    public /* synthetic */ mqe(dse1 dse1Var, int i) {
        this.f146260a = i;
        this.f146261b = dse1Var;
    }

    @Override // p204p.uev
    /* JADX INFO: renamed from: a */
    public final String mo56242a(bpe1 bpe1Var, tev tevVar) {
        switch (this.f146260a) {
            case 0:
                jev jevVar = bpe1Var.f29428e;
                if (jevVar == jev.f111679t) {
                    boolean zContains = tevVar.f219798e.contains("playlists");
                    Resources resources = this.f146261b.f52556b;
                    return !zContains ? resources.getString(R.string.item_description_your_highlights_playlist) : resources.getString(R.string.item_description_your_highlights);
                }
                na6.m63957e("This decorator is meant to be used with PLAYLIST entities (Clips), and was used with " + jevVar + ", this should not happen");
                return null;
            default:
                Set set = tevVar.f219798e;
                jev jevVar2 = bpe1Var.f29428e;
                if (jevVar2 == jev.f111679t) {
                    boolean z = (set.contains("playlists") || set.contains("podcasts")) ? false : true;
                    Resources resources2 = this.f146261b.f52556b;
                    return z ? resources2.getString(R.string.item_description_your_episodes_playlist_saved_and_downloaded) : resources2.getString(R.string.item_description_your_episodes_saved_and_downloaded);
                }
                na6.m63957e("This decorator is meant to be used with PLAYLIST entities (Your Episodes), and was used with " + jevVar2 + ", this should not happen");
                return null;
        }
    }
}
