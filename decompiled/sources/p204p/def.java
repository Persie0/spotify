package p204p;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.encoremobile.facepile.FaceView;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes9.dex */
public final class def implements rdc1 {

    /* JADX INFO: renamed from: a */
    public final ConstraintLayout f48074a;

    /* JADX INFO: renamed from: b */
    public final Group f48075b;

    /* JADX INFO: renamed from: c */
    public final TextView f48076c;

    /* JADX INFO: renamed from: d */
    public final EditText f48077d;

    /* JADX INFO: renamed from: e */
    public final EditText f48078e;

    /* JADX INFO: renamed from: f */
    public final TextView f48079f;

    /* JADX INFO: renamed from: g */
    public final FaceView f48080g;

    /* JADX INFO: renamed from: h */
    public final EncoreButton f48081h;

    /* JADX INFO: renamed from: i */
    public final ImageView f48082i;

    public def(ConstraintLayout constraintLayout, Group group, TextView textView, EditText editText, EditText editText2, TextView textView2, FaceView faceView, EncoreButton encoreButton, ImageView imageView) {
        this.f48074a = constraintLayout;
        this.f48075b = group;
        this.f48076c = textView;
        this.f48077d = editText;
        this.f48078e = editText2;
        this.f48079f = textView2;
        this.f48080g = faceView;
        this.f48081h = encoreButton;
        this.f48082i = imageView;
    }

    /* JADX INFO: renamed from: a */
    public static def m35783a(View view) {
        int i = R.id.active_input_group;
        Group group = (Group) vie1.m85629k(view, R.id.active_input_group);
        if (group != null) {
            i = R.id.character_count_text;
            TextView textView = (TextView) vie1.m85629k(view, R.id.character_count_text);
            if (textView != null) {
                i = R.id.comment_edittext;
                EditText editText = (EditText) vie1.m85629k(view, R.id.comment_edittext);
                if (editText != null) {
                    i = R.id.first_comment_edittext;
                    EditText editText2 = (EditText) vie1.m85629k(view, R.id.first_comment_edittext);
                    if (editText2 != null) {
                        i = R.id.platform_rules_text;
                        TextView textView2 = (TextView) vie1.m85629k(view, R.id.platform_rules_text);
                        if (textView2 != null) {
                            i = R.id.profile_picture;
                            FaceView faceView = (FaceView) vie1.m85629k(view, R.id.profile_picture);
                            if (faceView != null) {
                                i = R.id.send_button;
                                EncoreButton encoreButton = (EncoreButton) vie1.m85629k(view, R.id.send_button);
                                if (encoreButton != null) {
                                    i = R.id.send_button_space;
                                    if (((Space) vie1.m85629k(view, R.id.send_button_space)) != null) {
                                        i = R.id.timestamp_button;
                                        ImageView imageView = (ImageView) vie1.m85629k(view, R.id.timestamp_button);
                                        if (imageView != null) {
                                            return new def((ConstraintLayout) view, group, textView, editText, editText2, textView2, faceView, encoreButton, imageView);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p204p.rdc1
    public final View getRoot() {
        return this.f48074a;
    }
}
