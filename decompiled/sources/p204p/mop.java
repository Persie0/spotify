package p204p;

import android.content.Context;
import android.os.Trace;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.encoreconsumermobile.elements.badge.live.LiveEventBadgeView;
import com.spotify.music.R;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
public final class mop implements ovf {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f145722a;

    /* JADX INFO: renamed from: b */
    public final View f145723b;

    /* JADX INFO: renamed from: c */
    public final TextView f145724c;

    /* JADX INFO: renamed from: d */
    public final View f145725d;

    public mop(Context context, int i) {
        View viewInflate;
        this.f145722a = i;
        switch (i) {
            case 1:
                Trace.beginSection("ECM:SectionHeading2:inflate");
                try {
                    if (((Boolean) moi0.f145687g.getValue()).booleanValue()) {
                        viewInflate = q9g1.m72369A(context);
                    } else {
                        viewInflate = LayoutInflater.from(context).inflate(R.layout.section_heading2_layout, (ViewGroup) null);
                        wj50.m88279p(viewInflate);
                    }
                    Trace.endSection();
                    this.f145723b = viewInflate;
                    TextView textView = (TextView) mec1.m61562n(viewInflate, R.id.section_heading2_title);
                    this.f145724c = textView;
                    this.f145725d = (TextView) mec1.m61562n(viewInflate, R.id.section_heading2_subtitle);
                    viewInflate.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                    int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.section_heading2_padding);
                    viewInflate.setPadding(dimensionPixelSize, viewInflate.getPaddingTop(), dimensionPixelSize, viewInflate.getPaddingBottom());
                    mec1.m61564p(textView, qw71.f193209a);
                    return;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            default:
                View viewInflate2 = LayoutInflater.from(context).inflate(R.layout.live_progress_info_row, (ViewGroup) null);
                this.f145723b = viewInflate2;
                this.f145725d = (LiveEventBadgeView) viewInflate2.findViewById(R.id.live_event_badge);
                this.f145724c = (TextView) viewInflate2.findViewById(R.id.duration_text);
                return;
        }
    }

    @Override // p204p.gr50
    /* JADX INFO: renamed from: d */
    public final void mo2820d(Object obj) {
        String str;
        switch (this.f145722a) {
            case 0:
                um90 um90Var = (um90) obj;
                ((LiveEventBadgeView) this.f145725d).mo2820d(new qk90(false, um90Var.f231781b));
                long j = um90Var.f231780a;
                TextView textView = this.f145724c;
                Context context = textView.getContext();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                int hours = ((int) timeUnit.toHours(j)) % 24;
                int minutes = ((int) timeUnit.toMinutes(j)) % 60;
                int seconds = ((int) timeUnit.toSeconds(j)) % 60;
                Locale locale = new Locale(ihf1.m50634r(context, "_"));
                if (hours > 0) {
                    str = String.format(locale, "%d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(hours), Integer.valueOf(minutes), Integer.valueOf(seconds)}, 3));
                } else if (minutes > 0) {
                    str = String.format(locale, "%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(minutes), Integer.valueOf(seconds)}, 2));
                } else {
                    str = seconds > 0 ? String.format(locale, "00:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(seconds)}, 1)) : "--:--";
                }
                textView.setText(str);
                break;
            default:
                TextView textView2 = (TextView) this.f145725d;
                this.f145724c.setText(((q7z0) obj).f186195a);
                textView2.setVisibility(8);
                break;
        }
    }

    @Override // p204p.clc1
    public final View getView() {
        switch (this.f145722a) {
            case 0:
                break;
        }
        return this.f145723b;
    }
}
