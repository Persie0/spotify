package p204p;

import com.spotify.music.R;

/* JADX INFO: loaded from: classes6.dex */
public final class oh80 extends ol51 {

    /* JADX INFO: renamed from: c */
    public static final oh80 f165367c = new oh80(0);

    /* JADX INFO: renamed from: d */
    public static final oh80 f165368d = new oh80(1);

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f165369b;

    public /* synthetic */ oh80(int i) {
        this.f165369b = i;
    }

    @Override // p204p.ol51
    /* JADX INFO: renamed from: r */
    public final int mo66944r() {
        switch (this.f165369b) {
            case 0:
                return R.string.find_in_context_edit_text_liked_songs_hint;
            default:
                return R.string.find_in_context_edit_text_show_hint;
        }
    }
}
