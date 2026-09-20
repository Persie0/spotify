package p204p;

import android.app.Activity;
import com.spotify.music.R;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: classes11.dex */
public final class n380 implements lx20 {

    /* JADX INFO: renamed from: k */
    public static final fv31 f149953k;

    /* JADX INFO: renamed from: l */
    public static final fv31 f149954l;

    /* JADX INFO: renamed from: m */
    public static final fv31 f149955m;

    /* JADX INFO: renamed from: n */
    public static final fv31 f149956n;

    /* JADX INFO: renamed from: o */
    public static final fv31 f149957o;

    /* JADX INFO: renamed from: a */
    public final String f149958a;

    /* JADX INFO: renamed from: b */
    public final hqe1 f149959b;

    /* JADX INFO: renamed from: c */
    public final y980 f149960c;

    /* JADX INFO: renamed from: d */
    public final Scheduler f149961d;

    /* JADX INFO: renamed from: e */
    public final wg61 f149962e;

    /* JADX INFO: renamed from: f */
    public final ehv f149963f;

    /* JADX INFO: renamed from: g */
    public final ehv f149964g;

    /* JADX INFO: renamed from: h */
    public final ehv f149965h;

    /* JADX INFO: renamed from: i */
    public final ehv f149966i;

    /* JADX INFO: renamed from: j */
    public final wg61 f149967j;

    static {
        si5 si5Var = fv31.f73628b;
        f149953k = si5Var.m78181M("YourLibraryX.create_playlist_hint_dismissed");
        f149954l = si5Var.m78181M("YourLibraryX.follow_podcast_hint_dismissed");
        f149955m = si5Var.m78181M("YourLibraryX.follow_podcast_education_hint_dismissed");
        f149956n = si5Var.m78181M("YourLibraryX.offboard_new_episodes_to_following_feed_hint_dismissed");
        f149957o = si5Var.m78181M("YourLibraryX.offboard_new_episodes_to_following_feed_shown_date");
    }

    public n380(Activity activity, wb11 wb11Var, String str, hqe1 hqe1Var, y980 y980Var, Scheduler scheduler, xre xreVar) {
        this.f149958a = str;
        this.f149959b = hqe1Var;
        this.f149960c = y980Var;
        this.f149961d = scheduler;
        this.f149962e = new wg61(new k380(wb11Var, activity, this, 0));
        this.f149963f = new ehv("create_playlist", xoc1.f263848B1.f243453a, activity.getString(R.string.your_library_create_playlist_hint_label), activity.getString(R.string.your_library_create_playlist_hint_title), activity.getString(R.string.your_library_create_playlist_hint_body), activity.getString(R.string.your_library_create_playlist_hint_button), activity.getString(R.string.your_library_create_playlist_hint_button_content_description), activity.getString(R.string.your_library_create_playlist_hint_dismiss_content_description), null);
        voc1 voc1Var = xoc1.f263935M0;
        this.f149964g = new ehv("follow_podcast", voc1Var.f243453a, activity.getString(R.string.your_library_follow_podcast_hint_label), activity.getString(R.string.your_library_follow_podcast_hint_title), activity.getString(R.string.your_library_follow_podcast_hint_body), activity.getString(R.string.your_library_follow_podcast_hint_button), null, activity.getString(R.string.f6033xe9726871), null);
        this.f149965h = new ehv("follow_podcast_education", voc1Var.f243453a, activity.getString(R.string.your_library_follow_podcast_education_hint_label), activity.getString(R.string.your_library_follow_podcast_education_hint_title), activity.getString(R.string.your_library_follow_podcast_education_hint_body), activity.getString(R.string.your_library_follow_podcast_education_hint_button), null, activity.getString(R.string.f6033xe9726871), null);
        String string = activity.getString(R.string.your_library_offboard_new_episodes_hint_label);
        String string2 = activity.getString(R.string.your_library_offboard_new_episodes_to_follow_feed_hint_title);
        String string3 = activity.getString(R.string.your_library_offboard_new_episodes_to_follow_feed_hint_body);
        String string4 = activity.getString(R.string.your_library_offboard_new_episodes_to_follow_feed_hint_button);
        String string5 = activity.getString(R.string.f6036x21666e9a);
        String string6 = activity.getString(R.string.f6035x40bbe19);
        fx20[] fx20VarArr = fx20.f74227b;
        this.f149966i = new ehv("offboard_new_episodes", "spotify:home?facet=podcasts-following-chip", string, string2, string3, string4, string5, string6, 0);
        this.f149967j = new wg61(new ag70(this, 13));
    }

    @Override // p204p.lx20
    /* JADX INFO: renamed from: a */
    public final ObservableTransformer mo60158a() {
        return (ObservableTransformer) this.f149967j.getValue();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p204p.lx20
    /* JADX INFO: renamed from: b */
    public final void mo60159b(String str, dsr dsrVar) {
        if (dsrVar instanceof urr) {
            this.f149960c.f270531d = ((urr) dsrVar).f233447a;
            return;
        }
        lv31 lv31VarEdit = m63590c().edit();
        switch (str.hashCode()) {
            case -1614049793:
                if (str.equals("offboard_new_episodes")) {
                    if (!dsrVar.equals(srr.f213372a)) {
                        lv31VarEdit.m60048a(f149956n, false);
                    } else {
                        lv31VarEdit.m60048a(f149956n, true);
                    }
                }
                break;
            case -1499107915:
                if (str.equals("create_playlist")) {
                    lv31VarEdit.m60048a(f149953k, true);
                }
                break;
            case -995744650:
                if (str.equals("follow_podcast")) {
                    lv31VarEdit.m60048a(f149954l, true);
                }
                break;
            case 228584223:
                if (str.equals("follow_podcast_education")) {
                    lv31VarEdit.m60048a(f149955m, true);
                }
                break;
        }
        lv31VarEdit.m60055h();
    }

    /* JADX INFO: renamed from: c */
    public final hv31 m63590c() {
        return (hv31) this.f149962e.getValue();
    }

    /* JADX INFO: renamed from: d */
    public final Observable m63591d(fv31 fv31Var) {
        return k0e1.m54988g(((mv31) m63590c()).m62896q(fv31Var), dau.f47107a).map(new bq70(2, this, fv31Var)).startWith(Observable.fromCallable(new x31(13, this, fv31Var)));
    }
}
