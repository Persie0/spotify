package p204p;

import android.content.Context;
import com.spotify.music.R;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class pb01 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f175683a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ qb01 f175684b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hb01 f175685c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pb01(qb01 qb01Var, hb01 hb01Var, int i) {
        super(1);
        this.f175683a = i;
        this.f175684b = qb01Var;
        this.f175685c = hb01Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f175683a) {
            case 0:
                pwh0 pwh0Var = (pwh0) obj;
                eb01 eb01Var = this.f175684b.f186967b;
                eb01Var.getClass();
                List listM46715L = h6f.m46715L(new be70(R.string.auto_download_settings_description, 14), new pi80(this.f175685c.f89345a), new uxr(), new wn20(eb01Var.f57765a.getString(R.string.auto_download_settings_shows_heading)));
                if (!listM46715L.isEmpty()) {
                    pwh0Var.f182051a.add(listM46715L);
                }
                break;
            default:
                pwh0 pwh0Var2 = (pwh0) obj;
                Context context = this.f175684b.f186967b.f57765a;
                hb01 hb01Var = this.f175685c;
                List listM46715L2 = hb01Var.f89348d.f228320b == 0 ? h6f.m46715L(new be70(R.string.auto_download_settings_no_followed_shows, 10), new yna(context.getString(R.string.auto_download_settings_browse_podcasts_and_shows_button))) : Collections.singletonList(new xl91(context.getString(R.string.auto_download_settings_turn_off_for_all_shows_button), hb01Var.f89346b));
                if (!listM46715L2.isEmpty()) {
                    pwh0Var2.f182051a.add(listM46715L2);
                }
                break;
        }
        return w2a1.f247311a;
    }
}
