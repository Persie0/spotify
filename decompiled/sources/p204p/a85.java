package p204p;

import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public class a85 extends c85 {
    @Override // p204p.c85
    /* JADX INFO: renamed from: a */
    public void mo25031a(StaticLayout.Builder builder, TextView textView) {
        Object objInvoke = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        try {
            objInvoke = d85.m35247d("getTextDirectionHeuristic").invoke(textView, null);
        } catch (Exception unused) {
        }
        builder.setTextDirection((TextDirectionHeuristic) objInvoke);
    }
}
