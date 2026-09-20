package p204p;

import android.content.Context;
import com.spotify.music.R;
import java.util.Collections;

/* JADX INFO: loaded from: classes11.dex */
public final class c51 implements u6z0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f34045a;

    /* JADX INFO: renamed from: b */
    public final Context f34046b;

    public /* synthetic */ c51(Context context, int i) {
        this.f34045a = i;
        this.f34046b = context;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f34045a) {
            case 0:
                ph3 ph3Var = (ph3) obj;
                Boolean bool = (Boolean) ph3Var.f177455c.m41144c(so50.f211096a);
                return Collections.singletonList(new ihv(1, this.f34046b.getString(R.string.your_library_add_artists_row_and_card_title), bool != null ? bool.booleanValue() : false, ph3Var.f177454b.f117618a.f84781b));
            case 1:
                ph3 ph3Var2 = (ph3) obj;
                Boolean bool2 = (Boolean) ph3Var2.f177455c.m41144c(so50.f211096a);
                return Collections.singletonList(new ihv(2, this.f34046b.getString(R.string.your_library_add_podcasts_row_and_card_title), bool2 != null ? bool2.booleanValue() : false, ph3Var2.f177454b.f117618a.f84781b));
            case 2:
                ph3 ph3Var3 = (ph3) obj;
                Boolean bool3 = (Boolean) ph3Var3.f177455c.m41144c(so50.f211096a);
                return Collections.singletonList(new ihv(3, this.f34046b.getString(R.string.your_library_events_hub_navigation_title), bool3 != null ? bool3.booleanValue() : false, ph3Var3.f177454b.f117618a.f84781b));
            default:
                ph3 ph3Var4 = (ph3) obj;
                Boolean bool4 = (Boolean) ph3Var4.f177455c.m41144c(so50.f211096a);
                return Collections.singletonList(new ihv(4, this.f34046b.getString(R.string.your_library_import_your_music_row_and_card_title), bool4 != null ? bool4.booleanValue() : false, ph3Var4.f177454b.f117618a.f84781b));
        }
    }
}
