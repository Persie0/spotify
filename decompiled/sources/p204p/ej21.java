package p204p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes3.dex */
public final enum ej21 extends rj21 {
    public ej21() {
        super("ROW_IMAGE_SMALL", 14);
    }

    @Override // p204p.xj21
    /* JADX INFO: renamed from: a */
    public final View mo26136a(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(R.layout.skeleton_rowimagesmall, viewGroup, false);
    }
}
