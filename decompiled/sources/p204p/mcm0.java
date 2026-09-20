package p204p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes3.dex */
public final class mcm0 implements u9m0 {

    /* JADX INFO: renamed from: a */
    public View f142206a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f142207b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f142208c;

    public mcm0(int i, int i2) {
        this.f142207b = i;
        this.f142208c = i2;
    }

    @Override // p204p.u9m0
    /* JADX INFO: renamed from: c */
    public final void mo24481c(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.default_placeholder_not_found, viewGroup, false);
        this.f142206a = viewInflate;
        TextView textView = (TextView) viewInflate.findViewById(R.id.not_found_title);
        TextView textView2 = (TextView) this.f142206a.findViewById(R.id.not_found_subtitle);
        TextView[] textViewArr = {textView, textView2};
        eng1.m39510t(textViewArr);
        eng1.m39509s(textViewArr);
        textView2.setTag(R.id.baselines_original_top_margin, Integer.valueOf((int) (26.0f * context.getResources().getDisplayMetrics().scaledDensity)));
        eng1.m39508r(this.f142206a);
        textView.setText(this.f142207b);
        textView2.setText(this.f142208c);
    }

    @Override // p204p.u9m0
    public final View getView() {
        return this.f142206a;
    }

    @Override // p204p.u9m0
    public final void start() {
    }

    @Override // p204p.u9m0
    public final void stop() {
    }
}
