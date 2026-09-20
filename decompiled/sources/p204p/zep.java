package p204p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes9.dex */
public final class zep implements ovf {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f282074a = 0;

    /* JADX INFO: renamed from: b */
    public final Object f282075b;

    /* JADX INFO: renamed from: c */
    public final View f282076c;

    public zep(Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.empty_view_playlist_all_songs, (ViewGroup) null, false);
        FrameLayout frameLayout = (FrameLayout) viewInflate;
        TextView textView = (TextView) vie1.m85629k(viewInflate, R.id.title);
        if (textView == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.title)));
        }
        t7q t7qVar = new t7q(16, frameLayout, textView);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.f282075b = t7qVar;
        this.f282076c = frameLayout;
    }

    @Override // p204p.gr50
    /* JADX INFO: renamed from: d */
    public final void mo2820d(Object obj) {
        switch (this.f282074a) {
            case 0:
                ((TextView) ((t7q) this.f282075b).f217872c).setText(((wcu) obj).f250113a);
                break;
            default:
                ((ovf) this.f282075b).mo2820d(new b3q0("", "", null, null, false, true));
                break;
        }
    }

    @Override // p204p.clc1
    public final View getView() {
        switch (this.f282074a) {
            case 0:
                return (FrameLayout) this.f282076c;
            default:
                return this.f282076c;
        }
    }

    public zep(ovf ovfVar) {
        this.f282075b = ovfVar;
        this.f282076c = ovfVar.getView();
    }
}
