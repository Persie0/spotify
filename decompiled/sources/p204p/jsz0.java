package p204p;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes9.dex */
public final class jsz0 implements rdc1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f115633a;

    /* JADX INFO: renamed from: b */
    public final ConstraintLayout f115634b;

    /* JADX INFO: renamed from: c */
    public final TextView f115635c;

    public /* synthetic */ jsz0(ConstraintLayout constraintLayout, TextView textView, int i) {
        this.f115633a = i;
        this.f115634b = constraintLayout;
        this.f115635c = textView;
    }

    /* JADX INFO: renamed from: a */
    public static jsz0 m54252a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.sensitive_comments_warning_layout, viewGroup, false);
        int i = R.id.bottom_guideline;
        if (((Guideline) vie1.m85629k(viewInflate, R.id.bottom_guideline)) != null) {
            i = R.id.end_guideline;
            if (((Guideline) vie1.m85629k(viewInflate, R.id.end_guideline)) != null) {
                i = R.id.icon_frame;
                if (((FrameLayout) vie1.m85629k(viewInflate, R.id.icon_frame)) != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                    int i2 = R.id.start_guideline;
                    if (((Guideline) vie1.m85629k(viewInflate, R.id.start_guideline)) != null) {
                        i2 = R.id.top_guideline;
                        if (((Guideline) vie1.m85629k(viewInflate, R.id.top_guideline)) != null) {
                            i2 = R.id.warning_text;
                            TextView textView = (TextView) vie1.m85629k(viewInflate, R.id.warning_text);
                            if (textView != null) {
                                return new jsz0(constraintLayout, textView, 0);
                            }
                        }
                    }
                    i = i2;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // p204p.rdc1
    public final View getRoot() {
        switch (this.f115633a) {
            case 0:
                break;
        }
        return this.f115634b;
    }
}
