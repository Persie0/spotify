package p204p;

import android.os.Parcelable;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class goz implements Parcelable {

    /* JADX INFO: renamed from: b */
    public static final Set f83039b = s601.m77310m0(gn80.FMA_UPSELL_AUDIO_QUALITY, gn80.FMA_UPSELL_TRACK_SELECT, gn80.FMA_UPSELL_TRACK_SELECT_SEARCH, gn80.FMA_UPSELL_SKIP_NEXT, gn80.FMA_UPSELL_DOWNLOADS, gn80.FMA_UPSELL_SHUFFLE, gn80.FMA_UPSELL_MUSIC_VIDEO, gn80.FMA_UPSELL_QUEUE_REORDER);

    /* JADX INFO: renamed from: c */
    public static final Set f83040c = s601.m77310m0(ynz.f274530d, eoz.f61518d, foz.f71653d, doz.f51132d, znz.f284602d, coz.f40371d, aoz.f17792d, boz.f29279d);

    /* JADX INFO: renamed from: a */
    public final gn80 f83041a;

    public goz(gn80 gn80Var) {
        this.f83041a = gn80Var;
    }

    /* JADX INFO: renamed from: c */
    public final String m45351c() {
        if (equals(ynz.f274530d)) {
            return "fma_upsell:audio_quality";
        }
        if (equals(eoz.f61518d)) {
            return "fma_upsell:track_select";
        }
        if (equals(doz.f51132d)) {
            return "fma_upsell:skip_next";
        }
        if (equals(foz.f71653d)) {
            return "fma_upsell:track_select_search";
        }
        if (equals(znz.f284602d)) {
            return "fma_upsell:downloads";
        }
        if (equals(coz.f40371d)) {
            return "fma_upsell:shuffle";
        }
        if (equals(aoz.f17792d)) {
            return "fma_upsell:music_video";
        }
        if (equals(boz.f29279d)) {
            return "fma_upsell:queue";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: g */
    public final int m45352g() {
        if (equals(znz.f284602d)) {
            return 2;
        }
        if (equals(ynz.f274530d)) {
            return 1;
        }
        if (equals(eoz.f61518d)) {
            return 7;
        }
        if (equals(foz.f71653d)) {
            return 8;
        }
        if (equals(doz.f51132d)) {
            return 6;
        }
        if (equals(aoz.f17792d)) {
            return 3;
        }
        if (equals(boz.f29279d)) {
            return 4;
        }
        if (equals(coz.f40371d)) {
            return 5;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: h */
    public final String m45353h() {
        List list;
        ef41 ef41VarM64319a = nf41.m64319a(this.f83041a);
        String str = (ef41VarM64319a == null || (list = ef41VarM64319a.f58941c) == null) ? null : (String) g6f.m43745s0(list);
        if (str != null) {
            return str;
        }
        throw new IllegalStateException(("No uri found for " + this).toString());
    }
}
