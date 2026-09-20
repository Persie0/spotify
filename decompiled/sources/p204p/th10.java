package p204p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes7.dex */
@Deprecated
public abstract class th10 {
    /* JADX INFO: renamed from: a */
    public static ph10 m80815a(Context context, ViewGroup viewGroup) {
        return (ph10) m80817c(new qh10(LayoutInflater.from(context).inflate(R.layout.glue_empty_state_button, viewGroup, false)));
    }

    /* JADX INFO: renamed from: b */
    public static rh10 m80816b(Context context, ViewGroup viewGroup) {
        return (rh10) m80817c(new sh10(LayoutInflater.from(context).inflate(R.layout.glue_empty_state, viewGroup, false)));
    }

    /* JADX INFO: renamed from: c */
    private static <T extends ji10> T m80817c(T t) {
        t.getView().setTag(R.id.glue_viewholder_tag, t);
        return t;
    }
}
