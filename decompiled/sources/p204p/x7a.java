package p204p;

import android.content.Context;
import android.view.View;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes5.dex */
public final class x7a implements owt {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f258863a;

    /* JADX INFO: renamed from: b */
    public final EncoreTextView f258864b;

    public x7a(Context context, String str) {
        this.f258863a = 2;
        EncoreTextView encoreTextView = new EncoreTextView(context, null, 0, 6, null);
        encoreTextView.setId(R.id.cwp_section_header_element);
        int dimensionPixelSize = encoreTextView.getResources().getDimensionPixelSize(R.dimen.spacer_16);
        encoreTextView.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        encoreTextView.setTextAppearance(R.style.TextAppearance_Encore_TitleSmall);
        encoreTextView.setText(str);
        encoreTextView.setContentDescription(str);
        this.f258864b = encoreTextView;
    }

    @Override // p204p.owt
    /* JADX INFO: renamed from: a */
    public final void mo26764a(Object obj, ext extVar) {
        switch (this.f258863a) {
            case 0:
                this.f258864b.setText(((w7a) obj).f248616b);
                break;
            case 1:
                String str = (String) obj;
                EncoreTextView encoreTextView = this.f258864b;
                encoreTextView.setText(str);
                encoreTextView.setContentDescription(str);
                break;
            case 2:
                break;
            default:
                this.f258864b.setText((String) obj);
                break;
        }
    }

    @Override // p204p.owt
    public final View getView() {
        switch (this.f258863a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return this.f258864b;
    }

    public x7a(Context context, int i) {
        this.f258863a = i;
        switch (i) {
            case 1:
                EncoreTextView encoreTextView = new EncoreTextView(context, null, 0, 6, null);
                encoreTextView.setTextAppearance(R.style.TextAppearance_Encore_TitleSmall);
                int dimension = (int) context.getResources().getDimension(R.dimen.best_place_horizontal_padding);
                encoreTextView.setPadding(dimension, 0, dimension, 0);
                encoreTextView.setText(context.getString(R.string.best_place_to_start));
                encoreTextView.setContentDescription(context.getString(R.string.best_place_to_start));
                this.f258864b = encoreTextView;
                break;
            case 2:
            default:
                EncoreTextView encoreTextView2 = new EncoreTextView(context, null, 0, 6, null);
                encoreTextView2.setId(R.id.audiobook_title_element);
                int dimensionPixelSize = encoreTextView2.getResources().getDimensionPixelSize(R.dimen.spacer_16);
                encoreTextView2.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
                encoreTextView2.setTextAppearance(R.style.TextAppearance_Encore_BodyMedium);
                this.f258864b = encoreTextView2;
                break;
            case 3:
                EncoreTextView encoreTextView3 = new EncoreTextView(context, null, 0, 6, null);
                encoreTextView3.setTextAppearance(R.style.TextAppearance_Encore_TitleSmall);
                int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.encore_spacer_base);
                encoreTextView3.setPadding(dimensionPixelSize2, context.getResources().getDimensionPixelSize(R.dimen.encore_spacer_looser_2), dimensionPixelSize2, context.getResources().getDimensionPixelSize(R.dimen.encore_spacer_tighter_2));
                encoreTextView3.setTag(R.id.skip_divider_tag, Boolean.TRUE);
                this.f258864b = encoreTextView3;
                break;
        }
    }
}
