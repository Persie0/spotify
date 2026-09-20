package p204p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes8.dex */
public final class g2k0 implements ji10 {

    /* JADX INFO: renamed from: a */
    public final rte f75969a;

    public g2k0(Context context, ViewGroup viewGroup) {
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.notification_settings_section_header, viewGroup, false);
        int i = R.id.description;
        if (((TextView) vie1.m85629k(viewInflate, R.id.description)) != null) {
            i = R.id.title;
            if (((TextView) vie1.m85629k(viewInflate, R.id.title)) != null) {
                this.f75969a = new rte((ConstraintLayout) viewInflate, 1);
                return;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // p204p.clc1
    public final View getView() {
        return this.f75969a.f202572b;
    }
}
