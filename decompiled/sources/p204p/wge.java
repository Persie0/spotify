package p204p;

import android.content.Context;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes6.dex */
public final class wge extends p20 {
    public wge(Context context) {
        super(context);
        setIconResource(R.drawable.encore_icon_x);
    }

    @Override // android.view.View
    public void setContentDescription(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = getContext().getResources().getString(R.string.entity_action_clear_default_content_description);
        }
        super.setContentDescription(charSequence);
    }
}
