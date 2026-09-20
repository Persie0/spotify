package p204p;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.spotify.encoreconsumermobile.elements.badge.enhanced.EnhancedBadgeView;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes8.dex */
public final class pg81 extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public final TextView f177252a;

    /* JADX INFO: renamed from: b */
    public final TextView f177253b;

    /* JADX INFO: renamed from: c */
    public final EnhancedBadgeView f177254c;

    /* JADX INFO: renamed from: d */
    public View f177255d;

    public pg81(Context context) {
        super(context, null, 0);
        View.inflate(context, R.layout.track_view_connect, this);
        setOrientation(1);
        TextView textView = (TextView) findViewById(R.id.track_info_view_title);
        this.f177252a = textView;
        TextView textView2 = (TextView) findViewById(R.id.track_info_view_subtitle);
        this.f177253b = textView2;
        this.f177254c = (EnhancedBadgeView) findViewById(R.id.enhanced_badge);
        this.f177255d = findViewById(R.id.connect_entry_point);
        textView.setSelected(true);
        textView2.setSelected(true);
    }
}
