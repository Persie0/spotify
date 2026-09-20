package p204p;

import android.content.Context;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes6.dex */
public final class okc0 extends p20 {
    public okc0(Context context) {
        super(context);
        setIconResource(R.drawable.encore_icon_check);
    }

    @Override // android.view.View
    public void setContentDescription(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = getContext().getResources().getString(R.string.entity_action_mark_as_played_default_content_description);
        }
        super.setContentDescription(charSequence);
    }
}
