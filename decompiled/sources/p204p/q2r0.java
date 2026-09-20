package p204p;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoremobile.component.icons.IconCheck;
import com.spotify.encoremobile.component.slottextview.EncoreTitleView;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes6.dex */
public final class q2r0 implements rdc1 {

    /* JADX INFO: renamed from: a */
    public final ConstraintLayout f184700a;

    /* JADX INFO: renamed from: b */
    public final IconCheck f184701b;

    /* JADX INFO: renamed from: c */
    public final EncoreTitleView f184702c;

    public q2r0(ConstraintLayout constraintLayout, IconCheck iconCheck, EncoreTitleView encoreTitleView) {
        this.f184700a = constraintLayout;
        this.f184701b = iconCheck;
        this.f184702c = encoreTitleView;
    }

    /* JADX INFO: renamed from: b */
    public static q2r0 m72029b(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.preset_row_layout, (ViewGroup) null, false);
        int i = R.id.icon_check;
        IconCheck iconCheck = (IconCheck) vie1.m85629k(viewInflate, R.id.icon_check);
        if (iconCheck != null) {
            i = R.id.title;
            EncoreTitleView encoreTitleView = (EncoreTitleView) vie1.m85629k(viewInflate, R.id.title);
            if (encoreTitleView != null) {
                return new q2r0((ConstraintLayout) viewInflate, iconCheck, encoreTitleView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    /* JADX INFO: renamed from: a */
    public final ConstraintLayout m72030a() {
        return this.f184700a;
    }

    @Override // p204p.rdc1
    public final View getRoot() {
        return this.f184700a;
    }
}
