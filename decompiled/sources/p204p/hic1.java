package p204p;

import android.content.Context;
import android.graphics.Canvas;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes3.dex */
public final class hic1 extends mfs {
    public hic1(Context context) {
        super(context);
        setClipChildren(false);
        setClipToPadding(false);
        setTag(R.id.hide_graphics_layer_in_inspector_tag, Boolean.TRUE);
    }

    public final void dispatchGetDisplayList() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }
}
