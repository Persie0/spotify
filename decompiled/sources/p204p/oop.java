package p204p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.encoremobile.component.buttons.EncoreProgressIndicatorButton;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes8.dex */
public final class oop implements ovf {

    /* JADX INFO: renamed from: X */
    public final Drawable f167676X;

    /* JADX INFO: renamed from: a */
    public final Context f167677a;

    /* JADX INFO: renamed from: b */
    public final View f167678b;

    /* JADX INFO: renamed from: c */
    public final TextView f167679c;

    /* JADX INFO: renamed from: d */
    public final EncoreButton f167680d;

    /* JADX INFO: renamed from: e */
    public final EncoreButton f167681e;

    /* JADX INFO: renamed from: f */
    public final EncoreProgressIndicatorButton f167682f;

    /* JADX INFO: renamed from: g */
    public final EncoreButton f167683g;

    /* JADX INFO: renamed from: h */
    public final EncoreButton f167684h;

    /* JADX INFO: renamed from: i */
    public final EncoreButton f167685i;

    /* JADX INFO: renamed from: t */
    public final Drawable f167686t;

    public oop(Context context) {
        this.f167677a = context;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.livestreamcontrol_row_upcoming_layout, (ViewGroup) null);
        viewInflate.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.f167678b = viewInflate;
        this.f167679c = (TextView) viewInflate.findViewById(R.id.timestamp);
        this.f167680d = (EncoreButton) viewInflate.findViewById(R.id.share_button);
        this.f167681e = (EncoreButton) viewInflate.findViewById(R.id.add_to_calendar_button);
        this.f167682f = (EncoreProgressIndicatorButton) viewInflate.findViewById(R.id.rsvp_button);
        this.f167683g = (EncoreButton) viewInflate.findViewById(R.id.notify_button);
        this.f167684h = (EncoreButton) viewInflate.findViewById(R.id.will_notify_button);
        this.f167685i = (EncoreButton) viewInflate.findViewById(R.id.view_event_button);
        this.f167686t = context.getDrawable(R.drawable.encore_icon_locked_active_24);
        this.f167676X = context.getDrawable(R.drawable.encore_icon_check_alt_fill_24);
    }

    @Override // p204p.gr50
    /* JADX INFO: renamed from: c */
    public final void mo2821c(gh00 gh00Var) {
        this.f167680d.setOnClickListener(new mjp(10, gh00Var));
        this.f167681e.setOnClickListener(new mjp(11, gh00Var));
        this.f167685i.setOnClickListener(new mjp(12, gh00Var));
        this.f167682f.setOnClickListener(new mjp(13, gh00Var));
        this.f167683g.setOnClickListener(new mjp(14, gh00Var));
    }

    @Override // p204p.gr50
    /* JADX INFO: renamed from: d */
    public final void mo2820d(Object obj) {
        hs90 hs90Var = (hs90) obj;
        boolean z = hs90Var.f94640f;
        this.f167679c.setText(this.f167677a.getString(R.string.upcoming_live_audio_event_timestamp_title, hs90Var.f94636b));
        int i = hs90Var.f94639e;
        int iM38547C = edb.m38547C(i);
        int i2 = (iM38547C == 1 || iM38547C == 2) ? 0 : 8;
        EncoreProgressIndicatorButton encoreProgressIndicatorButton = this.f167682f;
        encoreProgressIndicatorButton.setVisibility(i2);
        int[] iArr = nop.f156773a;
        int i3 = iArr[edb.m38547C(i)];
        Drawable drawable = this.f167686t;
        encoreProgressIndicatorButton.setIcon(i3 == 1 ? drawable : null);
        encoreProgressIndicatorButton.setEnabled(!z);
        encoreProgressIndicatorButton.setShowProgressIndicator(z);
        int iM38547C2 = edb.m38547C(i);
        int i4 = (iM38547C2 == 4 || iM38547C2 == 5 || iM38547C2 == 7) ? 0 : 8;
        EncoreButton encoreButton = this.f167683g;
        encoreButton.setVisibility(i4);
        encoreButton.setIcon(iArr[edb.m38547C(i)] == 3 ? drawable : null);
        int i5 = iArr[edb.m38547C(i)] == 6 ? 0 : 8;
        EncoreButton encoreButton2 = this.f167684h;
        encoreButton2.setVisibility(i5);
        encoreButton2.setIcon(this.f167676X);
        encoreButton2.setClickable(false);
        this.f167685i.setVisibility(iArr[edb.m38547C(i)] == 7 ? 0 : 8);
    }

    @Override // p204p.clc1
    public final View getView() {
        return this.f167678b;
    }
}
