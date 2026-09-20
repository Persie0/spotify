package p204p;

import android.view.View;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class wxd1 {

    /* JADX INFO: renamed from: a */
    public static final cqi0 f256013a;

    static {
        long[] jArr = rdy0.f198228a;
        f256013a = new cqi0();
    }

    /* JADX INFO: renamed from: a */
    public static final hsh m89231a(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof hsh) {
            return (hsh) tag;
        }
        return null;
    }
}
