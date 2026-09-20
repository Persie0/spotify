package p204p;

import android.widget.TextView;
import com.spotify.highlightsstats.statsdetails.uiusecases.bubblegraph.BubbleView;

/* JADX INFO: loaded from: classes7.dex */
public final class fpa {

    /* JADX INFO: renamed from: a */
    public final TextView f71779a;

    /* JADX INFO: renamed from: b */
    public final TextView f71780b;

    /* JADX INFO: renamed from: c */
    public final BubbleView f71781c;

    public fpa(TextView textView, TextView textView2, BubbleView bubbleView) {
        this.f71779a = textView;
        this.f71780b = textView2;
        this.f71781c = bubbleView;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fpa)) {
            return false;
        }
        fpa fpaVar = (fpa) obj;
        return wj50.m88271j(this.f71779a, fpaVar.f71779a) && wj50.m88271j(this.f71780b, fpaVar.f71780b) && wj50.m88271j(this.f71781c, fpaVar.f71781c);
    }

    public final int hashCode() {
        return this.f71781c.hashCode() + ((this.f71780b.hashCode() + (this.f71779a.hashCode() * 31)) * 31);
    }
}
