package p204p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes9.dex */
public final class zip implements ovf {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f283215a;

    /* JADX INFO: renamed from: b */
    public final View f283216b;

    /* JADX INFO: renamed from: c */
    public final TextView f283217c;

    /* JADX INFO: renamed from: d */
    public final TextView f283218d;

    public zip(Context context, int i) {
        this.f283215a = i;
        switch (i) {
            case 1:
                View viewInflate = LayoutInflater.from(context).inflate(R.layout.greenroom_track_info_row, (ViewGroup) null);
                this.f283216b = viewInflate;
                TextView textView = (TextView) viewInflate.findViewById(R.id.track_info_view_title);
                this.f283217c = textView;
                TextView textView2 = (TextView) viewInflate.findViewById(R.id.track_info_view_subtitle);
                this.f283218d = textView2;
                textView.setSelected(true);
                textView2.setSelected(true);
                textView.setTextAppearance(R.style.TextAppearance_MarqueeTrackTitle_Mini);
                textView2.setTextAppearance(R.style.TextAppearance_MarqueeTrackSubtitle_Mini);
                break;
            default:
                View viewInflate2 = LayoutInflater.from(context).inflate(R.layout.greenroom_track_info_row, (ViewGroup) null);
                this.f283216b = viewInflate2;
                TextView textView3 = (TextView) viewInflate2.findViewById(R.id.track_info_view_title);
                this.f283217c = textView3;
                TextView textView4 = (TextView) viewInflate2.findViewById(R.id.track_info_view_subtitle);
                this.f283218d = textView4;
                textView3.setSelected(true);
                textView4.setSelected(true);
                break;
        }
    }

    @Override // p204p.gr50
    /* JADX INFO: renamed from: c */
    public final void mo2821c(gh00 gh00Var) {
        switch (this.f283215a) {
            case 0:
                this.f283217c.setOnClickListener(new yep(23, gh00Var));
                this.f283218d.setOnClickListener(new yep(24, gh00Var));
                break;
            default:
                this.f283217c.setOnClickListener(new gos(21, gh00Var));
                this.f283218d.setOnClickListener(new gos(22, gh00Var));
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Iterable, java.lang.Object] */
    @Override // p204p.gr50
    /* JADX INFO: renamed from: d */
    public final void mo2820d(Object obj) {
        switch (this.f283215a) {
            case 0:
                wy10 wy10Var = (wy10) obj;
                String str = wy10Var.f256173a;
                TextView textView = this.f283217c;
                if (!str.contentEquals(textView.getText())) {
                    textView.setText(str);
                    mec1.m61564p(textView, new usa(12));
                }
                ?? r3 = wy10Var.f256174b;
                TextView textView2 = this.f283218d;
                String strM43753y0 = g6f.m43753y0(r3, textView2.getContext().getString(R.string.greenroom_track_info_separator), null, null, null, 62);
                if (!strM43753y0.contentEquals(textView2.getText())) {
                    textView2.setText(strM43753y0);
                    mec1.m61564p(textView2, new usa(12));
                }
                break;
            default:
                wy10 wy10Var2 = (wy10) obj;
                String str2 = wy10Var2.f256173a;
                TextView textView3 = this.f283217c;
                if (!str2.contentEquals(textView3.getText())) {
                    textView3.setText(str2);
                    mec1.m61564p(textView3, new usa(12));
                }
                ?? r4 = wy10Var2.f256174b;
                TextView textView4 = this.f283218d;
                String strM43753y1 = g6f.m43753y0(r4, textView4.getContext().getString(R.string.greenroom_track_info_separator), null, null, null, 62);
                if (!strM43753y1.contentEquals(textView4.getText())) {
                    textView4.setText(strM43753y1);
                    mec1.m61564p(textView4, new usa(12));
                }
                break;
        }
    }

    @Override // p204p.clc1
    public final View getView() {
        switch (this.f283215a) {
            case 0:
                break;
        }
        return this.f283216b;
    }
}
