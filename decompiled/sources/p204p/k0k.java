package p204p;

import android.content.Context;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes6.dex */
public final class k0k extends p20 {
    public k0k(Context context) {
        super(context);
        setIconResource(R.drawable.encore_icon_more_android);
    }

    @Override // android.view.View
    public void setContentDescription(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = getContext().getResources().getString(R.string.entity_action_context_menu_default_content_description);
        }
        super.setContentDescription(charSequence);
    }
}
