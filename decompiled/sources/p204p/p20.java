package p204p;

import android.content.Context;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class p20 extends EncoreButton {
    public p20(Context context) {
        super(context, null, R.attr.encoreButtonTertiaryMediumIconOnly, null, 8, null);
        setIconTint(ihf1.m50631o(context, R.color.entity_action_button_icon_tint));
    }
}
