package p204p;

import android.text.StaticLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class b85 extends a85 {
    @Override // p204p.a85, p204p.c85
    /* JADX INFO: renamed from: a */
    public void mo25031a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }

    @Override // p204p.c85
    /* JADX INFO: renamed from: b */
    public boolean mo28412b(TextView textView) {
        return textView.isHorizontallyScrollable();
    }
}
