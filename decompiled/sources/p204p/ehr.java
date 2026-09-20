package p204p;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes7.dex */
public final class ehr extends LinearLayout {

    /* JADX INFO: renamed from: L0 */
    public final ImageView f59640L0;

    /* JADX INFO: renamed from: M0 */
    public View f59641M0;

    /* JADX INFO: renamed from: N0 */
    public final View f59642N0;

    /* JADX INFO: renamed from: O0 */
    public CharSequence f59643O0;

    /* JADX INFO: renamed from: P0 */
    public dtz f59644P0;

    /* JADX INFO: renamed from: a */
    public Button f59645a;

    /* JADX INFO: renamed from: b */
    public Button f59646b;

    /* JADX INFO: renamed from: c */
    public final Button f59647c;

    /* JADX INFO: renamed from: d */
    public final Button f59648d;

    /* JADX INFO: renamed from: e */
    public final Button f59649e;

    /* JADX INFO: renamed from: f */
    public final Button f59650f;

    /* JADX INFO: renamed from: g */
    public final LinearLayout f59651g;

    /* JADX INFO: renamed from: h */
    public final TextView f59652h;

    /* JADX INFO: renamed from: i */
    public final TextView f59653i;

    /* JADX INFO: renamed from: t */
    public final ViewGroup f59654t;

    public ehr(Context context, boolean z) {
        super(context, null);
        View.inflate(context, z ? R.layout.paste_dialog : R.layout.paste_dialog_noscroll, this);
        this.f59647c = (Button) findViewById(R.id.left_button);
        this.f59649e = (Button) findViewById(R.id.single_button_positive);
        this.f59650f = (Button) findViewById(R.id.single_button_negative);
        this.f59648d = (Button) findViewById(R.id.right_button);
        this.f59651g = (LinearLayout) findViewById(R.id.button_bar);
        this.f59652h = (TextView) findViewById(R.id.title);
        this.f59653i = (TextView) findViewById(R.id.body);
        this.f59654t = (ViewGroup) findViewById(R.id.content);
        this.f59640L0 = (ImageView) findViewById(R.id.image);
        this.f59642N0 = findViewById(R.id.title_container);
    }

    public TextView getBodyView() {
        return this.f59653i;
    }

    public LinearLayout getButtonBar() {
        return this.f59651g;
    }

    public View getContentView() {
        return this.f59641M0;
    }

    public ImageView getImageView() {
        return this.f59640L0;
    }

    public Button getLeftButton() {
        return this.f59647c;
    }

    public Button getNegativeButton() {
        return this.f59646b;
    }

    public Button getPositiveButton() {
        return this.f59645a;
    }

    public Button getRightButton() {
        return this.f59648d;
    }

    public Button getSingleNegativeButton() {
        return this.f59650f;
    }

    public Button getSinglePositiveButton() {
        return this.f59649e;
    }

    public TextView getTitleView() {
        return this.f59652h;
    }

    public void setBody(CharSequence charSequence) {
        TextView textView = this.f59653i;
        textView.setText(charSequence);
        textView.setVisibility(0);
    }

    public void setContentView(View view) {
        View view2 = this.f59641M0;
        ViewGroup viewGroup = this.f59654t;
        if (view2 != null) {
            viewGroup.removeView(view2);
        }
        if (view == null) {
            viewGroup.setVisibility(8);
            return;
        }
        this.f59641M0 = view;
        viewGroup.addView(view, -1, -2);
        viewGroup.setVisibility(0);
    }

    public void setImage(int i) {
        ImageView imageView = this.f59640L0;
        imageView.setVisibility(0);
        imageView.setImageResource(i);
    }

    public void setTitle(CharSequence charSequence) {
        this.f59652h.setText(charSequence);
        this.f59642N0.setVisibility(0);
    }

    public void setBody(int i) {
        setBody(getResources().getText(i));
    }

    public void setTitle(int i) {
        setTitle(getResources().getText(i));
    }
}
