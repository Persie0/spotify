package p204p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes9.dex */
public final class zvo implements ovf {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f286746a = 0;

    /* JADX INFO: renamed from: b */
    public final TextView f286747b;

    public zvo(Context context) {
        TextView textView = (TextView) LayoutInflater.from(context).inflate(R.layout.default_ad_context_header, (ViewGroup) null);
        this.f286747b = textView;
        mec1.m61564p(textView, new usa(11));
    }

    @Override // p204p.gr50
    /* JADX INFO: renamed from: d */
    public final void mo2820d(Object obj) {
        switch (this.f286746a) {
            case 0:
                String str = ((gl0) obj).f80971a;
                TextView textView = this.f286747b;
                textView.setText(str);
                textView.setTextAppearance(R.style.TextAppearance_Encore_MarginalBold);
                break;
            default:
                this.f286747b.setText((String) obj);
                break;
        }
    }

    @Override // p204p.clc1
    public final View getView() {
        switch (this.f286746a) {
            case 0:
                break;
        }
        return this.f286747b;
    }

    public zvo(TextView textView) {
        this.f286747b = textView;
    }
}
