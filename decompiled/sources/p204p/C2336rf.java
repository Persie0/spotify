package p204p;

import android.view.accessibility.AccessibilityNodeInfo;
import com.spotify.music.R;

/* JADX INFO: renamed from: p.rf */
/* JADX INFO: loaded from: classes3.dex */
public final class C2336rf {

    /* JADX INFO: renamed from: a */
    public final Object f198459a;

    public C2336rf() {
        this.f198459a = kkc0.m56695h0(new pqm0("downloaded", new i790(0, R.string.listen_later_filter_chip_downloaded, "downloaded", ss80.f213529a)), new pqm0("unplayed", new i790(1, R.string.listen_later_filter_chip_unplayed, "unplayed", lt80.f136724a)), new pqm0("inprogress", new i790(2, R.string.listen_later_filter_chip_in_progress, "inprogress", ft80.f73135a)));
    }

    public C2336rf(AccessibilityNodeInfo.RangeInfo rangeInfo) {
        this.f198459a = rangeInfo;
    }
}
