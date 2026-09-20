package p204p;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes3.dex */
public final class z500 implements rdc1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f279425a;

    /* JADX INFO: renamed from: b */
    public final LinearLayout f279426b;

    /* JADX INFO: renamed from: c */
    public final EncoreTextView f279427c;

    /* JADX INFO: renamed from: d */
    public final EncoreTextView f279428d;

    public /* synthetic */ z500(LinearLayout linearLayout, EncoreTextView encoreTextView, EncoreTextView encoreTextView2, int i) {
        this.f279425a = i;
        this.f279426b = linearLayout;
        this.f279427c = encoreTextView;
        this.f279428d = encoreTextView2;
    }

    /* JADX INFO: renamed from: b */
    public static z500 m95411b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_edit_options, viewGroup, false);
        LinearLayout linearLayout = (LinearLayout) viewInflate;
        int i = R.id.replace_current_playlist;
        EncoreTextView encoreTextView = (EncoreTextView) vie1.m85629k(viewInflate, R.id.replace_current_playlist);
        if (encoreTextView != null) {
            i = R.id.save_as_new_playlist;
            EncoreTextView encoreTextView2 = (EncoreTextView) vie1.m85629k(viewInflate, R.id.save_as_new_playlist);
            if (encoreTextView2 != null) {
                return new z500(linearLayout, encoreTextView, encoreTextView2, 0);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    /* JADX INFO: renamed from: c */
    public static z500 m95412c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_more_options, viewGroup, false);
        LinearLayout linearLayout = (LinearLayout) viewInflate;
        int i = R.id.clear_chat;
        EncoreTextView encoreTextView = (EncoreTextView) vie1.m85629k(viewInflate, R.id.clear_chat);
        if (encoreTextView != null) {
            i = R.id.report_problem;
            EncoreTextView encoreTextView2 = (EncoreTextView) vie1.m85629k(viewInflate, R.id.report_problem);
            if (encoreTextView2 != null) {
                return new z500(linearLayout, encoreTextView, encoreTextView2, 1);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    /* JADX INFO: renamed from: a */
    public final LinearLayout m95413a() {
        switch (this.f279425a) {
            case 0:
                break;
        }
        return this.f279426b;
    }

    @Override // p204p.rdc1
    public final View getRoot() {
        switch (this.f279425a) {
            case 0:
                break;
        }
        return this.f279426b;
    }
}
