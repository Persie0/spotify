package p204p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes3.dex */
public final enum pj21 extends rj21 {
    public pj21() {
        super("PILL_BUTTON_LARGE", 7);
    }

    @Override // p204p.xj21
    /* JADX INFO: renamed from: a */
    public final View mo26136a(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(R.layout.skeleton_pillbutton_large, viewGroup, false);
    }
}
