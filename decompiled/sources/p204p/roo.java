package p204p;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.spotify.music.R;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class roo extends BaseAdapter {

    /* JADX INFO: renamed from: d */
    public static final int f201307d;

    /* JADX INFO: renamed from: a */
    public final Calendar f201308a;

    /* JADX INFO: renamed from: b */
    public final int f201309b;

    /* JADX INFO: renamed from: c */
    public final int f201310c;

    static {
        f201307d = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public roo() {
        Calendar calendarM57748c = kza1.m57748c(null);
        this.f201308a = calendarM57748c;
        this.f201309b = calendarM57748c.getMaximum(7);
        this.f201310c = calendarM57748c.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f201309b;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        int i2 = this.f201309b;
        if (i >= i2) {
            return null;
        }
        int i3 = i + this.f201310c;
        if (i3 > i2) {
            i3 -= i2;
        }
        return Integer.valueOf(i3);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) adn.m25591c(viewGroup, R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        int i2 = i + this.f201310c;
        int i3 = this.f201309b;
        if (i2 > i3) {
            i2 -= i3;
        }
        Calendar calendar = this.f201308a;
        calendar.set(7, i2);
        textView.setText(calendar.getDisplayName(7, f201307d, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }
}
