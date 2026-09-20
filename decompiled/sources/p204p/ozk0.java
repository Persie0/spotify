package p204p;

import android.app.Activity;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes9.dex */
public final class ozk0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f172312a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ pzk0 f172313b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ozk0(pzk0 pzk0Var, int i) {
        super(0);
        this.f172312a = i;
        this.f172313b = pzk0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f172312a) {
            case 0:
                return new jzk0(new gj80(this.f172313b.f183721a.getString(R.string.offline_limited_experience_indicator_offline_mode), ej80.f60159a), 1);
            default:
                Activity activity = this.f172313b.f183721a;
                return new jzk0(new gj80(activity.getString(R.string.offline_limited_experience_indicator_no_internet_connection), new dj80(activity.getString(R.string.offline_limited_experience_indicator_back_online))), 3);
        }
    }
}
