package p204p;

import android.view.View;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes10.dex */
public final class o6t extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f162408a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ c7t f162409b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o6t(c7t c7tVar, int i) {
        super(0);
        this.f162408a = i;
        this.f162409b = c7tVar;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f162408a) {
            case 0:
                c7t c7tVar = this.f162409b;
                String string = c7tVar.f35014i.getContext().getString(R.string.edit_profile_name_label);
                View view = c7tVar.f35014i;
                return new h6t(string, "", view.getContext().getString(R.string.edit_profile_name_hint), vc41.X_ALT, view.getContext().getString(R.string.edit_profile_clear_text_content_description));
            case 1:
                View view2 = this.f162409b.f35014i;
                return new h6t(view2.getContext().getString(R.string.edit_profile_social_handle_label), (String) null, view2.getContext().getResources().getConfiguration().getLayoutDirection() == 1 ? vc41.CHEVRON_LEFT : vc41.CHEVRON_RIGHT, view2.getContext().getString(R.string.edit_profile_social_handle_edit_button), 4);
            case 2:
                c7t c7tVar2 = this.f162409b;
                String string2 = c7tVar2.f35014i.getContext().getString(R.string.edit_profile_bio_label);
                View view3 = c7tVar2.f35014i;
                return new h6t(string2, "", view3.getContext().getString(R.string.edit_profile_bio_hint), view3.getContext().getResources().getConfiguration().getLayoutDirection() == 1 ? vc41.CHEVRON_LEFT : vc41.CHEVRON_RIGHT, view3.getContext().getString(R.string.edit_profile_bio_edit_button));
            case 3:
                c7t c7tVar3 = this.f162409b;
                String string3 = c7tVar3.f35014i.getContext().getString(R.string.edit_profile_name_label);
                View view4 = c7tVar3.f35014i;
                return new h6t(string3, "", view4.getContext().getString(R.string.edit_profile_name_hint), vc41.LOCKED_ACTIVE, view4.getContext().getString(R.string.edit_profile_cannot_change_display_name_as_kid));
            case 4:
                View view5 = this.f162409b.f35014i;
                return new h6t(view5.getContext().getString(R.string.edit_profile_pronouns_label), view5.getContext().getString(R.string.edit_profile_pronouns_hint), (vc41) null, (String) null, 24);
            default:
                c7t c7tVar4 = this.f162409b;
                String string4 = c7tVar4.f35014i.getContext().getString(R.string.edit_profile_location_label);
                View view6 = c7tVar4.f35014i;
                return new h6t(string4, "", view6.getContext().getString(R.string.edit_profile_location_hint), vc41.X_ALT, view6.getContext().getString(R.string.edit_profile_clear_text_content_description));
        }
    }
}
